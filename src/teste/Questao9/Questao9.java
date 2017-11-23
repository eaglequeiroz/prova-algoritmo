package teste.Questao9;

/**
 *
 * @author Igor Queiroz
 */
public class Questao9 {

    public static void main(String[] args) {
        final BinnaryTree no2 = new BinnaryTree(7);
        final BinnaryTree no4 = new BinnaryTree(5);
        final BinnaryTree no3 = new BinnaryTree(5, no4);
        final BinnaryTree no1 = new BinnaryTree(1, no2, no3);

        System.out.println("Soma dos nós filhos: " + no1.somaDosNosFilhos());
    }

    private static class BinnaryTree {

        private final int valor;
        private BinnaryTree left;
        private BinnaryTree right;

        public BinnaryTree(int valor) {
            this.valor = valor;
        }

        public BinnaryTree(int valor, BinnaryTree left) {
            this.valor = valor;
            this.left = left;
        }

        public BinnaryTree(int valor, BinnaryTree left, BinnaryTree right) {
            this.valor = valor;
            this.left = left;
            this.right = right;
        }

        public int somaDosNosFilhos() {
            int valorAcc = valor;
            if (left != null) {
                valorAcc += left.somaDosNosFilhos();
            }
            if (right != null) {
                valorAcc += right.somaDosNosFilhos();
            }
            return valorAcc;
        }
    }
}
