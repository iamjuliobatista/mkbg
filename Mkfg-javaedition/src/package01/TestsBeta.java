package package01;

public class TestsBeta {
	
	public static void main(String[] args) throws InterruptedException {
		String respEAA = "vazio";
		String respEAC = "vazio1";
		String torreEscolhida = "vazio";
		int contadorTorre = 0;
		int batalhasVenc = 0;
		int batalhasPerd = 0;
		int quantEsco = 0;
		int charsEsco = 1;
		int contT = 0;
		
		
	    final String ANSI_RESET = "\u001B[0m";
	    final String ANSI_NEG = "\u001B[1m";
	    final String ANSI_SUB = "\u001B[4m";
		
		
		
		Navigation nav1 = new Navigation();
		
		do {
			contadorTorre = 0;
			batalhasVenc = 0;
			batalhasPerd = 0;
			quantEsco = 0;
			charsEsco = 1;
			contT = 0;
			
		nav1.apresentacao();
		nav1.escoModo();
//======================================================================================
//INITIATION ARCADE MODE
		//ESCOLHENDO PERSONAGEM
		if (nav1.escoModo.equals("arcade")) {
			System.out.println("Voce escolheu modo " + ANSI_SUB + "arcade" + ANSI_RESET);
			
			do {
			System.out.println("CREDITOS RESTANTES: " + nav1.creditos);
			respEAA = nav1.escoOuAle();
			
			if (respEAA.equals("escolher")) {
				nav1.userChar1 = nav1.escolhendo();
				nav1.userNumber1 = nav1.escUser1(nav1.userChar1, nav1.userNumber1);
				nav1.userChars1 = nav1.escUser2(nav1.userNumber1, nav1.userChars1);
				System.out.println("Voce escolheu " + ANSI_SUB + nav1.userChar1 + ANSI_RESET);
				System.out.println();
				
			} else if (respEAA.equals("aleatorio")) {
				nav1.userNumber1 = nav1.ranUser1(nav1.userNumber1);
				nav1.userChar1 = nav1.escUser3(nav1.userNumber1, nav1.userChar1);
				nav1.userChars1 = nav1.escUser2(nav1.userNumber1, nav1.userChars1);
				System.out.println("Voce escolheu " + ANSI_SUB + nav1.userChar1 + ANSI_RESET);
				System.out.println();
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
			
			if (contT == 0) {
			System.out.println("Voce escolheu torre " + ANSI_SUB + "novato" + ANSI_RESET);
			System.out.println();
			contT += 1;
			}
				if (batalhasVenc == 0) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				batalhasVenc += nav1.win1;
				if (batalhasVenc == 0) {
					nav1.creditos -= 1;
					}
					}
				if (batalhasVenc == 1) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar2, nav1.machineChars2);
				batalhasVenc += nav1.win1;
				if (batalhasVenc == 1) {
					nav1.creditos -= 1;
					}
					}
				if (batalhasVenc == 2) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar3, nav1.machineChars3);
				batalhasVenc += nav1.win1;
				if (batalhasVenc == 2) {
					nav1.creditos -= 1;
					}
					}
				if (batalhasVenc == 3) {
						nav1.creditosFim();
					}
				
				
			}
			
			else if (torreEscolhida.equals("guerreiro")) {
				nav1.quantInimigos = 6;
				
				if (contT == 0) {
					System.out.println("Voce escolheu torre " + ANSI_SUB + "guerreiro" + ANSI_RESET);
					System.out.println();
					contT += 1;
					}
				
				System.out.println();
				if (batalhasVenc == 0) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
					batalhasVenc += nav1.win1;
					if (batalhasVenc == 0) {
						nav1.creditos -= 1;
					}
						}
				if (batalhasVenc == 1) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar2, nav1.machineChars2);
					batalhasVenc += nav1.win1;
					if (batalhasVenc == 1) {
						nav1.creditos -= 1;
						}
				}
				if (batalhasVenc == 2) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar3, nav1.machineChars3);
					batalhasVenc += nav1.win1;
					if (batalhasVenc == 2) {
						nav1.creditos -= 1;
						}
				}
				if (batalhasVenc == 3) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar4, nav1.machineChars4);
					batalhasVenc += nav1.win1;
					if (batalhasVenc == 3) {
						nav1.creditos -= 1;
						}
				}
				if (batalhasVenc == 4) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar5, nav1.machineChars5);
					batalhasVenc += nav1.win1;
					if (batalhasVenc == 4) {
						nav1.creditos -= 1;
						}
				}
				if (batalhasVenc == 5) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar6, nav1.machineChars6);
					batalhasVenc += nav1.win1;
					if (batalhasVenc == 5) {
						nav1.creditos -= 1;
						}
				}
				if (batalhasVenc == 6) {
					nav1.creditosFim();
						}	
				
			}
			
			else if (torreEscolhida.equals("master")) {
				nav1.quantInimigos = 9;
				
				if (contT == 0) {
					System.out.println("Voce escolheu torre " + ANSI_SUB + "master" + ANSI_RESET);
					System.out.println();
					contT += 1;
					}
				
				System.out.println();
				
				if (batalhasVenc == 0) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
					batalhasVenc += nav1.win1;
						}
				if (batalhasVenc == 1) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar2, nav1.machineChars2);
					batalhasVenc += nav1.win1;
					if (batalhasVenc == 1) {
						nav1.creditos -= 1;
						}
						}
				if (batalhasVenc == 2) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar3, nav1.machineChars3);
					batalhasVenc += nav1.win1;
					if (batalhasVenc == 2) {
						nav1.creditos -= 1;
						}
						}
				if (batalhasVenc == 3) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar4, nav1.machineChars4);
					batalhasVenc += nav1.win1;
					if (batalhasVenc == 3) {
						nav1.creditos -= 1;
						}
						}
				if (batalhasVenc == 4) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar5, nav1.machineChars5);
					batalhasVenc += nav1.win1;
					if (batalhasVenc == 4) {
						nav1.creditos -= 1;
						}
						}
				if (batalhasVenc == 5) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar6, nav1.machineChars6);
					batalhasVenc += nav1.win1;
					if (batalhasVenc == 5) {
						nav1.creditos -= 1;
						}
						}
				if (batalhasVenc == 6) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar7, nav1.machineChars7);
					batalhasVenc += nav1.win1;
					if (batalhasVenc == 6) {
						nav1.creditos -= 1;
						}
						}
				if (batalhasVenc == 7) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar8, nav1.machineChars8);
					batalhasVenc += nav1.win1;
					if (batalhasVenc == 7) {
						nav1.creditos -= 1;
						}
						}
				if (batalhasVenc == 8) {
					nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar9, nav1.machineChars9);
					batalhasVenc += nav1.win1;
					if (batalhasVenc == 8) {
						nav1.creditos -= 1;
						}
						}
				if (batalhasVenc == 9) {
					nav1.creditosFim();
						}
		
			}
			} while (batalhasVenc != nav1.quantInimigos && nav1.creditos > 0);
			if (nav1.creditos == 0) {
				System.out.println("CREDITOS RESTANTES: " + nav1.creditos);
				Thread.sleep(600);
				System.out.println("GAME OVER");
				Thread.sleep(3000);
			}
//===============================================================================================================================
//===============================================================================================================================
//===============================================================================================================================
		} else if (nav1.escoModo.equals("classico")) {
			System.out.println("Voce escolheu modo " + ANSI_SUB + "classico" + ANSI_RESET);
			
			System.out.println("CREDITOS RESTANTES: " + nav1.creditos);
			quantEsco = nav1.escoQuant();
			
			if (quantEsco == 1) {
			System.out.println("Batalha com " + quantEsco + " personagem escolhida!");
			System.out.println();
			} else {
			System.out.println("Batalha com " + quantEsco + " personagens escolhida!");
			System.out.println();
			}

		do {
			respEAA = nav1.escoOuAle();

			if (charsEsco == 1) {
				if (respEAA.equals("escolher")) {
					nav1.userChar1 = nav1.escolhendo();
					nav1.userNumber1 = nav1.escUser1(nav1.userChar1, nav1.userNumber1);
					nav1.userChars1 = nav1.escUser2(nav1.userNumber1, nav1.userChars1);
					System.out.println("Sua primeira escolha é " + ANSI_SUB + nav1.userChar1 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber1 = nav1.ranUser1(nav1.userNumber1);
					nav1.userChar1 = nav1.escUser3(nav1.userNumber1, nav1.userChar1);
					nav1.userChars1 = nav1.escUser2(nav1.userNumber1, nav1.userChars1);
					System.out.println("Sua primeira escolha é " + ANSI_SUB + nav1.userChar1 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;
				}

			} else if (charsEsco == 2) {
				if (respEAA.equals("escolher")) {
					nav1.userChar2 = nav1.escolhendo();
					nav1.userNumber2 = nav1.escUser1(nav1.userChar2, nav1.userNumber2);
					nav1.userChars2 = nav1.escUser2(nav1.userNumber2, nav1.userChars2);
					System.out.println("Sua segunda escolha é " + ANSI_SUB + nav1.userChar2 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber2 = nav1.ranUser1(nav1.userNumber2);
					nav1.userChar2 = nav1.escUser3(nav1.userNumber2, nav1.userChar2);
					nav1.userChars2 = nav1.escUser2(nav1.userNumber2, nav1.userChars2);
					System.out.println("Sua segunda escolha é " + ANSI_SUB + nav1.userChar2 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;
				}
			} else if (charsEsco == 3) {
				if (respEAA.equals("escolher")) {
					nav1.userChar3 = nav1.escolhendo();
					nav1.userNumber3 = nav1.escUser1(nav1.userChar3, nav1.userNumber3);
					nav1.userChars3 = nav1.escUser2(nav1.userNumber3, nav1.userChars3);
					System.out.println("Sua terceira escolha é " + ANSI_SUB + nav1.userChar3 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber3 = nav1.ranUser1(nav1.userNumber3);
					nav1.userChar3 = nav1.escUser3(nav1.userNumber3, nav1.userChar3);
					nav1.userChars3 = nav1.escUser2(nav1.userNumber3, nav1.userChars3);
					System.out.println("Sua terceira escolha é " + ANSI_SUB + nav1.userChar3 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;
				}
			} else if (charsEsco == 4) {
				if (respEAA.equals("escolher")) {
					nav1.userChar4 = nav1.escolhendo();
					nav1.userNumber4 = nav1.escUser1(nav1.userChar4, nav1.userNumber4);
					nav1.userChars4 = nav1.escUser2(nav1.userNumber4, nav1.userChars4);
					System.out.println("Sua quarta escolha é " + ANSI_SUB + nav1.userChar4 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber4 = nav1.ranUser1(nav1.userNumber4);
					nav1.userChar4 = nav1.escUser3(nav1.userNumber4, nav1.userChar4);
					nav1.userChars4 = nav1.escUser2(nav1.userNumber4, nav1.userChars4);
					System.out.println("Sua quarta escolha é " + ANSI_SUB + nav1.userChar4 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;
				}
			} else if (charsEsco == 5) {
				if (respEAA.equals("escolher")) {
					nav1.userChar5 = nav1.escolhendo();
					nav1.userNumber5 = nav1.escUser1(nav1.userChar5, nav1.userNumber5);
					nav1.userChars5 = nav1.escUser2(nav1.userNumber5, nav1.userChars5);
					System.out.println("Sua quinta escolha é " + ANSI_SUB + nav1.userChar5 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber5 = nav1.ranUser1(nav1.userNumber5);
					nav1.userChar5 = nav1.escUser3(nav1.userNumber5, nav1.userChar5);
					nav1.userChars5 = nav1.escUser2(nav1.userNumber5, nav1.userChars5);
					System.out.println("Sua quinta escolha é " + ANSI_SUB + nav1.userChar5 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;
				}
			} else if (charsEsco == 6) {
				if (respEAA.equals("escolher")) {
					nav1.userChar6 = nav1.escolhendo();
					nav1.userNumber6 = nav1.escUser1(nav1.userChar6, nav1.userNumber6);
					nav1.userChars6 = nav1.escUser2(nav1.userNumber6, nav1.userChars6);
					System.out.println("Sua sexta escolha é " + ANSI_SUB + nav1.userChar6 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber6 = nav1.ranUser1(nav1.userNumber6);
					nav1.userChar6 = nav1.escUser3(nav1.userNumber6, nav1.userChar6);
					nav1.userChars6 = nav1.escUser2(nav1.userNumber6, nav1.userChars6);
					System.out.println("Sua sexta escolha é " + ANSI_SUB + nav1.userChar6 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;
				}
			} else if (charsEsco == 7) {
				if (respEAA.equals("escolher")) {
					nav1.userChar7 = nav1.escolhendo();
					nav1.userNumber7 = nav1.escUser1(nav1.userChar7, nav1.userNumber7);
					nav1.userChars7 = nav1.escUser2(nav1.userNumber7, nav1.userChars7);
					System.out.println("Sua setima escolha é " + ANSI_SUB + nav1.userChar7 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber7 = nav1.ranUser1(nav1.userNumber7);
					nav1.userChar7 = nav1.escUser3(nav1.userNumber7, nav1.userChar7);
					nav1.userChars7 = nav1.escUser2(nav1.userNumber7, nav1.userChars7);
					System.out.println("Sua setima escolha é " + ANSI_SUB + nav1.userChar7 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;
				}
			} else if (charsEsco == 8) {
				if (respEAA.equals("escolher")) {
					nav1.userChar8 = nav1.escolhendo();
					nav1.userNumber8 = nav1.escUser1(nav1.userChar8, nav1.userNumber8);
					nav1.userChars8 = nav1.escUser2(nav1.userNumber8, nav1.userChars8);
					System.out.println("Sua oitava escolha é " + ANSI_SUB + nav1.userChar8 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber8 = nav1.ranUser1(nav1.userNumber8);
					nav1.userChar8 = nav1.escUser3(nav1.userNumber8, nav1.userChar8);
					nav1.userChars8 = nav1.escUser2(nav1.userNumber8, nav1.userChars8);
					System.out.println("Sua oitava escolha é " + ANSI_SUB + nav1.userChar8 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;
				}
			} else if (charsEsco == 9) {
				if (respEAA.equals("escolher")) {
					nav1.userChar9 = nav1.escolhendo();
					nav1.userNumber9 = nav1.escUser1(nav1.userChar9, nav1.userNumber9);
					nav1.userChars9 = nav1.escUser2(nav1.userNumber9, nav1.userChars9);
					System.out.println("Sua nona escolha é " + ANSI_SUB + nav1.userChar9 + ANSI_RESET);
					System.out.println();
					charsEsco += 1;

				} else if (respEAA.equals("aleatorio")) {
					nav1.userNumber9 = nav1.ranUser1(nav1.userNumber9);
					nav1.userChar9 = nav1.escUser3(nav1.userNumber9, nav1.userChar9);
					nav1.userChars9 = nav1.escUser2(nav1.userNumber9, nav1.userChars9);
					System.out.println("Sua nona escolha é " + ANSI_SUB + nav1.userChar9 + ANSI_RESET);
					System.out.println();
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
			System.out.println();
			
			if (quantEsco == 1) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				batalhasVenc += nav1.win1;
				
				if (batalhasVenc == 1) {
					System.out.println("Voce venceu!!");
					nav1.creditosFim();
				} else {
					System.out.println("Oponente venceu!!");
					Thread.sleep(400);
					System.out.println("GAME OVER");
					Thread.sleep(1200);
					nav1.creditos -= 1;
				}
			} 
//======================================================================================
			else if (quantEsco == 2) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber2, nav1.userChar2, nav1.userChars2, nav1.machineChar2, nav1.machineChars2);
				batalhasVenc += nav1.win1;
				
				if (batalhasVenc == 2) {
					System.out.println("Voce Venceu!!");
					nav1.creditosFim();
				} else if (batalhasVenc == 1) {
					System.out.println("Empate!!");
					nav1.creditosFimE();
				} else {
					System.out.println("Oponente venceu!!");
					Thread.sleep(400);
					System.out.println("GAME OVER");
					Thread.sleep(1200);
					nav1.creditos -= 1;
				}
			} 
//======================================================================================
			else if (quantEsco == 3) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber2, nav1.userChar2, nav1.userChars2, nav1.machineChar2, nav1.machineChars2);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber3, nav1.userChar3, nav1.userChars3, nav1.machineChar3, nav1.machineChars3);
				batalhasVenc += nav1.win1;
				
				if (batalhasVenc >= 2) {
					System.out.println("Voce venceu!!");
					nav1.creditosFim();
				} else {
					System.out.println("Oponente venceu!!");
					Thread.sleep(400);
					System.out.println("GAME OVER");
					Thread.sleep(1200);
					nav1.creditos -= 1;
				}
			} 
//======================================================================================
			else if (quantEsco == 4) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber2, nav1.userChar2, nav1.userChars2, nav1.machineChar2, nav1.machineChars2);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber3, nav1.userChar3, nav1.userChars3, nav1.machineChar3, nav1.machineChars3);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber4, nav1.userChar4, nav1.userChars4, nav1.machineChar4, nav1.machineChars4);
				batalhasVenc += nav1.win1;
				
				if (batalhasVenc >= 3) {
					System.out.println("Voce Venceu!!");
					nav1.creditosFim();
				} else if (batalhasVenc == 2) {
					System.out.println("Empate!!");
					nav1.creditosFimE();
				} else {
					System.out.println("Oponente venceu!!");
					Thread.sleep(400);
					System.out.println("GAME OVER");
					Thread.sleep(1200);
					nav1.creditos -= 1;
				}
			} 
//======================================================================================
			else if (quantEsco == 5) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber2, nav1.userChar2, nav1.userChars2, nav1.machineChar2, nav1.machineChars2);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber3, nav1.userChar3, nav1.userChars3, nav1.machineChar3, nav1.machineChars3);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber4, nav1.userChar4, nav1.userChars4, nav1.machineChar4, nav1.machineChars4);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber5, nav1.userChar5, nav1.userChars5, nav1.machineChar5, nav1.machineChars5);
				batalhasVenc += nav1.win1;
				
				if (batalhasVenc >= 3) {
					System.out.println("Voce venceu!!");
					nav1.creditosFim();
				} else {
					System.out.println("Oponente venceu!!");
					Thread.sleep(400);
					System.out.println("GAME OVER");
					Thread.sleep(1200);
					nav1.creditos -= 1;
				}
			} 
//======================================================================================
			else if (quantEsco == 6) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber2, nav1.userChar2, nav1.userChars2, nav1.machineChar2, nav1.machineChars2);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber3, nav1.userChar3, nav1.userChars3, nav1.machineChar3, nav1.machineChars3);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber4, nav1.userChar4, nav1.userChars4, nav1.machineChar4, nav1.machineChars4);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber5, nav1.userChar5, nav1.userChars5, nav1.machineChar5, nav1.machineChars5);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber6, nav1.userChar6, nav1.userChars6, nav1.machineChar6, nav1.machineChars6);
				batalhasVenc += nav1.win1;
				
				if (batalhasVenc >= 4) {
					System.out.println("Voce Venceu!!");
					nav1.creditosFim();
				} else if (batalhasVenc == 3) {
					System.out.println("Empate!!");
					nav1.creditosFimE();
				} else {
					System.out.println("Oponente venceu!!");
					Thread.sleep(400);
					System.out.println("GAME OVER");
					Thread.sleep(1200);
					nav1.creditos -= 1;
				}
			} 
//======================================================================================
			else if (quantEsco == 7) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber2, nav1.userChar2, nav1.userChars2, nav1.machineChar2, nav1.machineChars2);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber3, nav1.userChar3, nav1.userChars3, nav1.machineChar3, nav1.machineChars3);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber4, nav1.userChar4, nav1.userChars4, nav1.machineChar4, nav1.machineChars4);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber5, nav1.userChar5, nav1.userChars5, nav1.machineChar5, nav1.machineChars5);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber6, nav1.userChar6, nav1.userChars6, nav1.machineChar6, nav1.machineChars6);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber7, nav1.userChar7, nav1.userChars7, nav1.machineChar7, nav1.machineChars7);
				batalhasVenc += nav1.win1;
			
				if (batalhasVenc >= 4) {
					System.out.println("Voce venceu!!");
					nav1.creditosFim();
				} else {
					System.out.println("Oponente venceu!!");
					Thread.sleep(400);
					System.out.println("GAME OVER");
					Thread.sleep(1200);
					nav1.creditos -= 1;
				}
			} 
//======================================================================================
			else if (quantEsco == 8) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber2, nav1.userChar2, nav1.userChars2, nav1.machineChar2, nav1.machineChars2);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber3, nav1.userChar3, nav1.userChars3, nav1.machineChar3, nav1.machineChars3);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber4, nav1.userChar4, nav1.userChars4, nav1.machineChar4, nav1.machineChars4);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber5, nav1.userChar5, nav1.userChars5, nav1.machineChar5, nav1.machineChars5);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber6, nav1.userChar6, nav1.userChars6, nav1.machineChar6, nav1.machineChars6);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber7, nav1.userChar7, nav1.userChars7, nav1.machineChar7, nav1.machineChars7);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber8, nav1.userChar8, nav1.userChars8, nav1.machineChar8, nav1.machineChars8);
				batalhasVenc += nav1.win1;
				
				if (batalhasVenc >= 5) {
					System.out.println("Voce Venceu!!");
					nav1.creditosFim();
				} else if (batalhasVenc == 4) {
					System.out.println("Empate!!");
					nav1.creditosFimE();
				} else {
					System.out.println("Oponente venceu!!");
					Thread.sleep(400);
					System.out.println("GAME OVER");
					Thread.sleep(1200);
					nav1.creditos -= 1;
				}
			} 
//======================================================================================
			else if (quantEsco == 9) {
				nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber2, nav1.userChar2, nav1.userChars2, nav1.machineChar2, nav1.machineChars2);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber3, nav1.userChar3, nav1.userChars3, nav1.machineChar3, nav1.machineChars3);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber4, nav1.userChar4, nav1.userChars4, nav1.machineChar4, nav1.machineChars4);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber5, nav1.userChar5, nav1.userChars5, nav1.machineChar5, nav1.machineChars5);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber6, nav1.userChar6, nav1.userChars6, nav1.machineChar6, nav1.machineChars6);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber7, nav1.userChar7, nav1.userChars7, nav1.machineChar7, nav1.machineChars7);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber8, nav1.userChar8, nav1.userChars8, nav1.machineChar8, nav1.machineChars8);
				batalhasVenc += nav1.win1;
				nav1.mecanicaBatalha(nav1.userNumber9, nav1.userChar9, nav1.userChars9, nav1.machineChar9, nav1.machineChars9);
				batalhasVenc += nav1.win1;
				if (batalhasVenc >= 5) {
					System.out.println("Voce venceu!!");
					nav1.creditosFim();
				} else {
					System.out.println("Oponente venceu!!");
					Thread.sleep(400);
					System.out.println("GAME OVER");
					Thread.sleep(1200);
					nav1.creditos -= 1;
				}
			} 
//======================================================================================
			
			
		} else if (nav1.escoModo.equals("sobrevivencia")) {
			System.out.println("Voce escolheu modo " + ANSI_SUB + "sobrevivencia" + ANSI_RESET);
			System.out.println("CREDITOS RESTANTES: " + nav1.creditos);
			respEAA = nav1.escoOuAle();
			
			if (respEAA.equals("escolher")) {
				nav1.userChar1 = nav1.escolhendo();
				nav1.userNumber1 = nav1.escUser1(nav1.userChar1, nav1.userNumber1);
				nav1.userChars1 = nav1.escUser2(nav1.userNumber1, nav1.userChars1);
				System.out.println("Voce escolheu " + ANSI_SUB + nav1.userChar1 + ANSI_RESET);
				System.out.println();
				
			} else if (respEAA.equals("aleatorio")) {
				nav1.userNumber1 = nav1.ranUser1(nav1.userNumber1);
				nav1.userChar1 = nav1.escUser3(nav1.userNumber1, nav1.userChar1);
				nav1.userChars1 = nav1.escUser2(nav1.userNumber1, nav1.userChars1);
				System.out.println("Voce escolheu " + ANSI_SUB + nav1.userChar1 + ANSI_RESET);
				System.out.println();
			}
			
			do {
			nav1.machineNumber1 = nav1.machine1(nav1.machineNumber1);
			nav1.machineChars1 = nav1.machine2(nav1.machineNumber1, nav1.machineChars1);
			nav1.machineChar1 = nav1.machine3(nav1.machineNumber1, nav1.machineChar1);
			
			nav1.mecanicaBatalha(nav1.userNumber1, nav1.userChar1, nav1.userChars1, nav1.machineChar1, nav1.machineChars1);
			batalhasVenc += nav1.win1;
			batalhasPerd += nav1.winS;
			} while (batalhasPerd == 0);
			
			if (batalhasVenc == 0) {
				System.out.println("Voce nao ganhou nenhuma batalha");
			} else if (batalhasVenc == 1) {
				System.out.println("Voce ganhou " + batalhasVenc + " batalha");
			} else {
			System.out.println("Voce ganhou " + batalhasVenc + " batalhas");
			}
			nav1.creditos -= 1;
			nav1.creditosFimE();
			
		}
	}  while (2 > 1);
	}
}
