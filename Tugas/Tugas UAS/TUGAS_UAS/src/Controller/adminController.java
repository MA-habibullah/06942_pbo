/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.TeknisiEntity;
import Entity.DaftarPelEntity;
import Entity.PelangganEntity;
import Model.TeknisiModel;
import Model.PelangganModel;

import java.util.ArrayList;

public class adminController implements ControllerInterface{
    int indexLogin = 0;
    public adminController(){
    }

    public void dataTeknisi(){
        String idTeknisi[] = {"01", "02", "03"};
        String passwordTeknisi[] = {"01", "02", "03"};
        String namaTeknisi[] = {"maulana", "andre", "gofur"};
        String notelpTeknisi[] = {"01", "02", "03"};
        String alamat[] = {"a","b","c"};
        String service[] = {"home","home","business"};
        for (int i=0; i<idTeknisi.length; i++){
            AllObjectModel.teknisiModel.insertTeknisi(new TeknisiEntity
        (idTeknisi[i], passwordTeknisi[i], namaTeknisi[i], notelpTeknisi[i], alamat[i], service[i]));
        }
    }


    public void listPendaftarPraktikum(){
        AllObjectModel.daftarpelModel.view();
    }


    @Override
    public void login(String id, String password) {
        indexLogin = AllObjectModel.teknisiModel.cekData(id, password);
    }

    public void updateIsVerified(int index, int indexservis, PelangganEntity pelangganEntity){
        AllObjectModel.daftarpelModel.updateIsVerified(index, new DaftarPelEntity(indexservis, pelangganEntity, true));
    }

    public ArrayList<DaftarPelEntity> cekdaftarpelModel(){
        return AllObjectModel.daftarpelModel.getDaftarpelArrayList();
    }

    public TeknisiEntity teknisiEntity(){
        return AllObjectModel.teknisiModel.showDataTeknisi(indexLogin);
    } 
}
