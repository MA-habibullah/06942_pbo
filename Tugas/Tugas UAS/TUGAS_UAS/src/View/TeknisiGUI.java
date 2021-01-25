package View;

import Controller.AllObjectModel;
import Controller.PelangganController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TeknisiGUI {
    private static PelangganController pelanggan = new PelangganController();
    JFrame Teknisi = new JFrame();
    JTable tabelpelanggan = new JTable();
    JScrollPane scrollteknisi = new JScrollPane(tabelpelanggan);
    JButton back,verif;
    JLabel admin,idlabel,passlabel;
    JTextField idtext,passtext;
    
    public TeknisiGUI(){
        Teknisi.setSize(650,500);
        Teknisi.setLayout(null);
        Teknisi.getContentPane().setBackground(Color.PINK);
        admin = new JLabel("Admin");
        admin.setBounds(250,30,200,30);
        admin.setFont(new Font("Times New Roman", Font.BOLD,40));
        Teknisi.add(admin);

        scrollteknisi.setBounds(30,100,570,200);
        tabelpelanggan.setModel(pelanggan.daftarpel());
        Teknisi.add(scrollteknisi);

        idlabel = new JLabel("ID");
        idlabel.setBounds(50,320,100,30);
        Teknisi.add(idlabel);

        idtext = new JTextField();
        idtext.setBounds(50,350,100,30);
        Teknisi.add(idtext);

        passlabel = new JLabel("password");
        passlabel.setBounds(200,320,100,30);
        Teknisi.add(passlabel);

        passtext = new JTextField();
        passtext.setBounds(200,350,100,30);
        Teknisi.add(passtext);

        verif = new JButton("verif");
        verif.setBounds(350,350,100,30);
        verif.setBackground(Color.GREEN);
        Teknisi.add(verif);

        back = new JButton("back");
        back.setBounds(50,400,100,30);
        back.setBackground(Color.red);
        Teknisi.add(back);

        Teknisi.setLocationRelativeTo(null);
        Teknisi.setVisible(true);
        Teknisi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        back.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent ae){
                Teknisi.dispose();
                GUI men = new GUI();
            }
        });
        verif.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                String id = idtext.getText();
                String pass = passtext.getText();
                int index = AllObjectModel.daftarpelModel.cekData(id,pass);
                Allobjctrl.admin.updateIsVerified(index,Allobjctrl.Pelanggan.showDaftarpel(index).getIndexservis(),Allobjctrl.Pelanggan.showDaftarpel(index).getpelanggan());
                tabelpelanggan.setModel(pelanggan.daftarpel());
            }
        });
        tabelpelanggan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelpelanggan.getSelectedRow();
                idtext.setText(Allobjctrl.Pelanggan.daftarpel().getValueAt(i, 0).toString());
                passtext.setText(Allobjctrl.Pelanggan.daftarpel().getValueAt(i, 2).toString());
            }
        });
    }
}
