/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Entity.Maulana06942_TeknisiEntity;
import Entity.Maulana06942_PelangganEntity;
import controller.*;

import java.util.ArrayList;
/**
 *
 * @author MAULANA
 */
public class adminController implements ControllerInterface {
	int indexLogin=0;
	public adminController(){
	}
	public void dataTeknisi(){
		String idTeknisi[]={"01","02","03"};
		String passwordTeknisi[]={"01","02","03"};
		String namaTeknisi[]={"ridho","roma","richard"};
		String no_telpTeknisi[]={"01","02","03"};
		String jaringan[]={"platinum","silver","gold"};
		for(int i=0;i<idTeknisi.length;i++){
			AllObjectModel.teknisiModel.insertTeknisi(new 
       Maulana06942_TeknisiEntity
        (idTeknisi[i],passwordTeknisi[i],namaTeknisi[i],no_telpTeknisi[i],jaringan[i]) {});
		}
	}
	public void viewTeknisi(){
		AllObjectModel.teknisiModel.view();
	}
	public void listPendaftarPelanggan(){
		AllObjectModel.daftarpelmodel.view();
	}
	
//	@Override
	public void login(String no_id, String password){
		indexLogin = AllObjectModel.teknisiModel.cekData(no_id,password);
	}
	public void updateIsVerified(int index, int indexPel, Maulana06942_PelangganEntity pelangganEntity){
		AllObjectModel.daftarpelmodel.updateIsVerified
        (index, new Maulana06942_PelangganEntity
        (indexPel,pelangganEntity,true));
	}
            public Maulana06942_TeknisiEntity TeknisiEntity() {
        return AllObjectModel.teknisiModel.showDataTeknisi(indexLogin);
    }
	public ArrayList<Maulana06942_PelangganEntity>cekDaftarpelModel(){
		return AllObjectModel.
                        daftarpelmodel.
                        getDaftarpelArrayLits();
	}

}