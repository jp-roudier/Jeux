package Unite;
import java.util.ArrayList;
import java.util.Iterator;

import Plateau.Position;

public class Troupe extends Unite {

	private ArrayList<Unite> listedUnite = new ArrayList<Unite>();
	
	public Troupe() {
	}
	
    public void addChild(Unite unite) {
    	listedUnite.add(unite);
    }

    public void removeChild(Unite unite) {
    	listedUnite.remove(unite);
    }

    public Unite getChild(int index) {
    	return listedUnite.get(index);
    }
    
    public void seDeplacer(Position _position) {
    	System.out.println("La troupe se déplace.");
    	for(Iterator<Unite> iterator = listedUnite.iterator(); iterator.hasNext();) {
    		Unite unite = iterator.next();
    		
    		if(unite != null) {
    			System.out.println(unite.toString() + ": ");
    			unite.seDeplacer(_position);
    		}
    	}
	}
	
	public void combattre() {
		for(Iterator<Unite> iterator = listedUnite.iterator(); iterator.hasNext();) {
    		Unite unite = iterator.next();
    		
    		if(unite != null) {
    			unite.combattre();
    		}
    	}
	}
	
	public void defendre() {
		for(Iterator<Unite> iterator = listedUnite.iterator(); iterator.hasNext();) {
    		Unite unite = iterator.next();
    		
    		if(unite != null) {
    			unite.defendre();
    		}
    	}
	}
}
