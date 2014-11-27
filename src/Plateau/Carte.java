package Plateau;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;


public class Carte implements Plateau.ITFCarte {

    private int width;

    private int height;

    private Map<Position, Case> _case = new HashMap<Position, Case> ();

    public static Carte carte;

    public Carte buildCarte(int width, int height) {
        if(carte != null) {
        	this.width = width;
            this.height = height;
            
            if(this.width != 0 && this.height != 0) {
                for(int line = 0; line < this.width; ++line) {
                    for(int column = 0; column < this.height; ++column) {
                        Position pos = new Position(column, line);
                        Case casePosition = new Case(pos);
                        _case.put(pos, casePosition);
                    }
                }
                System.out.println("Une carte de " + this.width + " cases de largeur * " + this.height +" cases de hauteur vient d'être créer.\n");
            }
            return carte;
        } else {
            System.out.println("La carte n'est pas instanciée");
        }
        return null;
    }

    private Carte() {
    	this.width = 0;
    	this.height = 0;
    }

    public Case getCaseFromPosition(Position _position) {
        return  _case.get(_position);
    }
    
    public Case getAvailableCase() {
    	Case caseAvailable = null;
    	Iterator<Entry<Position, Case>> it = _case.entrySet().iterator();
        while (it.hasNext()) {
            Entry<Position, Case> pairs = it.next();
            if(!pairs.getValue().comportement.getOccupe()) {
            	caseAvailable = pairs.getValue();
            	caseAvailable.comportement.setOccupe(true);
            	break;            	
            } else {
            	continue;
            }
        }
    	return caseAvailable;
    }

    public static Carte getInstance() {
    	if(carte == null) {
    		carte = new Carte();
    	}
        return carte;
    }

}
