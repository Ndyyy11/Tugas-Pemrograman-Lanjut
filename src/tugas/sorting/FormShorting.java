package tugas.sorting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormShorting {
    private JPanel MainPanel;
    private JTextField InputField;
    private JButton DoButton;
    private JTable OutputTable;
    private JTextField InJumlah;
    private DefaultTableModel tableModel;
    private boolean added = false;

    public FormShorting() {
        initComponents();
        DoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) OutputTable.getModel();
                String input = InputField.getText();
                int jumlah = Integer.parseInt(InJumlah.getText());
                String[] stmp = input.split(",");
                if (stmp.length > jumlah || stmp.length < jumlah){
                    JOptionPane.showMessageDialog(MainPanel,
                            "Jumlah Angka Tidak Sesuai Limit yang DiInput",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (InJumlah.getText().length()>3){
                    JOptionPane.showMessageDialog(MainPanel,
                            "Data Terlalu Banyak\nMax Input : 999",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                return;
                }
                if (!added) {
                    for (int i = 0; i < jumlah; i++) {
                        model.addRow(new Object[]{});
                    }
                added = true;
                }
                int a = 0;
                for (int i : Sorting.getas(input, jumlah)){
                    model.setValueAt(i, a, 0);
                    a++;
                }
                int b = 0;
                for (int i : Sorting.getdes(input, jumlah)){
                    model.setValueAt(i, b, 1);
                    b++;
                }
            }
        });
    }

    public JPanel getMainPanel() {
        return MainPanel;
    }
    private void initComponents(){
        Object[] tableColumn = {
                "Ascending",
                "Descending"
        };
        Object[][] initData = {
        };
        //set table model
        tableModel = new DefaultTableModel(initData, tableColumn);
        OutputTable.setModel(tableModel);
        //menampilkan sorting di setiap colom
        OutputTable.setAutoCreateRowSorter(false);
        // enable single selection
        OutputTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
