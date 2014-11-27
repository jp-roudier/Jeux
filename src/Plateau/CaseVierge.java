package Plateau;


public class CaseVierge implements Plateau.Comportement {
	
     boolean nonTraversable = false;
     boolean occupe = false;

    public void setOccupe(boolean occupe) {
		this.occupe = occupe;
	}

    public boolean agir() {
        return nonTraversable;
    }
    
    public boolean getOccupe() {
    	return occupe;
    }

}
