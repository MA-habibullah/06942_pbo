/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import Entity.PelangganEntity;
import View.GUI;
import View.Allobjctrl;
import Controller.PelangganController;
import Entity.ServiceEntity;

/**
 *
 * @author MAULANA
 */
public class PelangganGUI {
    JFrame Pelanggan = new JFrame();
    JButton back,daftarbtn;
    JTextArea area = new JTextArea();
    JLabel datadiri, daftarPelanggan, daftraservis;
    JComboBox pilserv = new JComboBox(ServiceEntity.nama);
    int cek = Allobjctrl.Pelanggan.cekDaftarpel(Allobjctrl.Pelanggan.pelangganEntity().getID());
    public PelangganGUI(){
        Pelanggan.setSize(720,600);
        Pelanggan.setLayout(null);
        Pelanggan.getContentPane().setBackground(Color.PINK);
        datadiri = new JLabel("Data Pelanggan");
        datadiri.setFont(new Font("Times New Roman", Font.BOLD,30));
        datadiri.setBounds(90,30,200,30);
        Pelanggan.add(datadiri);
        area.setBounds(30,90,400,300);
        Pelanggan.add(area);
        daftraservis = new JLabel("Daftar Pelanggan");
        daftraservis.setBounds(450,30,250,30);
        daftraservis.setFont(new Font("Times New Roman", Font.BOLD,30));
        Pelanggan.add(daftraservis);
        pilserv.setBounds(450,90,230,30);
        Pelanggan.add(pilserv);

        daftarbtn = new JButton("Daftar");
        daftarbtn.setBounds(500,200,100,30);
        daftarbtn.setBackground(Color.GREEN);
        Pelanggan.add(daftarbtn);
        back = new JButton("back");
        back.setBounds(30,500,100,30);
        back.setBackground(Color.red);
        Pelanggan.add(back);

        Pelanggan.setVisible(true);
        Pelanggan.setLocationRelativeTo(null);
        Pelanggan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        if(cek==-1){
            JOptionPane.showMessageDialog(null,"Anda Belum Daftar Pelanggan","Information",JOptionPane.INFORMATION_MESSAGE);
        }else if(cek==-2){
            JOptionPane.showMessageDialog(null,"Anda Belum Daftar Pelanggan","Information",JOptionPane.INFORMATION_MESSAGE);
        }else{
            area.setText(datapraktikan());
        }
        daftarbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                int indexprak=pilserv.getSelectedIndex();
                Allobjctrl.Pelanggan.daftarServis(indexprak,Allobjctrl.Pelanggan.getData(),false);
                area.setText(datapraktikan());
            }
        });
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Pelanggan.dispose();
                GUI men = new GUI();
            }
        });
    }
    String datapraktikan(){
        int cek = Allobjctrl.Pelanggan.cekDaftarpel(Allobjctrl.Pelanggan.pelangganEntity().getID());
        String cekverif;
        if(Allobjctrl.Pelanggan.showDaftarpel(cek).isVerified()==false){
            cekverif = "belum diverifikasi";
        }else{
            cekverif = "sudah diverifikasi";
        }
        String text ="ID = " +Allobjctrl.Pelanggan.showDaftarpel(cek).getpelanggan().getID()
                +"\n"+"No Telp = "+Allobjctrl.Pelanggan.showDaftarpel(cek).getpelanggan().getNama()
                +"\n"+"Alamat = "+Allobjctrl.Pelanggan.showDaftarpel(cek).getpelanggan().getAlamat()
                +"\n"+"verifikasi = "+cekverif+"\n"+"Service = "+Allobjctrl.Pelanggan.showDaftarpel(cek).getpelanggan().getService()
                +"\n"+"Pelanggan = "+ServiceEntity.nama[Allobjctrl.Pelanggan.showDaftarpel(cek).getIndexservis()];
        return text;
    }
}
