package AtividadeDOWHILE;

public class atividade1 {
    public static void main(String[] args) {
        int totalTempo = 2;
        int inicioTempo = 0;
        while (inicioTempo <= totalTempo){
            try{
                System.out.println("Assistindo filme...");
                Thread.sleep(60000);
                inicioTempo++;
            } catch (InterruptedException e){
                System.out.println("ops! houve algum erro...: " + e);
            }
        }
        System.out.println("Fim do filme.");

    }
        
}

