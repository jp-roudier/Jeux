package Exemples_Element;

import Exemples_TypeCombat.*;
import Exemples_TypeDefense.*;
import Exemples_TypeDeplacement.*;
import Plateau.Case;
import Unite.Element;
import Unite.TypeCombat;
import Unite.TypeDefense;
import Unite.TypeDeplacement;


public class Chevalier extends Element {

    public Chevalier() {
    	super();
        this.attaquePrincipale = new AttaqueALepee();
        this.attaqueSecondaire = new AttaqueMainsNus();
        this.deplacement = new Marcher();
        this.defendre = new DefendreBouclier();
        
        endurance = 5;
        experience = 10;
        attaqueActive = "AttaquePrincipale";
        this.force = this.attaquePrincipale.getForcePoint();
        this.defense = this.defendre.getDefensePoint();
    }
    
    public Chevalier(Case _case) {
    	super(_case);
        this.attaquePrincipale = new AttaqueALepee();
        this.attaqueSecondaire = new AttaqueMainsNus();
        this.deplacement = new Marcher();
        this.defendre = new DefendreBouclier();
        
        endurance = 5;
        experience = 10;
        attaqueActive = "AttaquePrincipale";
        this.force = this.attaquePrincipale.getForcePoint();
        this.defense = this.defendre.getDefensePoint();
    }
    
    public Chevalier(TypeCombat _attaquePrincipale, TypeCombat _attaqueSecondaire, TypeDeplacement _deplacement, TypeDefense _defendre) {
        super(_attaquePrincipale, _attaqueSecondaire, _deplacement, _defendre);
        
        this.endurance = 5;
        this.experience = 10;
        this.attaqueActive = "AttaquePrincipale";
        this.force = this.attaquePrincipale.getForcePoint();
        this.defense = this.defendre.getDefensePoint();
    }

    public String toString() {
    	return "Chevalier";
    }

}
