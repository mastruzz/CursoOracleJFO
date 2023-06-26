package section08;

import section08.Game;
import section08.Team;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Application {
    public static void main(String[] args) {
        
        int jogosPorSemana = 0;

        ArrayList<Team> equipes = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)) {


            while (jogosPorSemana < 3) {

                System.out.println("---PARA ENCERRAR DIGITE VALORES NEGATIVOS---");
                System.out.println("    ---OU VALORES ACIMA DE 40 GRAUS---\n");
                System.out.println("Digite a temperatura da semana: ");

                double temperaturaDaSemana = input.nextDouble();

                if (temperaturaDaSemana < 0 || temperaturaDaSemana > 40) { break; }

                if (temperaturaDaSemana <= 0) { jogosPorSemana++; } 

                else {
                    jogosPorSemana++;

                    if (temperaturaDaSemana >= 20) {
                        String equipeA = Team.gerarEquipeAleatoria();
                        String equipeB = Team.gerarEquipeAleatoria();

                        while (equipeA.equals(equipeB)) {
                            equipeB = Team.gerarEquipeAleatoria();
                        }

                        Game jogoDeFutebol = new Game(equipeA, equipeB, temperaturaDaSemana);
                        equipes.add(jogoDeFutebol.getEquipe1());
                        equipes.add(jogoDeFutebol.getEquipe2());
                    }

                }

            }

        } catch(IllegalArgumentException e){
            String excecao = "Valores digitados inválidos, a temporada está encerrada. ";
            JOptionPane.showMessageDialog(null, excecao);
        }


        ArrayList<Game> temporadaAtual = Game.getTemporada();
        equipes.sort(Team.ComparadorNomeDasEquipes);

        for (Game partida : temporadaAtual) {
            partida.imprimirEstatisticas();
        }

        System.out.println("Estatísticas Gerais das Equipes:");
        Team equipeAtual = null;

        for (Team equipe : equipes) {
            if (equipeAtual == null || !equipe.getNomeTime().equals(equipeAtual.getNomeTime())) {

                if (equipeAtual != null) {
                    equipeAtual.imprimirEstatisticas();
                }
                equipeAtual = equipe;
            } 
            else {
                equipeAtual.atualizarEstatisticas(equipe.getGolsMarcados(), equipe.getGolsSofridos());
            }
        }
        
        if (equipeAtual != null) {
            equipeAtual.imprimirEstatisticas();
        }

        double temperaturaMaisQuente = 0.0;
        double temperaturaTotal = 0.0;

        for (Game partida : temporadaAtual) {
            temperaturaTotal += partida.getTemperatura();
            if (partida.getTemperatura() > temperaturaMaisQuente) {
                temperaturaMaisQuente = partida.getTemperatura();
            }
        }

        double temperaturaMedia = temperaturaTotal / temporadaAtual.size();

        System.out.printf("Temperatura mais quente: %.1f\n", temperaturaMaisQuente);
        System.out.printf("Temperatura média: %.1f\n", temperaturaMedia);

    }


}
