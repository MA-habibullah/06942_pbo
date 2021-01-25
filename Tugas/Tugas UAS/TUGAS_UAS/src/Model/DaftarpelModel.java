/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.DaftarPelEntity;
import java.util.ArrayList;
import Entity.ServiceEntity;

/**
 *
 * @author MAULANA
 */
public class DaftarpelModel {
    private ArrayList<DaftarPelEntity> daftarpelArrayList;
    public DaftarpelModel(){
        daftarpelArrayList = new ArrayList<DaftarPelEntity>();
    }


    public void insertDataDaftarpel(DaftarPelEntity daftarpel){
        daftarpelArrayList.add(daftarpel);
    }

    public ArrayList<DaftarPelEntity> getDaftarpelArrayList(){
        return daftarpelArrayList;
    }

    public void view(){
        for(DaftarPelEntity daftarpel : daftarpelArrayList){
            System.out.println("===================================");
            System.out.println("ID: "+ daftarpel.getpelanggan().getID()
                    +"\n Nama: "+daftarpel.getpelanggan().getNama()
                    +"\n Password: "+daftarpel.getpelanggan().getPassword()
                    +"\n No. Telp: "+daftarpel.getpelanggan().getNo_Telp()
                    +"\n alamat: "+ daftarpel.getpelanggan().getAlamat()
                    +"\n Service: "+ServiceEntity.nama[daftarpel.getIndexservis()]
                    +"\n IsVerified: ");
            if(daftarpel.isVerified() == false){
                System.out.println("Belum Di Verifikasi Admin");
            }
            else{
                System.out.println("Telah Di Verifikasi");
            }
            System.out.println("===================================");
        }
    }

    public int cekData(String id, String password){
        int loop = 0;
        if(daftarpelArrayList.size() == 0){
            loop = -1;//data kosong
        }
        else{
            for(int i=0; i<daftarpelArrayList.size(); i++){
                if(daftarpelArrayList.get(i).getpelanggan().getID().equals(id)){
                    loop = i;
                    break;
                }
                else{
                    loop = -2;
                }
            }
        }return loop;
    }

    public DaftarPelEntity showDaftarpel(int index){
        return daftarpelArrayList.get(index);
    }

    public void updateIsVerified(int index, DaftarPelEntity daftarpelEntity){
        daftarpelArrayList.set(index, daftarpelEntity);
    }

    public ArrayList<DaftarPelEntity> alldatapel(){
        return daftarpelArrayList;
    }
}
