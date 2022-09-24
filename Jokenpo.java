package jokenpo;

import java.util.Scanner;
//JOGO
	public class Jokenpo {
//Placar
		private static int reiniciar = 1;
		private static int placarJogador = 0;
		private static int placarComputador = 0;
		//Escolhas
		//1 = Pedra, 2 = Papel, 3 = Tesoura
		private static int escolhaJogador;
		private static int escolhaComputador;
		//Método Principal
		public static void main(String[] args) {
			//Quantidade de radadas / jogadas
			int rodadas = 0;
			//Input de dados
			Scanner input2 = new Scanner(system.in);
			Scanner input = new Scanner(System.in);
			//Perguntar para o jogador a quantidade de rodadas
			System.out.println("::: JOKENPÔ :::");
			System.out.println("Insira a quantidade de rodadas: ");
			rodadas = input.nextInt();
			//Reinicia jogo - Vale 0,25
			while(reiniciar == 1) {
				for(int i = 1; i <= rodadas; ++i) {
					escolhaComputador = (int) (Math.random()*3)+1;
					rotuloEscolhaJogador();
					escolhaJogador = input.nextInt();
					verificaResultado();
					exibePlacar();
					System.out.println("Deseja continuar?");
					System.out.println(" (0) NÃO (1) SIM ");
					reiniciar = input2.nextInt();
				
				}	
			}
			
			
//Reinicia jogo - Vale 0,25
}
//Verifica condição de vitória e derrota
//Vale 0,25
//Usar o if para verificar e comparar as escolhas
//Quem ganha recebe pontos
//A pontuação deve ser atribuidas nas variáveis
//placarJogador E placarComputador
		private static void verificaResultado() {
			//Condições onde o computador ganha
			if(escolhaJogador == 1 && escolhaComputador == 2) {
				++placarComputador;
			} else if(escolhaJogador == 2 && escolhaComputador == 3) {
				++placarComputador;
			} else if(escolharJogador == 3 && escolhaComputador == 1){
				++placarComputador
			}
			//Condições onde o jogador ganha
			else if(escolhaJogador == 1 && escolhaComputador == 3){
				++placarJogador
			} else if(escolhaJogador == 2 && escolhaComputador == 1){
				++placarJogador
			} else if(escolhaJogador == 3 && escolhaComputador == 2){
				++placarJogador
			}
			//Condições de empate (escolha do jogador == escolha do computador)
			else{
				continue
			}
				

		
}
//Exibe o resultado do placar
//placarJogador E placarComputador
//Vale 0,25
//Seu código aqui
		private static void exibePlacar() {
			System.out.println("::: PLACAR");
			System.out.println("Jogador: " + placarJogador);
			System.out.println("Computador " + placarComputador);
}
		private static void rotuloEscolhaJogador() {
			System.out.println("::: JOGADOR, DIGITE:");
			System.out.println("::: 1 - Pedra");
			System.out.println("::: 2 - Papel");
			System.out.println("::: 3 - Tesoura");
			System.out.println("::: Escolha sua opção: ");
		}
//Explicação do código - Vale 0,25
}
