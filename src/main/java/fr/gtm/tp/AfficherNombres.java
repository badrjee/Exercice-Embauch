package fr.gtm.tp;



public class AfficherNombres {
	
	// methode à l'encienne
//	public static void main(String[] args) {
//		
//		for (int i = 1; i < 101; i++) {
//
//			if (i % 3 == 0 && i % 5 == 0) {
//
//				System.out.println("buggfeez");
//			}
//
//			else if (i % 5 == 0) {
//				System.out.println("feez");
//			}
//
//			else if (i % 3 == 0) {
//				System.out.println("bugg");
//			} else {
//				System.out.println(i);
//			}
//		}

	
	// methode avec concatenation
	public String generateString() {
		
		final StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 101; i++) {
			String toPrint = "";
			
			if (i % 3 == 0 ) {
				toPrint += "Buzz";
			}
			
			if (i % 5 == 0 ) {
				toPrint += "Freez";
			}
			sb.append(toPrint.isEmpty() ? i:toPrint);
			sb.append(" ");

		}
		return sb.toString();
		
	}
	
	public static void main (String[]args) {
		AfficherNombres app = new AfficherNombres();
		System.out.println(app.generateString());
	}
	

}