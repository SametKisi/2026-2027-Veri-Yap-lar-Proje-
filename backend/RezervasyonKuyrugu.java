package backend;

import java.util.ArrayList;

public class RezervasyonKuyrugu {
    
    private ArrayList<String> kuyruk;

    public RezervasyonKuyrugu(){
        this.kuyruk = new ArrayList<>();
    }

    public void ekle (String rezervasyon){
        kuyruk.add(rezervasyon);
        System.out.println("sıraya eklendi : " + rezervasyon);
    }

    public boolean bosMu(){
        return kuyruk.isEmpty();
    }

    public String kaldir() {
        if(bosMu()){
            System.out.println("kuyruk boş çıkarılacak rezervasyon yok.");
            return null;
        }
        return kuyruk.remove(0);
    }
    public String siradakiKisi(){
        if(bosMu()){
            return null;
        }
        return kuyruk.get(0);
    }
}
