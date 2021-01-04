/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maulana06942_ESIGJaringan;
import Controller.AllObjectModel;
import static Controller.AllObjectModel.teknisiModel;
import Controller.adminController;
import controller.PelangganController;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class maulana06942_main {
        private static final adminController admin = new adminController();
	private static final Scanner input = new Scanner(System.in);
	private static final PelangganController pelangganModel = new PelangganController();
	private static int pilpel;
	static int cekpelanggan;
        static int cekpriority;
	static int cekTeknisi;
        
    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        int loop=0;
                admin.dataTeknisi();
		do{ //perulangan do - while
			int pilih = 0;
			System.out.println("Selamat Datang aplikasi ESIG jaringan!!"+"\n 1. Login"+"\n 2. Daftar Pelanggan"+"\n 0. Stop"+"\n Masukkan Pilihan Anda : ");
			pilih = input.nextInt();
			if(pilih==1){ //percabangan
				int pilLogin = 0;
				System.out.print("1. Login Teknisi"+"\n 2. Login Pelanggan" +"\n Pilih: ");
				pilLogin = input.nextInt();
				if(pilLogin == 1){
					loginTeknisi();
				}else{
					loginPelanggan();
				}
			}else if (pilih == 2){
				register();
			}else if (pilih == 3){
				admin.viewTeknisi();
			}else if (pilih == 4){
				
			}else{
				break;
			}
		}while(loop!=1);
	}

    static void loginTeknisi(){
		System.out.print("No ID : ");
		String no_id = input.next();
		System.out.print("Password : ");
		String password = input.next();
                try{
		admin.login(no_id,password);
                        System.out.println("Selamat Datang"+ admin.TeknisiEntity().getNama()+ admin.TeknisiEntity().getJaringan());
                        if (pelangganModel.AllModel.pelangganModel.size()==0){
				System.out.println("Data masih kosong !!");
			}else{
				viewDaftarPel();
			}
	}catch(Exception exception){
			System.out.println("no_id atau Password anda salah !!");
        }
}

	static void loginPelanggan(){
		System.out.print("No ID : ");
		String no_id = input.next();
		System.out.print("Password : ");
		String password = input.next();
                pelangganModel.login(no_id,password);
		System.out.println("Selamat Datang"+pelangganModel.pelangganEntity().getNama());
		int cek = pelangganModel.cekDaftarpel(pelangganModel.pelangganEntity().getno_id());
		if(cek==-1){
			System.out.println("Anda Belum terdaftar praktikum !!");
			register();
		}else if(cek==-2){
			System.out.println("Anda Belum Terdaftar Praktikum!!");
			register();
		}else{
			System.out.println("====================================");
			System.out.print("no id : "+pelangganModel.showDaftarpel(cek).getPelanggan().getno_id()+
                                "\n Nama : "+pelangganModel.showDaftarpel(cek).getPelanggan().getNama()+
                                "\n Password"+pelangganModel.showDaftarpel(cek).getPelanggan().getPassword()+
                                "\n No.telp "+pelangganModel.showDaftarpel(cek).getPelanggan().getno_telp()+
                                "\n Isverified : ");
			if(pelangganModel.showDaftarpel(cek).isVerified()==false){
				System.out.println("Belum di Verifikasi Teknisi");
			}
                        else{
				System.out.println("Telah Di verifikasi Teknisi");
			}
			System.out.println("Kelas : "+ pelangganModel.showDaftarpel(cek).
                                getIndexpel());
			System.out.println("====================================");
		}
	}
	
	static void register(){
            try{
		System.out.println("Input No ID = ");
		String no_id = input.next();
		System.out.println("Input nama = ");
		String nama = input.next();
		System.out.println("Input Password = ");
		String password = input.next();
		System.out.println("Input notelp");
		String notelp= input.next();
//		System.out.println("Priority = ");
//		String Priority = input.next();
                    pelangganModel.insert(no_id,password,nama,notelp);//,Priority
		System.out.println("Daftar Sukses !!");}
        	catch (Exception exception){
			System.out.println("Format Pengisian Salah !!");
		}}
            
        static void viewDaftarPel(){
            pelangganModel.view_pelanggan();
	}
        
	static void updateIsverified(){
		System.out.print("\nNO ID Pelanggan = ");
		String no_id=input.next();
		int index = AllObjectModel.daftarpelmodel.
                        cekdata(no_id,null);
//		admin.
//                updateIsVerified
//        (index,pelangganModel.showDaftarpel(index).getIndexpel(),
//                pelangganModel
//                        .showDaftarpel(index).
//                        getIndexpel());	
        }
}  