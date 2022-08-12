package package01;

import java.util.Random;
import java.util.Scanner;

public class Navigation {
//======================================================================================================
		static String[] machineCharV = {"vazio1", "vazio2", "vazio3", "vazio4", "vazio5", "vazio6", "vazio7", "vazio8", "vazio9"};
		static int[][] machineCharsM = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1},{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
		static int[] machineNumberV = {21, 22, 23, 24, 25, 26, 27, 28, 29};
//=======================================================================================================
		static String[] userCharV = {"vazio1", "vazio2", "vazio3", "vazio4", "vazio5", "vazio6", "vazio7", "vazio8", "vazio9"};
		static int[][] userCharsM = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1},{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
		static int[] userNumberV = {31, 32, 33, 34, 35, 36, 37, 38, 39};
//========================================================================================================
	static Scanner entrada = new Scanner(System.in);
	static Random n = new Random();
	static Chars chrs = new Chars();
//========================================================================================================
	static int numAle = 51;
	static int numAle2 = 50;
	static int quantChar = 1;
	static int contaRound = 1;
	static int atributoEscoInt = 0;
	static int creditos = 0;
	static int verificaCreditos = 0;
	static int win1 = 0;
	static int quantInimigos = 0;
	static String escolher = "jax";
	static String firstChoose = "escolher";
	static String destEsco = "master";
	static String escoModo = "arcade";
	static String atributoEsco = "power";
//========================================================================================================
	static void apresentacao() throws InterruptedException {			//TELA INICIAL DO GAME
		System.out.println("Mortal Kombat Battle Game");
		//Thread.sleep(1500);
		System.out.println("Java Editon");
		//Thread.sleep(2000);
		credit();
		System.out.println("Pressione qualquer botão");
		entrada.next();
		//Thread.sleep(500);
		System.out.println("Carregando...");
		//Thread.sleep(3000);
	}
//========================================================================================================
	static int credit() {
		if (creditos == 0) {
		do {
			System.out.println("Insira créditos: ");
			creditos = entrada.nextInt();
			
			if (creditos <= 0) {
				System.out.println("Insira pelo menos 1 crédito");
			} else if (creditos > 20) {
				System.out.println("A quantidade maxima de créditos é 20");
			}
		} while (creditos <= 0 || creditos > 20);
		}
		if (creditos == 1) {
			System.out.println("Voce tem " + creditos + " credito!");
		} else {
			System.out.println("Voce tem " + creditos + " creditos!");
		}
		
		verificaCreditos = creditos;
		return creditos;
	}
//========================================================================================================	
	static int machine1(int machineNumber) {
//========================================================================================================
		if (machineNumber == machineNumberV[0]) {
		do {
			numAle2 = n.nextInt(17);
			machineNumber = numAle2;
		} while (machineNumber == userNumberV[0] || machineNumber == userNumberV[1] || machineNumber == userNumberV[2] || 
				machineNumber == userNumberV[3] || machineNumber == userNumberV[4] || machineNumber == userNumberV[5] || 
				machineNumber == userNumberV[6] || machineNumber == userNumberV[7] || machineNumber == userNumberV[8]);
//===============================================================================================================================		
		} else if (machineNumber == machineNumberV[1]) {
			do {
				numAle2 = n.nextInt(17);
				machineNumber = numAle2;
			} while (machineNumber == userNumberV[0] || machineNumber == userNumberV[1] || machineNumber == userNumberV[2] || 
					machineNumber == userNumberV[3] || machineNumber == userNumberV[4] || machineNumber == userNumberV[5] || 
					machineNumber == userNumberV[6] || machineNumber == userNumberV[7] || machineNumber == userNumberV[8] ||
					machineNumber == machineNumberV[0]);
//===============================================================================================================================
			} else if (machineNumber == machineNumberV[2]) {
				do {
					numAle2 = n.nextInt(17);
					machineNumber = numAle2;
				} while (machineNumber == userNumberV[0] || machineNumber == userNumberV[1] || machineNumber == userNumberV[2] || 
						machineNumber == userNumberV[3] || machineNumber == userNumberV[4] || machineNumber == userNumberV[5] || 
						machineNumber == userNumberV[6] || machineNumber == userNumberV[7] || machineNumber == userNumberV[8] ||
						machineNumber == machineNumberV[0] || machineNumber == machineNumberV[1]);
//===============================================================================================================================
			} else if (machineNumber == machineNumberV[3]) {
				do {
					numAle2 = n.nextInt(17);
					machineNumber = numAle2;
				} while (machineNumber == userNumberV[0] || machineNumber == userNumberV[1] || machineNumber == userNumberV[2] || 
						machineNumber == userNumberV[3] || machineNumber == userNumberV[4] || machineNumber == userNumberV[5] || 
						machineNumber == userNumberV[6] || machineNumber == userNumberV[7] || machineNumber == userNumberV[8] ||
						machineNumber == machineNumberV[0] || machineNumber == machineNumberV[1] || machineNumber == machineNumberV[2]);
//===============================================================================================================================
			} else if (machineNumber == machineNumberV[4]) {
				do {
					numAle2 = n.nextInt(17);
					machineNumber = numAle2;
				} while (machineNumber == userNumberV[0] || machineNumber == userNumberV[1] || machineNumber == userNumberV[2] || 
						machineNumber == userNumberV[3] || machineNumber == userNumberV[4] || machineNumber == userNumberV[5] || 
						machineNumber == userNumberV[6] || machineNumber == userNumberV[7] || machineNumber == userNumberV[8] ||
						machineNumber == machineNumberV[0] || machineNumber == machineNumberV[1] || machineNumber == machineNumberV[2] || 
						machineNumber == machineNumberV[3]);
//===============================================================================================================================
			} else if (machineNumber == machineNumberV[5]) {
				do {
					numAle2 = n.nextInt(17);
					machineNumber = numAle2;
				} while (machineNumber == userNumberV[0] || machineNumber == userNumberV[1] || machineNumber == userNumberV[2] || 
						machineNumber == userNumberV[3] || machineNumber == userNumberV[4] || machineNumber == userNumberV[5] || 
						machineNumber == userNumberV[6] || machineNumber == userNumberV[7] || machineNumber == userNumberV[8] ||
						machineNumber == machineNumberV[0] || machineNumber == machineNumberV[1] || machineNumber == machineNumberV[2] || 
						machineNumber == machineNumberV[3] || machineNumber == machineNumberV[4]);
//===============================================================================================================================
			} else if (machineNumber == machineNumberV[6]) {
				do {
					numAle2 = n.nextInt(17);
					machineNumber = numAle2;
				} while (machineNumber == userNumberV[0] || machineNumber == userNumberV[1] || machineNumber == userNumberV[2] || 
						machineNumber == userNumberV[3] || machineNumber == userNumberV[4] || machineNumber == userNumberV[5] || 
						machineNumber == userNumberV[6] || machineNumber == userNumberV[7] || machineNumber == userNumberV[8] ||
						machineNumber == machineNumberV[0] || machineNumber == machineNumberV[1] || machineNumber == machineNumberV[2] || 
						machineNumber == machineNumberV[3] || machineNumber == machineNumberV[4] || machineNumber == machineNumberV[5]);
//===============================================================================================================================
			} else if (machineNumber == machineNumberV[7]) {
				do {
					numAle2 = n.nextInt(17);
					machineNumber = numAle2;
				} while (machineNumber == userNumberV[0] || machineNumber == userNumberV[1] || machineNumber == userNumberV[2] || 
						machineNumber == userNumberV[3] || machineNumber == userNumberV[4] || machineNumber == userNumberV[5] || 
						machineNumber == userNumberV[6] || machineNumber == userNumberV[7] || machineNumber == userNumberV[8] ||
						machineNumber == machineNumberV[0] || machineNumber == machineNumberV[1] || machineNumber == machineNumberV[2] || 
						machineNumber == machineNumberV[3] || machineNumber == machineNumberV[4] || machineNumber == machineNumberV[5] || 
						machineNumber == machineNumberV[6]);
//===============================================================================================================================				
			} else if (machineNumber == machineNumberV[8]) {
				do {
					numAle2 = n.nextInt(17);
					machineNumber = numAle2;
				} while (machineNumber == userNumberV[0] || machineNumber == userNumberV[1] || machineNumber == userNumberV[2] || 
						machineNumber == userNumberV[3] || machineNumber == userNumberV[4] || machineNumber == userNumberV[5] || 
						machineNumber == userNumberV[6] || machineNumber == userNumberV[7] || machineNumber == userNumberV[8] ||
						machineNumber == machineNumberV[0] || machineNumber == machineNumberV[1] || machineNumber == machineNumberV[2] || 
						machineNumber == machineNumberV[3] || machineNumber == machineNumberV[4] || machineNumber == machineNumberV[5] || 
						machineNumber == machineNumberV[6] || machineNumber == machineNumberV[7]);
			}
		return machineNumber;
//===============================================================================================================================
		
}
//========================================================================================================
	static int[][] machine2(int machineNumber, int machineChars[][]) {
		
		if (machineNumber == 0) {
			machineChars[0][0] = chrs.motaro[0];
			machineChars[0][1] = chrs.motaro[1];
			machineChars[0][2] = chrs.motaro[2];
			
		} else if (machineNumber == 1) {
			machineChars[1][0] = chrs.sonya[0];
			machineChars[1][1] = chrs.sonya[1];
			machineChars[1][2] = chrs.sonya[2];
			
		}  else if (machineNumber == 2) {
			machineChars[2][0] = chrs.nightwolf[0];
			machineChars[2][1] = chrs.nightwolf[1];
			machineChars[2][2] = chrs.nightwolf[2];
			
		}  else if (machineNumber == 3) {
			machineChars[3][0] = chrs.sindel[0];
			machineChars[3][1] = chrs.sindel[1];
			machineChars[3][2] = chrs.sindel[2];
			
		}  else if (machineNumber == 4) {
			machineChars[4][0] = chrs.stryker[0];
			machineChars[4][1] = chrs.stryker[1];
			machineChars[4][2] = chrs.stryker[2];
			
		}  else if (machineNumber == 5) {
			machineChars[5][0] = chrs.sheeva[0];
			machineChars[5][1] = chrs.sheeva[1];
			machineChars[5][2] = chrs.sheeva[2];
			
		}  else if (machineNumber == 6) {
			machineChars[6][0] = chrs.noob[0];
			machineChars[6][1] = chrs.noob[1];
			machineChars[6][2] = chrs.noob[2];
			
		}  else if (machineNumber == 7) {
			machineChars[7][0] = chrs.subzero[0];
			machineChars[7][1] = chrs.subzero[1];
			machineChars[7][2] = chrs.subzero[2];
			
		}  else if (machineNumber == 8) {
			machineChars[8][0] = chrs.shangtsung[0];
			machineChars[8][1] = chrs.shangtsung[1];
			machineChars[8][2] = chrs.shangtsung[2];
			
		}  else if (machineNumber == 9) {
			machineChars[9][0] = chrs.shaokahn[0];
			machineChars[9][1] = chrs.shaokahn[1];
			machineChars[9][2] = chrs.shaokahn[2];
			
		}  else if (machineNumber == 10) {
			machineChars[10][0] = chrs.sektor[0];
			machineChars[10][1] = chrs.sektor[1];
			machineChars[10][2] = chrs.sektor[2];
			
		}  else if (machineNumber == 11) {
			machineChars[11][0] = chrs.cyrax[0];
			machineChars[11][1] = chrs.cyrax[1];
			machineChars[11][2] = chrs.cyrax[2];
			
		}  else if (machineNumber == 12) {
			machineChars[12][0] = chrs.smoke[0];
			machineChars[12][1] = chrs.smoke[1];
			machineChars[12][2] = chrs.smoke[2];
			
		}  else if (machineNumber == 13) {
			machineChars[13][0] = chrs.kano[0];
			machineChars[13][1] = chrs.kano[1];
			machineChars[13][2] = chrs.kano[2];
			
		}  else if (machineNumber == 14) {
			machineChars[14][0] = chrs.liukang[0];
			machineChars[14][1] = chrs.liukang[1];
			machineChars[14][2] = chrs.liukang[2];
			
		}  else if (machineNumber == 15) {
			machineChars[15][0] = chrs.kunglao[0];
			machineChars[15][1] = chrs.kunglao[1];
			machineChars[15][2] = chrs.kunglao[2];
		
		}  else if (machineNumber == 16) {
			machineChars[16][0] = chrs.jax[0];
			machineChars[16][1] = chrs.jax[1];
			machineChars[16][2] = chrs.jax[2];
			
		}  else if (machineNumber == 17) {
			machineChars[17][0] = chrs.kabal[0];
			machineChars[17][1] = chrs.kabal[1];
			machineChars[17][2] = chrs.kabal[2];
		
		}
		return machineChars;
	}
//========================================================================================================
//========================================================================================================
	static String machine3(int machineNumber, String machineChar) {
		
		if (machineNumber == 0) {
			machineChar = chrs.chars[0];
			
		} else if (machineNumber == 1) {
			machineChar = chrs.chars[1];
			
		}  else if (machineNumber == 2) {
			machineChar = chrs.chars[2];
			
		}  else if (machineNumber == 3) {
			machineChar = chrs.chars[3];
			
		}  else if (machineNumber == 4) {
			machineChar = chrs.chars[4];
			
		}  else if (machineNumber == 5) {
			machineChar = chrs.chars[5];
			
		}  else if (machineNumber == 6) {
			machineChar = chrs.chars[6];
			
		}  else if (machineNumber == 7) {
			machineChar = chrs.chars[7];
			
		}  else if (machineNumber == 8) {
			machineChar = chrs.chars[8];
			
		}  else if (machineNumber == 9) {
			machineChar = chrs.chars[9];
			
		}  else if (machineNumber == 10) {
			machineChar = chrs.chars[10];
			
		}  else if (machineNumber == 11) {
			machineChar = chrs.chars[11];
			
		}  else if (machineNumber == 12) {
			machineChar = chrs.chars[12];
			
		}  else if (machineNumber == 13) {
			machineChar = chrs.chars[13];
			
		}  else if (machineNumber == 14) {
			machineChar = chrs.chars[14];
			
		}  else if (machineNumber == 15) {
			machineChar = chrs.chars[15];
		
		}  else if (machineNumber == 16) {
			machineChar = chrs.chars[16];
			
		}  else if (machineNumber == 17) {
			machineChar = chrs.chars[17];
		
		}
		return machineChar;
		
	}
//========================================================================================================
	static void impriChars() throws InterruptedException {			//IMPRESSAO DO NOME DOS PERSONAGENS
		Thread.sleep(1000);
		System.out.println(chrs.chars[0] + " | " + chrs.chars[1] + " | " + chrs.chars[2] + 
				" | " + chrs.chars[3] + " | " + chrs.chars[4] + " | " + chrs.chars[5]);
		Thread.sleep(500);
		System.out.println(chrs.chars[6] + " | " + chrs.chars[7] + " | " + chrs.chars[8] + 
				" | " + chrs.chars[9] + " | " + chrs.chars[10] + " | " + chrs.chars[11]);
		Thread.sleep(500);
		System.out.println(chrs.chars[12] + " | " + chrs.chars[13] + " | " + chrs.chars[14] + 
				" | " + chrs.chars[15] + " | " + chrs.chars[16] + " | " + chrs.chars[17]);
		Thread.sleep(2000);
	}
//========================================================================================================
	static void escoModo() {
		do {
			if (!escoModo.equals("arcade") && !escoModo.equals("classica") && !escoModo.equals("sobrevivencia")) {
				System.out.println("Erro, tente novamente");
			}
			System.out.println("Arcade");
			System.out.println("Classica");
			System.out.println("Sobrevivencia");
			System.out.println("Escolha o modo de jogo:");
			escoModo = entrada.next();
		} while (!escoModo.equals("arcade") && !escoModo.equals("classica") && !escoModo.equals("sobrevivencia"));
	}
//========================================================================================================
	static String escoTorre() {
		do {
			if (!destEsco.equals("novato") && !destEsco.equals("guerreiro") && !destEsco.equals("master")) {
				System.out.println("Erro, tente novamente");
			}
		System.out.println("Novato");
		System.out.println("Guerreiro");
		System.out.println("Master");
		System.out.println("Escolha seu destino");
		destEsco = entrada.next();
		} while (!destEsco.equals("novato") && !destEsco.equals("guerreiro") && !destEsco.equals("master"));
		return destEsco;
	}
//========================================================================================================
	static void torreNovato(int userNumber11, String userChar11, int userChars11[], 
			String machineChar11, int machineChars11[],
			String machineChar22, int machineChars22[], 
			String machineChar33, int machineChars33[]) throws InterruptedException {
		
		if (destEsco.equals("novato")) {
			mecanicaBatalha(userNumber11, userChar11, userChars11, machineChar11, machineChars11);
			mecanicaBatalha(userNumber11, userChar11, userChars11, machineChar22, machineChars22);
			mecanicaBatalha(userNumber11, userChar11, userChars11, machineChar33, machineChars33);
		}
	}
//========================================================================================================
	static int escoQuant() {										//ESCOLHER QUANTIDADE DE PERSONAGENS NO MODO CLASSICO
		
		do {
		if (quantChar <= 0 || quantChar > 9) {
			if (quantChar <= 0) {
				System.out.println("Erro, tente novamente");
				System.out.println("A quantidade minima de personagens é 1");
			} else if (quantChar > 9) {
				System.out.println("Erro, tente novamente");
				System.out.println("A quantidade maxima de personagens é 9");
			}	
		}
		System.out.println("Deseja quantos personagens na batalha?");
		quantChar = entrada.nextInt();
		} while (quantChar <= 0 || quantChar > 9);
		return quantChar;
}
	static void exibeTime(int quantEsco) {
		if (quantEsco == 1) {
			System.out.println("Seu personagem é: " + userCharV[0]);
		} else if (quantEsco == 2) {
			System.out.println("Seu time é: " + userCharV[0] + ", " + userCharV[1]);
		} else if (quantEsco == 3) {
			System.out.println("Seu time é: " + userCharV[0] + ", " + userCharV[1] + ", " + userCharV[2]);
		} else if (quantEsco == 4) {
			System.out.println("Seu time é: " + userCharV[0] + ", " + userCharV[1] + ", " + userCharV[2]
					 + ", " + userCharV[3]);
		} else if (quantEsco == 5) {
			System.out.println("Seu time é: " + userCharV[0] + ", " + userCharV[1] + ", " + userCharV[2]
					 + ", " + userCharV[3] + ", " + userCharV[4]);
		} else if (quantEsco == 6) {
			System.out.println("Seu time é: " + userCharV[0] + ", " + userCharV[1] + ", " + userCharV[2]
					 + ", " + userCharV[3] + ", " + userCharV[4] + ", " + userCharV[5]);
		} else if (quantEsco == 7) {
			System.out.println("Seu time é: " + userCharV[0] + ", " + userCharV[1] + ", " + userCharV[2]
					 + ", " + userCharV[3] + ", " + userCharV[4] + ", " + userCharV[5]
					 + ", " + userCharV[6]);
		} else if (quantEsco == 8) {
			System.out.println("Seu time é: " + userCharV[0] + ", " + userCharV[1] + ", " + userCharV[2]
					 + ", " + userCharV[3] + ", " + userCharV[4] + ", " + userCharV[5]
					 + ", " + userCharV[6] + ", " + userCharV[7]);
		} else if (quantEsco == 9) {
			System.out.println("Seu time é: " + userCharV[0] + ", " + userCharV[1] + ", " + userCharV[2]
					 + ", " + userCharV[3] + ", " + userCharV[4] + ", " + userCharV[5]
					 + ", " + userCharV[6] + ", " + userCharV[7] + ", " + userCharV[8]);
		}
	}
//========================================================================================================
	static String escoOuAle() throws InterruptedException {			//DEFINIR SE QUER ESCOLHER OU ALEATORIO
		do {
			if (!firstChoose.equals("aleatorio") && !firstChoose.equals("escolher")) {
				Thread.sleep(1000);
				System.out.println("Erro, tente novamente");
				Thread.sleep(1000);
			}
		System.out.print("Deseja escolher ou modo aleatorio? ");
		firstChoose = entrada.next();
		} while (!firstChoose.equals("aleatorio") && !firstChoose.equals("escolher"));
		return firstChoose;
	}
//========================================================================================================
	static String escolhendo() throws InterruptedException {		//MENU DE ESCOLHA
			do {
			if (!escolher.equals(chrs.chars[0]) && !escolher.equals(chrs.chars[1]) && 
					!escolher.equals(chrs.chars[2]) && !escolher.equals(chrs.chars[3]) && 
					!escolher.equals(chrs.chars[4]) && !escolher.equals(chrs.chars[5]) && 
					!escolher.equals(chrs.chars[6]) && !escolher.equals(chrs.chars[7]) && 
					!escolher.equals(chrs.chars[8]) && !escolher.equals(chrs.chars[9]) && 
					!escolher.equals(chrs.chars[10]) && !escolher.equals(chrs.chars[11]) && 
					!escolher.equals(chrs.chars[12]) && !escolher.equals(chrs.chars[13]) && 
					!escolher.equals(chrs.chars[14]) && !escolher.equals(chrs.chars[0]) && 
					!escolher.equals(chrs.chars[15]) && !escolher.equals(chrs.chars[16]) &&
					!escolher.equals(chrs.chars[17])) {
		System.out.println("Erro, tente novamente");
		Thread.sleep(1000);
			}
			if (escolher.equals(userCharV[0]) || escolher.equals(userCharV[1]) || escolher.equals(userCharV[2]) || 
					escolher.equals(userCharV[3]) || escolher.equals(userCharV[4]) || escolher.equals(userCharV[5]) || 
					escolher.equals(userCharV[6]) || escolher.equals(userCharV[7]) || escolher.equals(userCharV[8])) {
				if (escoModo.equals("classica")) {
				System.out.println("Voce ja escolheu esse personagem");
				}
			}
			
			impriChars();
			System.out.print("Escolha seu Personagem: ");
			escolher = entrada.next();
			} while (!escolher.equals(chrs.chars[0]) && !escolher.equals(chrs.chars[1]) && 
					!escolher.equals(chrs.chars[2]) && !escolher.equals(chrs.chars[3]) && 
					!escolher.equals(chrs.chars[4]) && !escolher.equals(chrs.chars[5]) && 
					!escolher.equals(chrs.chars[6]) && !escolher.equals(chrs.chars[7]) && 
					!escolher.equals(chrs.chars[8]) && !escolher.equals(chrs.chars[9]) && 
					!escolher.equals(chrs.chars[10]) && !escolher.equals(chrs.chars[11]) && 
					!escolher.equals(chrs.chars[12]) && !escolher.equals(chrs.chars[13]) && 
					!escolher.equals(chrs.chars[14]) && !escolher.equals(chrs.chars[0]) && 
					!escolher.equals(chrs.chars[15]) && !escolher.equals(chrs.chars[16]) &&
					!escolher.equals(chrs.chars[17]) &&
					 !escolher.equals(userCharV[0]) && !escolher.equals(userCharV[1]) && !escolher.equals(userCharV[2]) 
					 && !escolher.equals(userCharV[3]) && !escolher.equals(userCharV[4]) && !escolher.equals(userCharV[5]) 
					 && !escolher.equals(userCharV[6]) && !escolher.equals(userCharV[7]) && !escolher.equals(userCharV[8]));
			return escolher;
	}
//========================================================================================================
	static void mecanicaBatalha(int userNumber, String userChar, int userChars[], String machineChar, int machineChars[]) throws InterruptedException {
		Thread.sleep(500);
		System.out.println("Carregando Batalha...");
		Thread.sleep(4000);
		System.out.println("Round " + contaRound);
		Thread.sleep(1000);
		System.out.println("Fight!!!");
		Thread.sleep(2000);
		
		do {
			if (!atributoEsco.equals("power") && !atributoEsco.equals("magic") && !atributoEsco.equals("life")) {
				Thread.sleep(1000);
				System.out.println("Erro, tente novamente");
				Thread.sleep(1000);
			}
		
		System.out.println(userChar);
		Thread.sleep(1000);
		System.out.println("power: " + userChars[0] + "; ");
		Thread.sleep(500);
		System.out.println("magic: " + userChars[1] + "; ");
		Thread.sleep(500);
		System.out.println("life: " + userChars[2] + ".");
		Thread.sleep(500);

		System.out.print("Escolha um atributo de " + userChar + " entre 'Power', 'Magic', 'Life': ");
		atributoEsco = entrada.next();
		Thread.sleep(1000);
		} while (!atributoEsco.equals("power") && !atributoEsco.equals("magic") && !atributoEsco.equals("life"));
		
		if (atributoEsco.equals("power") || atributoEsco.equals("magic") || atributoEsco.equals("life")) {
			System.out.println("Voce escolheu " + atributoEsco);
			Thread.sleep(1000);
		}
		
		if (atributoEsco.equals("power")) {
			atributoEscoInt = 0;
		} else if (atributoEsco.equals("magic")) {
			atributoEscoInt = 1;
		} else if (atributoEsco.equals("life")) {
			atributoEscoInt = 2;
		}
		
		System.out.println("Oponente " + contaRound + " possui: " + machineChar);
		Thread.sleep(1200);
		
		if (atributoEsco.equals("power") || atributoEsco.equals("magic") || atributoEsco.equals("life")) {
			System.out.println(userChar + ": " + atributoEsco + " " + userChars[atributoEscoInt]);
			Thread.sleep(500);
			System.out.println(machineChar + ": " + atributoEsco + " " + machineChars[atributoEscoInt]);
			Thread.sleep(2000);
			if (userChars[atributoEscoInt] > machineChars[atributoEscoInt]) {
				System.out.println(userChar + " venceu!!");
				Thread.sleep(1200);
				System.out.println("FATALITY!!!!");
				win1 =1;
				contaRound += 1;
			}
			if (userChars[atributoEscoInt] < machineChars[atributoEscoInt]){
				System.out.println(machineChar + " venceu!!");
				Thread.sleep(1200);
				System.out.println("FATALITY!!!!");
				Thread.sleep(4000);
				win1 = 0;
				contaRound += 0;
				creditos -= 1;
			}
		
		}
	}
//========================================================================================================
	static int ranUser1(int userNumber) throws InterruptedException {
			
			if (userNumber == userNumberV[0]) {
				Thread.sleep(1200);
				numAle = n.nextInt(17);
				userNumber = numAle;
				
			} else if (userNumber == userNumberV[1]) {
				do {
					Thread.sleep(1200);
					numAle = n.nextInt(17);
					userNumber = numAle;
					} while (userNumber == userNumberV[0]);
				
			} else if (userNumber == userNumberV[2]) {
				do {
					Thread.sleep(1200);
					numAle = n.nextInt(17);
					userNumber = numAle;
					} while (userNumber == userNumberV[0] || userNumber == userNumberV[1]);
				
			} else if (userNumber == userNumberV[3]) {
				do {
					Thread.sleep(1200);
					numAle = n.nextInt(17);
					userNumber = numAle;
					} while (userNumber == userNumberV[0] || userNumber == userNumberV[1] || userNumber == userNumberV[2]);
				
			} else if (userNumber == userNumberV[4]) {
				do {
					Thread.sleep(1200);
					numAle = n.nextInt(17);
					userNumber = numAle;
					} while (userNumber == userNumberV[0] || userNumber == userNumberV[1] || userNumber == userNumberV[2] || 
							userNumber == userNumberV[3]);
				
			} else if (userNumber == userNumberV[5]) {
				do {
					Thread.sleep(1200);
					numAle = n.nextInt(17);
					userNumber = numAle;
					} while (userNumber == userNumberV[0] || userNumber == userNumberV[1] || userNumber == userNumberV[2] || 
							userNumber == userNumberV[3] || userNumber == userNumberV[4]);
				
			} else if (userNumber == userNumberV[6]) {
				do {
					Thread.sleep(1200);
					numAle = n.nextInt(17);
					userNumber = numAle;
					} while (userNumber == userNumberV[0] || userNumber == userNumberV[1] || userNumber == userNumberV[2] || 
							userNumber == userNumberV[3] || userNumber == userNumberV[4] || userNumber == userNumberV[5]);
				
			} else if (userNumber == userNumberV[7]) {
				do {
					Thread.sleep(1200);
					numAle = n.nextInt(17);
					userNumber = numAle;
					} while (userNumber == userNumberV[0] || userNumber == userNumberV[1] || userNumber == userNumberV[2] || 
							userNumber == userNumberV[3] || userNumber == userNumberV[4] || userNumber == userNumberV[5] || 
							userNumber == userNumberV[6]);
				
			} else if (userNumber == userNumberV[8]) {
				do {
					Thread.sleep(1200);
					numAle = n.nextInt(17);
					userNumber = numAle;
					} while (userNumber == userNumberV[0] || userNumber == userNumberV[1] || userNumber == userNumberV[2] || 
							userNumber == userNumberV[3] || userNumber == userNumberV[4] || userNumber == userNumberV[5] || 
							userNumber == userNumberV[6] || userNumber == userNumberV[7]);
			
		}
		return userNumber;
	}
//========================================================================================================
	static int escUser1(String userChar, int userNumber) throws InterruptedException {	//NO CASO DE ESCOLHER, ATRIBUI O NUMERO DO PERSONAGEM CORRESPONDENTE
		if (userChar.equals(chrs.chars[0])) {
				userNumber = 0;
		} else if (userChar.equals(chrs.chars[1])) {
				userNumber = 1;
		} else if (userChar.equals(chrs.chars[2])) {
			userNumber = 2;
		} else if (userChar.equals(chrs.chars[3])) {
			userNumber = 3;
		} else if (userChar.equals(chrs.chars[4])) {
			userNumber = 4;
		} else if (userChar.equals(chrs.chars[5])) {
			userNumber = 5;
		} else if (userChar.equals(chrs.chars[6])) {
			userNumber = 6;
		} else if (userChar.equals(chrs.chars[7])) {
			userNumber = 7;
		} else if (userChar.equals(chrs.chars[8])) {
			userNumber = 8;
		} else if (userChar.equals(chrs.chars[9])) {
			userNumber = 9;
		} else if (userChar.equals(chrs.chars[10])) {
			userNumber = 10;
		} else if (userChar.equals(chrs.chars[11])) {
			userNumber = 11;
		} else if (userChar.equals(chrs.chars[12])) {
			userNumber = 12;
		} else if (userChar.equals(chrs.chars[13])) {
			userNumber = 13;
		} else if (userChar.equals(chrs.chars[14])) {
			userNumber = 14;
		} else if (userChar.equals(chrs.chars[15])) {
			userNumber = 15;
		} else if (userChar.equals(chrs.chars[16])) {
			userNumber = 16;
		} else if (userChar.equals(chrs.chars[17])) {
			userNumber = 17;
		}
		return userNumber;
	}
//========================================================================================================
	static int[][] escUser2(int userNumber, int userChars[][]) throws InterruptedException {
	
		if (userNumber == 0) {
			userChars[0][0] = chrs.motaro[0];
			userChars[0][1] = chrs.motaro[1];
			userChars[0][2] = chrs.motaro[2];
			
		} else if (userNumber == 1) {
			userChars[1][0] = chrs.sonya[0];
			userChars[1][1] = chrs.sonya[1];
			userChars[1][2] = chrs.sonya[2];
			
		}  else if (userNumber == 2) {
			userChars[2][0] = chrs.nightwolf[0];
			userChars[2][1] = chrs.nightwolf[1];
			userChars[2][2] = chrs.nightwolf[2];
			
		}  else if (userNumber == 3) {
			userChars[3][0] = chrs.sindel[0];
			userChars[3][1] = chrs.sindel[1];
			userChars[3][2] = chrs.sindel[2];
			
		}  else if (userNumber == 4) {
			userChars[4][0] = chrs.stryker[0];
			userChars[4][1] = chrs.stryker[1];
			userChars[4][2] = chrs.stryker[2];
			
		}  else if (userNumber == 5) {
			userChars[5][0] = chrs.sheeva[0];
			userChars[5][1] = chrs.sheeva[1];
			userChars[5][2] = chrs.sheeva[2];
			
		}  else if (userNumber == 6) {
			userChars[6][0] = chrs.noob[0];
			userChars[6][1] = chrs.noob[1];
			userChars[6][2] = chrs.noob[2];
			
		}  else if (userNumber == 7) {
			userChars[7][0] = chrs.subzero[0];
			userChars[7][1] = chrs.subzero[1];
			userChars[7][2] = chrs.subzero[2];
			
		}  else if (userNumber == 8) {
			userChars[8][0] = chrs.shangtsung[0];
			userChars[8][1] = chrs.shangtsung[1];
			userChars[8][2] = chrs.shangtsung[2];
			
		}  else if (userNumber == 9) {
			userChars[9][0] = chrs.shaokahn[0];
			userChars[9][1] = chrs.shaokahn[1];
			userChars[9][2] = chrs.shaokahn[2];
			
		}  else if (userNumber == 10) {
			userChars[10][0] = chrs.sektor[0];
			userChars[10][1] = chrs.sektor[1];
			userChars[10][2] = chrs.sektor[2];
			
		}  else if (userNumber == 11) {
			userChars[11][0] = chrs.cyrax[0];
			userChars[11][1] = chrs.cyrax[1];
			userChars[11][2] = chrs.cyrax[2];
			
		}  else if (userNumber == 12) {
			userChars[12][0] = chrs.smoke[0];
			userChars[12][1] = chrs.smoke[1];
			userChars[12][2] = chrs.smoke[2];
			
		}  else if (userNumber == 13) {
			userChars[13][0] = chrs.kano[0];
			userChars[13][1] = chrs.kano[1];
			userChars[13][2] = chrs.kano[2];
			
		}  else if (userNumber == 14) {
			userChars[14][0] = chrs.liukang[0];
			userChars[14][1] = chrs.liukang[1];
			userChars[14][2] = chrs.liukang[2];
			
		}  else if (userNumber == 15) {
			userChars[15][0] = chrs.kunglao[0];
			userChars[15][1] = chrs.kunglao[1];
			userChars[15][2] = chrs.kunglao[2];
		
		}  else if (userNumber == 16) {
			userChars[16][0] = chrs.jax[0];
			userChars[16][1] = chrs.jax[1];
			userChars[16][2] = chrs.jax[2];
			
		}  else if (userNumber == 17) {
			userChars[17][0] = chrs.kabal[0];
			userChars[17][1] = chrs.kabal[1];
			userChars[17][2] = chrs.kabal[2];
		
		}
	return userChars;
}
//========================================================================================================
	static String escUser3(int userNumber, String userChar) throws InterruptedException {
		
	if (userNumber == 0) {
		userChar = chrs.chars[0];
		
	} else if (userNumber == 1) {
		userChar = chrs.chars[1];
		
	} else if (userNumber == 2) {
		userChar = chrs.chars[2];
		
	} else if (userNumber == 3) {
		userChar = chrs.chars[3];
		
	} else if (userNumber == 4) {
		userChar = chrs.chars[4];
		
	} else if (userNumber == 5) {
		userChar = chrs.chars[5];
		
	} else if (userNumber == 6) {
		userChar = chrs.chars[6];
		
	} else if (userNumber == 7) {
		userChar = chrs.chars[7];
		
	} else if (userNumber == 8) {
		userChar = chrs.chars[8];
		
	} else if (userNumber == 9) {
		userChar = chrs.chars[9];
		
	} else if (userNumber == 10) {
		userChar = chrs.chars[10];
		
	} else if (userNumber == 11) {
		userChar = chrs.chars[11];
		
	} else if (userNumber == 12) {
		userChar = chrs.chars[12];
		
	} else if (userNumber == 13) {
		userChar = chrs.chars[13];
		
	} else if (userNumber == 14) {
		userChar = chrs.chars[14];
		
	} else if (userNumber == 15) {
		userChar = chrs.chars[15];
		
	} else if (userNumber == 16) {
		userChar = chrs.chars[16];
		
	} else if (userNumber == 17) {
		userChar = chrs.chars[17];
	
	}
	return userChar;
}
//========================================================================================================
	static void arcade() throws InterruptedException {
		
		
	}
}
