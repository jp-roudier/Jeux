package Exemples_TypeCombat;

import Unite.TypeCombat;


public class AttaqueALepee implements TypeCombat {

    public void combattre() {
        System.out.println("J'attaque à l'épée.");
    }

    public String toString() {
    	return ("Attaque à l'épée");
    }
}
