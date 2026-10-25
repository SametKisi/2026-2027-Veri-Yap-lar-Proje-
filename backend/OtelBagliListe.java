package backend;

public class OtelBagliListe {

    // LİSTENİN İLK VE SON DÜĞÜMÜNÜ VE ELEMAN SAYISINI TUTAN DEĞİŞKENLER.
    private OtelNode head;
    private OtelNode tail;
    private int elemanSayisi;

    public OtelBagliListe() {
        this.head = null;
        this.tail = null;
        this.elemanSayisi = 0;
    }


    
    public void ekle(Otel yeniOtel) {
        OtelNode yeniVagon = new OtelNode(yeniOtel);

        // EĞER LİSTE BOŞSA EKLENEN DÜĞÜM HEM BAŞ HEM DE SON DÜĞÜM OLUR.
        if (head == null) {
            head = yeniVagon;
            tail = yeniVagon;
        }

        // EĞER LİSTE DOLUYSA EKLENEN DÜĞÜMÜ EN SONA ÇİFT YÖNLÜ BAĞLA VE TAİLİ GÜNCELLE.
        else {
            tail.next = yeniVagon;
            yeniVagon.prev = tail;
            tail = yeniVagon;
        }

        elemanSayisi++;
    }



    public void listele() {

        if (head == null) {
            System.out.println("Otel listesi şu an boş.");
            return;
        }

        // LİSTEYİ GEZMEK İÇİN GEÇİCİ DÜĞÜMÜ İLK DÜĞÜME EŞİTLEDİK.
        OtelNode temp = head;
        System.out.println("----- KAYITLI OTELLER -----");

        // SON DÜĞÜMÜ GEÇENE KADAR TÜM DÜĞÜMLERİ DOLAŞ.
        while (temp != null) {
            System.out.println("ID: " + temp.veri.getId() + " | Otel Adı: " + temp.veri.getAd() + " | Şehir: " + temp.veri.getSehir() + " | Fiyat: " + temp.veri.getFiyat());

            // BİR SONRAKİ DÜĞÜME İLERLE.
            temp = temp.next;
        }

        System.out.println("Toplam otel sayısı: " + elemanSayisi);
    }



    public void sil(int silinecekId) {

        OtelNode temp = head;

        while (temp != null && temp.veri.getId() != silinecekId) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Silenecek ID bulunamadi!");
            return;
        }

        if (temp == head && temp == tail) {
            head = null;
            tail = null;
        }

        else if (temp == head) {
            head = head.next;
            head.prev = null;
        }

        else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        }

        else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        elemanSayisi--;

        System.out.println(silinecekId + "ID'li otel silindi.");
    }



    public void guncelle(int guncellenecekId, String yeniAd, String yeniSehir) {

        OtelNode temp = head;

        while (temp != null && temp.veri.getId() != guncellenecekId) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Güncellenecek ID bulunamadi!");
            return;
        }

        temp.veri.setAd(yeniAd);
        temp.veri.setSehir(yeniSehir);
        System.out.println(guncellenecekId + " ID'li otel bilgileri güncellendi.");
    }

    

    public OtelNode getHead() {
        return head;
    }

}
