package Unite;

import Exemples_TypeCombat.AttaqueMainsNus;
import Exemples_TypeDefense.DefendreSansDefense;
import Exemples_TypeDeplacement.Marcher;
import Plateau.Position;

public abstract class Unite {

	protected TypeDeplacement deplacement = new Marcher();;
	protected TypeCombat attaquePrincipale = new AttaqueMainsNus();
	protected TypeCombat attaqueSecondaire = new AttaqueMainsNus();
    protected TypeDefense defendre = new DefendreSansDefense();

	public Unite() {
	}
	
	public Unite(TypeCombat _attaquePrincipale, TypeCombat _attaqueSecondaire, TypeDeplacement _deplacement, TypeDefense _defendre) {	
		this.attaquePrincipale = _attaquePrincipale;
		this.attaqueSecondaire = _attaqueSecondaire;
		this.deplacement = _deplacement;
		this.defendre = _defendre;
	}
	
	public void seDeplacer(Position _position) {
	}
	
	public void combattre() {
	}
	
	public void defendre() {
	}
		
	public void setDeplacement(TypeDeplacement deplacement) {
	}
	
	public void setCombat(TypeCombat combat) {
		//this.combat = combat;
	}
	
}