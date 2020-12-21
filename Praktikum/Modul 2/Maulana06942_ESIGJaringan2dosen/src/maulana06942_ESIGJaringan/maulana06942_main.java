/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maulana06942_ESIGJaringan;
import Entity.Maulana06942_PriorityEntity;
import Entity.Maulana06942_TeknisiEntity;
import Entity.Maulana06942_PelangganEntity;
import Entity.*;
import java.util.Scanner;
import model.Maulana06942_TeknisiModel;
import model.Maulana06942_DaftarPelModel;
import model.Maulana06942_PelangganModel;

public class maulana06942_main {
        private static Maulana06942_TeknisiModel teknisiModel = new Maulana06942_TeknisiModel();
	private static Scanner input = new Scanner(System.in);
	private static Maulana06942_PelangganModel pelangganModel = new Maulana06942_PelangganModel();
	private static Maulana06942_DaftarPelModel daftarpelModel = new Maulana06942_DaftarPelModel();
	private static int pilpel;
	static int cekpelanggan;
        static int cekpriority;
	static int cekTeknisi;
        
    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        int loop=0;
		dataTeknisi();
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
					login();
				}
			}else if (pilih == 2){
				register();
			}else if (pilih == 3){
				teknisiModel.view();
			}else if (pilih == 4){
				
			}else{
				break;
			}
		}while(loop!=1);
	}
	static void dataTeknisi(){
		String idTeknisi[]={"01","02","03"};
		String passwordTeknisi[]={"01","02","03"};
		String namaTeknisi[]={"ridho","roma","richard"};
		String no_telpTeknisi[]={"01","02","03"};
		String jaringan[]={"platinum","silver","gold"};
		for(int i=0;i<idTeknisi.length;i++){
                    teknisiModel.insertTeknisi(new Maulana06942_TeknisiEntity(idTeknisi[i],passwordTeknisi[i],namaTeknisi[i],no_telpTeknisi[i],jaringan[i]));
		}
	}
	static void register(){
		System.out.println("Input No ID = ");
		String no_id = input.next();
		System.out.println("Input nama = ");
		String nama = input.next();
		System.out.println("Input Password = ");
		String pass = input.next();
		System.out.println("Input notelp");
		String notelp= input.next();
		System.out.println("Priority = ");
		String Priority = input.next();
                    pelangganModel.insert(new Maulana06942_PelangganEntity(no_id,pass,nama,notelp,Priority));
		}

	static void login(){
		System.out.print("No ID : ");
		String no_id = input.next();
		System.out.print("Password : ");
		String password = input.next();
		cekpelanggan = pelangganModel.cekData(no_id,password);
		System.out.println("selamat datang " + pelangganModel.getPelEntityArrayList(cekpriority).getNama());
		int cekPriority = daftarpelModel.cekdata(no_id, password);
		if(cekPriority==-1){
			System.out.println("perbaikan belum di veifikasi");
			daftarpel();
		}else if(cekPriority==-2){
			System.out.println("perbaikan belum di veifikasi");
			daftarpel();
		}else{
			System.out.println("Nama = "+daftarpelModel.showDaftarpel(cekPriority).getpelanggan().getNama());
			System.out.println("Noid = "+daftarpelModel.showDaftarpel(cekPriority).getpelanggan().getNo_id());
			System.out.println("No Telp = "+daftarpelModel.showDaftarpel(cekPriority).getpelanggan().getno_telp());
			System.out.println("Priority = "+Maulana06942_PriorityEntity.priority[daftarpelModel.showDaftarpel(cekPriority).getIndexPriority()]);
			System.out.println("isVerified = "+daftarpelModel.showDaftarpel(cekPriority).isVerified());
		}
	}
	
	static void daftarpel(){
		System.out.println("Pilih Pelanggan = ");
                    for(int i=0;i<Maulana06942_PriorityEntity.priority.length;i++){
			System.out.println(i+". " +Maulana06942_PriorityEntity.priority[i]);
		}
		System.out.print("Pilih Pelanggan = ");
		pilpel = input.nextInt();
                    daftarpelModel.insertDataDaftarpel(new Maulana06942_PelangganEntity(pilpel,pelangganModel.getPelEntityArrayList(cekpriority),false));
	}
	static void loginTeknisi(){
		System.out.print("No ID : ");
		String no_id = input.next();
		System.out.print("Password : ");
		String password = input.next();
		cekTeknisi = teknisiModel.cekData(no_id, password);
		System.out.print("Selamat Datang "+teknisiModel.showDataTeknisi(pilpel).getNama());
		pelangganModel.view();
		updateIsverified();
	}
	static void updateIsverified(){
		System.out.print("\nNO ID Pelanggan = ");
		String no_id=input.next();
		int index = daftarpelModel.cekdata(no_id,null);
		daftarpelModel.updateIsVerified (index, new Maulana06942_PelangganEntity(pilpel,pelangganModel.getPelEntityArrayList(index),true));
	}
}  