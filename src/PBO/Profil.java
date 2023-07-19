package PBO;
//class
public class Profil{//atribut dan encapculation
    private String noreg;
    private String nama;

    //construktor
    public Profil(String noreg, String nama) {
        this.noreg= noreg;
        this.nama = nama;
    }

    //setter
    public void setNoreg(String noreg) {
        this.noreg = noreg;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

 
    //getter
    public String getNoreg() {
        return noreg;
    }

    public String getNama() {
        return nama;
    }
    
    
    public String displayInfo() {
        return "Noreg = "+getNoreg()+ "\nNama = "+getNama();
    }
    
    //polymortisme(overloding)
    public String displayInfo(String alamat){
        return displayInfo()+"\nAlamat = "+alamat;
    }
    
}
 