package Entity;


public class Maulana06942_PelangganEntity extends Maulana06942_PelangganAbstractEntity{

    public static Object getPelEntityArrayList(int cekPriority) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String Priority;
	public Maulana06942_PelangganEntity(String no_id, String password, String nama, String no_telp, String IDpel, String Priority){
		super(no_id, password, nama, no_telp, IDpel);
		this.Priority=Priority;
	}

    public Maulana06942_PelangganEntity(String no_id, String pass, String nama, String notelp, String Priority) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
}

