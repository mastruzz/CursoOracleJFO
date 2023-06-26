package section08;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    private static int proximoNumeroJogo = 1;

    private int numeroJogo;
    private Team equipe1;
    private Team equipe2;
    private double temperatura;
    private static ArrayList<Game> temporada = new ArrayList<>();

    public Game(String nomeEquipe1, String nomeEquipe2, double temperatura) {
        this.numeroJogo = proximoNumeroJogo++;
        this.equipe1 = new Team(nomeEquipe1);
        this.equipe2 = new Team(nomeEquipe2);
        this.temperatura = temperatura;
        temporada.add(this);


        Random geradorDeGolsAleatorio = new Random();
        int maxGols = (int) (temperatura * 3);
        int golsEquipeA = geradorDeGolsAleatorio.nextInt(Math.min(maxGols + 1, 21));
        int golsEquipeB = geradorDeGolsAleatorio.nextInt(Math.min(maxGols + 1, 21));
        this.equipe1.atualizarEstatisticas(golsEquipeA, golsEquipeB);
        this.equipe2.atualizarEstatisticas(golsEquipeB, golsEquipeA);

    }

    
    public static ArrayList<Game> getTemporada() {return temporada;}

    public Team getEquipe1() {return equipe1;}
    public Team getEquipe2() {return equipe2;}

    public double getTemperatura() {return temperatura;}


    public void imprimirEstatisticas() {

        System.out.printf("Jogo: %d\n", numeroJogo);
        System.out.printf("Equipe 1: %s\n", equipe1.getNomeTime());
        System.out.printf("Equipe 2: %s\n", equipe2.getNomeTime());
        System.out.printf("Gols Marcados Equipe 1: %d\n", equipe1.getGolsMarcados());
        System.out.printf("Gols Marcados Equipe 2: %d\n", equipe2.getGolsMarcados());
        System.out.printf("Temperatura: %.1f\n", temperatura);
        System.out.println();

    }
    

}