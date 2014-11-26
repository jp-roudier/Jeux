package Exemples_Element;

import Exemples_TypeCombat.*;
import Exemples_TypeDefense.*;
import Exemples_TypeDeplacement.*;
import Plateau.Case;
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
        
        this.endurance = 7;
        this.experience = 1;
        this.attaqueActive = "AttaquePrincipale";
        this.force = this.attaquePrincipale.getForcePoint();
        this.defense = this.defendre.getDefensePoint();
    }
    
    public Paysan(Case _case) {
    	super(_case);
        this.attaquePrincipale = new AttaqueMainsNus();
        this.attaqueSecondaire = new AttaqueMainsNus();
        this.deplacement = new Courir();
        this.defendre = new DefendreSansDefense();
        
        this.endurance = 7;
        this.experience = 1;
        this.attaqueActive = "AttaquePrincipale";
        this.force = this.attaquePrincipale.getForcePoint();
        this.defense = this.defendre.getDefensePoint();
    }

    public Paysan(TypeCombat _attaquePrincipale, TypeCombat _attaqueSecondaire, TypeDeplacement _deplacement, TypeDefense _defendre) {        
    	super(_attaquePrincipale, _attaqueSecondaire, _deplacement, _defendre);
    	
        this.endurance = 7;
        this.experience = 1;
        this.attaqueActive = "AttaquePrincipale";
        this.force = this.attaquePrincipale.getForcePoint();
        this.defense = this.defendre.getDefensePoint();
    }
    
    public String toString() {
    	return "Paysan";
    }

}
