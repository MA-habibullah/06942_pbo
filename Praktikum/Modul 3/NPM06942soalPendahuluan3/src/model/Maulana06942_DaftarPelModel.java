/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import Entity.Maulana06942_PriorityEntity;
import Entity.Maulana06942_PelangganEntity;
import java.text.ParseException;
import java.util.ArrayList;


public class Maulana06942_DaftarPelModel implements Maulana06942_ModelInterfaces {
    private ArrayList<Maulana06942_PelangganEntity> daftarpelArrayList;

	public Maulana06942_DaftarPelModel(){
		daftarpelArrayList = new ArrayList<Maulana06942_PelangganEntity>();
	}

	public void insertDataDaftarpel(Maulana06942_PelangganEntity daftarpel){
		daftarpelArrayList.add(daftarpel);
	}

	public ArrayList<Maulana06942_PelangganEntity> getDaftarpelArrayLits(){
		return daftarpelArrayList;
	}

	@Override
	public void view(){
            for (Maulana06942_PelangganEntity daftarpel : daftarpelArrayList){
            System.out.println("============================================");
            System.out.print("No ID : "+daftarpel.getpelanggan().getno_id()+
                    "\n Nama : "+daftarpel.getpelanggan().getNama()+
                    "\n Password : "+daftarpel.getpelanggan().getPassword()+
                    "\nNo Telp : "+daftarpel.getpelanggan().getno_telp()+
                    "\nPriority : "+Maulana06942_PriorityEntity.priority[daftarpel.getindexPrio()]+
                    "\n IsVerifed : ");
           //kondisi
            if (daftarpel.isVerified()==false){
                System.out.println("perbaikan Belum Di verifikasi Admin");
            }else {
                System.out.println("perbaikan Diverfikasi");
            }
            System.out.println("====================================================");
            }
	}

	public int cekdata(String no_id, String password){
		int loop = 0;
		if(daftarpelArrayList.isEmpty()){
                    loop=-1;
                    System.out.println("");
		}else{
			for(int i = 0;i<daftarpelArrayList.size(); i++){
				if(daftarpelArrayList.get(i).getpelanggan().getno_id().equals(no_id)){
					loop=i;
					break;
				}else{
					loop= -2;
				}
			}
		}return loop;

	}
	public Maulana06942_PelangganEntity showDaftarpel(int index){
		return daftarpelArrayList.get(index);
	}

	public void updateIsVerified(int index, Maulana06942_PelangganEntity daftarpelEntity){
		daftarpelArrayList.set(index,daftarpelEntity);
	}

    @Override
    public int cekData(String no_id, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
