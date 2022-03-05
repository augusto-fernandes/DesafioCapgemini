package desafioCapgemini;

public class Exercicio3 {

	public static void main(String[] args) {
		String s1 = "ovo";
		String s2 = "voo";
		
		if(anagrama(s1, s2)) {
			System.out.println("É anagrama!");
		}
		else {
			System.out.println("não é anagrama");
		}
			
	}
	
	private static boolean anagrama(String s1, String s2) {
		int resultado = 0;
		
		for(int i = 0; i < s1.length(); i++) {
			resultado =resultado ^ s1.charAt(i);
		}
		for(int i = 0; i < s1.length(); i++) {
			resultado =resultado ^ s2.charAt(i);
		}
		
		return(resultado ==0);
	}

}
