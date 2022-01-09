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
				System.out.print("        Cadastro de álbuns\n");
				System.out.print("Título do álbum:\n");
				String titulo = scan.next();
				System.out.print("Ano de lançamento:\n");
				int ano = scan.nextInt();
				System.out.print("Nome da banda:\n");
				String nome = scan.next();
				album = new Album(titulo, ano, nome); // criando o album passando os parametros do construtor

				System.out.print("-----------------------------\n");
				System.out.print("        Cadastro de músicas do álbum\n");
				System.out.print("Digite o título da música:\n");
				String tituloM = scanMusica.next();
				System.out.print("Digite a duração da música:\n");
				double min = scanMusica.nextDouble();
				System.out.print("A música é favorita?(S/N) \n");
				String fav = scanMusica.next();
				m = new Musica(tituloM, min, fav);
				m.validaFav(fav);
				album.adicionarMusica(m);

				System.out.println("\nDeseja cadastrar outra música? \n ");
				System.out.println("1- Sim \n ");
				System.out.println("2- Não, voltar ao menu \n ");
				int option = scanMusica.nextInt();
				if (option == 1) {
					System.out.print("Digite quantas músicas quer cadastrar:\n");
					int opcoes = scanMusica.nextInt();
					for (int i = 0; i < opcoes; i++) {
						System.out.print("Digite o título da música:\n");
						String t = scanMusica.next();
						System.out.print("Digite a duração da música:\n");
						double mi = scanMusica.nextDouble();
						System.out.print("A música é favorita?(S/N) \n");
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
				System.out.print(" Opção 1 - Buscar por título do álbum\n");
				System.out.print(" Opção 2 - Buscar por ano de lançamento \n");
				System.out.print(" Opção 3 - Buscar por nome da banda \n");
				System.out.print(" Digite a opção desejada: \n");
				escolha = scan.nextInt();
				if (escolha == 1) {
					System.out.println("Digite o título:");
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
				System.out.print(" Opção 1 - Buscar por título da música\n");
				System.out.print(" Opção 2 - Buscar por nome da banda \n");
				escolha = scan.nextInt();

				if (escolha == 1) {
					System.out.println("Digite o título da música:");
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
				System.out.print("\nSaindo do sistema, até logo!\n");
				break;

			default:
				System.out.print("\nOpção Inválida! Escolha opções de 1 a 5.");
				break;
			}
		} while (escolha != 5);
		scan.close();
		scanMusica.close();

	}

	public static void menuPrincipal() {
		System.out.print("-----------------------------\n");
		System.out.print("       MENU PRINCIPAL        \n");
		System.out.print(" Opção 1 - Cadastrar álbum   \n");
		System.out.print(" Opção 2 - Pesquisar álbum   \n");
		System.out.print(" Opção 3 - Pesquisar música  \n");
		System.out.print(" Opção 4 - Gerar playlist    \n");
		System.out.print(" Opção 5 - Sair              \n");
		System.out.print("-----------------------------\n");
		System.out.print("Digite o número da opção desejada: ");

	}

}
