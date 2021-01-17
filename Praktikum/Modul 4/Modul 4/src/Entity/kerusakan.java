package Entity;

public class kerusakan {
    
    private String[] id_pelanggan = new String[100];
    private String[] kerusakan = new String[100];
    private String[] status = new String[100];
    
    private int i = -1;
    
    public void insertDataKerusakan(int i, String id_pelanggan, String kerusakan, String status){
        this.id_pelanggan[i] = id_pelanggan;
        this.kerusakan[i] = kerusakan;
        this.status[i] = status;
        this.i = i;
    }
    
    public void setStatus(int i, String status){
        this.status[i] = status;
    }

    public String[] getId_pelanggan() {
        return id_pelanggan;
    }

    public String[] getKerusakan() {
        return kerusakan;
    }
    
    public String[] getStatus() {
        return status;
    }
    
    public int getIndex() {
        return i;
    }
    
}
