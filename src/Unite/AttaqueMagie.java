package Unite;


public class AttaqueMagie implements TypeCombat {

    public void combattre() {
        System.out.println("J'attaque avec de la magie.");
    }

    public String toString() {
    	return ("Attaque magique");
    }
}
