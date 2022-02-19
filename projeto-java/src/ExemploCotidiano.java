import java.math.BigDecimal;
import java.util.Scanner;
import java.math.BigDecimal;

public class ExemploCotidiano {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String valorProduto;
        String quantidadeProduto;
        String dinheiro;

        System.out.print("Valor do Produto: ");
        valorProduto = entrada.next();

        System.out.println("");
        System.out.print("Quantidade do Produto: ");
        quantidadeProduto = entrada.next();

        System.out.println("");
        System.out.print("Dinheiro: ");
        dinheiro = entrada.next();

        BigDecimal total = new BigDecimal(valorProduto).multiply(new BigDecimal(quantidadeProduto));
        String totalConvertido = total.toPlainString();

        System.out.println("");
        System.out.println("Total da Compra");
        System.out.println(new BigDecimal(valorProduto).multiply(new BigDecimal(quantidadeProduto)));

        System.out.println("");
        System.out.println("Troco");
        System.out.println(new BigDecimal(dinheiro).subtract(new BigDecimal(totalConvertido)));

        System.out.println("");
        System.out.println("Total da compra mais o dinheiro");
        BigDecimal resultado = nomeProduto(dinheiro,totalConvertido);

        System.out.println("");
        System.out.println("Comparação do dinheiro com o total da compra");
        System.out.println(resultado);
        System.out.println(new BigDecimal(dinheiro).compareTo(new BigDecimal(totalConvertido)));

    }
     public static BigDecimal nomeProduto(String dinheiro, String totalConvertido){

        System.out.println("");
        BigDecimal total = new BigDecimal(dinheiro).add(new BigDecimal(totalConvertido));

        return total;
       
    }
}
