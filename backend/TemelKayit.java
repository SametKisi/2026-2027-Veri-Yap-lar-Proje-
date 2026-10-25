package backend;

//ATA SINIF.
public abstract class TemelKayit {

    private int id;
    
    public TemelKayit (int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    //DAHA SONRA ALT SINIFLARDA DOLACAKTIR.
    public abstract String dosyaSatiriCevir();
}
