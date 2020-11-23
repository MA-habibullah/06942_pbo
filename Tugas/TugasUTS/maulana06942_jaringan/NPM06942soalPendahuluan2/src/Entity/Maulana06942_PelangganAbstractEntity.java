/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public abstract class Maulana06942_PelangganAbstractEntity {

    public String no_id;
    public String password;
    public String nama;
    protected String no_telp, IDpel;
	public Maulana06942_PelangganAbstractEntity(String no_id, String password, String nama, String no_telp, String IDpel){
		this.no_id = no_id;
		this.password = password;
		this.nama = nama;
		this.no_telp = no_telp;
	}
	public Maulana06942_PelangganAbstractEntity(){
	}

	public abstract String getNo_id();
	public void setNo_id(String no_id){
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
}
