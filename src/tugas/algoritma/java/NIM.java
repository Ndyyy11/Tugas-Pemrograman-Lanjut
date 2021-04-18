package tugas.algoritma.java;

public class NIM {
    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjang(){
        char a = nim.charAt(0);
        if (a== '1'){
            return "S1 (Sarjana)";
        }
        if (a== '2'){
            return "S2 (Magister)";
        }
        if (a== '3'){
            return "S3 (Doktor)";
        }
        return "UNKNOWN";
    }
    public String getTahunMasuk(){
        char b = nim.charAt(1);
        char c = nim.charAt(2);
        String plus = "20";
        return plus+b+c;
    }
    public String getFakultas(){
        char d = nim.charAt(3);
        if (d== '1'){
            return "TARBIYAH DAN KEGURUAN";
        }
        if (d== '2'){
            return "SYARI’AH DAN HUKUM";
        }
        if (d== '3'){
            return "USHULUDDIN";
        }
        if (d== '4'){
            return "DAKWAH &  KOMUNIKASI";
        }
        if (d== '5'){
            return "SAINS DAN TEKNOLOGI";
        }
        if (d== '6'){
            return "PSIKOLOGI";
        }
        if (d== '7'){
            return "EKONOMI DAN ILMU SOSIAL";
        }
        if (d== '8'){
            return "PERTANIAN DAN PETERNAKAN";
        }
        return "UNKNOWN";
    }
    public String getJurusan(){
        char e = nim.charAt(4);
        char f = nim.charAt(5);
        if (e== '0' && f=='1'){
            return "Teknik Informatika";
        }
        if (e== '0' && f=='2'){
            return "Teknik Industri";
        }
        if (e== '0' && f=='3'){
            return "Sistem Informasi ";
        }
        if (e== '0' && f=='4'){
            return "Matematika";
        }
        if (e== '0' && f=='5'){
            return "Teknik Elektro";
        }
        return "UNKNOWN";
    }
    public String getJenisKelamin(){
        char g = nim.charAt(6);
        if(g == '1'){
            return "LAKI-LAKI";
        }
        if(g == '2'){
            return "PEREMPUAN";
        }
        return "UNKNOWN ATAU NIM YANG DIMASUKAN SALAH";
    }
    public String getNomorUrut(){
        String h = nim.substring(7);
        return h;
    }
}
