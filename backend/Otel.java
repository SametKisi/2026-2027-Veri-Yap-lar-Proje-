package backend;

// - TEMEL KAYITDAN MİRAS ALINDI.
public class Otel extends TemelKayit {
    private String ad;
    private String sehir;
    private Double fiyat;

    public Otel(int id, String ad, String sehir, Double fiyat) {

        // - ATA SINIFIN CONSTRUCTOR'INA ID'Yİ GÖNDERİR.
        super(id);

        this.ad = ad;
        this.sehir = sehir;
        this.fiyat = fiyat;
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

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    // - ATA SINIFIN SOYUT METODU OVERRİDE EDİLDİ.
    @Override
    public String dosyaSatiriCevir() {
        return getId() + "," + ad + "," + sehir + "," + fiyat;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "| Otel: " + ad + "| Şehir: " + sehir + "| Fiyat: " + fiyat + "TL";
    }
}
