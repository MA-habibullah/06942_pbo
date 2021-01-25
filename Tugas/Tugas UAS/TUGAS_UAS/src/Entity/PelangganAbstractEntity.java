/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author MAULANA
 */
public abstract class PelangganAbstractEntity {

    public String id;
    public String password;
    public String nama;
    public String no_telp, alamat;

    public PelangganAbstractEntity(String id, String password, String nama, String no_telp, String alamat){
        this.id = id;
        this.password = password;
        this.nama = nama;
        this.no_telp = no_telp;
        this.alamat = alamat;
    }

    public PelangganAbstractEntity(){
    }

    public abstract String getID();
    public void setID(String id){
        this.id = id;
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
    public String getNo_telp(){
        return no_telp;
    }
    public void setNo_telp(String no_telp){
        this.no_telp = no_telp;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat (String alamat){
        this.alamat = alamat;
    }
}
