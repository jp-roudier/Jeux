package Exemples;

import Unite.AttaqueALarc;
import Unite.AttaqueMainsNus;
import Unite.Courir;
import Unite.DefendreBouclier;
import Unite.Element;
import Unite.TypeCombat;
import Unite.TypeDefense;
import Unite.TypeDeplacement;


public class Archer extends Element {
    public Archer() {
    	super();
        this.attaquePrincipale = new AttaqueALarc();
        this.attaqueSecondaire = new AttaqueMainsNus();
        this.deplacement = new Courir();
        this.defendre = new DefendreBouclier();
        
        this.force = 2;
        this.endurance = 7;
        this.defense = 3;
        this.experience = 10;
        this.attaqueActive = "AttaquePrincipale";
    }
    
    public Archer(Plateau.Case _case) {
    	super(_case);
        this.attaquePrincipale = new AttaqueALarc();
        this.attaqueSecondaire = new AttaqueMainsNus();
        this.deplacement = new Courir();
        this.defendre = new DefendreBouclier();
        
        this.force = 2;
        this.endurance = 7;
        this.defense = 3;
        this.experience = 10;
        this.attaqueActive = "AttaquePrincipale";
    }

    public Archer(TypeCombat _attaquePrincipale, TypeCombat _attaqueSecondaire, TypeDeplacement _deplacement, TypeDefense _defendre) {
        super(_attaquePrincipale, _attaqueSecondaire, _deplacement, _defendre);
        
        this.force = 2;
        this.endurance = 7;
        this.defense = 3;
        this.experience = 10;
        this.attaqueActive = "AttaquePrincipale";
    }
    
    public String toString() {
    	return "Archer";
    }

}
