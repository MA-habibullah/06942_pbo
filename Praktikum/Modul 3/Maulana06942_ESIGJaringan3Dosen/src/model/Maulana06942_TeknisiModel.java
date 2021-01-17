/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import Entity.Maulana06942_PelangganEntity;
import Entity.Maulana06942_TeknisiEntity;
import java.util.ArrayList;


public class Maulana06942_TeknisiModel implements Maulana06942_ModelInterfaces{
	private ArrayList<Maulana06942_TeknisiEntity> teknisiEntityArrayList;	

	
	public Maulana06942_TeknisiModel(){
		teknisiEntityArrayList = new ArrayList<Maulana06942_TeknisiEntity>();
	}
	public void insertTeknisi(Maulana06942_TeknisiEntity teknisi){
		teknisiEntityArrayList.add(teknisi);
	}
	
	@Override
	public void view(){
            teknisiEntityArrayList.stream().map((teknisiEntity) -> {
                System.out.print(teknisiEntity.getno_id());
                return teknisiEntity;
            }).map((teknisiEntity) -> {
                System.out.print(teknisiEntity.getNama());
                return teknisiEntity;
            }).map((teknisiEntity) -> {
                System.out.print(teknisiEntity.getPassword());
                return teknisiEntity;
            }).map((teknisiEntity) -> {
                System.out.print(teknisiEntity.getno_telp());
                return teknisiEntity;
            }).forEachOrdered((_item) -> {
                System.out.println();
            });
	}
        @Override
	public int cekData(String no_id, String password){
		int loop = 0;
		for (Maulana06942_TeknisiEntity teknisiEntity: teknisiEntityArrayList){
			if(teknisiEntity.getno_id().equals(no_id) && teknisiEntity.getPassword().equals(password)){
				break;
			}else{
				loop++;
			}
		}
		return loop;
	}
	public Maulana06942_TeknisiEntity showDataTeknisi(int index){
		return teknisiEntityArrayList.get(index);
	}

}
