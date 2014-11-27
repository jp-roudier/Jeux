package Plateau;


public class CaseEau extends Plateau.CaseDecorer {

    public CaseEau() {
        nonTraversable = true;
        occupe = false;
    }

    public boolean agir() {
        return nonTraversable;
    }

}
