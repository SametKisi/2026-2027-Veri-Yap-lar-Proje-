package backend;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DosyaYoneticisi {



    // - DOSYA TANIMI.
    private static final String DOSYA_ADI = "oteller.hot";



    // - BAĞLI LİSTEYİ DOSYAYA YAZMA.
    public void otelleriKaydet(OtelBagliListe liste) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DOSYA_ADI))) {
            OtelNode temp = liste.getHead();

            while (temp != null) {
                writer.write(temp.veri.dosyaSatiriCevir());
                writer.newLine();
                temp = temp.next;
            }

            System.out.println("Oteller basariyla " + DOSYA_ADI + " dosyasina kaydedildi.");
        }

        catch (IOException e) {

            System.out.println("Dosya yazma hatasi: " + e.getMessage());
        }
    }


    
    // - DOSYAYI OKUYUP LİSTEYE GERİ YAZMA.
    public void otelleriOku(OtelBagliListe liste) {
        try (BufferedReader reader = new BufferedReader(new FileReader(DOSYA_ADI))) {
            String satir;

            while ((satir = reader.readLine()) != null) {

                String[] parcalar = satir.split(",");

                int id = Integer.parseInt(parcalar[0].trim());

                String ad = parcalar[1].trim();
                String sehir = parcalar[2].trim();
                double fiyat = Double.parseDouble(parcalar[3].trim());

                // - ELDE EDİLEN VERİLERLE OTEL NESNESİ OLUŞTURUP BAĞLI LİSTEYE EKLEME.
                Otel okunanOtel = new Otel(id, ad, sehir, fiyat);
                liste.ekle(okunanOtel);
            }

            System.out.println("Dosyadan okuma işlemi tamamlandı.");
        }

        catch (IOException e) {
            System.out.println("Doysa okuma hatasi: " + e.getMessage());
        }
    }

}
