import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String s1;
		String s2;
		
		System.out.println("Ingrese la cadena 1");
		s1 = entrada.next();
		
		System.out.println("Ingrese la cadena 2");
		s2 = entrada.next();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("--------------------------");
		
		if(s1.length() != s2.length()) {
			System.out.println("No es un Anagrama");
		} else {
			
			char [] c1 = s1.toCharArray();
			char [] c2 =s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2)) {
				System.out.println("Es un Anagrama");
			}else
				System.out.print("No es un Anagrama");
		}
		
	}

}
