package CRUD;

import java.io.*;
import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CrudMethod {
    public void showData() throws IOException {
        FileReader fileInput;
        BufferedReader bufferedInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferedInput = new BufferedReader(fileInput);
        } catch (Exception e) {
            System.out.println("Database tidak ditemukan!");
            System.out.println("Silahkan tambah data terlebih dahulu\n");
            tambahData();
            return;
        }

        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        String data = bufferedInput.readLine();
        int noData = 0;

        while (data != null) {
            noData++;
            StringTokenizer stringTokenizer = new StringTokenizer(data,",");

            stringTokenizer.nextToken();
            System.out.printf("| %2d ", noData);
            System.out.printf("|\t%4s  ", stringTokenizer.nextToken());
            System.out.printf("|\t%-20s   ", stringTokenizer.nextToken());
            System.out.printf("|\t%-20s   ", stringTokenizer.nextToken());
            System.out.printf("|\t%s   ", stringTokenizer.nextToken());
            System.out.print("\n");

            data = bufferedInput.readLine();
        }

        System.out.println("----------------------------------------------------------------------------------------------------------");

    }

    public void cariData() throws IOException {
        // membaca database ada/tidak
        try {
            File file = new File("database.txt");
        } catch (Exception e) {
            System.out.println("Database tidak ditemukan!");
            System.out.println("Silahkan tambah data terlebih dahulu\n");
            tambahData();
            return;
        }

        // mengambil keyword dari users
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan kata kunci untuk mencari buku : ");
        String cariString = terminalInput.nextLine();
        String[] keywords = cariString.split("\\s+");

        // cek keyword di database
        this.cariBukuDiDatabase(keywords,true);
    }

    public void updateData() throws IOException {
        // kita ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // kita buat database sementara
        File tempDb = new File("tempDb.txt");
        FileWriter fileOutput = new FileWriter(tempDb);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("\nList Buku\n-----------");
        showData();

        // get user input
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("\nUbah Buku\n---------");
        System.out.print("Masukan nomor buku\nyang akan diupdate : ");
        int updateNum = terminalInput.nextInt();

        // tampilkan data yang ingin di update
        String data = bufferedInput.readLine();
        int entryCounts = 0;

        while (data != null) {
            entryCounts++;
            StringTokenizer stringTokenizer = new StringTokenizer(data,",");

            // tampilkan jika entryCounts == updateNum
            if (entryCounts == updateNum) {
                System.out.println("\nData yang ingin anda ubah adalah : ");
                System.out.println("-----------------------------------");
                System.out.println("Referensi       : " + stringTokenizer.nextToken());
                System.out.println("Tahun           : " + stringTokenizer.nextToken());
                System.out.println("Penulis         : " + stringTokenizer.nextToken());
                System.out.println("Penerbit        : " + stringTokenizer.nextToken());
                System.out.println("Judul           : " + stringTokenizer.nextToken());

                // update data

                // mengambil input dari user
                String[] fieldData = {"tahun","penulis","penerbit","judul"};
                String[] tempData = new String[4];

                stringTokenizer = new StringTokenizer(data,",");
                String originalData = stringTokenizer.nextToken();

                for (int i = 0; i < fieldData.length; i++) {
                    boolean isUpdate = getYesOrNo("Apakah anda ingin merubah " + fieldData[i]);
                    originalData = stringTokenizer.nextToken();

                    if (isUpdate) {
                        // user input
                        if (fieldData[i].equalsIgnoreCase("tahun")) {
                            System.out.print("Masukan tahun terbit : ");
                            tempData[i] = ambilTahun();
                        } else {
                            terminalInput = new Scanner(System.in);
                            System.out.print("Masukan " + fieldData[i] + " baru : ");
                            tempData[i] = terminalInput.nextLine();
                        }

                    } else {
                        tempData[i] = originalData;
                    }
                }

                // tampilkan data baru ke layar
                stringTokenizer = new StringTokenizer(data,",");
                stringTokenizer.nextToken();

                System.out.println("\nData baru anda adalah ");
                System.out.println("---------------------------------------");
                System.out.println("Tahun               : " + stringTokenizer.nextToken() + " --> " + tempData[0]);
                System.out.println("Penulis             : " + stringTokenizer.nextToken() + " --> " + tempData[1]);
                System.out.println("Penerbit            : " + stringTokenizer.nextToken() + " --> " + tempData[2]);
                System.out.println("Judul               : " + stringTokenizer.nextToken() + " --> " + tempData[3]);

                boolean isUpdate = getYesOrNo("Apakah anda yakin ingin mengupdate data tersebut");

                if (isUpdate) {
                    // cek data baru di database
                    boolean isExist = cariBukuDiDatabase(tempData,false);

                    if (isExist) {
                        System.err.println("data buku sudah ada di database, proses update dibatalkan, \nsilahkan delete data yang bersangkutan");
                        // copy data
                        bufferedOutput.write(data);
                    } else {
                        // format data baru kedalam database
                        String tahun = tempData[0]; String penulis = tempData[1];
                        String penerbit = tempData[2]; String judul = tempData[3];

                        // kita bikin primary key
                        long noEntry = this.getEntryPerTahun(penulis,tahun) + 1;
                        String writerNoSpace = penulis.replaceAll("\\s+","");
                        String primaryKey = writerNoSpace + "_" + tahun + "_" + noEntry;

                        // tulis data ke database
                        bufferedOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                    }
                } else {
                    // copy data
                    bufferedOutput.write(data);
                }

            } else {
                // copy data
                bufferedOutput.write(data);
            }

            bufferedOutput.newLine();
            data = bufferedInput.readLine();
        }

        // menulis data ke file
        bufferedOutput.flush();

        // delete original file
        database.delete();

        // rename file sementara ke original
        tempDb.renameTo(database);

    }

    public void deleteData() throws IOException {
        // kita ambil database original
        // untuk membaca saja
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // kita buat database sementara
        // untuk menulis isi file
        File tempDb = new File("tempDb.txt");
        FileWriter fileOutput = new FileWriter(tempDb);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("\nList Buku\n-----------");
        showData();

        // kita ambil user input untuk delete data
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("\nHapus Buku\n---------");
        System.out.print("Masukan nomor buku\nyang akan dihapus : ");
        int delNum = terminalInput.nextInt();


        // looping untuk membaca tiap data baris dan skip data yang akan di delete
        int entryCounts = 0;
        boolean isFound = false;
        String data = bufferedInput.readLine();

        while (data != null) {
            entryCounts++;
            boolean isDelete = false;

            StringTokenizer stringTokenizer = new StringTokenizer(data,",");

            // tampilkan data yang ingin di hapus
            if (entryCounts == delNum) {
                System.out.println("\nData yang ingin anda hapus adalah : ");
                System.out.println("-----------------------------------");
                System.out.println("Referensi       : " + stringTokenizer.nextToken());
                System.out.println("Tahun           : " + stringTokenizer.nextToken());
                System.out.println("Penulis         : " + stringTokenizer.nextToken());
                System.out.println("Penerbit        : " + stringTokenizer.nextToken());
                System.out.println("Judul           : " + stringTokenizer.nextToken());

                isDelete = getYesOrNo("Apakah anda yakin akan menghapus");
                isFound = true;
            }

            if (isDelete) {
                System.out.println("Data berhasil dihapus");
            } else {
                // kita pindahkan data dari original ke sementara
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine();
        }

        if (!isFound) {
            System.err.println("Buku tidak ditemukan!");
        }

        // menulis data ke file
        bufferedOutput.flush();

        bufferedOutput.close();
        fileOutput.close();
        bufferedInput.close();
        fileInput.close();

        System.gc();

        // delete original file
        database.delete();

        // rename file sementara ke original
        tempDb.renameTo(database);

    }

    public boolean cariBukuDiDatabase(String[] keywords, boolean isDisplay) throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        String data = bufferedInput.readLine();
        int noData = 0;
        boolean isExist = false;

        if (isDisplay) {
            System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
            System.out.println("----------------------------------------------------------------------------------------------------------");
        }

        while (data != null) {

            // cek keywords didalam baris
            isExist = true;
            for(String keyword:keywords){
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }

            // jika keyword nya cocok, maka tampilkan
            if (isExist) {
                if (isDisplay) {
                    noData++;
                    StringTokenizer stringTokenizer = new StringTokenizer(data,",");

                    stringTokenizer.nextToken();
                    System.out.printf("| %2d ", noData);
                    System.out.printf("|\t%4s  ", stringTokenizer.nextToken());
                    System.out.printf("|\t%-20s   ", stringTokenizer.nextToken());
                    System.out.printf("|\t%-20s   ", stringTokenizer.nextToken());
                    System.out.printf("|\t%s   ", stringTokenizer.nextToken());
                    System.out.print("\n");
                } else {
                    break;
                }
            }

            data = bufferedInput.readLine();
        }

        if (isDisplay) {
            System.out.println("----------------------------------------------------------------------------------------------------------");
        }

        return isExist;
    }

    public void tambahData() throws IOException {
        FileWriter fileOutput = new FileWriter("database.txt",true);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // get input from user
        Scanner terminalInput = new Scanner(System.in);
        String penulis,penerbit,judul,tahun;

        System.out.print("Masukan Nama Penulis : ");
        penulis = terminalInput.nextLine();
        System.out.print("Masukan Judul Buku : ");
        judul = terminalInput.nextLine();
        System.out.print("Masukan Nama Penerbit : ");
        penerbit = terminalInput.nextLine();
        System.out.print("Masukan Tahun Terbit : ");
        tahun = this.ambilTahun();

        // cek buku di database

        String[] keywords = { tahun + "," + penulis + "," + penerbit + "," + judul };
        System.out.println(Arrays.toString(keywords));

        boolean isExist = this.cariBukuDiDatabase(keywords,false);

        // menulis buku di database
        if (!isExist) {
            System.out.println(this.getEntryPerTahun(penulis,tahun));
            long noEntry = this.getEntryPerTahun(penulis,tahun) + 1;
            String writerNoSpace = penulis.replaceAll("\\s+","");
            String primaryKey = writerNoSpace + "_" + tahun + "_" + noEntry;

            System.out.println("\nData yang akan anda masukan adalah");
            System.out.println("----------------------------------------");
            System.out.println("Primary Key  : " + primaryKey);
            System.out.println("Tahun Terbit : " + tahun);
            System.out.println("Penulis      : " + penulis);
            System.out.println("Judul        : " + judul);
            System.out.println("Penerbit     : " + penerbit);

            boolean isTambah = this.getYesOrNo("Apakah ingin menambah data tersebut");

            if (isTambah) {
                bufferedOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                bufferedOutput.newLine();
                bufferedOutput.flush();
            }

        } else {
            System.out.println("Buku yang anda akan masukan sudah tersedia di database dengan data berikut : ");
            this.cariBukuDiDatabase(keywords,true);
        }

        bufferedOutput.close();

    }

    public long getEntryPerTahun(String penulis, String tahun) throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        long entry = 0;
        String data = bufferInput.readLine();
        Scanner dataScanner; String primaryKey;

        while (data != null) {
            dataScanner = new Scanner(data);
            dataScanner.useDelimiter(",");

            primaryKey = dataScanner.next();

            dataScanner = new Scanner(primaryKey);
            dataScanner.useDelimiter("_");

            penulis = penulis.replaceAll("\\s+","");

            if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next()) ) {
                entry = dataScanner.nextInt();
            }

            data = bufferInput.readLine();
        }

        return entry;
    }

    public String ambilTahun() throws IOException {
        boolean tahunValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String tahunInput = terminalInput.nextLine();

        while (!tahunValid) {
            try {
                Year.parse(tahunInput);
                tahunValid = true;
            } catch (Exception err) {
                System.out.println("Format Salah!");
                System.out.print("Masukan Tahun lagi : ");
                tahunValid = false;
                tahunInput = terminalInput.nextLine();
            }
        }

        return tahunInput;
    }

    public boolean getYesOrNo(String message) {
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n"+ message +"? (y/n) ");
        String inputUser = terminalInput.next();

        while(!inputUser.equalsIgnoreCase("y") && !inputUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan Anda tidak tersedia!");
            System.out.print("\n"+ message +"? (y/n) ");
            inputUser = terminalInput.next();
        }

        return inputUser.equalsIgnoreCase("y");
    }

    public void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex){
            System.err.println("tidak bisa clear screen");
        }
    }
}
