package backend;

public class main {
    public static void main(String[] args) {



        // - SAMET KİŞİ EKLEDİ.
        RezervasyonKuyrugu rezervasyonKuyrugu = new RezervasyonKuyrugu();

        rezervasyonKuyrugu.ekle("Adar");
        rezervasyonKuyrugu.ekle("Mahmut");

        System.out.println("sıradaki kişi : " + rezervasyonKuyrugu.siradakiKisi());
        System.out.println("Kaldirilan kisi : " + rezervasyonKuyrugu.kaldir());
        System.out.println("yeni siradaki kisi :" + rezervasyonKuyrugu.siradakiKisi());



        // - SAMET DELİCE EKLEDİ.
        // - ÇİFT YÖNLÜ BAĞLI LİSTE NESNESİ OLUŞTURDUK.
        System.out.println("===== Otel Rezervasyon Sistemi =====");
        OtelBagliListe yeniListe = new OtelBagliListe();

        // - TEST İÇİN ÖRNEK OTEL NESNELERİ OLUŞTURDUK.
        Otel otel1 = new Otel(1, "Ankara Başkent Otel", "Ankara", 600.0);
        Otel otel2 = new Otel(2, "İzmir Ege Otel", "İzmir", 500.0);
        Otel otel3 = new Otel(3, "Büyük Osmaniye Oteli", "Osmaniye", 300.0);

        // - OTELLERİ BAĞLI LİSTEYE EKLEDİK.
        yeniListe.ekle(otel1);
        yeniListe.ekle(otel2);
        yeniListe.ekle(otel3);

        // - LİSTEDEKİ NODELAR EKRANA YAZDIRILDI.
        System.out.println("\n");
        yeniListe.listele();

        // - 2 ID'Lİ OTELİN BİLGİLERİ GÜNCELLENDİ.
        System.out.println("\n--- Güncelleme Testi ---");
        yeniListe.guncelle(2, "İzmir Kordon Palas", "İzmir");
        yeniListe.listele();

        // - 1 ID'Lİ OTEL LİSTEDEN SİLİNDİ.
        System.out.println("\n--- Silme Testi ---");
        yeniListe.sil(1);
        yeniListe.listele();
        System.out.println("\n");



        // - ESRA KESİP EKLEDİ.
        FiyatBST bst = new FiyatBST();

        // 1. olarak string parcalama methodumuzu test edecegiz
        Otel o1 = bst.metinOtelOlustur("101,Trump,Istanbul,15000");
        Otel o2 = bst.metinOtelOlustur("103,GrandDerya,Igdir,2500");
        Otel o3 = bst.metinOtelOlustur("104,Eftalya Aqua,Antalya ,10000");

        // 2. Agaca ekliyoruz
        bst.ekle(o1);
        bst.ekle(o2);
        bst.ekle(o3);

        // 3. Fiyatına gore siraliyoruz
        bst.fiyataGoreSirala();
        System.out.println("\n");



        // - YAĞMUR YEŞİLKAYA EKLEDİ.
        IslemYigini yigin = new IslemYigini();
        System.out.println("Yiğin Testi Çalişiyor");
        System.out.println("\n");



        // - SAMET DELİCE EKLEDİ.
        DosyaYoneticisi dosyaYoneticisi = new DosyaYoneticisi();
        dosyaYoneticisi.otelleriKaydet(yeniListe);

        OtelBagliListe dosyadanGelenListe = new OtelBagliListe();
        dosyaYoneticisi.otelleriOku(dosyadanGelenListe);

        dosyadanGelenListe.listele();
    }

}
