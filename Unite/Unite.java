package Unite;

public abstract class Unite {

	public TypeDeplacement deplacement;
	public TypeCombat combat;

	public Unite(){}
	
	public Unite(TypeDeplacement deplacement, TypeCombat combat) {
		this.combat = combat;
		this.deplacement = deplacement;
	}
	
	public void seDeplacer() {
		deplacement.deplacer();
	}
	
	public void combattre() {
		combat.combattre();
	}
		
	public void setDeplacement(TypeDeplacement deplacement) {
		this.deplacement = deplacement;
	}
	
	public void setCombat(TypeCombat combat) {
		this.combat = combat;
	}
	
}