package ge.main;
import ge.comportement.*;

public class Hero extends Personnage {	
	public Hero(){
		this.espritCombatif = new AttackDistance();
	}
	
	public Hero(Attack esprit, Soin soin, Move dep) {
		super(esprit, soin, dep);
	}
	
	
}