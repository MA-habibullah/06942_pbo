package Entity;

/**
 *
 * @author MAULANA
 */
public class DaftarPelEntity {
    private PelangganEntity pelanggan;
    private boolean isVerified;
    private int indexservis;

    public DaftarPelEntity(int indexservis, PelangganEntity pelanggan, boolean isVerified){
        this.pelanggan = pelanggan;
        this.isVerified = isVerified;
        this.indexservis = indexservis;
    }

    public PelangganEntity getpelanggan(){
        return pelanggan;
    }

    public void setpelanggan(PelangganEntity pelanggan){
        this.pelanggan = pelanggan;
    }
    public boolean isVerified(){
        return isVerified;
    }
    public void setVerified(boolean verified){
        isVerified = verified;
    }
    public int getIndexservis(){
        return indexservis;
    }
    public void setIndexservis(int indexservis){
        this.indexservis = indexservis;
    }
}
