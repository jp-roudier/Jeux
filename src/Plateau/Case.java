package Plateau;


public class Case {

    public Comportement comportement;

    public Position position;

    public Case() {
    	this.comportement = new CaseVierge();
    	this.position = new Position();
    }
    
    public Case(Comportement comportement) {
    	if(comportement != null) {
    		this.comportement = comportement;
    	} else {
    		this.comportement = new CaseVierge();
    	}
    }
    
    public Case(Position position, Comportement comportement) {
    	if(position != null) {
        	this.position = position;
        } else {
        	this.position = new Position();
        }
    	if(comportement != null) {
    		this.comportement = comportement;
    	} else {
    		this.comportement = new CaseVierge();
    	}
    }

    public Position getPosition() {
        return position;
    }

    public Case(Position position) {
        if(position != null) {
        	this.position = position;
        } else {
        	this.position = new Position();
        }
        this.comportement = new CaseVierge();
    }

}
