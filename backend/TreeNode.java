package backend;

    public class TreeNode {

    Otel otel;  //Dugumun tasidigi veri
    TreeNode left;
    TreeNode right;

    //Constructor
    public TreeNode(Otel otel){
        this.otel=otel;
        this.left=null; //ilk olustugunda sag ve sol bostur
        this.right=null;
    }

}
