package genericite;


public class Boite<T> {
    private T contenue;

    public Boite(T ex) {
        this.contenue = ex;
    }

    public T getEx(){
        return contenue;
    }

    public void setEx(T ex){
        this.contenue = ex;
    }
}
