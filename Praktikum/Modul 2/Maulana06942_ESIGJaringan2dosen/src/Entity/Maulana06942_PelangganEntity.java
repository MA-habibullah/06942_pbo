package Entity;


public class Maulana06942_PelangganEntity extends Maulana06942_ManusiaAbstractEntity{
    private boolean isVerified;
    private Maulana06942_PelangganEntity pelanggan;
    
    public static Object getPelEntityArrayList(int cekPriority) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String Verified;
    	public Maulana06942_PelangganEntity(int indexpriority, Maulana06942_PelangganEntity admin, boolean isVerified){
		this.isVerified = isVerified;
                this.pelanggan = pelanggan;
        }
	public Maulana06942_PelangganEntity getpelanggan(){
            return pelanggan;
        }
    private String Priority;
	public Maulana06942_PelangganEntity(String no_id, String password, String nama, String no_telp, String Priority){
		super(no_id, password, nama, no_telp);
		this.Priority=Priority;
	}
	public void setpelanggan(Maulana06942_PelangganEntity pelanggan){
		this.pelanggan = pelanggan;
	}
        
	@Override
	public String getNo_id(){
		return no_id;
	}
	public String getPriority(){
		return Priority;
	}
	public void setPriority(String Priority){
		this.Priority = Priority;
	}
            	public boolean isVerified(){
		return isVerified;
	}

    public int getIndexPriority() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}