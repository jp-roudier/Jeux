package Unite;

import Plateau.Carte;
import Plateau.Case;
import Plateau.Position;

public class Element extends Unite {

	protected Integer force;

    protected Integer defense;

    protected Integer endurance;

    protected Integer experience;

    protected String attaqueActive;

    public Element() {
    	super();
    }
    
    public Element(Case _case) {
    	super(_case);
    }
    
    public Element(TypeCombat _attaquePrincipale, TypeCombat _attaqueSecondaire, TypeDeplacement _deplacement, TypeDefense _defendre) {
    	super(_attaquePrincipale, _attaqueSecondaire, _deplacement, _defendre);
    }
    
    public Element(TypeCombat _attaquePrincipale, TypeCombat _attaqueSecondaire, TypeDeplacement _deplacement, TypeDefense _defendre, Case _case) {
    	super(_attaquePrincipale, _attaqueSecondaire, _deplacement, _defendre, _case);
    }

    public void seDeplacer(Position _position) {
        Case destinationCase = Carte.getInstance().GetCaseFromPosition(_position);
        if(!Carte.getInstance().GetCaseFromPosition(_position).comportement.agir()) {
            deplacement.deplacer(_position);
            this._case = destinationCase;
        }
    }

    public void combattre() {
        if(this.attaqueActive.equals("Principale")){
            attaquePrincipale.combattre();
        } else if((this.attaqueActive.equals("Secondaire"))){
            attaqueSecondaire.combattre();
        }
    }

    public void defendre() {
        defendre.defendre();
    }

    public void PrintPosition() {
        System.out.println("Je me trouve aux coordonnées (X:" 
                            + _case.getPosition().getPositionX().toString() 
                            + ",Y:" + _case.getPosition().getPositionY().toString() + ")\n");
    }
    
    public Position GetPosition() {
    	return _case.getPosition();
    }
    
    public void GetInformation() {
    	System.out.println("Je suis un "+ this.toString() +". Mes attaques sont: " 
    						+ "Attaque Principale: " + attaquePrincipale.toString() + ", " 
    						+ "Attaque Secondaire: " + attaqueSecondaire.toString() + "\n"
    						+ this.GetPosition()
    						+ this.GetStatus());
    }
    
    public String GetStatus() {
    	return ("Ma force est de: "+ force.toString() + "\n"
				+ "Mon endurance est de: "+ endurance.toString() + "\n"
				+ "Ma défense est de: "+ defense.toString() + "\n"
				+ "Mon expérience est de: "+ experience.toString() + "\n"
				+ "Mon attaque active est: "+ attaqueActive + "\n");
    }
}