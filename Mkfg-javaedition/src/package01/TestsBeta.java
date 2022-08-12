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
				nav1.userCharV[0] = nav1.escolhendo();
				nav1.userNumberV[0] = nav1.escUser1(nav1.userCharV[0], nav1.userNumberV[0]);
				nav1.userCharsM = nav1.escUser2(nav1.userNumberV[0], nav1.userCharsM);
				System.out.println("Voce escolheu " + nav1.userCharV[0]);
				
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
//===============================================================================================================================
//===============================================================================================================================
//===============================================================================================================================
		} else if (nav1.escoModo.equals("classica")) {
			
			System.out.println("CREDITOS RESTANTES: " + nav1.creditos);
			quantEsco = nav1.escoQuant();
			
			if (quantEsco == 1) {
			System.out.println("Batalha com " + quantEsco + " personagem escolhida!");
			} else {
			System.out.println("Batalha com " + quantEsco + " personagens escolhida!");	
			}

		do {
			respEAA = nav1.escoOuAle();

			if (charsEsco == 1) {
				if (respEAA.equals("escolher")) {
					nav1.userChar1 = nav1.escolhendo();
					nav1.userNumber1 = nav1.escUser1(nav1.userChar1, nav1.userNumber1);
					nav1.userChars1 = nav1.escUser2(nav1.userNumber1, nav1.userChars1);
					System.out.println("Sua primeira escolha é " + nav1.userChar1);
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber1 = nav1.ranUser1(nav1.userNumber1);
					nav1.userChar1 = nav1.escUser3(nav1.userNumber1, nav1.userChar1);
					nav1.userChars1 = nav1.escUser2(nav1.userNumber1, nav1.userChars1);
					System.out.println("Sua primeira escolha é " + nav1.userChar1);
					charsEsco += 1;
				}

			} else if (charsEsco == 2) {
				if (respEAA.equals("escolher")) {
					nav1.userChar2 = nav1.escolhendo();
					nav1.userNumber2 = nav1.escUser1(nav1.userChar2, nav1.userNumber2);
					nav1.userChars2 = nav1.escUser2(nav1.userNumber2, nav1.userChars2);
					System.out.println("Sua segunda escolha é " + nav1.userChar2);
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber2 = nav1.ranUser1(nav1.userNumber2);
					nav1.userChar2 = nav1.escUser3(nav1.userNumber2, nav1.userChar2);
					nav1.userChars2 = nav1.escUser2(nav1.userNumber2, nav1.userChars2);
					System.out.println("Sua segunda escolha é " + nav1.userChar2);
					charsEsco += 1;
				}
			} else if (charsEsco == 3) {
				if (respEAA.equals("escolher")) {
					nav1.userChar3 = nav1.escolhendo();
					nav1.userNumber3 = nav1.escUser1(nav1.userChar3, nav1.userNumber3);
					nav1.userChars3 = nav1.escUser2(nav1.userNumber3, nav1.userChars3);
					System.out.println("Sua terceira escolha é " + nav1.userChar3);
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber3 = nav1.ranUser1(nav1.userNumber3);
					nav1.userChar3 = nav1.escUser3(nav1.userNumber3, nav1.userChar3);
					nav1.userChars3 = nav1.escUser2(nav1.userNumber3, nav1.userChars3);
					System.out.println("Sua terceira escolha é " + nav1.userChar3);
					charsEsco += 1;
				}
			} else if (charsEsco == 4) {
				if (respEAA.equals("escolher")) {
					nav1.userChar4 = nav1.escolhendo();
					nav1.userNumber4 = nav1.escUser1(nav1.userChar4, nav1.userNumber4);
					nav1.userChars4 = nav1.escUser2(nav1.userNumber4, nav1.userChars4);
					System.out.println("Sua quarta escolha é " + nav1.userChar4);
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumberV[3] = nav1.ranUser1(nav1.userNumberV[3]);
					nav1.userChar4 = nav1.escUser3(nav1.userNumber4, nav1.userChar4);
					nav1.userChars4 = nav1.escUser2(nav1.userNumber4, nav1.userChars4);
					System.out.println("Sua quarta escolha é " + nav1.userChar4);
					charsEsco += 1;
				}
			} else if (charsEsco == 5) {
				if (respEAA.equals("escolher")) {
					nav1.userChar5 = nav1.escolhendo();
					nav1.userNumber5 = nav1.escUser1(nav1.userChar5, nav1.userNumber5);
					nav1.userChars5 = nav1.escUser2(nav1.userNumber5, nav1.userChars5);
					System.out.println("Sua quinta escolha é " + nav1.userChar5);
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber5 = nav1.ranUser1(nav1.userNumber5);
					nav1.userChar5 = nav1.escUser3(nav1.userNumber5, nav1.userChar5);
					nav1.userChars5 = nav1.escUser2(nav1.userNumber5, nav1.userChars5);
					System.out.println("Sua quinta escolha é " + nav1.userChar5);
					charsEsco += 1;
				}
			} else if (charsEsco == 6) {
				if (respEAA.equals("escolher")) {
					nav1.userChar6 = nav1.escolhendo();
					nav1.userNumber6 = nav1.escUser1(nav1.userChar6, nav1.userNumber6);
					nav1.userChars6 = nav1.escUser2(nav1.userNumber6, nav1.userChars6);
					System.out.println("Sua sexta escolha é " + nav1.userChar6);
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber6 = nav1.ranUser1(nav1.userNumber6);
					nav1.userChar6 = nav1.escUser3(nav1.userNumber6, nav1.userChar6);
					nav1.userChars6 = nav1.escUser2(nav1.userNumber6, nav1.userChars6);
					System.out.println("Sua sexta escolha é " + nav1.userChar6);
					charsEsco += 1;
				}
			} else if (charsEsco == 7) {
				if (respEAA.equals("escolher")) {
					nav1.userChar7 = nav1.escolhendo();
					nav1.userNumber7 = nav1.escUser1(nav1.userChar7, nav1.userNumber7);
					nav1.userChars7 = nav1.escUser2(nav1.userNumber7, nav1.userChars7);
					System.out.println("Sua setima escolha é " + nav1.userChar7);
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber7 = nav1.ranUser1(nav1.userNumber7);
					nav1.userChar7 = nav1.escUser3(nav1.userNumber7, nav1.userChar7);
					nav1.userChars7 = nav1.escUser2(nav1.userNumber7, nav1.userChars7);
					System.out.println("Sua setima escolha é " + nav1.userChar7);
					charsEsco += 1;
				}
			} else if (charsEsco == 8) {
				if (respEAA.equals("escolher")) {
					nav1.userChar8 = nav1.escolhendo();
					nav1.userNumber8 = nav1.escUser1(nav1.userChar8, nav1.userNumber8);
					nav1.userChars8 = nav1.escUser2(nav1.userNumber8, nav1.userChars8);
					System.out.println("Sua oitava escolha é " + nav1.userChar8);
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber8 = nav1.ranUser1(nav1.userNumber8);
					nav1.userChar8 = nav1.escUser3(nav1.userNumber8, nav1.userChar8);
					nav1.userChars8 = nav1.escUser2(nav1.userNumber8, nav1.userChars8);
					System.out.println("Sua oitava escolha é " + nav1.userChar8);
					charsEsco += 1;
				}
			} else if (charsEsco == 9) {
				if (respEAA.equals("escolher")) {
					nav1.userChar9 = nav1.escolhendo();
					nav1.userNumber9 = nav1.escUser1(nav1.userChar9, nav1.userNumber9);
					nav1.userChars9 = nav1.escUser2(nav1.userNumber9, nav1.userChars9);
					System.out.println("Sua nona escolha é " + nav1.userChar9);
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber9 = nav1.ranUser1(nav1.userNumber9);
					nav1.userChar9 = nav1.escUser3(nav1.userNumber9, nav1.userChar9);
					nav1.userChars9 = nav1.escUser2(nav1.userNumber9, nav1.userChars9);
					System.out.println("Sua nona escolha é " + nav1.userChar9);
					charsEsco += 1;
				}
			}

		} while (charsEsco <= quantEsco);

		nav1.exibeTime(quantEsco);	

//======================================================================================
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
//======================================================================================
			System.out.println("Sorteando batalhas...");
			
			if (quantEsco == 1) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
			} else if (quantEsco == 2) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				nav1.mecanicaBatalha(nav1.userNumber2, nav1.userChar2, nav1.userChars2, nav1.machineChar2, nav1.machineChars2);
			} else if (quantEsco == 3) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				nav1.mecanicaBatalha(nav1.userNumber2, nav1.userChar2, nav1.userChars2, nav1.machineChar2, nav1.machineChars2);
				nav1.mecanicaBatalha(nav1.userNumber3, nav1.userChar3, nav1.userChars3, nav1.machineChar3, nav1.machineChars3);
			} else if (quantEsco == 4) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				nav1.mecanicaBatalha(nav1.userNumber2, nav1.userChar2, nav1.userChars2, nav1.machineChar2, nav1.machineChars2);
				nav1.mecanicaBatalha(nav1.userNumber3, nav1.userChar3, nav1.userChars3, nav1.machineChar3, nav1.machineChars3);
				nav1.mecanicaBatalha(nav1.userNumber4, nav1.userChar4, nav1.userChars4, nav1.machineChar4, nav1.machineChars4);
			} else if (quantEsco == 5) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				nav1.mecanicaBatalha(nav1.userNumber2, nav1.userChar2, nav1.userChars2, nav1.machineChar2, nav1.machineChars2);
				nav1.mecanicaBatalha(nav1.userNumber3, nav1.userChar3, nav1.userChars3, nav1.machineChar3, nav1.machineChars3);
				nav1.mecanicaBatalha(nav1.userNumber4, nav1.userChar4, nav1.userChars4, nav1.machineChar4, nav1.machineChars4);
				nav1.mecanicaBatalha(nav1.userNumber5, nav1.userChar5, nav1.userChars5, nav1.machineChar5, nav1.machineChars5);
			} else if (quantEsco == 6) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				nav1.mecanicaBatalha(nav1.userNumber2, nav1.userChar2, nav1.userChars2, nav1.machineChar2, nav1.machineChars2);
				nav1.mecanicaBatalha(nav1.userNumber3, nav1.userChar3, nav1.userChars3, nav1.machineChar3, nav1.machineChars3);
				nav1.mecanicaBatalha(nav1.userNumber4, nav1.userChar4, nav1.userChars4, nav1.machineChar4, nav1.machineChars4);
				nav1.mecanicaBatalha(nav1.userNumber5, nav1.userChar5, nav1.userChars5, nav1.machineChar5, nav1.machineChars5);
				nav1.mecanicaBatalha(nav1.userNumber6, nav1.userChar6, nav1.userChars6, nav1.machineChar6, nav1.machineChars6);
			} else if (quantEsco == 7) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				nav1.mecanicaBatalha(nav1.userNumber2, nav1.userChar2, nav1.userChars2, nav1.machineChar2, nav1.machineChars2);
				nav1.mecanicaBatalha(nav1.userNumber3, nav1.userChar3, nav1.userChars3, nav1.machineChar3, nav1.machineChars3);
				nav1.mecanicaBatalha(nav1.userNumber4, nav1.userChar4, nav1.userChars4, nav1.machineChar4, nav1.machineChars4);
				nav1.mecanicaBatalha(nav1.userNumber5, nav1.userChar5, nav1.userChars5, nav1.machineChar5, nav1.machineChars5);
				nav1.mecanicaBatalha(nav1.userNumber6, nav1.userChar6, nav1.userChars6, nav1.machineChar6, nav1.machineChars6);
				nav1.mecanicaBatalha(nav1.userNumber7, nav1.userChar7, nav1.userChars7, nav1.machineChar7, nav1.machineChars7);
			} else if (quantEsco == 8) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				nav1.mecanicaBatalha(nav1.userNumber2, nav1.userChar2, nav1.userChars2, nav1.machineChar2, nav1.machineChars2);
				nav1.mecanicaBatalha(nav1.userNumber3, nav1.userChar3, nav1.userChars3, nav1.machineChar3, nav1.machineChars3);
				nav1.mecanicaBatalha(nav1.userNumber4, nav1.userChar4, nav1.userChars4, nav1.machineChar4, nav1.machineChars4);
				nav1.mecanicaBatalha(nav1.userNumber5, nav1.userChar5, nav1.userChars5, nav1.machineChar5, nav1.machineChars5);
				nav1.mecanicaBatalha(nav1.userNumber6, nav1.userChar6, nav1.userChars6, nav1.machineChar6, nav1.machineChars6);
				nav1.mecanicaBatalha(nav1.userNumber7, nav1.userChar7, nav1.userChars7, nav1.machineChar7, nav1.machineChars7);
				nav1.mecanicaBatalha(nav1.userNumber8, nav1.userChar8, nav1.userChars8, nav1.machineChar8, nav1.machineChars8);
			} else if (quantEsco == 9) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				nav1.mecanicaBatalha(nav1.userNumber2, nav1.userChar2, nav1.userChars2, nav1.machineChar2, nav1.machineChars2);
				nav1.mecanicaBatalha(nav1.userNumber3, nav1.userChar3, nav1.userChars3, nav1.machineChar3, nav1.machineChars3);
				nav1.mecanicaBatalha(nav1.userNumber4, nav1.userChar4, nav1.userChars4, nav1.machineChar4, nav1.machineChars4);
				nav1.mecanicaBatalha(nav1.userNumber5, nav1.userChar5, nav1.userChars5, nav1.machineChar5, nav1.machineChars5);
				nav1.mecanicaBatalha(nav1.userNumber6, nav1.userChar6, nav1.userChars6, nav1.machineChar6, nav1.machineChars6);
				nav1.mecanicaBatalha(nav1.userNumber7, nav1.userChar7, nav1.userChars7, nav1.machineChar7, nav1.machineChars7);
				nav1.mecanicaBatalha(nav1.userNumber8, nav1.userChar8, nav1.userChars8, nav1.machineChar8, nav1.machineChars8);
				nav1.mecanicaBatalha(nav1.userNumber9, nav1.userChar9, nav1.userChars9, nav1.machineChar9, nav1.machineChars9);
			} 
			
			
			
		}
	}  while (2 > 1);
	}
}
