package Exemples_TypeCombat;

import Unite.TypeCombat;


public class AttaqueALepee implements TypeCombat {

	private final int force = 5;
	
    public void combattre() {
        System.out.println("J'attaque à l'épée.");
    }

    public String toString() {
    	return ("Attaque à l'épée");
    }
    
    public int getForcePoint() {
    	return force;
    }
}
