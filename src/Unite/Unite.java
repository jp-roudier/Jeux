package Unite;

import Plateau.Carte;
import Plateau.Case;
import Plateau.Position;

public abstract class Unite {

	protected TypeDeplacement deplacement;
	protected TypeCombat attaquePrincipale;
	protected TypeCombat attaqueSecondaire;
    protected TypeDefense defendre;
    protected Case _case;

	public Unite() {
    	this._case = Carte.getInstance().getAvailableCase();
	}
	
	public Unite(Case _case) {
    	this._case = _case;
	}
	
	public Unite(TypeCombat _attaquePrincipale, TypeCombat _attaqueSecondaire, TypeDeplacement _deplacement, TypeDefense _defendre) {	
		this.attaquePrincipale = _attaquePrincipale;
		this.attaqueSecondaire = _attaqueSecondaire;
		this.deplacement = _deplacement;
		this.defendre = _defendre;

    	this._case = Carte.getInstance().getAvailableCase();
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