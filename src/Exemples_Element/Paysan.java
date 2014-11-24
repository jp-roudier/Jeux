package Exemples_Element;

import Exemples_TypeCombat.AttaqueMainsNus;
import Exemples_TypeDefense.DefendreSansDefense;
import Exemples_TypeDeplacement.Courir;
import Unite.Element;
import Unite.TypeCombat;
import Unite.TypeDefense;
import Unite.TypeDeplacement;


public class Paysan extends Element {

    public Paysan() {
    	super();
        this.attaquePrincipale = new AttaqueMainsNus();
        this.attaqueSecondaire = new AttaqueMainsNus();
        this.deplacement = new Courir();
        this.defendre = new DefendreSansDefense();
        
        this.force = 1;
        this.endurance = 7;
        this.defense = 3;
        this.experience = 1;
        this.attaqueActive = "AttaquePrincipale";
    }

    public Paysan(TypeCombat _attaquePrincipale, TypeCombat _attaqueSecondaire, TypeDeplacement _deplacement, TypeDefense _defendre) {        
        this.force = 1;
        this.endurance = 7;
        this.defense = 1;
        this.experience = 1;
        this.attaqueActive = "AttaquePrincipale";
    }
    
    public String toString() {
    	return "Paysan";
    }

}
