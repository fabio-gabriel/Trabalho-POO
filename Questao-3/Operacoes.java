
import java.util.*;

public class Operacoes {
	
	ArrayList<Conjuntos> lista = new ArrayList<>();

	int i = 0;

	public void criaConjunto(){
		Conjuntos conj = new Conjuntos();
		lista.add(conj);
		System.out.println("Conjunto criado. Seu dígito é " + i);
		i++;
	}	

	public void adicionaNoConjunto(){
		System.out.println("Informe qual é o dígito do conjunto");
		int localizador = Util.readInt();

		//Verificar se o conjunto existe 
		if(localizador > (i - 1)) {
			System.out.println("Conjunto inexistente.");
		}
				
		//Adicionar elementos
		System.out.println("Informe a quantidade de elementos:");
		int tam = Util.readInt();
		System.out.println("Digite os elementos:");
		for(int k = 0; k < tam; k++) {
			int number = Util.readInt();
			lista.get(localizador).conjuntinho.add(number);
		}
		System.out.println("Elementos inseridos.");
	}

	public void mostrarConjunto(){
		
		System.out.println("Informe qual dígito do conjunto");
		int localizador = Util.readInt();
		//Verificar se o conjunto existe 
		if(localizador > (i - 1)) {
			System.out.println("Conjunto inexistente.");
		}
		System.out.println(lista.get(localizador).conjuntinho);
	}

	public void pertencimento(){
		System.out.println("Informe o dígito do conjunto.");
		int localizador = Util.readInt();

		//Verificar se o conjunto existe 
		if(localizador > (i - 1)) {
			System.out.println("Conjunto inexistente.");
		}
		
		System.out.println("Digite qual o elemento deseja verificar a pertinência.");
		int element = Util.readInt();
		System.out.println("O conjunto " + localizador + " contém o elemento " + element + ": "+ lista.get(localizador).conjuntinho.contains(element));
		
	}

	public void ehSubconjunto(){
		System.out.println("Informe o dígito do conjunto principal:");
		int localizador1 = Util.readInt();

		//Verificar se o primeiro conjunto existe 
		if(localizador1 > (i - 1)) {
			System.out.println("Conjunto inexistente.");
		}
		
		System.out.println("Informe o dígito do conjunto secundário, o qual será verificado se é de fato ou não subconjunto:");
		int localizador2 = Util.readInt();
		//Verificar se o segundo conjunto existe 
		if(localizador2 > (i - 1)) {
			System.out.println("Conjunto inexistente.");
		}
		
		System.out.println("O conjunto " + localizador2 + " é subconjunto de " + localizador1 + ": " +
		lista.get(localizador1).conjuntinho.containsAll(lista.get(localizador2).conjuntinho));
	}

	public void uniao(){
		System.out.println("Informe o dígito do primeiro conjunto");
		int localizador1 = Util.readInt();
		//Verificar se o primeiro conjunto existe 
		if(localizador1 > (i - 1)) {
			System.out.println("Conjunto inexistente.");
		}
			
		System.out.println("Informe o dígito do segundo conjunto");
		int localizador2 = Util.readInt();
		//Verificar se o segundo conjunto existe 
		if(localizador2 > (i - 1)) {
			System.out.println("Conjunto inexistente.");
		}
		
		//Criar conjunto união
		Conjuntos conj = new Conjuntos();
		lista.add(conj);
		lista.get(i).conjuntinho.addAll(lista.get(localizador1).conjuntinho);
		lista.get(i).conjuntinho.addAll(lista.get(localizador2).conjuntinho);
		System.out.println("Conjunto da união criado. Seu dígito é " + i);
		i++;
	}

	public void intersecao(){
		System.out.println("Informe qual dígito do primeiro conjunto conjunto.");
		int localizador1 = Util.readInt();
		//Verificar se o primeiro conjunto existe 
		if(localizador1 > (i - 1)) {
			System.out.println("Conjunto inexistente.");
		}
		
		System.out.println("Informe qual dígito do segundo conjunto conjunto.");
		int localizador2 = Util.readInt();
		//Verificar se o segundo conjunto existe 
		if(localizador2 > (i - 1)) {
			System.out.println("Conjunto inexistente.");
		}
		
		//Criar conjunto de intersecção
		Conjuntos conj = new Conjuntos();
		lista.add(conj);
		lista.get(i).conjuntinho.addAll(lista.get(localizador1).conjuntinho);
		lista.get(i).conjuntinho.retainAll(lista.get(localizador2).conjuntinho);
		System.out.println("Conjunto de intersecção criado. Seu dígito é " + i);
		i++;
	}

	public void diferenca(){
		System.out.println("Informe qual dígito do primeiro conjunto conjunto.");
		int localizador1 = Util.readInt();
		//Verificar se o primeiro conjunto existe 
		if(localizador1 > (i - 1)) {
			System.out.println("Conjunto inexistente.");
		}
		
		System.out.println("Informe qual dígito do segundo conjunto conjunto.");
		int localizador2 = Util.readInt();
		//Verificar se o segundo conjunto existe 
		if(localizador2 > (i - 1)) {
			System.out.println("Conjunto inexistente.");
		}
		
		//Criar conjunto de diferença
		Conjuntos conj = new Conjuntos();
		lista.add(conj);
		lista.get(i).conjuntinho.addAll(lista.get(localizador1).conjuntinho);
		lista.get(i).conjuntinho.removeAll(lista.get(localizador2).conjuntinho);
		System.out.println("Conjunto de diferença criado. Seu dígito é " + i);
		i++;
	}
}	

