package backend;

class StackNode {
    Object islemData ;
    StackNode next ;

    public StackNode(Object islemData){
        this.islemData= islemData;
        this.next= null;

    }
}
public class IslemYigini {
    private StackNode top;
    private int elemanSayisi;

    public IslemYigini (){
        this.top = null;
        this.elemanSayisi= 0;
    }

    public void islemKaydet(Object islem){
        StackNode yeniDugum =new StackNode(islem);
        yeniDugum.next = top;
        top = yeniDugum ;
        elemanSayisi++;

    }

    public Object geriAl(){
        if (top == null){
            System.out.println("geri alınacak işlem yok");
            return null;
        }
        
        Object cikarilan = top.islemData;
        top = top.next;
        elemanSayisi--;
        return cikarilan;
    }
    public boolean bosMu(){
        return top == null;
    }

}