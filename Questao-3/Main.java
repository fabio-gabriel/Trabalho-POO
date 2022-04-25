public class Main {

    public static void main(String[] args) {

		Operacoes op = new Operacoes();

		while(true){

        	System.out.println("Informe o dígito do comando:");
			System.out.println("1.Criar um Conjunto.");
			System.out.println("2.Inserir elementos no conjunto.");
			System.out.println("3.Verificar pertencimento de um elemento.");
			System.out.println("4.Verificação de um conjunto ser subconjunto do outro.");
			System.out.println("5.União de conjuntos.");
			System.out.println("6.Intersecção de conjuntos.");	
			System.out.println("7.Diferença de dois conjuntos.");
			System.out.println("8.Printar.");
			System.out.println("9.Fim do programa.");

			//Recebe a ordem
			int order = Util.readInt();

        	if(order == 1) {
				op.criaConjunto();
			} else if (order == 2){
				op.adicionaNoConjunto();
			} else if (order == 8){
				op.mostrarConjunto();
			}
		}
    }
}

