package Exemples_Element;

import Exemples_TypeCombat.*;
import Exemples_TypeDefense.*;
import Exemples_TypeDeplacement.*;
import Unite.Element;
import Unite.TypeCombat;
import Unite.TypeDefense;
import Unite.TypeDeplacement;


public class Magicien extends Element {

    public Magicien() {
    	super();
        this.attaquePrincipale = new AttaqueMagie();
        this.attaqueSecondaire = new AttaqueMainsNus();
        this.deplacement = new Marcher();
        this.defendre = new DefendreMagie();
        
        this.endurance = 5;
        this.experience = 10;
        this.attaqueActive = "AttaquePrincipale";
        this.force = this.attaquePrincipale.getForcePoint();
        this.defense = this.defendre.getDefensePoint();
    }

    public Magicien(Plateau.Case _case) {
    	super(_case);
        this.attaquePrincipale = new AttaqueMagie();
        this.attaqueSecondaire = new AttaqueMainsNus();
        this.deplacement = new Marcher();
        this.defendre = new DefendreMagie();
        
        this.endurance = 5;
        this.experience = 10;
        this.attaqueActive = "AttaquePrincipale";
        this.force = this.attaquePrincipale.getForcePoint();
        this.defense = this.defendre.getDefensePoint();
    }
    
    public Magicien(TypeCombat _attaquePrincipale, TypeCombat _attaqueSecondaire, TypeDeplacement _deplacement, TypeDefense _defendre) {
        super(_attaquePrincipale, _attaqueSecondaire, _deplacement, _defendre);
        
        this.endurance = 5;
        this.experience = 10;
        this.attaqueActive = "AttaquePrincipale";
        this.force = this.attaquePrincipale.getForcePoint();
        this.defense = this.defendre.getDefensePoint();
    }
    
    public String toString() {
    	return "Magicien";
    }

}
