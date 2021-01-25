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
public class TeknisiEntity extends PelangganAbstractEntity{
    private String toko;
    
    public TeknisiEntity(String id, String password, String nama, String no_telp, String alamat, String toko){
        super(id ,password, nama, no_telp, alamat);
    } 
    
    @Override
    public String getID() {
        return id;
    }
    public String getToko(){
       return toko;
   }
    public void setService(String toko){
       this.toko = toko;
    }
}
