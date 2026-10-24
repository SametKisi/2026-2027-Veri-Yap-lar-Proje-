package backend;

//TEMEL KAYITDAN MİRAS ALINDI.
public class Otel extends TemelKayit {
    private String ad;
    private String sehir;
    
    public Otel (int id, String ad, String sehir) {
        
        //ATA SINIFIN CONSTRUCTOR'INA ID'Yİ GÖNDERİR.
        super(id);

        this.ad = ad;
        this.sehir = sehir;
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }


    //ATA SINIFIN SOYUT METODU OVERRİDE EDİLDİ.
    @Override 
    public String dosyaSatiriCevir() {
        return getId() + "," + ad + "," + sehir; 
    }
}
