package backend;

public class main {
    public static void main(String[] args) {
     
        

        System.out.println("===== Otel Rezervasyon Sistemi =====");

        // ÇİFT YÖNLÜ BAĞLI LİSTE NESNESİ OLUŞTURDUK.
        OtelBagliListe yeniListe = new OtelBagliListe();

        // TEST İÇİN ÖRNEK OTEL NESNELERİ OLUŞTURDUK.
        Otel otel1 = new Otel(1, "Ankara Başkent Otel", "Ankara");
        Otel otel2 = new Otel(2, "İzmir Ege Otel", "İzmir");
        Otel otel3 = new Otel(3, "Büyük Osmaniye Oteli", "Osmaniye");

        // OTELLERİ BAĞLI LİSTEYE EKLEDİK.
        yeniListe.ekle(otel1);
        yeniListe.ekle(otel2);
        yeniListe.ekle(otel3);

        //LİSTEDEKİ NODELAR EKRANA YAZDIRILDI.
        System.out.println("\n");
        yeniListe.listele();


    }
}
