
import java.util.*;

public class Operacoes {
	
	ArrayList<Conjuntos> lista = new ArrayList<>();

	private int i = 0;

	public int getI(){
		return i;
	}

	public void criaConjunto(){
		Conjuntos conj = new Conjuntos();
		lista.add(conj);
		System.out.println("Conjunto criado. Seu dígito é " + i);
		i++;
	}	

	public void adicionaNoConjunto(int localizador){
				
		//Adicionar elementos
		System.out.println("Informe a quantidade de elementos:");
		int tam = Util.readInt();
		System.out.println("Digite os elementos:");
		for(int k = 0; k < tam; k++) {
			int number = Util.readInt();
			lista.get(localizador).listaConjuntos.add(number);
		}
		System.out.println("Elementos inseridos.");
	}

	public void mostrarConjunto(int localizador){
		System.out.println(lista.get(localizador).listaConjuntos);
	}

	public void pertencimento(int localizador){
		System.out.println("Digite qual o elemento deseja verificar a pertinência.");
		int element = Util.readInt();
		System.out.println("O conjunto " + localizador + " contém o elemento " + element + ": "+ lista.get(localizador).listaConjuntos.contains(element));
	}

	public void ehSubconjunto(int localizador1, int localizador2){		
		System.out.println("O conjunto " + localizador2 + " é subconjunto de " + localizador1 + ": " +
		lista.get(localizador1).listaConjuntos.containsAll(lista.get(localizador2).listaConjuntos));
	}

	public void uniao(int localizador1, int localizador2){
		//Criar conjunto união
		Conjuntos conj = new Conjuntos();
		lista.add(conj);
		lista.get(i).listaConjuntos.addAll(lista.get(localizador1).listaConjuntos);
		lista.get(i).listaConjuntos.addAll(lista.get(localizador2).listaConjuntos);
		System.out.println("Conjunto da união criado. Seu dígito é " + i);
		i++;
	}

	public void intersecao(int localizador1, int localizador2){
		//Criar conjunto de intersecção
		Conjuntos conj = new Conjuntos();
		lista.add(conj);
		lista.get(i).listaConjuntos.addAll(lista.get(localizador1).listaConjuntos);
		lista.get(i).listaConjuntos.retainAll(lista.get(localizador2).listaConjuntos);
		System.out.println("Conjunto de intersecção criado. Seu dígito é " + i);
		i++;
	}

	public void diferenca(int localizador1, int localizador2){
		//Criar conjunto de diferença
		Conjuntos conj = new Conjuntos();
		lista.add(conj);
		lista.get(i).listaConjuntos.addAll(lista.get(localizador1).listaConjuntos);
		lista.get(i).listaConjuntos.removeAll(lista.get(localizador2).listaConjuntos);
		System.out.println("Conjunto de diferença criado. Seu dígito é " + i);
		i++;
	}

	public int pegaConjunto(){
		System.out.println("Informe o dígito do conjunto.");
		int local = Util.readInt();

		//Verificar se o conjunto existe 
		if(local > (i - 1)) {
			System.out.println("Conjunto inexistente.");
		}
		
		return local;
	}
}	