package Exemples_TypeCombat;

import Unite.TypeCombat;


public class AttaqueMagie implements TypeCombat {

	private final int force = 5;
	
    public void combattre() {
        System.out.println("J'attaque avec de la magie.");
    }

    public String toString() {
    	return ("Attaque magique");
    }
    
    public int getForcePoint() {
    	return force;
    }
}
