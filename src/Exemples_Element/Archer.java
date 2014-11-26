package Exemples_Element;

import Exemples_TypeCombat.*;
import Exemples_TypeDefense.*;
import Exemples_TypeDeplacement.*;
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
        
        this.endurance = 7;
        this.experience = 10;
        this.attaqueActive = "AttaquePrincipale";
        this.force = this.attaquePrincipale.getForcePoint();
        this.defense = this.defendre.getDefensePoint();
    }
    
    public Archer(Plateau.Case _case) {
    	super(_case);
        this.attaquePrincipale = new AttaqueALarc();
        this.attaqueSecondaire = new AttaqueMainsNus();
        this.deplacement = new Courir();
        this.defendre = new DefendreBouclier();
        
        this.endurance = 7;
        this.experience = 10;
        this.attaqueActive = "AttaquePrincipale";
        this.force = this.attaquePrincipale.getForcePoint();
        this.defense = this.defendre.getDefensePoint();
    }

    public Archer(TypeCombat _attaquePrincipale, TypeCombat _attaqueSecondaire, TypeDeplacement _deplacement, TypeDefense _defendre) {
        super(_attaquePrincipale, _attaqueSecondaire, _deplacement, _defendre);

        this.endurance = 7;
        this.experience = 10;
        this.attaqueActive = "AttaquePrincipale";
        this.force = this.attaquePrincipale.getForcePoint();
        this.defense = this.defendre.getDefensePoint();
    }
    
    public String toString() {
    	return "Archer";
    }

}
