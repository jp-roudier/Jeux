package Unite;
import java.util.ArrayList;

public class Troupe extends Unite {

	private ArrayList<Unite> listedUnite = new ArrayList<Unite>();
	
    public void addChild(Unite unite) {
    	listedUnite.add(unite);
    }

    public void removeChild(Unite unite) {
    	listedUnite.remove(unite);
    }

    public Unite getChild(int index) {
    	return listedUnite.get(index);
    }
}
