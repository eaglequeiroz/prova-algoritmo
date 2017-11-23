package teste.Questao8;

/**
 *
 * @author Igor Queiroz
 */
public class Questao8 {
    
    public static void main(String[] args) {
        System.out.println("Valor concatenado ( 150122): " + concatenarValor(102, 512));
        System.out.println("Valor concatenado (-964378): " + concatenarValor(947, -638));
        System.out.println("Valor concatenado (1501225): " + concatenarValor(1025, 512));
        System.out.println("Valor concatenado (     -1): " + concatenarValor(10256, 512));
    }
    
    public static int concatenarValor(int numA, int numB) {
        String prefixo = "";
        if (numA < 0) {
            numA *= -1;
            prefixo = "-";
        }
        if (numB < 0) {
            numB *= -1;
            prefixo = "-";
        }
        final String numAStr = Integer.toString(numA);
        final String numBStr = Integer.toString(numB);
        
        final int qtdDigitosNumA = numAStr.length();
        final int qtdDigitosNumB = numBStr.length();

        if (qtdDigitosNumA + qtdDigitosNumB > 7) {
            return -1;
        }

        int indiceMenor;
        String maiorNumero;
        if (qtdDigitosNumA < qtdDigitosNumB) {
            maiorNumero = numBStr;
            indiceMenor = qtdDigitosNumA;
        } else {
            maiorNumero = numAStr;
            indiceMenor = qtdDigitosNumB;
        }
        final String sufixo = maiorNumero.substring(indiceMenor);

        String novoNumero = "";
        for (int i = 0; i < indiceMenor; i++) {
            novoNumero += numAStr.charAt(i);
            novoNumero += numBStr.charAt(i);
        }
        novoNumero = prefixo + novoNumero + sufixo;
        return Integer.parseInt(novoNumero);
    }
}
