
//fungsi scanner untuk menginputkan dari user
import java.util.Scanner;

public class Persegi {
    
    //Inisialisasi objek input dari class scanner
    Scanner input=new Scanner(System.in);
    
    //Deklarasi variabel 
    double luas, sisi;
    
    //method void hitung untuk input user
    void hitung(){
        
        //Input nilai sisi persegi
       System.out.print("Masukan Sisi : ");
       sisi=input.nextInt();
       
       //Menghitung luas persegi
       luas = sisi*sisi;

       //Tampilkan hasil perhitungan
       System.out.println("Luas Persegi = "+luas);
       
    }
    
}
