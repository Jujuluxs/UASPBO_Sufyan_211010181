package PBO;
import java.util.Scanner;
public class ProfilBeraksi {
    public static void main(String[] args) {
        //objek
        //DataPasien profil = new DataPasien("21100101810","Sufyan");
        
        //System.out.println(profil.displayInfo());
        //System.out.println(profil.displayInfo("Banjar"));
        
        //error headling
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
       ProfilDetail[] profil= new ProfilDetail[2];
        
        //perulangan
        for(int i =0; i<profil.length;i++){  
        System.out.print(" Masukkan NOREG "+(i+1)+" = ");
        String noreg = scanner.nextLine();
        System.out.print(" Masukkan NAMA  "+(i+1)+" = ");
        String nama = scanner.nextLine();
        
        //objek
        profil[i] = new ProfilDetail(noreg,nama);
        }
        
        //perulangan
        for(ProfilDetail data : profil) {
            System.out.println("====================");
            System.out.println("Data Pasien= ");
            System.out.println(data.displayInfo());
        }
    }   catch(NumberFormatException e ) {
            System.out.println("Kesalahan Format Nomor "+e.getMessage());
    }   catch(StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format NOREG"+e.getMessage());
    }
        catch (Exception e){
        System.out.println("Kesalahan Umum"+e.getMessage());
    }
  }    
}
