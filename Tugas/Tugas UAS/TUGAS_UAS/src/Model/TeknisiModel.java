/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.TeknisiEntity;
import java.util.ArrayList;

/**
 *
 * @author MAULANA
 */
public class TeknisiModel {
      private ArrayList<TeknisiEntity> teknisiEntityArrayList;


    public TeknisiModel(){
        teknisiEntityArrayList = new ArrayList<TeknisiEntity>();
    }

    public void insertTeknisi(TeknisiEntity teknisi){
        teknisiEntityArrayList.add(teknisi);
    }

    public void view(){
        for(TeknisiEntity teknisiEntity : teknisiEntityArrayList){
            System.out.print(teknisiEntity.getID());
            System.out.print(teknisiEntity.getNama());
            System.out.print(teknisiEntity.getPassword());
            System.out.print(teknisiEntity.getNo_telp());
            System.out.print(teknisiEntity.getAlamat());
            System.out.println();
        }
    }

    public int cekData(String id, String password){
        int loop = 0;
        for(TeknisiEntity teknisiEntity : teknisiEntityArrayList){
            if(teknisiEntity.getID().equals(id) && teknisiEntity.getPassword().equals(password)){
                break;
            }
            else{
                loop++;
            }
        }
        return loop;
    }

    public TeknisiEntity showDataTeknisi(int index){
        return teknisiEntityArrayList.get(index);
    }  
}
