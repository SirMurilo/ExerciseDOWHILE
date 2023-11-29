package AtividadeDOWHILE;

import java.util.*;

public class atividade4 {
    public static void main(String[] args) {
        Scanner scnProduto = new Scanner(System.in);
        Scanner scnQtd = new Scanner (System.in);
        Scanner scnContinuar = new Scanner (System.in);
        boolean continuar = true;

        String[] nomesProdutos = {"Maçã (Kg)", "Pão (Un)", "Sabão(Un)", "Coca-Cola(2L)", "Chocolate (Barra)"};
        Double[] precosProdutos = {7.5, 0.5, 27.8, 8.99, 3.89};

        short codProduto;
        List<Short> codigosProdutosCarrinho = new ArrayList<>();
        List<String> nomesProdutosCarrinho = new ArrayList<>();
        List<Double> precosProdutosCarrinho = new ArrayList<>();

        double qtdProduto;
        List<Double> qtdsProdutosCarrinho = new ArrayList<>();
        List<Double> subtotalProdutosCarrinho = new ArrayList<>();

        short qtdProdutosCarrinho = 0;
        boolean carrinhoCheio = false;

        short idProdTemp;
        while(carrinhoCheio == false){
            idProdTemp = 0;
            while (idProdTemp < nomesProdutos.length){
                System.out.println("Cód [" + idProdTemp + "] - Produto: " + nomesProdutos[idProdTemp]);
                idProdTemp++;
            }
            System.out.println("Digite o código do produto que deseja adicionar ao carrinho: ");
            codProduto = scnProduto.nextShort();

            codigosProdutosCarrinho.add(codProduto);
            nomesProdutosCarrinho.add(nomesProdutos[codProduto]);
            precosProdutosCarrinho.add(precosProdutos[codProduto]);

            System.out.println("Digite a quantidade do produto que deseja adicionar ao carrinho: ");
            qtdProduto = scnQtd.nextDouble();

            qtdsProdutosCarrinho.add(qtdProduto);
            subtotalProdutosCarrinho.add(precosProdutos[codProduto] * qtdProduto);

            qtdProdutosCarrinho++;
            if (qtdProdutosCarrinho == nomesProdutos.length) {
                carrinhoCheio = true;
            }

            System.out.println("Deseja adicionar mais algum produto no carrinho? ");
            if (scnContinuar.nextLine().toUpperCase().equals("NÃO")){
                break;
            }
        }

        scnProduto.close();
        scnQtd.close();
        scnContinuar.close();

        short idProdCarrinhoTmp = 0;
        Double precoTotal = 0.0;
        System.out.println("Os produtos do carrinho são: ");

        while (idProdCarrinhoTmp < nomesProdutosCarrinho.size()){
            System.out.println(
            "Código [" + 
            codigosProdutosCarrinho.get(idProdCarrinhoTmp) +
            " | Produto: " + 
            nomesProdutosCarrinho.get(idProdCarrinhoTmp) + 
            " | Preço unitário: " + 
            precosProdutosCarrinho.get(idProdCarrinhoTmp) + 
            " | Quantidades: " + 
            qtdsProdutosCarrinho.get(idProdCarrinhoTmp) +
            " | Subtotal: R$ " +
            subtotalProdutosCarrinho.get(idProdCarrinhoTmp)

            );      
            precoTotal += subtotalProdutosCarrinho.get(idProdCarrinhoTmp);
            idProdCarrinhoTmp++;

        }    
        System.out.println("Total da compra: R$ " + precoTotal);
    }
}
