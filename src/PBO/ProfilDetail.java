package PBO;//inheritance
public class ProfilDetail extends Profil{
     //overriding
    public ProfilDetail(String noreg, String nama) {
        super(noreg, nama);
    }
    
    public String getDiagnosa(){
        String Diagnosa = getNoreg().substring(0, 4);
        //seleksi swicth
        switch(Diagnosa) {
            case "0011":
                return "Kencing Manis";
            case "0022":
                return "Asma";
            case "0033":
                return "Tipes";
            default:
                return "Data Pasien Penyakit Lain";
        }
    }
    
    public int getNoAntrian(){
          return Integer.parseInt(getNoreg().substring(4,12));   
    }
    
    public String getKategori(){
        String urutankategori = getNoreg().substring(12,14);
        //seleksi swicth
        switch(urutankategori) {
            case "01":
                return "Balita";
            case "02":
                return "Anak Anak";
            case "03":
                return "Dewasa";
            case "04":
                return "Lansia";
            default:
                return "Dan Seterusnya";
         }
    }
   //polymortisme(override)
    @Override
    public String displayInfo(){
            return super.displayInfo()+
            "\nDiagnosa = "+getDiagnosa()+
            "\nNoAntrian = "+getNoAntrian()+
            "\nUrutan Kategori = "+getKategori();
        }
    }
    
