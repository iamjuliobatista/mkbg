package package01;

import java.util.Random;
import java.util.Scanner;

public class Navigation {
//======================================================================================================
		static String machineChar1 = "vazio1"; static String machineChar2 = "vazio2"; static String machineChar3 = "vazio3";
		static String machineChar4 = "vazio4"; static String machineChar5 = "vazio5"; static String machineChar6 = "vazio6";
		static String machineChar7 = "vazio7"; static String machineChar8 = "vazio8"; static String machineChar9 = "vazio9";
		static int machineChars1[] = {1, 1, 1}; static int machineChars2[] = {1, 1, 1}; static int machineChars3[] = {1, 1, 1};
		static int machineChars4[] = {1, 1, 1}; static int machineChars5[] = {1, 1, 1}; static int machineChars6[] = {1, 1, 1};
		static int machineChars7[] = {1, 1, 1}; static int machineChars8[] = {1, 1, 1}; static int machineChars9[] = {1, 1, 1};
		static int machineNumber1 = 31; static int machineNumber2 = 32; static int machineNumber3 = 33;
		static int machineNumber4 = 34; static int machineNumber5 = 35; static int machineNumber6 = 36;
		static int machineNumber7 = 37; static int machineNumber8 = 38; static int machineNumber9 = 39;
//=======================================================================================================		
		static String userChar1 = "vazio1"; static String userChar2 = "vazio2"; static String userChar3 = "vazio3";
		static String userChar4 = "vazio4"; static String userChar5 = "vazio5"; static String userChar6 = "vazio6";
		static String userChar7 = "vazio7"; static String userChar8 = "vazio8"; static String userChar9 = "vazio9";
		static int userChars1[] = {1, 1, 1}; static int userChars2[] = {1, 1, 1}; static int userChars3[] = {1, 1, 1}; 
		static int userChars4[] = {1, 1, 1}; static int userChars5[] = {1, 1, 1}; static int userChars6[] = {1, 1, 1}; 
		static int userChars7[] = {1, 1, 1}; static int userChars8[] = {1, 1, 1}; static int userChars9[] = {1, 1, 1};
		static int userNumber1 = 41; static int userNumber2 = 42; static int userNumber3 = 43; 
		static int userNumber4 = 44; static int userNumber5 = 45; static int userNumber6 = 46; 
		static int userNumber7 = 47; static int userNumber8 = 48; static int userNumber9 = 49; 
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
		if (machineNumber == machineNumber1) {
		do {
			numAle2 = n.nextInt(17);
			machineNumber = numAle2;
		} while (machineNumber == userNumber1 || machineNumber == userNumber2 || machineNumber == userNumber3 || 
				machineNumber == userNumber4 || machineNumber == userNumber5 || machineNumber == userNumber6 || 
				machineNumber == userNumber7 || machineNumber == userNumber8 || machineNumber == userNumber9);
//===============================================================================================================================		
		} else if (machineNumber == machineNumber2) {
			do {
				numAle2 = n.nextInt(17);
				machineNumber = numAle2;
			} while (machineNumber == userNumber1 || machineNumber == userNumber2 || machineNumber == userNumber3 || 
					machineNumber == userNumber4 || machineNumber == userNumber5 || machineNumber == userNumber6 || 
					machineNumber == userNumber7 || machineNumber == userNumber8 || machineNumber == userNumber9 ||
					machineNumber == machineNumber1);
//===============================================================================================================================
			} else if (machineNumber == machineNumber3) {
				do {
					numAle2 = n.nextInt(17);
					machineNumber = numAle2;
				} while (machineNumber == userNumber1 || machineNumber == userNumber2 || machineNumber == userNumber3 || 
						machineNumber == userNumber4 || machineNumber == userNumber5 || machineNumber == userNumber6 || 
						machineNumber == userNumber7 || machineNumber == userNumber8 || machineNumber == userNumber9 ||
						machineNumber == machineNumber1 || machineNumber == machineNumber2);
//===============================================================================================================================
			} else if (machineNumber == machineNumber4) {
				do {
					numAle2 = n.nextInt(17);
					machineNumber = numAle2;
				} while (machineNumber == userNumber1 || machineNumber == userNumber2 || machineNumber == userNumber3 || 
						machineNumber == userNumber4 || machineNumber == userNumber5 || machineNumber == userNumber6 || 
						machineNumber == userNumber7 || machineNumber == userNumber8 || machineNumber == userNumber9 ||
						machineNumber == machineNumber1 || machineNumber == machineNumber2 || machineNumber == machineNumber3);
//===============================================================================================================================
			} else if (machineNumber == machineNumber5) {
				do {
					numAle2 = n.nextInt(17);
					machineNumber = numAle2;
				} while (machineNumber == userNumber1 || machineNumber == userNumber2 || machineNumber == userNumber3 || 
						machineNumber == userNumber4 || machineNumber == userNumber5 || machineNumber == userNumber6 || 
						machineNumber == userNumber7 || machineNumber == userNumber8 || machineNumber == userNumber9 ||
						machineNumber == machineNumber1 || machineNumber == machineNumber2 || machineNumber == machineNumber3 || 
						machineNumber == machineNumber4);
//===============================================================================================================================
			} else if (machineNumber == machineNumber6) {
				do {
					numAle2 = n.nextInt(17);
					machineNumber = numAle2;
				} while (machineNumber == userNumber1 || machineNumber == userNumber2 || machineNumber == userNumber3 || 
						machineNumber == userNumber4 || machineNumber == userNumber5 || machineNumber == userNumber6 || 
						machineNumber == userNumber7 || machineNumber == userNumber8 || machineNumber == userNumber9 ||
						machineNumber == machineNumber1 || machineNumber == machineNumber2 || machineNumber == machineNumber3 || 
						machineNumber == machineNumber4 || machineNumber == machineNumber5);
//===============================================================================================================================
			} else if (machineNumber == machineNumber7) {
				do {
					numAle2 = n.nextInt(17);
					machineNumber = numAle2;
				} while (machineNumber == userNumber1 || machineNumber == userNumber2 || machineNumber == userNumber3 || 
						machineNumber == userNumber4 || machineNumber == userNumber5 || machineNumber == userNumber6 || 
						machineNumber == userNumber7 || machineNumber == userNumber8 || machineNumber == userNumber9 ||
						machineNumber == machineNumber1 || machineNumber == machineNumber2 || machineNumber == machineNumber3 || 
						machineNumber == machineNumber4 || machineNumber == machineNumber5 || machineNumber == machineNumber6);
//===============================================================================================================================
			} else if (machineNumber == machineNumber8) {
				do {
					numAle2 = n.nextInt(17);
					machineNumber = numAle2;
				} while (machineNumber == userNumber1 || machineNumber == userNumber2 || machineNumber == userNumber3 || 
						machineNumber == userNumber4 || machineNumber == userNumber5 || machineNumber == userNumber6 || 
						machineNumber == userNumber7 || machineNumber == userNumber8 || machineNumber == userNumber9 ||
						machineNumber == machineNumber1 || machineNumber == machineNumber2 || machineNumber == machineNumber3 || 
						machineNumber == machineNumber4 || machineNumber == machineNumber5 || machineNumber == machineNumber6 || 
						machineNumber == machineNumber7);
//===============================================================================================================================				
			} else if (machineNumber == machineNumber9) {
				do {
					numAle2 = n.nextInt(17);
					machineNumber = numAle2;
				} while (machineNumber == userNumber1 || machineNumber == userNumber2 || machineNumber == userNumber3 || 
						machineNumber == userNumber4 || machineNumber == userNumber5 || machineNumber == userNumber6 || 
						machineNumber == userNumber7 || machineNumber == userNumber8 || machineNumber == userNumber9 ||
						machineNumber == machineNumber1 || machineNumber == machineNumber2 || machineNumber == machineNumber3 || 
						machineNumber == machineNumber4 || machineNumber == machineNumber5 || machineNumber == machineNumber6 || 
						machineNumber == machineNumber7 || machineNumber == machineNumber8);
			}
		return machineNumber;
//===============================================================================================================================
		
}
//========================================================================================================
	static int[] machine2(int machineNumber, int machineChars[]) {
		
		if (machineNumber == 0) {
			machineChars = chrs.motaro;
			
		} else if (machineNumber == 1) {
			machineChars = chrs.sonya;
			
		}  else if (machineNumber == 2) {
			machineChars = chrs.nightwolf;
			
		}  else if (machineNumber == 3) {
			machineChars = chrs.sindel;
			
		}  else if (machineNumber == 4) {
			machineChars = chrs.stryker;
			
		}  else if (machineNumber == 5) {
			machineChars = chrs.sheeva;
			
		}  else if (machineNumber == 6) {
			machineChars = chrs.noob;
			
		}  else if (machineNumber == 7) {
			machineChars = chrs.subzero;
			
		}  else if (machineNumber == 8) {
			machineChars = chrs.shangtsung;
			
		}  else if (machineNumber == 9) {
			machineChars = chrs.shaokahn;
			
		}  else if (machineNumber == 10) {
			machineChars = chrs.sektor;
			
		}  else if (machineNumber == 11) {
			machineChars = chrs.cyrax;
			
		}  else if (machineNumber == 12) {
			machineChars = chrs.smoke;
			
		}  else if (machineNumber == 13) {
			machineChars = chrs.kano;
			
		}  else if (machineNumber == 14) {
			machineChars = chrs.liukang;
			
		}  else if (machineNumber == 15) {
			machineChars = chrs.kunglao;
		
		}  else if (machineNumber == 16) {
			machineChars = chrs.jax;
			
		}  else if (machineNumber == 17) {
			machineChars = chrs.kabal;
		
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
		
		System.out.println("Batalha Classica");
		System.out.println("Deseja quantos personagens na batalha?");
		quantChar = entrada.nextInt();
		} while (quantChar <= 0 || quantChar > 9);
		return quantChar;
}
	static void exibeTime(int quantEsco) {
		if (quantEsco == 1) {
			System.out.println("Seu personagem é: " + userChar1);
		} else if (quantEsco == 2) {
			System.out.println("Seu time é: " + userChar1 + ", " + userChar2);
		} else if (quantEsco == 3) {
			System.out.println("Seu time é: " + userChar1 + ", " + userChar2 + ", " + userChar3);
		} else if (quantEsco == 4) {
			System.out.println("Seu time é: " + userChar1 + ", " + userChar2 + ", " + userChar3
			 + ", " + userChar4);
		} else if (quantEsco == 5) {
			System.out.println("Seu time é: " + userChar1 + ", " + userChar2 + ", " + userChar3
					 + ", " + userChar4 + ", " + userChar5);
		} else if (quantEsco == 6) {
			System.out.println("Seu time é: " + userChar1 + ", " + userChar2 + ", " + userChar3
					 + ", " + userChar4 + ", " + userChar5 + ", " + userChar6);
		} else if (quantEsco == 7) {
			System.out.println("Seu time é: " + userChar1 + ", " + userChar2 + ", " + userChar3
					 + ", " + userChar4 + ", " + userChar5 + ", " + userChar6
					 + ", " + userChar7);
		} else if (quantEsco == 8) {
			System.out.println("Seu time é: " + userChar1 + ", " + userChar2 + ", " + userChar3
					 + ", " + userChar4 + ", " + userChar5 + ", " + userChar6
					 + ", " + userChar7 + ", " + userChar8);
		} else if (quantEsco == 9) {
			System.out.println("Seu time é: " + userChar1 + ", " + userChar2 + ", " + userChar3
					 + ", " + userChar4 + ", " + userChar5 + ", " + userChar6
					 + ", " + userChar7 + ", " + userChar8 + ", " + userChar9);
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
			if (escolher.equals(userChar1) || escolher.equals(userChar2) || escolher.equals(userChar3) || 
					escolher.equals(userChar4) || escolher.equals(userChar5) || escolher.equals(userChar6) || 
					escolher.equals(userChar7) || escolher.equals(userChar8) || escolher.equals(userChar9)) {
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
					 !escolher.equals(userChar1) && !escolher.equals(userChar2) && !escolher.equals(userChar3) 
					 && !escolher.equals(userChar4) && !escolher.equals(userChar5) && !escolher.equals(userChar6) 
					 && !escolher.equals(userChar7) && !escolher.equals(userChar8) && !escolher.equals(userChar9));
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
			
			if (userNumber == userNumber1) {
				Thread.sleep(1200);
				numAle = n.nextInt(17);
				userNumber = numAle;
				
			} else if (userNumber == userNumber2) {
				do {
					Thread.sleep(1200);
					numAle = n.nextInt(17);
					userNumber = numAle;
					} while (userNumber == userNumber1);
				
			} else if (userNumber == userNumber3) {
				do {
					Thread.sleep(1200);
					numAle = n.nextInt(17);
					userNumber = numAle;
					} while (userNumber == userNumber1 || userNumber == userNumber2);
				
			} else if (userNumber == userNumber4) {
				do {
					Thread.sleep(1200);
					numAle = n.nextInt(17);
					userNumber = numAle;
					} while (userNumber == userNumber1 || userNumber == userNumber2 || userNumber == userNumber3);
				
			} else if (userNumber == userNumber5) {
				do {
					Thread.sleep(1200);
					numAle = n.nextInt(17);
					userNumber = numAle;
					} while (userNumber == userNumber1 || userNumber == userNumber2 || userNumber == userNumber3 || 
							userNumber == userNumber4);
				
			} else if (userNumber == userNumber6) {
				do {
					Thread.sleep(1200);
					numAle = n.nextInt(17);
					userNumber = numAle;
					} while (userNumber == userNumber1 || userNumber == userNumber2 || userNumber == userNumber3 || 
							userNumber == userNumber4 || userNumber == userNumber5);
				
			} else if (userNumber == userNumber7) {
				do {
					Thread.sleep(1200);
					numAle = n.nextInt(17);
					userNumber = numAle;
					} while (userNumber == userNumber1 || userNumber == userNumber2 || userNumber == userNumber3 || 
							userNumber == userNumber4 || userNumber == userNumber5 || userNumber == userNumber6);
				
			} else if (userNumber == userNumber8) {
				do {
					Thread.sleep(1200);
					numAle = n.nextInt(17);
					userNumber = numAle;
					} while (userNumber == userNumber1 || userNumber == userNumber2 || userNumber == userNumber3 || 
							userNumber == userNumber4 || userNumber == userNumber5 || userNumber == userNumber6 || 
							userNumber == userNumber7);
				
			} else if (userNumber == userNumber9) {
				do {
					Thread.sleep(1200);
					numAle = n.nextInt(17);
					userNumber = numAle;
					} while (userNumber == userNumber1 || userNumber == userNumber2 || userNumber == userNumber3 || 
							userNumber == userNumber4 || userNumber == userNumber5 || userNumber == userNumber6 || 
							userNumber == userNumber7 || userNumber == userNumber8);
			
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
	static int[] escUser2(int userNumber, int userChars[]) throws InterruptedException {
	
	if (userNumber == 0) {
			userChars = chrs.motaro;
			
	} else if (userNumber == 1) {
		userChars = chrs.sonya;
		
	} else if (userNumber == 2) {
		userChars = chrs.nightwolf;
		
	} else if (userNumber == 3) {
		userChars = chrs.sindel;
		
	} else if (userNumber == 4) {
		userChars = chrs.stryker;
		
	} else if (userNumber == 5) {
		userChars = chrs.sheeva;
		
	} else if (userNumber == 6) {
		userChars = chrs.noob;
		
	} else if (userNumber == 7) {
		userChars = chrs.subzero;
		
	} else if (userNumber == 8) {
		userChars = chrs.shangtsung;
		
	} else if (userNumber == 9) {
		userChars = chrs.shaokahn;
		
	} else if (userNumber == 10) {
		userChars = chrs.sektor;
		
	} else if (userNumber == 11) {
		userChars = chrs.cyrax;
		
	} else if (userNumber == 12) {
		userChars = chrs.smoke;
		
	} else if (userNumber == 13) {
		userChars = chrs.kano;
		
	} else if (userNumber == 14) {
		userChars = chrs.liukang;
		
	} else if (userNumber == 15) {
		userChars = chrs.kunglao;
		
	} else if (userNumber == 16) {
		userChars = chrs.jax;
		
	} else if (userNumber == 17) {
		userChars = chrs.kabal;
		
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
