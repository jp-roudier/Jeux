package Plateau;


public class CaseForet extends Plateau.CaseDecorer {

    public CaseForet() {
        nonTraversable = false;
        occupe = false;
    }

    public boolean agir() {
        return nonTraversable;
    }

}
