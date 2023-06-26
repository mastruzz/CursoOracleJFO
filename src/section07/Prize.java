package section07;

public class Prize {
        private final String nome;
        private final int ticketsObrigatorios;
        private int quantidadeDisponivel;
        
        public Prize(String nome, int ticketsObrigatorios, int quantidadeDisponivel) {
            this.nome = nome;
            this.ticketsObrigatorios = ticketsObrigatorios;
            this.quantidadeDisponivel = quantidadeDisponivel;
        }
        
        public String getNome() {
            return nome;
        }
        
        public int getTicketsObrigatorios() {
            return ticketsObrigatorios;
        }
        
        public int getQuantidadeDisponivel() {
            return quantidadeDisponivel;
        }
        
        public void reduzirQuantidadeDisponivel() {
            quantidadeDisponivel--;
        }
    
}
