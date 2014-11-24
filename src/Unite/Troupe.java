package Unite;
import java.util.ArrayList;

public class Troupe extends Unite {
	
	public Unite unite;

	private ArrayList<Unite> listedUnite = new ArrayList<Unite>();
	
    public void Add() {
    	listedUnite.add(unite);
    }

    public void Suppr() {
    	listedUnite.remove(unite);
    }

    public ArrayList<Unite> getUnite() {
    	return listedUnite;
    }
}
