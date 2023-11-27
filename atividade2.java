package AtividadeDOWHILE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {

       //String[] usuariosLogados = {"teste1", "teste2", "..."};
        //usuariosLogados[3] = "teste4";
        //usuariosLogados[2] = "Substituir a string ...";

        List<String> usersLogged = new ArrayList<>();
        int limitUsers = 2;

        Scanner scnUser = new Scanner(System.in);
        String usuario;
        try{
            while (usersLogged.size() < limitUsers){
                System.out.println("Digite o usuário!");
                usuario = scnUser.nextLine();
                if (usuario != "") {
                    usersLogged.add(usuario);
            } else {
                System.out.println("Digite um usuário válido: ");
            }
            Thread.sleep(1000);

        } 
        System.out.println("Limite de usuario excedido");
    }catch (InterruptedException e){
        System.out.println("ops, houve algum erro...!" + e);

        }
        scnUser.close();
    }

}
