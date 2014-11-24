package Unite;


public class Magicien extends Element {

    public Magicien() {
    	super();
        this.attaquePrincipale = new AttaqueMagie();
        this.attaqueSecondaire = new AttaqueMainsNus();
        this.deplacement = new Marcher();
        this.defendre = new DefendreMagie();
        
        this.force = 1;
        this.endurance = 5;
        this.defense = 2;
        this.experience = 10;
        this.attaqueActive = "AttaquePrincipale";
    }

    public Magicien(TypeCombat _attaquePrincipale, TypeCombat _attaqueSecondaire, TypeDeplacement _deplacement, TypeDefense _defendre) {
        super(_attaquePrincipale, _attaqueSecondaire, _deplacement, _defendre);
        
        this.force = 1;
        this.endurance = 5;
        this.defense = 2;
        this.experience = 10;
        this.attaqueActive = "AttaquePrincipale";
    }
    
    public String toString() {
    	return "Magicien";
    }

}
