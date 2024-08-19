import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        String nome_produto = "RTX 4090";
        double preco_produto = 9499.99;
        int quant_prod_comp = 3;
        double taxa = preco_produto * 0.1;
        double lucro = 4395.62;
        double preco_impst = preco_produto + taxa;
        double preco_qntdd_impst = (preco_produto+ taxa) * quant_prod_comp;
        double preco_venda = preco_impst + lucro;
        System.out.println("O produto é: " + nome_produto);
        System.out.println("O valor de fabricação do produto é de R$"+ df.format(preco_produto));
        System.out.println("A quantidade de itens comprados é: "+ quant_prod_comp);
        System.out.println("A margem de lucro buscada é de R$"+ df.format(lucro));
        System.out.println("O valor pago em imposto é de R$"+ taxa+" por item, como são(é) "+quant_prod_comp+" fica R$"+df.format(taxa * quant_prod_comp)+" de imposto");
        System.out.println("O preço de venda, sem lucro, seria de R$"+df.format(preco_impst)+" por item, como são(é) "+quant_prod_comp+" fica R$"+df.format(preco_qntdd_impst));
        System.out.println("O preço de venda é de "+df.format(preco_venda)+" como são(é) "+quant_prod_comp+" fica R$"+df.format(preco_venda * quant_prod_comp));
    }
}