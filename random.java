package �ifre;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		s�freUret();
		
	}
	public static void s�freUret() {
	
	
	char ilkK = (char) ((int) (Math.random()*15+33));
	char ikiK = (char) ((int) (Math.random()*26+65));
	char sonK = (char) ((int) (Math.random()*10+48));
	
	String d��erK = " " ;
	
	for(int i=1 ; i<= 10 ; i++) {
		char uk = (char)((int )(Math.random()*26+97));
		d��erK+=String.valueOf(uk);
	}
    System.out.println(String.valueOf(ilkK)+String.valueOf(ikiK)+d��erK+String.valueOf(sonK));

		
		
		
		

	}

}
