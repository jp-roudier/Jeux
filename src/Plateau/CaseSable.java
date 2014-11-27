package Plateau;


public class CaseSable extends Plateau.CaseDecorer {
	
    public CaseSable() {
        nonTraversable = false;
        occupe = false;
    }
    
    public boolean agir() {
        return nonTraversable;
    }

}
