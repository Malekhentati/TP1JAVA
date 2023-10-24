package genericite;
import java.util.ArrayList;
import java.util.List;

public class ListeTableau<T> implements ListeGenerique<T> {
	List<T> tab = new ArrayList<T>();

	@Override
	public void ajouter(T t) {
		tab.add(t);
	}

	@Override
	public T get() {
		return tab.get(0);
	}

	@Override
	public int taille() {
		int s =0;
		// TODO Auto-generated method stub
		for (T t : tab) {
			s++;
		}
		return s;
	}
	
	public static void main(String[] args) {
		ListeTableau<Integer> lt = new ListeTableau<>();
		lt.ajouter(4);
		lt.ajouter(5);
		lt.ajouter(6);
		System.out.println(lt.taille());
	}

}
