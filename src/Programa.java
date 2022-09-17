import java.util.ArrayList;

public class Programa {
	public static void main(String[] args) {
		System.out.println("Iniciando do programa ..");
		System.out.println();

		ArrayList<Integer> numeros = new ArrayList<>();//Integer tipo da variável
		Pilha pilhaPar = new Pilha();// importe da classe
		Pilha pilhaImpar = new Pilha();
		
		
		
		
		

		for (int i = 0; i <= 29; i++) {
			numeros.add(i);

		}

		System.out.println(numeros);
		System.out.println();
		System.out.println("Quantidades de números criados  = " + numeros.size());
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
		
		System.out.println("Pilha de números pares criada!");
		System.out.println(pilhaPar);
		System.out.println();
		
		System.out.println("Pilha de números impares criada!");
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
		
	
	
		
		
		
		
		
		
		
	}// fim do método main
	
	public static void desempilha (Pilha tipoDePilha) {
		for(int i = 0; i <= 14; i++ ) {
			tipoDePilha.remove();
			
		}
	}

}

// tipo Integer