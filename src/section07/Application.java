package section07;

public class Application {
        public static void main(String[] args) {
            Card cartao1 = new Card(1);
            Card cartao2 = new Card(2);
            Games jogo = new Games(5);
            Terminal terminal = new Terminal();
            
            terminal.converterDinheiroEmCredito(cartao1, 10);
            terminal.converterDinheiroEmCredito(cartao2, 20);
            
            jogo.jogar(cartao1);
            jogo.jogar(cartao2);
            
            terminal.transferirCreditos(cartao1, cartao2, 5);
            
            terminal.verificarSaldos(cartao1);
            terminal.verificarSaldos(cartao2);
            
            terminal.trocarTicketsPorPremio(cartao2, 15);
            
            jogo.jogar(cartao1);
            terminal.trocarTicketsPorPremio(cartao1, 15);
        }
}
