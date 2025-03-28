public class Main {

    public static void main(String args[]){

         //Inicia tudo
        float t = 0;
        Mundo criar = new Mundo();
        criar.CriaAsPessoas();

        while (true) {
            t +=1;

            criar.DesenhaOMundo();
            criar.MovimentacaoPessoas();
            criar.AInformacaoFake();
            criar.DestroiAInformacaoFake();
            criar.Emissora();
            criar.DadosColetados();
            System.out.println(" ");
            System.out.println("Tempo de mundo simulado: " + t + " segundos");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}