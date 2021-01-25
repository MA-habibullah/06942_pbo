/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.PelangganEntity;
import java.util.ArrayList;

/**
 *
 * @author MAULANA
 */
public class PelangganModel implements ModelInterfaces{
    private ArrayList<PelangganEntity> pelangganEntityArrayList;

    public PelangganModel(){
        pelangganEntityArrayList = new ArrayList<PelangganEntity>();
    }
    public void insert(PelangganEntity pelangganEntity){
        pelangganEntityArrayList.add(pelangganEntity);
    }

    public void view(){
        for(PelangganEntity pelangganEntity : pelangganEntityArrayList){
            System.out.println("==========================================");
            System.out.println("NPM: "+ pelangganEntity.getID()
                    +"\n Nama: "+pelangganEntity.getNama()
                    +"\n Password: "+pelangganEntity.getPassword()
                    +"\n No. Telp: "+pelangganEntity.getNo_Telp()
                    +"\n Alamat: "+pelangganEntity.getAlamat());
            System.out.println("==========================================");
        }
    }

    public int cekData(String id, String password){
        int loop = 0;
        while(!pelangganEntityArrayList.get(loop).getID().equals(id) && !pelangganEntityArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }

    public PelangganEntity getPelangganEntityArrayList(int index){
        return pelangganEntityArrayList.get(index);
    }
}
