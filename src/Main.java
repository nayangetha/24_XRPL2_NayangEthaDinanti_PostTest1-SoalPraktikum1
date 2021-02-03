
//fungsi scanner untuk menginputkan dari user
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //pemanggilan method static 
        Main.tampilan();
    }
    
    //method static
    static void tampilan(){
        
        //object
        Lingkaran tampil1 = new Lingkaran();
        Persegi tampil2 = new Persegi();
        
        //Inisialisasi objek input dari class scanner
        Scanner input=new Scanner(System.in);
        
        System.out.println("Selamat datang di kalkulator java");
        System.out.println("Pilihan perhitungan : ");
        
        //pilihan
        System.out.print("\n 1. Luas Lingkaran\n 2. Luas Persegi\n \n");
        
        //input pilihan user
        System.out.print("Masukkan Pilihan : ");
        int pilih = input.nextInt();
        System.out.println("=================================");
        
        //percabangan switch case untuk menentukan pilihan
        switch (pilih){
            
            //pilihan pertama
            case 1:
                System.out.println("Menghitung Luas Lingkaran");
                //pemanggilan method void hitung dari kelas Lingkaran menggunakan object tampil1
                tampil1.hitung();
            break;
            
            //pilihan kedua
            case 2 :
                System.out.println("Menghitung Luas Persegi");
                //pemanggilan method void hitung dari kelas Persegi menggunakan object tampil2
                tampil2.hitung();
            break;
             
        }
    }
}
