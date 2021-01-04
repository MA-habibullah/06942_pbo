package Entity;


public class Maulana06942_PelangganEntity{
    private boolean isVerified;
    private Maulana06942_PelangganEntity pelanggan;
    private String Verified;
    private int indexPriority;
    protected String no_id;
    protected String no_telp, IDpel;
    private String Priority;
    public String password;
    public String nama;
    public Maulana06942_PelangganEntity(int indexPel, Maulana06942_PelangganEntity pelangganEntity, boolean isVerified) {
        
    }

    public Maulana06942_PelangganEntity(String no_id, String password, String nama, String no_telp) {//, String Priority
		this.no_id = no_id;
                this.password = password;
		this.nama = nama;
		this.no_telp = no_telp;
                this.indexPriority=indexPriority;

    }

//  @Override
	public Maulana06942_PelangganEntity getpelanggan(){
            return pelanggan;
        }
	public void setpelanggan(Maulana06942_PelangganEntity pelanggan){
		this.pelanggan = pelanggan;
	}
	public String getno_id(){
		return no_id;
	}
        public void setno_id(String no_id){
                this.no_id = no_id;
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
        public void setVerified(boolean verified){
		isVerified = verified;
        }
        public int getindexPrio(){
		return indexPriority;
	}
	public void setindexpriority(int indexprio){
		this.indexPriority = indexprio;
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
}