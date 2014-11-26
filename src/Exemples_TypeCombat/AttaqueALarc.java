package Exemples_TypeCombat;

import Unite.TypeCombat;


public class AttaqueALarc implements TypeCombat {

	private final int force = 2;
	
    public void combattre() {
        System.out.println("J'attaque à l'arc.");
    }
    
    public String toString() {
    	return ("Attaque à l'arc");
    }
    
    public int getForcePoint() {
    	return force;
    }

}
