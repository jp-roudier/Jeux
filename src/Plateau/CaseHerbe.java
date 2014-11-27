package Plateau;


public class CaseHerbe extends Plateau.CaseDecorer {

    public CaseHerbe() {
        nonTraversable = false;
        occupe = false;
    }
    
    public boolean agir() {
        return nonTraversable;
    }

}
