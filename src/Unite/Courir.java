package Unite;

import Plateau.Position;


public class Courir implements TypeDeplacement {
	
    public void deplacer(Position _position) {
        System.out.println("Je me déplace en courant vers la position (" 
                + _position.getPositionX().toString() + "," 
                + _position.getPositionY().toString() +")");
    }

}
