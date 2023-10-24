package genericite;
public class Main {

    public static void main(String[] args) {
       /* Boite <Integer> ex = new Boite <Integer>(12);
        Paire<String,Double> a = new Paire();

        a.setTab("azaeazeaze");
        a.setTab("b");
        a.setTab("c");

        a.setTabv(10.0);
        a.setTabv(20.0);
        a.setTabv(30.0);

        System.out.println(a.getlist1());
        System.out.println(a.getlist2());*/

       Fournisseur<Produit<Integer>> f = new Fournisseur<>("wissem",69);

        f.setProduits(new Produit<Integer>(10.15,"Coffee"));
        f.setProduits(new Produit<Integer>(15.16,"Milk"));

        f.Afficher();

}
}