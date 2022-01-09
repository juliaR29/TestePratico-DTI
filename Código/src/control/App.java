package control;

import java.util.Scanner;
import business.Album;
import business.Colecao;
import business.Musica;

public class App {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner scanMusica = new Scanner(System.in);
		Colecao c1 = new Colecao();
		Album album = new Album(null, 0, null);
		Musica m = new Musica(null, 0, null);

		int escolha = 0;
		do {
			menuPrincipal();
			escolha = scan.nextInt();
			switch (escolha) {
			case 1:
				System.out.print("-----------------------------\n");
				System.out.print("        Cadastro de �lbuns\n");
				System.out.print("T�tulo do �lbum:\n");
				String titulo = scan.next();
				System.out.print("Ano de lan�amento:\n");
				int ano = scan.nextInt();
				System.out.print("Nome da banda:\n");
				String nome = scan.next();
				album = new Album(titulo, ano, nome); // criando o album passando os parametros do construtor

				System.out.print("-----------------------------\n");
				System.out.print("        Cadastro de m�sicas do �lbum\n");
				System.out.print("Digite o t�tulo da m�sica:\n");
				String tituloM = scanMusica.next();
				System.out.print("Digite a dura��o da m�sica:\n");
				double min = scanMusica.nextDouble();
				System.out.print("A m�sica � favorita?(S/N) \n");
				String fav = scanMusica.next();
				m = new Musica(tituloM, min, fav);
				m.validaFav(fav);
				album.adicionarMusica(m);

				System.out.println("\nDeseja cadastrar outra m�sica? \n ");
				System.out.println("1- Sim \n ");
				System.out.println("2- N�o, voltar ao menu \n ");
				int option = scanMusica.nextInt();
				if (option == 1) {
					System.out.print("Digite quantas m�sicas quer cadastrar:\n");
					int opcoes = scanMusica.nextInt();
					for (int i = 0; i < opcoes; i++) {
						System.out.print("Digite o t�tulo da m�sica:\n");
						String t = scanMusica.next();
						System.out.print("Digite a dura��o da m�sica:\n");
						double mi = scanMusica.nextDouble();
						System.out.print("A m�sica � favorita?(S/N) \n");
						String f = scanMusica.next();
						m = new Musica(t, mi, f);
						m.validaFav(fav);
						album.adicionarMusica(m);
					}
				}
				if (option == 2) {
				}
				c1.adicionarAlb(album);

				break;

			case 2:
				System.out.print(" Op��o 1 - Buscar por t�tulo do �lbum\n");
				System.out.print(" Op��o 2 - Buscar por ano de lan�amento \n");
				System.out.print(" Op��o 3 - Buscar por nome da banda \n");
				System.out.print(" Digite a op��o desejada: \n");
				escolha = scan.nextInt();
				if (escolha == 1) {
					System.out.println("Digite o t�tulo:");
					String tit = scan.next();
					System.out.println(c1.consultarTitulo(tit));
				}
				if (escolha == 2) {
					System.out.println("Digite o ano:");
					int anoL = scan.nextInt();
					System.out.println(c1.consultarAno(anoL));
				}
				if (escolha == 3) {
					System.out.println("Digite o nome da banda:");
					String nomeB = scan.next();
					System.out.println(c1.consultarNome(nomeB));
				}
				break;

			case 3:
				System.out.print(" Op��o 1 - Buscar por t�tulo da m�sica\n");
				System.out.print(" Op��o 2 - Buscar por nome da banda \n");
				escolha = scan.nextInt();

				if (escolha == 1) {
					System.out.println("Digite o t�tulo da m�sica:");
					String tit = scan.next();
					System.out.println(c1.consultarTituloM(tit));
				}
				if (escolha == 2) {
					System.out.println("Digite o nome da banda:");
					String nomeB = scan.next();
					System.out.println(c1.consultarBandaM(nomeB));
				}
				break;

			case 4:
				c1.getMusicas();
				System.out.println(c1.playlist());
				break;

			case 5:
				System.out.print("\nSaindo do sistema, at� logo!\n");
				break;

			default:
				System.out.print("\nOp��o Inv�lida! Escolha op��es de 1 a 5.");
				break;
			}
		} while (escolha != 5);
		scan.close();
		scanMusica.close();

	}

	public static void menuPrincipal() {
		System.out.print("-----------------------------\n");
		System.out.print("       MENU PRINCIPAL        \n");
		System.out.print(" Op��o 1 - Cadastrar �lbum   \n");
		System.out.print(" Op��o 2 - Pesquisar �lbum   \n");
		System.out.print(" Op��o 3 - Pesquisar m�sica  \n");
		System.out.print(" Op��o 4 - Gerar playlist    \n");
		System.out.print(" Op��o 5 - Sair              \n");
		System.out.print("-----------------------------\n");
		System.out.print("Digite o n�mero da op��o desejada: ");

	}

}
