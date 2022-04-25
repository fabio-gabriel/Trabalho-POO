
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
}	

