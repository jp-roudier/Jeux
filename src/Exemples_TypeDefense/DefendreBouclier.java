package Exemples_TypeDefense;

import Unite.TypeDefense;


public class DefendreBouclier implements TypeDefense {

	private final int defense = 3;
	
	public void defendre() {
    }

    public int getDefensePoint() {
    	return defense;
    }
}
