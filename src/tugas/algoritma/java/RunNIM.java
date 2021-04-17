package tugas.algoritma.java;

import java.util.Scanner;

public class RunNIM {
    public static void main(String[] args) {
        System.out.print("Masukan NIM : ");
        Scanner s = new Scanner(System.in);
        String nim = s.nextLine();
        NIM objNim = new NIM();
        objNim.setNim(nim);
        System.out.println("Jenjang = "+objNim.getJenjang());
        System.out.println("Tahun Masuk = "+objNim.getTahunMasuk());
        System.out.println("Fakultas = "+objNim.getFakultas());
        System.out.println("Jurusan = "+objNim.getJurusan());
        System.out.println("Jenis Kelamin = "+objNim.getJenisKelamin());
        System.out.println("Nomor Urut Mahasiswa = "+objNim.getNomorUrut());


    }
}
