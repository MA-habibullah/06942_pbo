/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;


public class Maulana06942_DaftarpelEntity {
    private Maulana06942_PelangganEntity pelanggan;
    private boolean isVerified;
    private int indexpriority;
	
	public Maulana06942_DaftarpelEntity(int indexpriority, Maulana06942_PelangganEntity admin, boolean isVerified){
		this.pelanggan = pelanggan;
		this.isVerified = isVerified;
		this.indexpriority = indexpriority;
	}
	
	public Maulana06942_PelangganEntity getpelanggan(){
            return pelanggan;
	}
	
	public void setpelanggan(Maulana06942_PelangganEntity pelanggan){
		this.pelanggan = pelanggan;
	}
	
	public boolean isVerified(){
		return isVerified;
	}
	
	public void setVerified(boolean verified){
		isVerified = verified;
	}
        public int getIndexPriority(){
            return indexpriority;
        }
	
	public void setIndexpel(int indexpel){
		this.indexpriority = indexpel;
	}
}
