package tugas.algoritma.java;

import javax.swing.*;

public class RunFormNIM {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Form Informasi Mahasiswa Berdasarkan NIM");
        jFrame.setContentPane(new FormNIM().getMainPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500, 350);
        jFrame.setVisible(true);
    }
}