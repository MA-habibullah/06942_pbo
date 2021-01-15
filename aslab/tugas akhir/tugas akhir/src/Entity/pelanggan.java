package Entity;

public class pelanggan {

    private String[] id = new String[100];
    private String[] nama = new String[100];
    private String[] password = new String[100];
    private String[] no_telpon = new String[100];
    private String[] alamat = new String[100];
    
    private int i = -1;
    
    public void insertData(int i, String id, String nama, String password, String no_telpon, String alamat){
        this.id[i] = id;
        this.nama[i] = nama;
        this.password[i] = password;
        this.no_telpon[i] = no_telpon;
        this.alamat[i] = alamat;
        this.i = i;
    }

    public String[] getId() {
        return id;
    }

    public String[] getNama() {
        return nama;
    }

    public String[] getPassword() {
        return password;
    }

    public String[] getNo_telpon() {
        return no_telpon;
    }

    public String[] getAlamat() {
        return alamat;
    }
    
    public int getIndex() {
        return i;
    }
}
