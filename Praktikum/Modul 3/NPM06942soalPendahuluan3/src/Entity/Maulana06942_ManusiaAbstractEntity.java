/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public abstract class Maulana06942_ManusiaAbstractEntity {

    public String no_id;
    public String password;
    public String nama;
    protected String no_telp, IDpel;
    private int indexPelanggan;
    private Maulana06942_PelangganEntity Pelanggan;
    private boolean isVerified;
        
	public Maulana06942_ManusiaAbstractEntity(Maulana06942_PelangganEntity Pelanggan, String no_id, String password, String nama, String no_telp, boolean isVerified){
		this.no_id = no_id;
		this.password = password;
		this.nama = nama;
		this.no_telp = no_telp;
                this.Pelanggan=Pelanggan;
                this.isVerified = isVerified;
	}
        public Maulana06942_ManusiaAbstractEntity(String no_id, String password, String nama, String no_telp){
		this.no_id = no_id;
		this.password = password;
		this.nama = nama;
		this.no_telp = no_telp;
	}

	public abstract String getno_id();
	public void setno_id(String no_id){
		this.no_id = no_id;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getNama(){
		return nama;
	}
	public void setNama(String nama){
		this.nama = nama;
	}
	public String getno_telp(){
		return no_telp;
	}
	public void setNo_telp(String no_telp){
		this.no_telp = no_telp;
	}
	public String getIDpel(){
		return IDpel;
	}
	public void setIDpel(String IDpel){
		this.IDpel = IDpel;
	}
        	public int getIndexpel(){
            return indexPelanggan;
        }
	public void setIndexpel(int indexpel){
		this.indexPelanggan = indexpel;
	}
        	public boolean isVerified(){
		return isVerified;
	}
		public Maulana06942_PelangganEntity getPelanggan(){
		return Pelanggan;
	}
	
	public void setPelanggan(Maulana06942_PelangganEntity Pelanggan){
		this.Pelanggan=Pelanggan;
	}
}
//int indexPriority, int indexpelanggan,Maulana06942_PelangganEntity pelangganEntity, boolean isVerified