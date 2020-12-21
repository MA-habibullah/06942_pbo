package Entity;

public class Maulana06942_TeknisiEntity  extends Maulana06942_ManusiaAbstractEntity{
    private String jaringan;
	public Maulana06942_TeknisiEntity(String id, String password, String nama, String no_telp,String priority){
		super(id, password, nama, no_telp);
			this.jaringan = priority;
	}
        
        @Override
	public String getNo_id(){
		return no_id;
	}
	
	public String getJaringan(){
		return jaringan;
	}
	
	public void setJaringan(String jaringan){
		this.jaringan = jaringan;
	}   
}
