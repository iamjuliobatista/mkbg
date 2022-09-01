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
	static int winS = 0;
	static int quantInimigos = 0;
	static String escolher = "jax";
	static String firstChoose = "escolher";
	static String destEsco = "master";
	static String escoModo = "arcade";
	static String atributoEsco = "power";
	

		
	    public static final String ANSI_RESET = "\u001B[0m";
	    public static final String ANSI_YELLOW = "\u001B[33m";
	    public static final String ANSI_RED = "\u001B[41m";
	    public static final String ANSI_NEG = "\u001B[1m";
	    public static final String ANSI_SUB = "\u001B[4m";
	
//========================================================================================================
	static void apresentacao() throws InterruptedException {			//TELA INICIAL DO GAME
		System.out.println("  __  __    ____    _____    _______              _          _  __   ____    __  __   ____               _______ ");
		System.out.println(" |  \\/  |  / __ \\  |  __ \\  |__   __|     /\\     | |        | |/ /  / __ \\  |  \\/  | |  _ \\      /\\     |__   __|");
		System.out.println(" | \\  / | | |  | | | |__) |    | |       /  \\    | |        | ' /  | |  | | | \\  / | | |_) |    /  \\       | |   ");
		System.out.println(" | |\\/| | | |  | | |  _  /     | |      / /\\ \\   | |        |  <   | |  | | | |\\/| | |  _ <    / /\\ \\      | |   ");
		System.out.println(" | |  | | | |__| | | | \\ \\     | |     / ____ \\  | |____    | . \\  | |__| | | |  | | | |_) |  / ____ \\     | |   ");
		System.out.println(" |_|  |_|  \\____/  |_|  \\_\\    |_|    /_/    \\_\\ |______|   |_|\\_\\  \\____/  |_|  |_| |____/  /_/    \\_\\    |_|   ");
		System.out.println("");
		//Thread.sleep(1500);
		System.out.println("     _                         ___      _   _   _     _              ");
		System.out.println("  _ | |  __ _  __ __  __ _    | __|  __| | (_) | |_  (_)  ___   _ _  ");
		System.out.println(" | || | / _` | \\ V / / _` |   | _|  / _` | | | |  _| | | / _ \\ | ' \\ ");
		System.out.println("  \\__/  \\__,_|  \\_/  \\__,_|   |___| \\__,_| |_|  \\__| |_| \\___/ |_||_|");
		System.out.println("");
		//Thread.sleep(2000);
		credit();
		System.out.print(ANSI_NEG + "PRESIONE QUALQUER BOTÃO: " + ANSI_RESET);
		entrada.next();
		System.out.println();
		//Thread.sleep(500);
		System.out.println("Carregando...");
		Thread.sleep(250);
		System.out.println("█▒▒▒▒▒▒▒▒▒");
		System.out.println("10%");
		Thread.sleep(550);
		System.out.println("███▒▒▒▒▒▒▒");
		System.out.println("30%");
		Thread.sleep(400);
		System.out.println("█████▒▒▒▒▒");
		System.out.println("50%");
		Thread.sleep(500);
		System.out.println("███████▒▒▒");
		System.out.println("70%");
		Thread.sleep(1000);
		System.out.println("██████████");
		System.out.println("100%");
		System.out.println("");
		//Thread.sleep(3000);
	}
	static int credit() {
		if (creditos == 0) {
		do {
			System.out.print("Insira créditos: ");
			creditos = entrada.nextInt();
			
			if (creditos <= 0) {
				System.err.println("Insira pelo menos 1 crédito");
			} else if (creditos > 20) {
				System.err.println("A quantidade maxima de créditos é 20");
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
	static int machine1(int machineNumber) {
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
	static void impriChars() throws InterruptedException {			//IMPRESSAO DO NOME DOS PERSONAGENS
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("1 - motaro⠀⠀| 2 - sonya⠀⠀ | 3 - nightwolf⠀⠀⠀| 4 - sindel⠀⠀ㅤ | 5 - stryker⠀⠀| 6 - sheeva");
		System.out.println("7 - noob⠀⠀⠀ | 8 - subzero | 9 - shangtsung ⠀| 10 - shaokahn⠀| 11 - sektor  | 12 - cyrax");
		System.out.println("13 - smoke⠀⠀| 14 - kano⠀⠀ | 15 - liukang⠀⠀  | 16 - kunglao  | 17 - jaxㅤ⠀ ㅤ| 18 - kabal");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println();
	}
	static void creditosFim() throws InterruptedException {
		Thread.sleep(600);
		System.out.println("Congratulations");
		Thread.sleep(600);
		System.out.println("Game Director/Programmer: Julio");
		Thread.sleep(3000);
		System.out.println("");
		Thread.sleep(200);
		System.out.println("2022");
		Thread.sleep(1500);
	}
	static void creditosFimE() throws InterruptedException {
		Thread.sleep(600);
		System.out.println("Game Director/Programmer: Julio");
		Thread.sleep(3000);
		System.out.println("");
		Thread.sleep(200);
		System.out.println("2022");
		Thread.sleep(1500);
	}
	static void escoModo() {
		do {
			if (!escoModo.equals("arcade") && !escoModo.equals("classico") && !escoModo.equals("sobrevivencia")) {
				System.out.println();
				System.err.println("Erro, tente novamente");
				System.out.println();
			}
			System.out.println("1 - Arcade");
			System.out.println("2 - Classico");
			System.out.println("3 - Sobrevivencia");
			System.out.print("Escolha o modo de jogo: ");
			escoModo = entrada.next();
		} while (!escoModo.equals("arcade") && !escoModo.equals("classico") && !escoModo.equals("sobrevivencia"));
	System.out.println();
	}
//========================================================================================================
	static String escoTorre() {
		do {
			if (!destEsco.equals("novato") && !destEsco.equals("guerreiro") && !destEsco.equals("master")) {
				System.err.println("Erro, tente novamente");
			}
		System.out.println("1 - Novato");
		System.out.println("2 - Guerreiro");
		System.out.println("3 - Master");
		System.out.print("Escolha seu destino: ");
		destEsco = entrada.next();
		} while (!destEsco.equals("novato") && !destEsco.equals("guerreiro") && !destEsco.equals("master"));
		return destEsco;
	}
//========================================================================================================
	static int escoQuant() {										//ESCOLHER QUANTIDADE DE PERSONAGENS NO MODO CLASSICO
		
		do {
		if (quantChar <= 0 || quantChar > 9) {
			if (quantChar <= 0) {
				System.err.println("Erro, tente novamente");
				System.err.println("A quantidade minima de personagens é 1");
			} else if (quantChar > 9) {
				System.err.println("Erro, tente novamente");
				System.err.println("A quantidade maxima de personagens é 9");
			}	
		}
		
		System.out.print("Deseja quantos personagens na batalha? ");
		quantChar = entrada.nextInt();
		System.out.println();
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
				System.out.println();
				System.err.println("Erro, tente novamente");
				System.out.println();
			}
		System.out.println("1 - Escolher");
		System.out.println("2 - Aleatorio");
		System.out.print("Deseja escolher ou modo aleatorio? ");
		firstChoose = entrada.next();
		} while (!firstChoose.equals("aleatorio") && !firstChoose.equals("escolher"));
		System.out.println();
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
		System.err.println("Erro, tente novamente");
		Thread.sleep(1000);
			}
			
			impriChars();
			System.out.print("Escolha seu Personagem: ");
			escolher = entrada.next();
			
			if (escolher.equals(userChar1) || escolher.equals(userChar2) || escolher.equals(userChar3) || 
					escolher.equals(userChar4) || escolher.equals(userChar5) || escolher.equals(userChar6) || 
					escolher.equals(userChar7) || escolher.equals(userChar8) || escolher.equals(userChar9)) {
				if (escoModo.equals("classico")) {
				System.err.println("Voce ja escolheu esse personagem");
				}
			}
			
			} while (!escolher.equals(chrs.chars[0]) && !escolher.equals(chrs.chars[1]) && 
					!escolher.equals(chrs.chars[2]) && !escolher.equals(chrs.chars[3]) && 
					!escolher.equals(chrs.chars[4]) && !escolher.equals(chrs.chars[5]) && 
					!escolher.equals(chrs.chars[6]) && !escolher.equals(chrs.chars[7]) && 
					!escolher.equals(chrs.chars[8]) && !escolher.equals(chrs.chars[9]) && 
					!escolher.equals(chrs.chars[10]) && !escolher.equals(chrs.chars[11]) && 
					!escolher.equals(chrs.chars[12]) && !escolher.equals(chrs.chars[13]) && 
					!escolher.equals(chrs.chars[14]) && !escolher.equals(chrs.chars[0]) && 
					!escolher.equals(chrs.chars[15]) && !escolher.equals(chrs.chars[16]) &&
					!escolher.equals(chrs.chars[17]) ||
					 escolher.equals(userChar1) || escolher.equals(userChar2) || escolher.equals(userChar3) 
					 || escolher.equals(userChar4) || escolher.equals(userChar5) || escolher.equals(userChar6) 
					 || escolher.equals(userChar7) || escolher.equals(userChar8) || escolher.equals(userChar9));
			return escolher;
	}
//========================================================================================================
	static void mecanicaBatalha(int userNumber, String userChar, int userChars[], String machineChar, int machineChars[]) throws InterruptedException {
		Thread.sleep(500);
		System.out.println("Carregando Batalha...");
		Thread.sleep(4000);
		System.out.println(ANSI_YELLOW +
				"ROUND " + contaRound
				+ ANSI_RESET);
		Thread.sleep(1000);
		System.out.println(ANSI_RED + ANSI_NEG +
				"FIGHT!!"
				+ ANSI_RESET);
		Thread.sleep(2000);
		
		do {
			if (!atributoEsco.equals("power") && !atributoEsco.equals("magic") && !atributoEsco.equals("life")) {
				Thread.sleep(1000);
				System.err.println("Erro, tente novamente");
				Thread.sleep(1000);
			}
		
		System.out.println(userChar);
		Thread.sleep(1000);
		System.out.println("1 - power: " + userChars[0] + "; ");
		Thread.sleep(500);
		System.out.println("2 - magic: " + userChars[1] + "; ");
		Thread.sleep(500);
		System.out.println("3 - life: " + userChars[2] + ".");
		Thread.sleep(500);

		System.out.print("Escolha um atributo de " + userChar + ": ");
		atributoEsco = entrada.next();
		Thread.sleep(1000);
		} while (!atributoEsco.equals("power") && !atributoEsco.equals("magic") && !atributoEsco.equals("life"));
		
		if (atributoEsco.equals("power") || atributoEsco.equals("magic") || atributoEsco.equals("life")) {
			System.out.println("Voce escolheu " + ANSI_SUB + atributoEsco + ANSI_RESET);
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
				System.out.println(userChar + " wins!!");
				Thread.sleep(1200);
				System.out.println(ANSI_RED + "FATALITY!!!!" + ANSI_RESET);
				System.out.println();
				win1 =1;
				winS = 0;
				contaRound += 1;
			}
			if (userChars[atributoEscoInt] < machineChars[atributoEscoInt]){
				System.out.println(machineChar + " wins!!");
				Thread.sleep(1200);
				System.out.println(ANSI_RED + "FATALITY!!!!" + ANSI_RESET);
				System.out.println();
				Thread.sleep(4000);
				win1 = 0;
				winS = 1;
				if (escoModo.equals("classico")) {
				contaRound += 1;
				}
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


}