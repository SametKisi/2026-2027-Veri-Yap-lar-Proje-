package backend;

public class FiyatBST {

    private TreeNode kok;  //Agacin en tepesindeki kök dügümdür.

    public FiyatBST(){
        this.kok=null;     //ilk basta agac bos
    }

    //1-Ekleme
    public void ekle(Otel otel){
        kok=ekleRekursif(kok,otel);
    }

    private TreeNode ekleRekursif(TreeNode current, Otel otel){
        //Eger bos bir yere geldiysek yeni dugumu buraya bagla
        if (current==null){
            return new TreeNode(otel);
        }
        if (otel.getFiyat()<current.otel.getFiyat()){
            current.left=ekleRekursif(current.left,otel); //ucuzsa sola
        }
        else {
            current.right=ekleRekursif(current.right,otel);
        }

        return current;
    }

    //2-Sirali listele(In-order Traversal)

    public void fiyataGoreSirala(){
        inOrder(kok);
    }

    private void inOrder(TreeNode dugum){
        if (dugum!=null){
            inOrder(dugum.left);    //1. once en soldaki-en ucuz-
            System.out.println(dugum.otel); //2.ortadaki dugumu yazdir
            inOrder(dugum.right);           //3.sonra sagdaki -pahali-
        }
    }

    //3. String Parcalama(Parsing)

    public Otel metinOtelOlustur(String satir){
        String[] parcalar=satir.split(","); //virgule gore yaziyi bol
        int id=Integer.parseInt(parcalar[0].trim());
        String ad=parcalar[1].trim();
        String sehir=parcalar[2].trim();
        double fiyat=Double.parseDouble(parcalar[3].trim());

        return new Otel(id,ad,sehir,fiyat);

    }



}
