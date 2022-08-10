package package01;

public class TestsBeta {
	
	public static void main(String[] args) throws InterruptedException {
		String respEAA = "vazio";
		String respEAC = "vazio1";
		String torreEscolhida = "vazio";
		int contadorTorre = 0;
		int batalhasVenc = 0;
		int quantEsco = 0;
		int charsEsco = 1;
		
		
		Navigation nav1 = new Navigation();
		
		do {
		nav1.apresentacao();
		nav1.escoModo();
//======================================================================================
//INITIATION ARCADE MODE
		//ESCOLHENDO PERSONAGEM
		if (nav1.escoModo.equals("arcade")) {
			
			do {
			System.out.println("CREDITOS RESTANTES: " + nav1.creditos);
			respEAA = nav1.escoOuAle();
			
			if (respEAA.equals("escolher")) {
				nav1.userChar1 = nav1.escolhendo();
				nav1.userNumber1 = nav1.escUser1(nav1.userChar1, nav1.userNumber1);
				nav1.userChars1 = nav1.escUser2(nav1.userNumber1, nav1.userChars1);
				System.out.println("Voce escolheu " + nav1.userChar1);
				
			} else if (respEAA.equals("aleatorio")) {
				nav1.userNumber1 = nav1.ranUser1(nav1.userNumber1);
				nav1.userChar1 = nav1.escUser3(nav1.userNumber1, nav1.userChar1);
				nav1.userChars1 = nav1.escUser2(nav1.userNumber1, nav1.userChars1);
				System.out.println("Voce escolheu " + nav1.userChar1);
			}
		//FIM DA ESCOLHA DE PERSONAGEM
//======================================================================================
		if (nav1.verificaCreditos == nav1.creditos) {
//MACHINE CHAR 1
			nav1.machineNumber1 = nav1.machine1(nav1.machineNumber1);
			nav1.machineChars1 = nav1.machine2(nav1.machineNumber1, nav1.machineChars1);
			nav1.machineChar1 = nav1.machine3(nav1.machineNumber1, nav1.machineChar1);
//MACHINE CHAR 2
			nav1.machineNumber2 = nav1.machine1(nav1.machineNumber2);
			nav1.machineChars2 = nav1.machine2(nav1.machineNumber2, nav1.machineChars2);
			nav1.machineChar2 = nav1.machine3(nav1.machineNumber2, nav1.machineChar2);
//MACHINE CHAR 3
			nav1.machineNumber3 = nav1.machine1(nav1.machineNumber3);
			nav1.machineChars3 = nav1.machine2(nav1.machineNumber3, nav1.machineChars3);
			nav1.machineChar3 = nav1.machine3(nav1.machineNumber3, nav1.machineChar3);
//MACHINE CHAR 4
			nav1.machineNumber4 = nav1.machine1(nav1.machineNumber4);
			nav1.machineChars4 = nav1.machine2(nav1.machineNumber4, nav1.machineChars4);
			nav1.machineChar4 = nav1.machine3(nav1.machineNumber4, nav1.machineChar4);
//MACHINE CHAR 5
			nav1.machineNumber5 = nav1.machine1(nav1.machineNumber5);
			nav1.machineChars5 = nav1.machine2(nav1.machineNumber5, nav1.machineChars5);
			nav1.machineChar5 = nav1.machine3(nav1.machineNumber5, nav1.machineChar5);
//MACHINE CHAR 6
			nav1.machineNumber6 = nav1.machine1(nav1.machineNumber6);
			nav1.machineChars6 = nav1.machine2(nav1.machineNumber6, nav1.machineChars6);
			nav1.machineChar6 = nav1.machine3(nav1.machineNumber6, nav1.machineChar6);
//MACHINE CHAR 7
			nav1.machineNumber7 = nav1.machine1(nav1.machineNumber7);
			nav1.machineChars7 = nav1.machine2(nav1.machineNumber7, nav1.machineChars7);
			nav1.machineChar7 = nav1.machine3(nav1.machineNumber7, nav1.machineChar7);
//MACHINE CHAR 8
			nav1.machineNumber8 = nav1.machine1(nav1.machineNumber8);
			nav1.machineChars8 = nav1.machine2(nav1.machineNumber8, nav1.machineChars8);
			nav1.machineChar8 = nav1.machine3(nav1.machineNumber8, nav1.machineChar8);
//MACHINE CHAR 9
			nav1.machineNumber9 = nav1.machine1(nav1.machineNumber9);
			nav1.machineChars9 = nav1.machine2(nav1.machineNumber9, nav1.machineChars9);
			nav1.machineChar9 = nav1.machine3(nav1.machineNumber9, nav1.machineChar9);
		}
//======================================================================================
		if (contadorTorre == 0) {
		torreEscolhida = nav1.escoTorre();
		contadorTorre += 1;
		}
		
		if (torreEscolhida.equals("novato")) {
			nav1.quantInimigos = 3;
			
				if (batalhasVenc == 0) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				batalhasVenc += nav1.win1;
					}
				if (batalhasVenc == 1) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar2, nav1.machineChars2);
				batalhasVenc += nav1.win1;
					}
				if (batalhasVenc == 2) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar3, nav1.machineChars3);
				batalhasVenc += nav1.win1;
					}
				if (batalhasVenc == 3) {
						System.out.println("Congratulations");
					}
				
				
			}
			
			else if (torreEscolhida.equals("guerreiro")) {
				nav1.quantInimigos = 6;
				
				if (batalhasVenc == 0) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
					batalhasVenc += nav1.win1;
						}
				if (batalhasVenc == 1) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar2, nav1.machineChars2);
					batalhasVenc += nav1.win1;
						}
				if (batalhasVenc == 2) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar3, nav1.machineChars3);
					batalhasVenc += nav1.win1;
						}
				if (batalhasVenc == 3) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar4, nav1.machineChars4);
					batalhasVenc += nav1.win1;
						}
				if (batalhasVenc == 4) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar5, nav1.machineChars5);
					batalhasVenc += nav1.win1;
						}
				if (batalhasVenc == 5) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar6, nav1.machineChars6);
					batalhasVenc += nav1.win1;
						}
				if (batalhasVenc == 6) {
					System.out.println("Congratulations");
						}	
				
			}
			
			else if (torreEscolhida.equals("master")) {
				nav1.quantInimigos = 9;
				
				if (batalhasVenc == 0) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
					batalhasVenc += nav1.win1;
						}
				if (batalhasVenc == 1) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar2, nav1.machineChars2);
					batalhasVenc += nav1.win1;
						}
				if (batalhasVenc == 2) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar3, nav1.machineChars3);
					batalhasVenc += nav1.win1;
						}
				if (batalhasVenc == 3) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar4, nav1.machineChars4);
					batalhasVenc += nav1.win1;
						}
				if (batalhasVenc == 4) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar5, nav1.machineChars5);
					batalhasVenc += nav1.win1;
						}
				if (batalhasVenc == 5) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar6, nav1.machineChars6);
					batalhasVenc += nav1.win1;
						}
				if (batalhasVenc == 6) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar7, nav1.machineChars7);
					batalhasVenc += nav1.win1;
						}
				if (batalhasVenc == 7) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar8, nav1.machineChars8);
					batalhasVenc += nav1.win1;
						}
				if (batalhasVenc == 8) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar9, nav1.machineChars9);
					batalhasVenc += nav1.win1;
						}
				if (batalhasVenc == 9) {
					System.out.println("Congratulations");
					
						}
		
			}
			} while (batalhasVenc != nav1.quantInimigos && nav1.creditos > 0);
			if (nav1.creditos == 0) {
				System.out.println("CREDITOS RESTANTES: " + nav1.creditos);
				System.out.println("GAME OVER");
			}
			
		}
	}  while (2 > 1);
	}
}
