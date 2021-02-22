package basics;

public class EinMalEinsB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int zaehler = 1; zaehler <=10 ; zaehler = zaehler +1 ) {
			
			for (int zaehlerB = zaehler; zaehlerB <=10*zaehler; zaehlerB = zaehlerB +zaehler ) {
			
			System.out.print(zaehlerB + " ");
		    }
		    System.out.println(" ");
		
		}
		
	}

}
