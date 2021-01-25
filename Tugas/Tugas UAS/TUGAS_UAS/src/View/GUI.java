/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author MAULANA
 */
public class GUI {
    JFrame LogReg = new JFrame();
    JLabel login, daftar, top;
    JRadioButton radioTeknisi, radioPelanggan;
    JTextField textIDlogin, textnama, textnotelp, textIDdaftar, textalamat, textservice;
    JLabel labelIDlogin, labelnama, labelpasswordlogin, labelnotelp, labelIDdaftar, labelpassworddaftar, labelalamat, labelservice;
    JButton check, reg;
    JPasswordField passwordlogin, passworddaftar;
    private boolean ceklogin = false;

    public GUI(){
        LogReg.setSize(700,630);
        LogReg.setLayout(null);
//        LogReg.getContentPane().setBackground(Color.lavender);
        top = new JLabel("ESIG JARINGAN");
        top.setBounds(50,10,600,50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        LogReg.add(top);

        login = new JLabel("Login");
        login.setBounds(100,50,100,100);
        login.setFont(new Font("Times New Roman", Font.BOLD, 30));
        LogReg.add(login);

        radioTeknisi = new JRadioButton("Teknisi");
        radioTeknisi.setBounds(30,150,100,30);
        radioTeknisi.setBackground(Color.CYAN);
        LogReg.add(radioTeknisi);

        radioPelanggan = new JRadioButton("Pelanggan");
        radioPelanggan.setBounds(140,150,100,30);
        radioPelanggan.setBackground(Color.CYAN);
        LogReg.add(radioPelanggan);

        labelIDlogin = new JLabel("ID Pelanggan");
        labelIDlogin.setBounds(30,180,100,30);
        LogReg.add(labelIDlogin);

        textIDlogin = new JTextField();
        textIDlogin.setBounds(30,210,200,30);
        LogReg.add(textIDlogin);

        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(30, 240, 100, 30);
        LogReg.add(labelpasswordlogin);

        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(30,270,200,30);
        LogReg.add(passwordlogin);

        check = new JButton("check");
        check.setBounds(90,320,100,40);
        check.setBackground(Color.GREEN);
        LogReg.add(check);

        daftar = new JLabel("Buat Akun");
        daftar.setFont(new Font("Times New Roman", Font.BOLD, 30));
        daftar.setBounds(440,50,150,100);
        LogReg.add(daftar);

        labelIDdaftar = new JLabel("No ID");
        labelIDdaftar.setBounds(400,150,30,30);
        LogReg.add(labelIDdaftar);

        textIDdaftar = new JTextField();
        textIDdaftar.setBounds(400,180,200,30);
        LogReg.add(textIDdaftar);

        labelnama = new JLabel("Nama");
        labelnama.setBounds(400,210,100,30);
        LogReg.add(labelnama);

        textnama = new JTextField();
        textnama.setBounds(400,240,200,30);
        LogReg.add(textnama);

        labelpassworddaftar = new JLabel("Password");
        labelpassworddaftar.setBounds(400,270,100,30);
        LogReg.add(labelpassworddaftar);

        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(400,300,200,30);
        LogReg.add(passworddaftar);

        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(400,330,100,30);
        LogReg.add(labelnotelp);

        textnotelp = new JTextField();
        textnotelp.setBounds(400,360,200,30);
        LogReg.add(textnotelp);

        labelalamat = new JLabel("alamat");
        labelalamat.setBounds(400,390,200,30);
        LogReg.add(labelalamat);

        textalamat = new JTextField();
        textalamat.setBounds(400,420,200,30);
        LogReg.add(textalamat);

        labelservice = new JLabel("servis");
        labelservice.setBounds(400,450, 200,30);
        LogReg.add(labelservice);

        textservice = new JTextField();
        textservice.setBounds(400,480,200,30);
        LogReg.add(textservice);

        reg = new JButton("Daftar");
        reg.setBounds(460,520,100,40);
        reg.setBackground(Color.GREEN);
        LogReg.add(reg);

        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);

        radioTeknisi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioTeknisi.isSelected()){
                    radioPelanggan.setSelected(false);
                    ceklogin = true;
                }
            }
        });

        radioPelanggan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioPelanggan.isSelected()){
                    radioTeknisi.setSelected(false);
                    ceklogin = false;
                }
            }
        });

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ceklogin == true){
                    try {
                        Allobjctrl.admin.dataTeknisi();//login admin
                        Allobjctrl.admin.login(textIDlogin.getText(), passwordlogin.getText());
                        String nama = Allobjctrl.admin.teknisiEntity().getNama();
                        JOptionPane.showMessageDialog(null, "Selamat Datang "+nama, "information", JOptionPane.INFORMATION_MESSAGE);
                        View.TeknisiGUI asisten = new TeknisiGUI();
                        LogReg.dispose();
                    }catch (Exception exception){
                        JOptionPane.showMessageDialog(null,"id atau Password anda salah", "information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }else {
                    try {
                        Allobjctrl.Pelanggan.login(textIDlogin.getText(), passwordlogin.getText());
                        String nama = Allobjctrl.Pelanggan.pelangganEntity().getNama();
                        JOptionPane.showMessageDialog(null, "Selamat Datang "+nama, "information", JOptionPane.INFORMATION_MESSAGE);
                        //PraktikanGUI prak = new PraktikanGUI();
                        PelangganGUI pel = new PelangganGUI();
                        LogReg.dispose();
                    }catch (Exception ecepption){
                        JOptionPane.showMessageDialog(null,"NPM atau Pssword Salah","information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }
            }
        });
        reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = textIDdaftar.getText();//registrasi
                    String pass = passworddaftar.getText();
                    String nama = textnama.getText();
                    String notelp = textnotelp.getText();
                    String alamat = textalamat.getText();
                    String service = textservice.getText();

                    Allobjctrl.Pelanggan.insert(id,pass, nama, notelp, alamat, service);
                    JOptionPane.showMessageDialog(null,"Registrasi Berhasil", "inform, kelasation", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "infomation", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    void kosong(){
        textIDdaftar.setText(null);
        passworddaftar.setText(null);
        textnama.setText(null);
        textnotelp.setText(null);
        textalamat.setText(null);
        textIDlogin.setText(null);
        passwordlogin.setText(null);
        textservice.setText(null);
    }
}

