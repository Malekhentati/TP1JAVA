package genericite;

public class Calculateur {
	   public <t extends Number> double somme(t[] tab){
	        double somme = 0.0;

	        for (int i = 0; i < tab.length; i++) {
	            somme = somme + tab[i].doubleValue();
	        }

	        return somme;
	    }
}

