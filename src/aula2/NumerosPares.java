package aula2;

public class NumerosPares {
	
	public static void main(String[] args) { //porque executou com o " main " escrito errado " mais "
		
		for(int i = 0; i <= 100; i++) {
			if(i %2 ==1) {
				continue;
			}
			System.out.print(i + "    "  + " \n");
			
		}
	}

}
