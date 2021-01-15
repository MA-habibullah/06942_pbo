package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import jdk.management.resource.ResourceType;
import model.porsesLogin;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import model.insertKerusakan;
        
public class tampilan {
    
    porsesLogin login = new porsesLogin();
    insertKerusakan ik = new insertKerusakan();
    
    int i = 0, j = 0;
    

    
    public void viewHalamanUtama(){
        
        final JFrame frame = new JFrame("Halaman Utama");
        frame.setSize(620, 550);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        
        JLabel label1 = new JLabel("ESIG JARINGAN");
        label1.setBounds(150, 10, 500, 30);
        label1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 28));

        JLabel label2 = new JLabel("LOGIN");
        label2.setBounds(50, 50, 100, 30);
        label2.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));        
        
        JRadioButton teknisi = new JRadioButton("Teknisi");
        teknisi.setBounds(50, 90, 100, 30);
        teknisi.setBackground(Color.CYAN);
        
        JRadioButton pelanggan = new JRadioButton("Pelanggan");
        pelanggan.setBounds(180, 90, 100, 30);
        pelanggan.setBackground(Color.CYAN);
        
        ButtonGroup group = new ButtonGroup();
        group.add(teknisi);
        group.add(pelanggan);
        
        JLabel label3 = new JLabel("Nomer ID");
        label3.setBounds(50, 130, 100, 20);
        
        JTextField id = new JTextField();
        id.setBounds(50, 160, 200, 30);
        
        JLabel label4 = new JLabel("Password");
        label4.setBounds(50, 200, 100, 20);
        
        JPasswordField password = new JPasswordField();
        password.setBounds(50, 230, 200, 30);
        
        JButton btnLogin = new JButton("Login");
        btnLogin.setBackground(Color.GREEN);
        btnLogin.setBounds(100, 270, 100, 30);
        
        JLabel label5 = new JLabel("Buat Akun");
        label5.setBounds(400, 50, 300, 30);
        label5.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));        
        
        JLabel label6 = new JLabel("ID");
        label6.setBounds(350, 90, 100, 20);
        
        JTextField inputID = new JTextField();
        inputID.setBounds(350, 120, 200, 30);
        
        JLabel label7 = new JLabel("Nama");
        label7.setBounds(350, 160, 100, 20);
        
        JTextField inputNama = new JTextField();
        inputNama.setBounds(350, 190, 200, 30);
        
        JLabel label8 = new JLabel("Password");
        label8.setBounds(350, 230, 100, 20);
        
        JTextField inputPassword = new JTextField();
        inputPassword.setBounds(350, 260, 200, 30);
        
        JLabel label9 = new JLabel("No Telpon");
        label9.setBounds(350, 300, 100, 20);
        
        JTextField inputNoTelpon = new JTextField();
        inputNoTelpon.setBounds(350, 330, 200, 30);
        
        JLabel label10 = new JLabel("Alamat");
        label10.setBounds(350, 370, 100, 20);
        
        JTextField inputAlamat = new JTextField();
        inputAlamat.setBounds(350, 400, 200, 30);
        
        JButton btnRegister = new JButton("Register");
        btnRegister.setBackground(Color.GREEN);
        btnRegister.setBounds(400, 440, 100, 30);
        
        panel.setLayout(null);
        
        panel.add(label1);
        panel.add(label2);
        panel.add(teknisi);
        panel.add(pelanggan);
        panel.add(label3);
        panel.add(id);
        panel.add(label4);
        panel.add(password);
        panel.add(btnLogin);
        panel.add(label5);
        panel.add(label6);
        panel.add(inputID);
        panel.add(label7);
        panel.add(inputNama);
        panel.add(label8);
        panel.add(inputPassword);
        panel.add(label9);
        panel.add(inputNoTelpon);
        panel.add(label10);
        panel.add(inputAlamat);
        panel.add(btnRegister);
        
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Boolean status = false;
                
                if (teknisi.isSelected()){
                    if (id.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "ID tidak boleh Kosong");
                    } else if (password.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Password tidak boleh Kosong");
                    } else {
                        status = login.login(id.getText(), password.getText());

                        if (status){
                            JOptionPane.showMessageDialog(null, "Berhasil login");
                            frame.setVisible(false);
                            halamanTeknisi();
                        } else {
                            id.setText("");
                            password.setText("");
                            JOptionPane.showMessageDialog(null, "ID Tidak Terdaftar...!!");
                        }
                    }
                } else if (pelanggan.isSelected()) {
                    if (id.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "ID tidak boleh Kosong");
                    } else if (password.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Password tidak boleh Kosong");
                    } else {
                        status = login.loginPelanggan(id.getText(), password.getText());

                        if (status){
                            JOptionPane.showMessageDialog(null, "Berhasil login");
                            frame.setVisible(false);
                            String[] idPelanggan = login.getId();
                            String[] namaPelanggan = login.getNama();
                            String[] noTelponPelanggan = login.getNo_telpon();
                            String[] alamatPelanggan = login.getAlamat();
                            halamanPelanggan(idPelanggan[login.getI()], namaPelanggan[login.getI()], noTelponPelanggan[login.getI()], alamatPelanggan[login.getI()]);
                        } else {
                            id.setText("");
                            password.setText("");
                            JOptionPane.showMessageDialog(null, "ID Tidak Terdaftar...!!");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih mode login teknisi atau pelanggan...!!");
                }
                
            }
        });
        
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
                if (inputID.equals("")){
                    JOptionPane.showMessageDialog(null, "ID tidak Boleh Kosong");
                } else if (inputNama.equals("")){
                    JOptionPane.showMessageDialog(null, "Nama tidak Boleh Kosong");
                } else if (inputPassword.equals("")){
                    JOptionPane.showMessageDialog(null, "Password tidak Boleh Kosong");
                } else if (inputNoTelpon.equals("")){
                    JOptionPane.showMessageDialog(null, "No Telpon tidak Boleh Kosong");
                } else if (inputAlamat.equals("")){
                    JOptionPane.showMessageDialog(null, "Alamat tidak Boleh Kosong");
                } else {
                    login.insertData(i, inputID.getText(), inputNama.getText(), inputPassword.getText(), inputNoTelpon.getText(), inputAlamat.getText());
                    i++;
                    JOptionPane.showMessageDialog(null, "Data Berhasil di Input");
                    inputID.setText("");
                    inputNama.setText("");
                    inputPassword.setText("");
                    inputNoTelpon.setText("");
                    inputAlamat.setText("");
                }
                
            }
        });
        
    }
    
    public void halamanTeknisi(){
        
        final JFrame frame = new JFrame("Halaman Teknisi");
        frame.setSize(620, 550);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        
        JLabel label1 = new JLabel("Teknisi");
        label1.setBounds(250, 10, 200, 30);
        label1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 28));
        
        JLabel label2 = new JLabel("Data Pelanggan");
        label2.setBounds(10, 50, 300, 30);
        label2.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 18));
        
        
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{
            "id",
            "Nama", 
            "No Telpon",
            "ALamat"
        });
        
        String[] idPelanggan = login.getId();
        String[] namaPelanggan = login.getNama();
        String[] noTelponPelanggan = login.getNo_telpon();
        String[] alamatPelanggan = login.getAlamat();
        int index = login.getIndex();
        
        if(index != -1){
            for(int i = 0; i <= index; i++){
                model.addRow(new Object[]{
                    idPelanggan[i],
                    namaPelanggan[i],
                    noTelponPelanggan[i], 
                    alamatPelanggan[i]
                });
                table.setModel(model);
            }
        }
        table.setBounds(10, 90, 580, 150);
        
        JLabel label3 = new JLabel("Sedang Proses");
        label3.setBounds(10, 250, 300, 30);
        label3.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 18));
        
        JTable table2 = new JTable();
        DefaultTableModel model2 = new DefaultTableModel();
        model2.setColumnIdentifiers(new Object[]{
            "ID",
            "Kerusakan",
            "Status"
        });
        
        String[] idPelangganKerusakan = ik.getId_pelanggan();
        String[] kerusakan = ik.getKerusakan();
        String[] status = ik.getStatus();
        int index2 = ik.getIndex();
        
        if(index2 != -1){
            for(int i = 0; i <= index2; i++){
                if (status[i].equals("proses")){
                    model2.addRow(new Object[]{
                        idPelangganKerusakan[i],
                        kerusakan[i],
                        status[i]
                    });
                    table2.setModel(model2);
                }
            }
        }
        table2.setBounds(10, 290, 580, 150);
        
        JLabel label4 = new JLabel("ID");
        label4.setBounds(10, 450, 100, 20);
        
        JTextField inputID = new JTextField();
        inputID.setBounds(10, 475, 100, 30);
        
        JButton verifikasi = new JButton("verifikasi");
        verifikasi.setBackground(Color.GREEN);
        verifikasi.setBounds(120, 475, 100, 30);
        
        JButton back = new JButton("Back");
        back.setBackground(Color.GREEN);
        back.setBounds(490, 475, 100, 30);
        
        panel.setLayout(null);
        panel.add(label1);
        panel.add(label2);
        panel.add(table);
        panel.add(label3);
        panel.add(table2);
        panel.add(label4);
        panel.add(inputID);
        panel.add(verifikasi);
        panel.add(back);
        
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                viewHalamanUtama();
            }
        });
        
        verifikasi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inputID.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "ID tidak boleh kosong");
                } else {
                    Boolean ada = false;
                    int tmp = 0;
                    if(index2 != -1){
                        for(int i = 0; i <= index2; i++){
                            if (idPelangganKerusakan[i].equals(inputID.getText()) && status[i].equals("proses")){
                                ada = true;
                                tmp = i;
                            }
                        }
                        if(ada){
                            ik.setStatus(tmp, "selesai");
                            frame.setVisible(false);
                            popUp();
                        } else {
                            JOptionPane.showMessageDialog(null, "Data Tidak di temukan wk");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Tidak di temukan");
                    }
                }
            }
        });
    }

    public void halamanPelanggan(String id, String nama, String no_telpon, String alamat){
        final JFrame frame = new JFrame("Halaman Pelanggan");
        frame.setSize(620, 450);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        
        JLabel label1 = new JLabel("Data Pelanggan");
        label1.setBounds(150, 10, 300, 30);
        label1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 28));
        
        JLabel idPelangan = new JLabel(id);
        idPelangan.setBounds(50, 40, 300, 20);
        
        JLabel namaPelanggan = new JLabel(nama);
        namaPelanggan.setBounds(50, 70, 300, 20);
        
        JLabel noTelponPelanggan = new JLabel(no_telpon);
        noTelponPelanggan.setBounds(50, 100, 300, 20);
        
        JLabel alamatPelanggan = new JLabel(alamat);
        alamatPelanggan.setBounds(50, 130, 300, 20);
        
        JLabel label2 = new JLabel("Input Kerusakan");
        label2.setBounds(50, 160, 300, 30);
        label2.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 28));
        
        JLabel label3 = new JLabel("Input Kerusakan");
        label3.setBounds(50, 200, 300, 20);
        
        JTextField kerusakan = new JTextField();
        kerusakan.setBounds(50, 230, 300, 30);
        
        JButton save = new JButton("Save");
        save.setBackground(Color.GREEN);
        save.setBounds(50, 270, 100, 30);
        
        JButton back = new JButton("Back");
        back.setBackground(Color.GREEN);
        back.setBounds(160, 270, 100, 30);
        
        JButton view = new JButton("View kerusakan");
        view.setBackground(Color.GREEN);
        view.setBounds(270, 270, 150, 30);
        
        panel.setLayout(null);
        panel.add(label1);
        panel.add(idPelangan);
        panel.add(namaPelanggan);
        panel.add(noTelponPelanggan);
        panel.add(alamatPelanggan);
        panel.add(label2);
        panel.add(label3);
        panel.add(kerusakan);
        panel.add(save);
        panel.add(back);
        panel.add(view);
        
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                viewHalamanUtama();
            }
        });
        
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (kerusakan.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Kerusakan Tidak Boleh Kosong");
                } else {
                    ik.insertDataKerusakan(j, id, kerusakan.getText(), "proses");
                    j++;
                    kerusakan.setText("");
                    JOptionPane.showMessageDialog(null, "Data berhasil di input..!!");
                }
            }
        });
        
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                dataKerusakan(id);
                
            }
        });
        
    }
    
    public void popUp(){
        final JFrame frame = new JFrame("Halaman Utama");
        frame.setSize(190, 120);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        
        JLabel label = new JLabel("Data berhasil di Verifikasi");
        label.setBounds(10, 10, 150, 20);
        
        JButton back = new JButton("Back");
        back.setBackground(Color.GREEN);
        back.setBounds(10, 40, 150, 30);
        
        panel.setLayout(null);
        panel.add(label);
        panel.add(back);
        
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                halamanTeknisi();
            }
        });
    }

    public void dataKerusakan(String id){
        
        final JFrame frame = new JFrame("Data Kerusakan");
        frame.setSize(620, 320);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        
        JLabel label = new JLabel("Data Kerusakan");
        label.setBounds(10, 10, 150, 20);
        
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{
            "Kerusakan",
            "Status"
        });
        
        String[] idPelangganKerusakan = ik.getId_pelanggan();
        String[] kerusakanP = ik.getKerusakan();
        String[] status = ik.getStatus();
        int index2 = ik.getIndex();
        
        if(index2 != -1){
            for(int i = 0; i <= index2; i++){
                if (idPelangganKerusakan[i] == id){
                    model.addRow(new Object[]{
                        kerusakanP[i],
                        status[i]
                    });
                    table.setModel(model);
                }
            }
        }
        table.setBounds(10, 40, 580, 150);
        
        JButton back = new JButton("Back");
        back.setBackground(Color.GREEN);
        back.setBounds(10, 200, 150, 30);
        
        panel.setLayout(null);
        panel.add(label);
        panel.add(table);
        panel.add(back);
        
        frame.add(panel);
        frame.setVisible(true);
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });
        
    }
    
}
