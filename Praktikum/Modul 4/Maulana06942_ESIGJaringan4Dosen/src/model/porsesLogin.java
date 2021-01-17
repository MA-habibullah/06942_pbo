package model;
import javax.swing.JOptionPane;
import Entity.teknisi;
import Entity.pelanggan;
import controller.interfaceController;

public class porsesLogin extends pelanggan implements interfaceController{

    teknisi tki = new teknisi();
    int i = 0;
    
    @Override
    public Boolean login(String id, String password){
        
        Boolean ada = false;
        String[] idTeknisi = tki.getId();
        String[] passwordTeknisi = tki.getPassword();
        String[] namaTeknisi = tki.getNama();
        
        int tmp = 0;
        
        for(int i = 0; i < tki.getId().length; i++ ){
            if (idTeknisi[i].equals(id) && passwordTeknisi[i].equals(password)){
                ada = true;
                tmp = i;
            }
        }
        return ada;
    }
    
    @Override
    public Boolean loginPelanggan(String id, String password){
        
        
        Boolean ada = false;
        String[] idTeknisi = getId();
        String[] passwordTeknisi = getPassword();
        String[] namaTeknisi = getNama();
        
        int tmp = 0;
        
        System.out.println(getIndex());
        
        if (getIndex() != -1){
            for(int i = 0; i <=getIndex(); i++ ){
                if (idTeknisi[i].equals(id) && passwordTeknisi[i].equals(password)){
                    ada = true;
                    tmp = i;
                    setI(tmp);
                }
            }    
        }
        
        return ada;
    }
    
    public void setI(int i){
        this.i = i;
    }
    
    public int getI(){
        return i;
    }
}
