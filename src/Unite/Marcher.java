package Unite;

import Plateau.Position;


public class Marcher implements TypeDeplacement {

    public void deplacer(Position _position) {
        System.out.println("Je me déplace en marchant vers la position (" 
                            + _position.getPositionX().toString() + "," 
                            + _position.getPositionY().toString() +")");
    }

}
