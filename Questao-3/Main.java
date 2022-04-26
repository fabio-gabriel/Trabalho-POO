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
			System.out.println("8.Printar o conjunto.");
			System.out.println("9.Fim do programa.");

			//Recebe a ordem
			int order = Util.readInt();

        	if(order == 1) {
				op.criaConjunto();
			} else if (order == 2) {
				int localizador = op.pegaConjunto();

				if (localizador > (op.getI() - 1)) {
					continue;
				}
				
				op.adicionaNoConjunto(localizador);
			} else if (order == 3) {
				int localizador = op.pegaConjunto();

				if (localizador > (op.getI() - 1)) {
					continue;
				}
				op.pertencimento(localizador);
			} else if (order == 4) {
				int localizador1 = op.pegaConjunto();

				if (localizador1 > (op.getI() - 1)) {
					continue;
				}

				int localizador2 = op.pegaConjunto();

				if (localizador2 > (op.getI() - 1)) {
					continue;
				}

				op.ehSubconjunto(localizador1, localizador2);
			} else if (order == 5) {
				int localizador1 = op.pegaConjunto();

				if (localizador1 > (op.getI() - 1)) {
					continue;
				}

				int localizador2 = op.pegaConjunto();

				if (localizador2 > (op.getI() - 1)) {
					continue;
				}

				op.uniao(localizador1, localizador2);
			} else if (order == 6) {
				int localizador1 = op.pegaConjunto();

				if (localizador1 > (op.getI() - 1)) {
					continue;
				}

				int localizador2 = op.pegaConjunto();

				if (localizador2 > (op.getI() - 1)) {
					continue;
				}

				op.intersecao(localizador1, localizador2);
			} else if (order == 7) {
				int localizador1 = op.pegaConjunto();

				if (localizador1 > (op.getI() - 1)) {
					continue;
				}

				int localizador2 = op.pegaConjunto();

				if (localizador2 > (op.getI() - 1)) {
					continue;
				}

				op.diferenca(localizador1, localizador2);
			} else if (order == 8){
				int localizador = op.pegaConjunto();

				if (localizador > (op.getI() - 1)) {
					continue;
				}

				op.mostrarConjunto(localizador);
			} else if (order == 9){
				System.out.println("Fim do programa.");
				break;
			} else {
				System.out.println("Comando inválido");
			}
		}
    }
}

