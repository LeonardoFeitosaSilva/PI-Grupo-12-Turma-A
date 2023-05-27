/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto;

/**
 *
 * @author user
 */
import java.util.Scanner;
import java.util.Random;
/*import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
*/
public class ProjetoIntegrador {

    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        //int seleciona_menu;
        System.out.printf("\nMestre: Esta pronto para a maior aventura de sua vida, terraqueo ?");
        System.out.println("\n1 - Sim | 2 - Nao ");
        int escolha = entrada.nextInt();
        if (escolha == 1) {
            System.out.println("Boa escolha meu jovem, comecaremos agora!!!");
        } else if (escolha == 2) {
            System.out.println("Desistir agora nao eh uma opcao meu caro, voce ja esta dentro do jogo e so nos resta jogar, ha ha ha.");
        } else {
            System.out.println("Nao adianta digitar outra opcao, o seu destino esta selado!");
        }
        menu();

    }

    public static void menu() throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        int seleciona_menu;
        do {
            System.out.println("\n1)Jogar\n2)Capitulos\n3)Creditos\n4)Sair");
            seleciona_menu = entrada.nextInt();
            switch (seleciona_menu) {
                case 1:
                    jogo();
                    break;
                case 2:
                    capitulos();
                    break;
                case 3:
                    creditos();
                case 4:
                    break;
                default:
                    System.out.println("\nEssa opcao nao existe, digite novamente: ");
            }
        } while (seleciona_menu != 1 && seleciona_menu != 2 && seleciona_menu != 3 && seleciona_menu != 4);
    }

    public static void capitulos() throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        int escolha_capitulo;
        System.out.println("\n    Em Busca do conhecimento perdido - Capitulos ");
        do {
            System.out.println("\n1) O despertar do guerreio\n2) O conhecimento eh a verdade\n3) Conheceis a verdade, e a verdade vos libertara\n4) Voltar");
            escolha_capitulo = entrada.nextInt();
            switch (escolha_capitulo) {
                case 1:
                    capitulo1();
                    break;
                case 2:
                    capitulo2();
                    break;
                case 3:
                    capitulo3();
                    break;
                case 4:
                    menu();
                    break;
                default:
                    System.out.println("Capitulo invalido, digite novamente: ");
            }
        } while (escolha_capitulo != 1 && escolha_capitulo != 2 && escolha_capitulo != 3 && escolha_capitulo != 4);
    }

    public static void creditos() throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        int escolha_menu;
        System.out.println("\n\n //  Criadores \\\\  \nLeonardo Feitosa da Silva \nDanilo Barbosa");
        do {
            System.out.println("\n2)Sair");
            escolha_menu = entrada.nextInt();
            if (escolha_menu == 2) {
                menu();
            } else {
                System.out.println("\nSelecao invalida, digite novamente: ");
            }
        } while (escolha_menu != 2);
    }

    public static void jogo() throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nMestre: Esta preparado a se tornar o maior heroi que uma nacao poderia ter?");
        System.out.println("Para isso, diga-me seu nome e embarcaremos nessa aventura de aprendizagem e heroismo:");
        String nome = entrada.next();
        System.out.println("\nMestre: " + nome + ", seja bem vindo ao fabuloso mundo de Aspergel!!");
        System.out.println("Aqui voce encontrara seres de todos os tipos, portanto nao se assuste e busque sempre aprender com eles. Pois lembre-se, o conhecimento eh a chave de tudo.");
        boolean historia = false;
        do {
            System.out.println("Agora, te contarei sobre a historia da qual voce faz parte: ");
            System.out.println("1)Sim Mestre, conte-me tudo.");
            int escolha_historia = entrada.nextInt();
            if (escolha_historia == 1) {
                System.out.println("Ha algumas decadas atras, um promissor e ganancioso General de 1, dos 5 reinos mundiais resolver conquistar todos os demais reinos com o intuito de que todos que ali deveriam servi a um unico rei");
                Thread.sleep(8000);
                System.out.println("Os outros 4 reinos, formados por seres Elfos, Anoes, Homens e Orcs nao iriam permitir a investida daquele General, conhecido como Surian o Mago Negro");
                Thread.sleep(8000);
                System.out.println("Com seu poder de perssuasao Surian conseguiu convencer o reino Orc a se aliar a ele, com a condicao de que o rei teria um lugar cativo no Grande Salao.");
                Thread.sleep(8000);
                System.out.println("O rei Orc nao sucumbiu muito e concordou, ja que o instinto do povo Orc eh a guerra");
                Thread.sleep(8000);
                System.out.println("Os outros 3 reinos tentaram se unir, mas por questoes de ego e orgulho, cada um optou-se por montar seu plano de batalha individual");
                Thread.sleep(8000);
                System.out.println("O primeiro reino a ser conquistado foi o reino dos Anoes, lutaram bravamente ate suas forcas se esgotarem, porem o exercito de Surian era muito forte, e nao resistiram aos ataques");
                Thread.sleep(8000);
                System.out.println("Conseguiram refugiar a maioria das criancas, e todo o resto do povo foi escravizado");
                Thread.sleep(8000);
                System.out.println("Assustados com a investida de Surian, os outros 2 reinos restantes foram buscar ajuda de Magos e Feiticeiros para encontrarem um jeito de derrotar Surian e seu grande exercito");
                Thread.sleep(8000);
                System.out.println("Nessa procura insana por uma salvacao, um general do reino dos Homens encontrou um Mago, nada convencional, que revelou a ele sobre uma antiga profecia e o convenceu de que a salvacao somente seria possível com a uniao de todos os 4 Reinos que Surian desafiou, ou seja, precisava encontrar um motivo que unisse todos eles inclusive os Orc que eram aliados de Surian");
                Thread.sleep(5000);
                System.out.println("Alguns anos se passaram e Surian finalmente foi de encontro ao reino do Homens, para conquista-lo");
                Thread.sleep(8000);
                System.out.println("A batalha que durou aproximadamente 3 semanas, teve muitas mortes inclusive o rei dos Trips(reino de Surian), foi morto em batalha ja que ele fazia questao de lutar ao lado de seus soldados");
                Thread.sleep(8000);
                System.out.println("Com essa perca, Surian tomou o trono e passou a liderar todo seu povo e a escravizar os reinos que ja havia conquistado");
                Thread.sleep(8000);
                System.out.println("Os homens sobreviventes, se refugiaram em uma caverna ao lado leste proximo ao reino Elfico");
                Thread.sleep(8000);
                System.out.println("Depois de um certo periodo, Surian tentou conquistar o reino Elfico so que nao obteve muito sucesso ja que os Elfos eram otimos em se esconderem e se camuflarem");
                Thread.sleep(8000);
                System.out.println("Algumas decadas se passaram e eis que surge um possivel novo heroi para essa destemida historia ...");
                Thread.sleep(8000);
                System.out.println("Cujo nome estava escrito nas profecias e ele eh nada mais e nada menos que ... " + nome + " !!!");
                Thread.sleep(8000);
                historia = false;
                capitulo1();
            } else {
                historia = true;
                System.out.println("Opcao invalida, escolha uma das opcoes abaixo");
            }
        } while (historia != false);
    }

    public static void capitulo1() throws InterruptedException {
        System.out.println("\n     Capitulo I - O Despertar do guerreiro");
        Thread.sleep(8000);
        System.out.println("\nMestre: Voce nao eh nada mais e nada menos que o filho de um refugiado do reino do Homens, sobrevivendo em uma montanha e com muitas duvidas sobre o porque do mundo em que vive esta do jeito que esta.");
        Thread.sleep(8000);
        System.out.println("Com tantas duvidas e tantos questionamentos em sua cabeca o anciao de sua caverna, lhe conta tudo o que aconteceu no passado");
        Thread.sleep(8000);
        System.out.println("Impactado com o que ouviu, voce e seu melhor amigo, Julien, acham que aquilo era apenas um delirio de um velho que esta no final de sua vida");
        Thread.sleep(8000);
        System.out.println("Algumas semanas se passaram e seu pai foi a uma batalha junto ao grupo de resistencia de sua aldeia ...");
        Thread.sleep(8000);
        System.out.println("De 100 homens que foram a batalha apenas 2 retornaram, e com pessimas noticias. Todos os outros haviam morrido, na tentativa de enfrentar um pequeno exertico do rei Surian.");
        Thread.sleep(8000);
        System.out.println("Inconformado com a perda de seu pai, aquele que voce enchergava como seu maior herói, voce decide se isolar daquilo tudo por um longo periodo. Partindo em uma viagem solitaria apenas voce e o luto que carregava em seus ombros");
        Thread.sleep(8000);
        System.out.println("10 anos apos o acontecimento, Julien o encontra em uma taverna completamente embriagado e muito debilitada. Julien havia se tornado um grande guerreiro de sua tribo, e ja voce apenas uma alcoolatra ainda dominado pelo luto");
        Thread.sleep(8000);
        System.out.println("Nesse momento Julien Indaga: ");
        Thread.sleep(4000);
        System.out.println("- Vamos meu amigo, voltemos para casa onde realmente eh seu lar");
        Thread.sleep(8000);
        System.out.println("Pelo fato de estar totalmente alcoolizado voce nao resiste muito e acaba voltando com seu melhor amigo, de onde nunca deveria ter ido embora");
        Thread.sleep(8000);
        System.out.println("Alguns dias de passaram e Julien vai a sua para, pra ver como voce esta");
        Thread.sleep(8000);
        System.out.println("Depois de muita conversa e muitas recordacoes, seu melhor amigo o lembra da velha profecia que o antigo anciao havia lhes contado");
        Thread.sleep(8000);
        System.out.println("Ambos decidem procurar o velho, mas haviam chegado tarde de mais");
        Thread.sleep(8000);
        System.out.println("Na casa onde morava, apenas residia uma moca muito bonita que lhe fez sentir sensacoes que nunca havia sentido");
        Thread.sleep(8000);
        System.out.println("Após alguns segundos paralisados, voce a questiona: ");
        System.out.println("- Onde esta o velho anciao que aqui?");
        Thread.sleep(8000);
        System.out.println("Aquela moca, bonita entao lhe responde: - Meu avo nao esta mais entre nos, mas ele deixou algo para lhe entregar. Estou te esperando ha 5 anos...");
        Thread.sleep(8000);
        System.out.println("Voce e Julien ficam sem entender, e entao a moca lhe entrega um objeto e diz: - Nas maos da pessoa certa este instrumento indicara o caminho a libertacao de todo o povo");
        Thread.sleep(8000);
        System.out.println("Ao pegar o objeto, o mesmo indica por onde sua jornada ira comecar ... ");
        Thread.sleep(8000);
        System.out.println("O caminho eh longo, Julien concorda em ir com voce mas com a condicao de que deveria treina-lo para se tornar um guerreiro melhor do que ele...");
        Thread.sleep(8000);
        System.out.println("E entao voces partem nessa viagem em busca de resposta montados em sua carroca...");
        capitulo2();
    }

    public static void capitulo2() throws InterruptedException {
        System.out.println("Capitulo II - O Conhecimento eh a Verdade");
        Thread.sleep(8000);
        System.out.println("Sua busca comeca pelo Leste, o antigo reino do anoes ...");
        Thread.sleep(8000);
        System.out.println("Os anoes eram famosos por serem bons arquitetos e construtores, mas principalmente por esconderem seus projetos em \"numeros\" que nenhum outro ser era capaz de compreender, exceto eles mesmos.");
        Thread.sleep(8000);
        System.out.println("Eles utilizavam um sistema de conversão para todos seus projetos(pois só eles sabiam metódos de conversão), ");
        Thread.sleep(8000);
        System.out.println("e no passado um anao decidiu construir túneis(ou rotas) que interligavam todos os reinos só que esse mapa estava completamente convertido em dois tipos de numeracao: HEXADECIMAL e BINÁRIO.");

    }

    static public void capitulo3() {
        System.out.println("Capitulo III - Conheceis a verdade, e a verdade vos libertara");
        System.out.println("essa eh a 1 linha, do 3 capitulo");
    }

    public static int desafio1(){
        int vida=0; 
        
        return vida;
    }
    
    
    public static int DesafioBinarioVetor() {
        Scanner entrada = new Scanner(System.in);
        String vetor[] = {"4 13 19 17 00 03 00", "6 15 21 19 02 05 02", "04 17 17 03 14", "05 00 11 18 14"};
        boolean acertou = false;
        int vida = 3;
        int resposta;
        Random random = new Random();
        System.out.println("Com base nos conhecimentos adquiridos no reino dos anoes, responda: ");
        //System.out.println("Selecione a alternativa que corresponde a conversão do seguinte sistema binário: 100 1101 10011 10001 00 11 00");
        //int j=0;
        do {
            int l = 0;
            String compara[] = new String[3];
            for (int i = 0; i < vetor.length; i++) {
                //sorteia um índice
                int j = random.nextInt(vetor.length);
                //troca o conteúdo dos índices i e j do vetor
                String temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
            System.out.println("Selecione a alternativa que corresponde a conversao do seguinte sistema binario: 100 1101 10011 10001 00 11 00");
            for (String item : vetor) {
                l++;
                System.out.printf("%d)%s\n", l, item);
                for (int a = 0; a < vetor.length - 1; a++) {
                    compara = vetor;

                }
            }
            resposta = entrada.nextInt();
            switch (resposta) {
                case 1:
                    if ("4 13 19 17 00 03 00".equals(compara[0])) {
                        System.out.println("Sua resposta esta correta");
                        if (vida > 0 && vida < 3) {
                            vida++;
                        }
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida--;
                    }
                    break;
                case 2:
                    if ("4 13 19 17 00 03 00".equals(compara[1])) {
                        System.out.println("Sua resposta esta correta");
                        if (vida > 0 && vida < 3) {
                            vida++;
                        }
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida--;
                    }
                    break;
                case 3:
                    if ("4 13 19 17 00 03 00".equals(compara[2])) {
                        System.out.println("Sua resposta esta correta");
                        if (vida > 0 && vida < 3) {
                            vida++;
                        }
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida--;
                    }
                    break;
                case 4:
                    if ("4 13 19 17 00 03 00".equals(compara[3])) {
                        System.out.println("Sua resposta esta correta");
                        if (vida > 0 && vida < 3) {
                            vida++;
                        }
                        acertou = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida--;
                    }
                    break;
                default:
                    System.out.println("Seleciona alternativa de 1 a 4\n");
            }
            if (vida < 1) {
                System.out.println("Suas vidas acabaram, volte ao inicio e obtenha mais conhecimento para prosseguir!!!");
                acertou = true;
            }
            System.out.println("Quantidad de vidas: \n" + vida);
            System.out.println("");
        } while (acertou == false);
        return vida;
    }

}
