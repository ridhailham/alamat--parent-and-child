public class Indux extends SuperIndux implements AktivitasPagi{
    
    public String namaInduk = "Induk";

    public Indux(String nama) {
        System.out.println("ada nama indux");
        System.out.println("Indux terpanggil");
    }

    public void LariPagi() {

    }

    public void getAlamat() {
        System.out.println("Jl. Raya Indux");
    }

    public void getAlamatSuperIndux() {
        super.getAlamat();
    }

    @Override
    public void lariPagi() {
        
    }
    
    // public abstract void getAlamatKedua();

}
