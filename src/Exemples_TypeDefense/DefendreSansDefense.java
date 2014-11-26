package Exemples_TypeDefense;

import Unite.TypeDefense;

public class DefendreSansDefense implements TypeDefense {
	
	private final int defense = 0;
	
    public void defendre() {
    }
    
    public int getDefensePoint() {
    	return defense;
    }

}
