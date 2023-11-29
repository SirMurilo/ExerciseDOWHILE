package AtividadeDOWHILE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner sncFruta = new Scanner(System.in); 
        Scanner sncSair = new Scanner(System.in); 
        List<String> frutas = new ArrayList<>();
        System.out.println("Digite o nome de uma fruta: ");
        String fruta = sncFruta.nextLine();

        boolean sair = false;
        while (sair == false) {
            System.out.println("Digite o nome de uma fruta: ");
            fruta = sncFruta.nextLine();
            if (fruta != "") {
                frutas.add(fruta);
            } else {
                System.out.println("Digite um nome válido: ");
            }
            System.out.println("Deseja digitar mais algum nome de fruta?: ");
            System.out.println("Digite S ou s para continuar ou digite N ou n para sair!: ");
            String saida = sncSair.nextLine();
            if (saida.equals("N") || saida.equals("n")) {
                break;
            }
        }
        System.out.println("Foram adicionadas " + frutas.size() + "frutas, quais sejam: " + frutas);
        sncFruta.close();
        sncSair.close();
    }
}
