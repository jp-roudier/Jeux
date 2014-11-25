package Unite;

import Exemples_TypeCombat.AttaqueMainsNus;
import Exemples_TypeDefense.DefendreSansDefense;
import Exemples_TypeDeplacement.Marcher;
import Plateau.Carte;
import Plateau.Case;
import Plateau.Position;

public abstract class Unite {

	protected TypeDeplacement deplacement = new Marcher();;
	protected TypeCombat attaquePrincipale = new AttaqueMainsNus();
	protected TypeCombat attaqueSecondaire = new AttaqueMainsNus();
    protected TypeDefense defendre = new DefendreSansDefense();
    protected Case _case;

	public Unite() {
    	this._case = Carte.getInstance().GetAvailableCase();
	}
	
	public Unite(Case _case) {
    	this._case = _case;
	}
	
	public Unite(TypeCombat _attaquePrincipale, TypeCombat _attaqueSecondaire, TypeDeplacement _deplacement, TypeDefense _defendre) {	
		this.attaquePrincipale = _attaquePrincipale;
		this.attaqueSecondaire = _attaqueSecondaire;
		this.deplacement = _deplacement;
		this.defendre = _defendre;

    	this._case = Carte.getInstance().GetAvailableCase();
	}
	
	public Unite(TypeCombat _attaquePrincipale, TypeCombat _attaqueSecondaire, TypeDeplacement _deplacement, TypeDefense _defendre, Case _case) {	
		this.attaquePrincipale = _attaquePrincipale;
		this.attaqueSecondaire = _attaqueSecondaire;
		this.deplacement = _deplacement;
		this.defendre = _defendre;
		
    	this._case = _case;
	}
	
	public void seDeplacer(Position _position) {
	}
	
	public void combattre() {
	}
	
	public void defendre() {
	}
	
}