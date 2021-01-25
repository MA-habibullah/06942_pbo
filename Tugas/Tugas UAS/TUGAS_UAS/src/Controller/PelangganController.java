/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.PelangganEntity;
import Entity.DaftarPelEntity;
import Entity.ServiceEntity;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author MAULANA
 */
public class PelangganController implements ControllerInterface {
    int indexLogin = 0;

    public PelangganEntity getData(){
        return AllObjectModel.pelangganModel.getPelangganEntityArrayList(indexLogin);
    }

    public void daftarServis(int indexService, PelangganEntity PelangganEntity, boolean isVerified){
        AllObjectModel.daftarpelModel.insertDataDaftarpel(new DaftarPelEntity(indexService, PelangganEntity, isVerified));
    }

    @Override
    public void login(String id, String password){
        indexLogin = AllObjectModel.pelangganModel.cekData(id, password);
    }

    public void insert(String id, String password, String nama, String no_telp, String alamat, String service){
        AllObjectModel.pelangganModel.insert(new PelangganEntity (id, password, nama, no_telp, alamat, service));
    }

    public PelangganEntity pelangganEntity(){
        return AllObjectModel.pelangganModel.getPelangganEntityArrayList(indexLogin);
    }

    public int cekDaftarpel(String id){
        int cek = AllObjectModel.daftarpelModel.cekData(id, null);
        return cek;
    }

    public DaftarPelEntity showDaftarpel(int index){
        return AllObjectModel.daftarpelModel.showDaftarpel(index);
    }
        public DefaultTableModel daftarpel(){
        DefaultTableModel dtmdaftarprak = new DefaultTableModel();
        Object[] kolom = {"ID", "Nama", "Password", "No Telp", "Alamat", "Servis", "Verified"};
        dtmdaftarprak.setColumnIdentifiers(kolom);
        int size = AllObjectModel.daftarpelModel.alldatapel().size();
        String verif = null;
        for (int i=0; i<size; i++){
            if (AllObjectModel.daftarpelModel.alldatapel().get(i).isVerified() == false){
                verif = "no";
            }
            else {
                verif = "yes";
            }
            Object[] data = new Object[8];
            data[0] = AllObjectModel.daftarpelModel.alldatapel().get(i).getpelanggan().getID();
            data[1] = AllObjectModel.daftarpelModel.alldatapel().get(i).getpelanggan().getNama();
            data[2] = AllObjectModel.daftarpelModel.alldatapel().get(i).getpelanggan().getPassword();
            data[3] = AllObjectModel.daftarpelModel.alldatapel().get(i).getpelanggan().getNo_telp();
            data[4] = AllObjectModel.daftarpelModel.alldatapel().get(i).getpelanggan().getAlamat();
            data[5] = ServiceEntity.nama[AllObjectModel.daftarpelModel.alldatapel().get(i).getIndexservis()];
            data[6] = verif;
            data[7] = AllObjectModel.daftarpelModel.alldatapel().get(i).getpelanggan().getService();
            dtmdaftarprak.addRow(data);
        }
        return dtmdaftarprak;
    }
}
