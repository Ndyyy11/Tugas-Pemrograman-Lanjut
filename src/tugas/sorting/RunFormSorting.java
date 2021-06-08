package tugas.sorting;

import javax.swing.*;

public class RunFormSorting {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        ImageIcon imageIcon = new ImageIcon("res/logo.png");
        JFrame jFrame = new JFrame("Program Sorter Angka");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new FormShorting().getMainPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
