package Exemples_TypeCombat;

import Unite.TypeCombat;


public class AttaqueMainsNus implements TypeCombat {
	
	private final int force = 1;
	
    public void combattre() {
        System.out.println("J'attaque à mains nus.");
    }

    public String toString() {
    	return ("Attaque à mains nus");
    }
    
    public int getForcePoint() {
    	return force;
    }
}
