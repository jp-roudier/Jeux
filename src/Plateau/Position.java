package Plateau;

public class Position {

    public Integer positionY;

    public Integer positionX;

    public Integer getPositionY() {
        return positionY;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public Position() {
    }

    public Position(Integer positionX, Integer positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    public String toString() {
    	return ("Je me trouve aux coordonnées (X:" 
                + this.positionX.toString() 
                + ",Y:" + this.positionY.toString() 
                + ")\n");
    }

}
