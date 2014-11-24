package Unite;


public class Chevalier extends Element {

    public Chevalier() {
    	super();
        this.attaquePrincipale = new AttaqueALepee();
        this.attaqueSecondaire = new AttaqueMainsNus();
        this.deplacement = new Marcher();
        this.defendre = new DefendreBouclier();
        
        this.force = 4;
        endurance = 5;
        defense = 4;
        experience = 10;
        attaqueActive = "AttaquePrincipale";
    }

    public Chevalier(TypeCombat _attaquePrincipale, TypeCombat _attaqueSecondaire, TypeDeplacement _deplacement, TypeDefense _defendre) {
        super(_attaquePrincipale, _attaqueSecondaire, _deplacement, _defendre);
        
        this.force = 4;
        this.endurance = 5;
        this.defense = 4;
        this.experience = 10;
        this.attaqueActive = "AttaquePrincipale";
    }

    public String toString() {
    	return "Chevalier";
    }

}
