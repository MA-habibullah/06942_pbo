/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maulana06942_MonitoringGangguanInternet;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dimdi
 */
public class Pelanggan {
    ArrayList <PelangganEntity> ArrayPelanggan = new ArrayList();
    Scanner input = new Scanner(System.in);
    
    public void TampilanMenu(){
        int Index, Pilihan, IdPelanggan, Kontak;
        String NamaPelanggan, Alamat;
        do{
            System.out.println("Menu Pelanggan");
            System.out.println("1. Create Pelanggan");
            System.out.println("2. Edit Pelanggan");
            System.out.println("3. Delete Pelanggan");
            System.out.println("4. Tampilkan Pelanggan");
            System.out.println("5. Kembali");
            System.out.print("Pilihan = "); Pilihan = input.nextInt();
            switch(Pilihan){
                case 1:
                    //CREATE
                    System.out.print("Id Pelanggan   = "); IdPelanggan = input.nextInt();
                    System.out.print("Nama Pelanggan = "); NamaPelanggan = input.next();
                    System.out.print("Kontak         = "); Kontak = input.nextInt();
                    System.out.print("Alamat         = "); Alamat = input.next();
                    ArrayPelanggan.add(new PelangganEntity(IdPelanggan, NamaPelanggan, Kontak, Alamat));
                    break;
                case 2:
                    //EDIT
                    System.out.print("Input Index = "); 
                        Index = input.nextInt();
                    System.out.print("Id Pelanggan   = "); 
                        IdPelanggan = input.nextInt();
                    System.out.print("Nama Pelanggan = "); 
                        NamaPelanggan = input.next();
                    System.out.print("Kontak         = "); 
                        Kontak = input.nextInt();
                    System.out.print("Alamat         = "); 
                        Alamat = input.next();
                    ArrayPelanggan.set(Index, new PelangganEntity(IdPelanggan, NamaPelanggan, Kontak, Alamat));
                    
                    break;
                case 3:
                    //DELETE
                    System.out.print("Input Index = "); Index = input.nextInt();
                    ArrayPelanggan.remove(Index);
                    break;
                case 4:
                    //VIEW
                    for(int i=0;i<ArrayPelanggan.size();i++){
                        System.out.println("Index "+i);
                        System.out.println("Id Pelanggan    = "+ArrayPelanggan.get(i).GetIdPelanggan());
                        System.out.println("Nama Pelanggan  = "+ArrayPelanggan.get(i).GetNamaPelanggan());
                        System.out.println("Kontak          = "+ArrayPelanggan.get(i).GetKontak());
                        System.out.println("Alamat          = "+ArrayPelanggan.get(i).GetAlamat());
                        System.out.println("");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak dikenali !");
                    
            }
        }while(Pilihan!=5);
        
    }
    
    public void TambahSample(){
        ArrayPelanggan.add(new PelangganEntity(123, "Google", 234, "Jl Pajajaran"));
        ArrayPelanggan.add(new PelangganEntity(234, "Facebook", 345, "Jl Ir Soekarno"));
        ArrayPelanggan.add(new PelangganEntity(456, "Apple", 567, "Jl Sulaiman"));
    }
    
}


