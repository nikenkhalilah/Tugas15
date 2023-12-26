import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        DataPelanggan P01 = new Transaksi();    //polymorphisme

        Kasir D1 = new Kasir();
        D1.login();

        Scanner Input = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;
        Input.close();
        while (isLanjutkan) {
            System.out.println("---------MENU-------\n");
            System.out.println("1.\tLihat Data Pelanggan");
            System.out.println("2.\tTambah Data Pelanggan");
            System.out.println("3.\tEdit Data Pelanggan");
            System.out.println("4.\tHapus Data Pelanggan");
            System.out.println("5.\tKeluar");

            System.out.print("\n\nPilihan anda: ");
            pilihanUser = Input.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println(" DATA PELANGGAN");
                    P01.tampilkanData();
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("Tambahkan Data Pelanggan");
                    P01.isiDataPelanggan();
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.println("Ubah Data Pelanggan");
                    P01.updateData();
                    P01.tampilkanData();
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("Hapus Data Pelanggan");
                    P01.deleteData();
                    break;
                case "5":
                    System.out.println("\n==============");
                    System.out.println("Silakan login kembali");
                    System.out.println("==============");
                    System.exit(0);
                    break;
                default:
                    System.err.println("\nInput tidak valid\nSilakan pilih [1-4]");
            }

            isLanjutkan = getYesorNo("Apakah ingin melanjutkan");
        }
    //exception    
    try {
        //mengisi data pelanggan
        P01.isiDataPelanggan();
        //mencetak struk
        P01.Struk();
    } 
    catch (Exception e){
        System.out.println("Data yang diinput salah");
    }


    }

    private static boolean getYesorNo(String message){
        Scanner Input = new Scanner(System.in);
        System.out.print("\n"+message+" (y/n)? ");
        String pilihanUser = Input.next();
        Input.close();
        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n"+message+" (y/n)? ");
            pilihanUser = Input.next();
        }
        return pilihanUser.equalsIgnoreCase("y");

    }
}