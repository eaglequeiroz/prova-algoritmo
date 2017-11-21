package teste.Questao8;

import java.util.Random;

public class Questao8 {

	/*
	   - O primeiro n�mero de C � o primeiro n�mero de A;
	   - O segundo n�mero de C � o primeiro n�mero de B;
	   - O terceiro n�mero de C � o segundo n�mero de A;
       - O quarto n�mero de C � o segundo n�mero de B;
        
        Assim sucessivamente...
       
       - Caso os n�meros de A ou B sejam de tamanhos diferentes, completar C com o restante
          dos n�meros do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.
       - Caso C seja maior que 1.000.000, retornar -1
         
        Desenvolva um algoritmo que atenda a todos os requisitos acima.
	 */
	
	public static int showNewNumber(Integer arg1, Integer arg2) {
		
		try {
			Integer maior = arg1 > arg2 ? arg1 : arg2;
			Integer menor = maior == arg1 ? arg2 : arg1;
			
			String C = "";
			
			for (int i = 0; i < maior.toString().length(); i++) {
				C += maior.toString().substring(i,i+1);
				for (int j = i; j < menor.toString().length();) {
					C += menor.toString().substring(j, j+1);
					break;
				}
			}
			
			return Integer.parseInt(C) > 1000000 ? -1 : Integer.parseInt(C);
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	/* As chances do Random.nextInt trazer n�meros grandes que ao somar com o pr�ximo inteiro gerem um 
	 * @NumberFormatException s�o enormes, sugiro que para testar o m�todo sete um valor m�ximo como par�metro para o nextInt().
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		Integer A = Math.abs(rand.nextInt());
		Integer B = Math.abs(rand.nextInt());
		Integer C = 0;
		
		C = Questao8.showNewNumber(A, B);
		
		System.out.println(C);
		
	}
}
