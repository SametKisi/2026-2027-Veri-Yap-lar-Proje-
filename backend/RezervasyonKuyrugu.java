package backend;

public class RezervasyonKuyrugu {

    private RezervasyonNode head;
    private RezervasyonNode tail;

    public RezervasyonKuyrugu() {
        //ilk ve son node boş yaptık ilk durum için
        this.head = null;
        this.tail = null;
    }

    public void ekle(String rezervasyon) {
        //yeni bir node eklendi
        RezervasyonNode yeni = new RezervasyonNode(rezervasyon);
        //eğer liste boşsa yeni node'yi en başa ekliyor
        if(bosMu()){
            head = yeni;
            tail = yeni;
        }
        else{
            //değilse sondan sonraki elemana yeni elemanı bağlıyor
            tail.next = yeni;
            tail = yeni;
        }

        System.out.println("sıraya eklendi : " + rezervasyon);
    }

    public boolean bosMu() {
        return head == null;
    }

    public String kaldir() {
        if (bosMu()) {
            System.out.println("kuyruk boş çıkarılacak rezervasyon yok.");
            return null;
        }
        String veri = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return veri;
    }

    public String siradakiKisi() {
        if (bosMu()) {
            return null;
        }
        return head.data;
    }
    public java.util.List<String> hepsi() {
        java.util.List<String> liste = new java.util.ArrayList<>();
        for (RezervasyonNode n = head; n != null; n = n.next) liste.add(n.data);
        return liste;
    }
}
