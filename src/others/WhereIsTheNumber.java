// Jr Silva 20/12/2018
// Implementação simples de um método que retornar o número faltante dada um arranjo a

package others;

public class WhereIsTheNumber {

    /**
     *
     * Testes simples da classe
     *
     * */
    public static void main (String... args) {
        int[] arr = {1, 2, 4, 5, 6};

        System.out.println(whereIsTheNumber(arr));
    }

    /**
     * Método para obter um número faltante em um dado arranjo
     *
     * @param arrangement Arranjo que será efetuado a varredura
     *
     * @return int
     */
    private static int whereIsTheNumber (int[] arrangement) {
        int n = arrangement.length + 1;

        // Soma da PA de n números
        // Uma soma em que todos os números de 1...n estão incluidos na PA
        int sum = n * (n + 1) / 2;

        for (int i = 0; i < arrangement.length; i++)
            sum -= arrangement[i];

        return sum;
    }
}
