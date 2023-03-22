import java.util.*;
public class Main {
    static Scanner inputan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        boolean lanjut = true;
        while(lanjut){
            System.out.println("=========================");
            System.out.println(" Data Akun Mobile Legend");
            System.out.println("=========================");
            System.out.println("= 1. Lihat Akun     =");
            System.out.println("= 2. Tambah Akun    =");
            System.out.println("= 3. Hapus Akun     =");   
            System.out.println("= 4. Update Akun    =");
            System.out.println("= 5. Keluar Program =");
            int pilihan = inputan.nextInt();
            switch(pilihan){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("=======================");
                    System.out.println("Pilihan tidak ditemukan");
                    System.out.println("=======================");
            }
        }
    }
    
}
