package Exemples_TypeCombat;

import Unite.TypeCombat;


public class AttaqueMainsNus implements TypeCombat {

    public void combattre() {
        System.out.println("J'attaque à mains nus.");
    }

    public String toString() {
    	return ("Attaque à mains nus");
    }
}
