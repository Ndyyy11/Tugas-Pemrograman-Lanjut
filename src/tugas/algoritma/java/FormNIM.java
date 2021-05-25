package tugas.algoritma.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormNIM {
    private JButton cek;
    private JTextField textNama;
    private JTextField textNIM;
    private JPanel mainPanel;
    private JLabel printnama;
    private JLabel printnim;
    private JLabel printjenjang;
    private JLabel printtahun;
    private JLabel printfakultas;
    private JLabel printjurusan;
    private JLabel printjk;
    private JLabel printnomor;


    public FormNIM() {
        cek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mengambil data dari textNama
                String nama = textNama.getText();
                //Mengambil data dari textNim
                String nim = textNIM.getText();
                //Diproses
                NIM objNim = new NIM();
                objNim.setNim(nim);
                //Tampilkan output ke FORM
                printnama.setText(nama);
                printnim.setText(nim);
                printjenjang.setText(objNim.getJenjang());
                printtahun.setText(objNim.getTahunMasuk());
                printfakultas.setText(objNim.getFakultas());
                printjurusan.setText(objNim.getJurusan());
                printjk.setText(objNim.getJenisKelamin());
                printnomor.setText(objNim.getNomorUrut());
            }
        });
    }


    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JTextField getTextNama() {
        return textNama;
    }


    public JTextField getNim() {
        return textNIM;
    }

}
