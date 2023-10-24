package genericite;
public class Produit<T>{
    private double prix;
    private String nom;
    private static int ref = 0;
    private int Thisref;

    public Produit(double prix, String nom){
        this.nom = nom;
        this.prix = prix;
        this.Thisref = ref++;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    public int getRef(){
        return Thisref;
    }

    public void setPrix(double prix){
        this.prix = prix;
    }

    public double getPrix(){
        return this.prix;
    }

    public String toString(){
        return this.nom + " " + this.prix;
     }}
