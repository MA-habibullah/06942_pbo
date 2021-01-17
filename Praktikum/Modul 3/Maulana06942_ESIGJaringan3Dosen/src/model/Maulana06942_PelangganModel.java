/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import Entity.Maulana06942_PelangganEntity;

public class Maulana06942_PelangganModel implements Maulana06942_ModelInterfaces {
    private ArrayList<Maulana06942_PelangganEntity> pelangganEntityArrayList;
	public Maulana06942_PelangganModel(){
		pelangganEntityArrayList = new ArrayList<Maulana06942_PelangganEntity>();
	}
	public void insert(Maulana06942_PelangganEntity pelangganEntity){
		pelangganEntityArrayList.add(pelangganEntity);
	}
	
	@Override
	public void view(){
		for (Maulana06942_PelangganEntity pelangganEntity : pelangganEntityArrayList){
			System.out.println("=========================================");
			System.out.println("No ID : " + pelangganEntity.getno_id()+
                                "\n Nama : "+ pelangganEntity.getNama()+ 
                                "\n Password :"+ pelangganEntity.getPassword()+ 
                                "\n No.Telp :"+ pelangganEntity.getno_telp()+ 
                                "\n Priority :"+ pelangganEntity.getPriority());
			System.out.println("=========================================");
		}
	}
	public int cekData(String no_id, String password){
		int loop = 0;
		while (!pelangganEntityArrayList.get(loop).getno_id().equals(no_id)&& !pelangganEntityArrayList.get(loop).getPassword().equals(password)){
			loop++;
		}
		return loop;
	}
	public Maulana06942_PelangganEntity getPelEntityArrayList(int index){
		return pelangganEntityArrayList.get(index);
	}
        
        public int size(){
            return pelangganEntityArrayList.size();
        }
}
