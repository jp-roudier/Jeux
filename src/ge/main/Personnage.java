package ge.main;
import ge.comportement.*;


public abstract class Personnage {
	//Nos instances de comportement
	protected Attack espritCombatif = new AttackNone();
	//protected Soin soin = new AucunSoin();
	protected Move deplacement = new MoveWalk();	
	
	//Constructeur par défaut
	public Personnage(){}
	
	//Constructeur avec paramètres
	//public Personnage(Attack espritCombatif, Soin soin, Move deplacement) {
	public Personnage(Attack espritCombatif, Move deplacement) {
		this.espritCombatif = espritCombatif;
		//this.soin = soin;
		this.deplacement = deplacement;
	}
	
	//Méthode de déplacement de personnage
	public void seDeplacer(){
		//On utilise les objets de déplacement de façon polymorphe
		deplacement.deplacer();
	}

	// Méthode que les combattants utilisent
	public void combattre(){
		//On utilise les objets de déplacement de façon polymorphe
		espritCombatif.combat();
	}
		
	//Méthode de soin
	/*public void soigner(){
		//On utilise les objets de déplacement de façon polymorphe
		soin.soigne();
	}*/
	
	//Redéfinit le comportement au combat
	public void setEspritCombatif(Attack espritCombatif) {
		this.espritCombatif = espritCombatif;
	}
	
	//Redéfinit le comportement de Soin
	/*public void setSoin(Soin soin) {
		this.soin = soin;
	}*/
	
	//Redéfinit le comportement de déplacement
	public void setDeplacement(Move deplacement) {
		this.deplacement = deplacement;
	}	
}