public class Anak1 extends Indux implements AktivitasPagi, AktivitasSore{


    public Anak1() {
        super("anak 1");
        System.out.println("Anak1 terpanggil");
    }
    
    public Anak1(String nama) {
        super(nama);
        System.out.println("ada nama anak");
    }
    

    @Override
    public void getAlamat() {
        System.out.println("jalan raya anak1");
    }

    public void getAlamatIndux(){
        super.getAlamat();
    }

    public void getAlamatSuperIndux() {
        super.getAlamatSuperIndux();
    }

    @Override
    public void getAlamatKedua() {
        System.out.println(""); 
    }

    @Override
    public void lariPagi() {
        
    }
    
    @Override
    public void berenang() {
        
    }

    @Override
    public void makan() {
        
    }
}
