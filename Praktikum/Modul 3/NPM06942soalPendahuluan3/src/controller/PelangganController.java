/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Entity.Maulana06942_ManusiaAbstractEntity;
import Entity.Maulana06942_PelangganEntity;
import model.Maulana06942_DaftarPelModel;

/**
 *
 * @author MAULANA
 */
public class PelangganController implements ControllerInterface{
        public Controller.AllObjectModel AllModel = new Controller.AllObjectModel();
	int indexLogin=0;
	public PelangganController(){
	}
	
	public Maulana06942_PelangganEntity getData(){
	return AllModel.pelangganModel.getPelEntityArrayList(indexLogin);
	}
	
	public void daftarPraktikum(int indexpelanggan, Maulana06942_PelangganEntity PelangganEntity, boolean isVerified){
	AllModel.daftarpelmodel.
                insertDataDaftarpel(
                        new 
                Maulana06942_PelangganEntity
        (indexpelanggan,PelangganEntity,isVerified));
	}
	
        @Override
	public void login(String no_id, String password){
		indexLogin = AllModel.pelangganModel.cekData(no_id,password);
	}
        
	public void insert(String no_id, String password, String nama, String no_telp){//, String Priority
		AllModel.pelangganModel.insert(new Maulana06942_PelangganEntity(no_id, password, nama, no_telp));//, Priority
	}
	public Maulana06942_PelangganEntity pelangganEntity(){
		return AllModel.pelangganModel.getPelEntityArrayList(indexLogin);
	}
	public int cekDaftarpel(String no_id){
		int cek = AllModel.daftarpelmodel.cekData(no_id,null);
		return cek;
	}
	public Maulana06942_ManusiaAbstractEntity showDaftarpel(int index){
	return AllObjectModel.daftarpelmodel.showDaftarpel(index);
	}
        
        public void view_pelanggan(){
            AllModel.pelangganModel.view();
        }

}
