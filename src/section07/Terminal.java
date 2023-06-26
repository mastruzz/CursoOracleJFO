package section07;

public class Terminal {

    private final Prize[] categorias;
    
    public Terminal() {
        categorias = new Prize[3];
        categorias[0] = new Prize("Prêmio 1", 10, 5);
        categorias[1] = new Prize("Prêmio 2", 20, 10);
        categorias[2] = new Prize("Prêmio 3", 30, 15);
    }
    
    public void converterDinheiroEmCredito(Card cartao, int dinheiro) {
        int creditos = dinheiro * 2;
        cartao.adicionarCredito(creditos);
    }
    
    public void verificarSaldos(Card cartao) {
        System.out.println("Número do cartão: " + cartao.getNumero());
        System.out.println("Saldo de crédito: " + cartao.getSaldoCredito());
        System.out.println("Saldo de tíquetes: " + cartao.getSaldoTicket());
    }
    
    public void transferirCreditos(Card origem, Card destino, int quantidade) {
        if (origem.getSaldoCredito() >= quantidade) {
            origem.reduzirCredito(quantidade);
            destino.adicionarCredito(quantidade);
            System.out.println("Transferência de créditos realizada com sucesso");
        } else {
            System.out.println("Créditos insuficientes para transferência");
        }
    }
    
    public void trocarTicketsPorPremio(Card cartao, int categoriaIndex) {
        Prize categoria = categorias[categoriaIndex];
        if (cartao.getSaldoTicket() >= categoria.getTicketsObrigatorios()) {
            if (categoria.getQuantidadeDisponivel() > 0) {
                cartao.reduzirTicket(categoria.getTicketsObrigatorios());
                categoria.reduzirQuantidadeDisponivel();
                System.out.println("Prêmio " + categoria.getNome() + " concedido");
                System.out.println("Número restante desse prêmio: " + categoria.getQuantidadeDisponivel());
            } else {
                System.out.println("Prêmio esgotado");
            }
        } else {
            System.out.println("Tíquetes insuficientes para trocar por esse prêmio");
        }
    }
}