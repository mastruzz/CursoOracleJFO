package section03;

import java.util.Scanner;

public class History {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o nome de um reino mágico: ");
        String reino = scanner.nextLine();

        System.out.print("Digite o nome de um animal fantástico: ");
        String animal = scanner.nextLine();

        System.out.print("Digite um poder mágico: ");
        String poder = scanner.nextLine();

        System.out.print("Digite um objeto mágico: ");
        String objeto = scanner.nextLine();

        System.out.printf("Era uma vez, em um reino mágico chamado %s, viveu um(a) mago chamado(a) %s.\n", reino, nome);
        System.out.printf("O %s possuía o poder mágico de %s e era conhecido por sua sabedoria.\n", animal, poder);
        System.out.printf("Um dia, %s encontrou um antigo %s %s escondido em uma floresta encantada.\n", nome, animal, objeto);
        System.out.printf("Ao tocar o %s, %s foi envolvido por uma luz brilhante e ganhou novos poderes.\n", objeto, nome);
        System.out.printf("Agora, com seus poderes ampliados, %s se tornou um(a) herói(ína) lendário(a) em %s, protegendo o reino e lutando contra as forças das trevas.\n", nome, reino);
        System.out.printf("E assim, a história de %s e seu(a) %s mágico perdura através dos tempos!\n", nome, animal);
    }
}