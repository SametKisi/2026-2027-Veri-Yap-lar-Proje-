package backend;

//ÇİFT YÖNLÜ BAĞLI LİSTEDEKİ ELEMANLARI TEMSİL EDEN SINIF.
public class OtelNode {
    
    //NODE OTEL NESNESİ.
    public Otel veri;
    //BİR SONRAKİ NODE İÇİN İŞARETÇİ.
    public OtelNode next;
    //BİR ÖNCEKİ NODE İÇİN İŞARETÇİ.
    public OtelNode prev;  

    public OtelNode(Otel yeniOtel) {
        this.veri = yeniOtel;

        //NODE'UN İLK HALİ LİSTEYE BAĞLI OLMADIĞI İÇİN SONRAKİ VE ÖNCEKİ BAĞLAR BOŞTUR.

        this.next = null;
        this.prev = null;
    }
    
}
