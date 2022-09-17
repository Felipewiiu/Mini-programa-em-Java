import java.util.LinkedList;
import java.util.List;

public class Pilha {
	
	private List<Integer> conjunto = new LinkedList<>();
	
	public void insere (Integer valor) {
		conjunto.add(valor);
	}
	
	public Integer remove () {
		return conjunto.remove(conjunto.size() -1);
	}
	
	public boolean vazia () {
		return conjunto.isEmpty();
	}
	
	@Override
	public String toString() {// sobreescrever o ToString
		return conjunto.toString();
	}
	
	public Integer verificaTamanho () {
		return conjunto.size();
	}
	
	
	

}
