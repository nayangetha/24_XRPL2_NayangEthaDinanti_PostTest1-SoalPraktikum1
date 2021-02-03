
//fungsi scanner untuk menginputkan dari user
import java.util.Scanner;

public class Lingkaran {
 
    //Inisialisasi objek input dari class scanner
    Scanner input=new Scanner(System.in);
    
    //Deklarasi variabel 
    double luas,r, phi=3.14;
    
    //method void hitung untuk input user
    void hitung (){
        
        //Input nilai jari-jari
       System.out.print("Masukan Jari-jari : ");
       r=input.nextInt();
       
       //Menghitung luas lingkaran
       luas=phi*r*r;

       //Tampilkan hasil perhitungan
       System.out.println("Luas Lingkaran = "+luas);
    }
    
}
