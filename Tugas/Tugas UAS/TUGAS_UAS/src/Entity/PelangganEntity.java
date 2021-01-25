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
public class PelangganEntity extends PelangganAbstractEntity{
    private String service;
    public PelangganEntity(String id, String password, String nama, String no_telp, String alamat, String Service){
        super(id, password, nama, no_telp, alamat);
        this.service = Service;
    }


    @Override
    public String getID() {
        return id;
    }
    public String getService(){
        return service;
    }
    public void setSevice(String service){
        this.service = service;
    }

    public String getNo_Telp() {
        return no_telp;
    }
}
