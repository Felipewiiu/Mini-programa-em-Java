import java.util.ArrayList;

public class Programa {
	public static void main(String[] args) {
		System.out.println("Iniciando o programa ..");
		System.out.println();

		ArrayList<Integer> numeros = new ArrayList<>();//Integer tipo da vari�vel
		Pilha pilhaPar = new Pilha();// importe da classe
		Pilha pilhaImpar = new Pilha();
		
		
		
		
		

		for (int i = 0; i <= 29; i++) {
			numeros.add(i);

		}

		System.out.println(numeros);
		System.out.println();
		System.out.println("Quantidades de n�meros criados  = " + numeros.size());
		System.out.println();

//------------------------------------------------------------------------------------		


		numeros.forEach(elemento -> {
			if (elemento % 2 == 0) {
				//("Vai para a pilha de par " + elemento);
				
				pilhaPar.insere(elemento);

			} else {
				//("Vai para a pilha de impar" + elemento);
				pilhaImpar.insere(elemento);
				
			}
			
			
		});
		
		
//--------------------------------------------------------------------------------------		
		
		System.out.println("Empilhando.......");
		System.out.println();
		System.out.println();
		
		System.out.println("Pilha de n�meros pares criada!");
		System.out.println(pilhaPar);
		System.out.println();
		
		System.out.println("Pilha de n�meros impares criada!");
		System.out.println(pilhaImpar);
		
		System.out.println();
		System.out.println();
		System.out.println("Desempilhando pilhaPar....");
		System.out.println();
//--------------------------------------------------------------------------------------
		
		
		
		desempilha(pilhaPar);
		System.out.println("pilhaPar desempilhada " + pilhaPar);
		System.out.println("------------------------------------");
		System.out.println();
		
		System.out.println("Desempilhando pilhaImpar....");
		System.out.println();
		desempilha(pilhaImpar);
		System.out.println("pilhaImpar desempilhada " + pilhaImpar);
		System.out.println("------------------------------------");
		System.out.println();
		
		
		
		
		System.out.println("Fim do programa..");
		
	
	
		
		
		
		
		
		
		
	}// fim do m�todo main
	
	public static void desempilha (Pilha tipoDePilha) {
		for(int i = 0; i <= 14; i++ ) {
			tipoDePilha.remove();
			
		}
	}

}

// tipo Integer