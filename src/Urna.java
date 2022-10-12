import java.util.Scanner;

public class Urna {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        int voto = 0;
        int voto1 = 0;
        int voto2 = 0;
        int bolso = 0;
        int lula = 0;
        int ciro = 0;


        while (opcao != 4) {
            System.out.println();
            System.out.println("**Bem vindo a votacao**");
            System.out.println("**Selecione [1], [2], [3] para o que voce deseja votar**");
            System.out.println("[1] Presidente");
            System.out.println("[2] Prefeito");
            System.out.println("[3] Governador");
            System.out.println("[4] Finalizar Votacao");
            opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Insira seu voto para presidente: ");
                    voto = scanner.nextInt();
                    break;

                case 2:
                    System.out.println("Insira seu voto para Prefeito: ");
                    voto1 = scanner.nextInt();
                    if (voto1 != 22 && voto1 != 15 && voto1 != 13){
                        System.out.println("Você votou em: " + voto1);
                    } else System.out.println("Insira um voto valido por favor");

                    break;

                case 3:
                    System.out.println("Insira seu voto para Governador");
                    voto2 = scanner.nextInt();

                    if (voto2 != 22 && voto2 != 15 && voto2 != 13){
                        System.out.println("Você votou em: " + voto2);
                    } else System.out.println("Insira um voto valido por favor");

                    System.out.println("Você votou em: " + voto2);
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Insira uma opcao valida por favor");


            }

            if (voto == 22) {
                System.out.println("**Voce votou em Bolsonaro**");
            } else if (voto == 13)
                System.out.println("**Voce votou no Lula**");
            {
                if (voto == 15)
                    System.out.println("Voce votou no Ciro**");
            }

            if (opcao >= 1 && opcao <= 3) {
                System.out.println("**Voto computado**");
            }

            if (voto == 22) {
                bolso = bolso + 1;
            } else if (voto == 13) {
                lula = lula + 1;
            } else if (voto == 15) {
                ciro = ciro + 1;
            }
            System.out.println("**Placar Geral**");
            System.out.println("Bolsonaro: " +bolso);
            System.out.println("Lula: " +lula);
            System.out.println("Ciro: " +ciro);

        }
        System.out.println("Obrigado por votar!");
    }
}
