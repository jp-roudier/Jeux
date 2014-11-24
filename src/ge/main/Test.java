package ge.main;

import ge.map.Carte;

class Test{
	
	//public Carte myCart;
	
	public static void main(String[] args) {
		Personnage[] tPers = {new Hero(), new Pnj()};
			
	    for(int i = 0; i < tPers.length; i++){
	    	System.out.println("\nInstance de " + tPers[i].getClass().getName());
	    	System.out.println("*****************************************");
	    	tPers[i].combattre();
	    	tPers[i].seDeplacer();
	    	//tPers[i].soigner();
	    }
	    
	    Carte myCart = new Carte();
	}
}