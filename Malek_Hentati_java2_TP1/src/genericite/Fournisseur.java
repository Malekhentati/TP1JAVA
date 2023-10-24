package genericite;
import java.util.ArrayList;
import java.util.List;

public class Fournisseur<T>{
    private String nom;
    private int ID;
    private List<T> produits = new ArrayList<T>();

    public Fournisseur(String nom, int id){
        this.nom = nom;
        this.ID = id;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setID(int id){
        this.ID = id;
    }
    public String getNom(){
        return this.nom;
    }

    public int getID(){
        return this.ID;
    }

    public void setProduits(T prod){
        this.produits.add(prod);
    }

    public void Afficher(){
        for (T prod : this.produits) {
            System.out.println(prod.toString());
        }}}
