/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

import java.util.ArrayList;


public class Mundo{

    private int[][] mapaMundo;
    

    public void DesenharMapa() {
        mapaMundo = new int[][]{
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},};
    }
    ;
            private ArrayList<Pessoa> ArrayPessoas = new ArrayList<>();

    IAInformacaoCerta IAInformacaoCerta = new IAInformacaoCerta();
    IAInformacaoFake IAInformacaoFake = new IAInformacaoFake();
    EmissoraConfiavel EmissoraConfiavel = new EmissoraConfiavel();
    FakeNews FakeNews = new FakeNews();

    
    public Mundo() {
        DesenharMapa();

    }

    public void CriaAsPessoas() {

        for (int i = 0; i < 100; i++) {

            ArrayPessoas.add(new PessoaInformada(ArrayPessoas));
            ArrayPessoas.get(i).setContatoWhats(i);

        }

    }
     //Reduz a imunidade de 1 em 1 segundo
    public void ReduzImunidade(){
         for (Pessoa pessoa : ArrayPessoas) {
             if ((pessoa instanceof PessoaSegura)){
                if(pessoa.getTempoImunidade()>0){
                    pessoa.setTempoImunidade(pessoa.getTempoImunidade()-1);
                }else if(pessoa.getTempoImunidade()==0){
                    PessoaInformada pessoainformada = new PessoaInformada(pessoa);
                    ArrayPessoas.set(pessoa.getContatoWhats(), pessoainformada);
                }
             }
        }
    
    
    }
    
    
    public void DesenhaAsPessoas() {

        DesenharMapa();
        for (Pessoa pessoa : ArrayPessoas) {
            mapaMundo[pessoa.getPosY()][pessoa.getPosX()] = pessoa.getCorIdentidade();

        }
    }

    public void MovimentacaoPessoas() {

        for (Pessoa pessoa : ArrayPessoas) {
            pessoa.Movimentacao();

        }
    }
       //Ia onde trasmite a Informaçao falsa
    public void AInformacaoFake() {

        for (Pessoa pessoa : ArrayPessoas) {
            if ((pessoa instanceof PessoaInformada) && pessoa.getPosY() >= 2 && pessoa.getPosY() <= 5 && pessoa.getPosX() >= 2 && pessoa.getPosX() <= 9) {
                    IAInformacaoFake.setContagem(IAInformacaoFake.getContagem() + 1);
                    FakeNews.setContagem(FakeNews.getContagem() + 1);
                    PessoaInformacaoFake pessoainformacaofake = new PessoaInformacaoFake(pessoa);
                    ArrayPessoas.set(pessoa.getContatoWhats(), pessoainformacaofake);
                }
             //Adiciona a pessoa no contato da outra    
            for(Integer contato :pessoa.getContatos()){
                if ((ArrayPessoas.get(contato) instanceof PessoaInformada) && ArrayPessoas.get(contato).getPosY() >= 2 && ArrayPessoas.get(contato).getPosY() <= 9 && ArrayPessoas.get(contato).getPosX() >= 2 && ArrayPessoas.get(contato).getPosX() <= 9) {
                IAInformacaoFake.setContagem(IAInformacaoFake.getContagem() + 1);
                FakeNews.setContagem(FakeNews.getContagem() + 1);
                PessoaInformacaoFake pessoainformacaofake = new PessoaInformacaoFake(ArrayPessoas.get(contato));
                ArrayPessoas.set(ArrayPessoas.get(contato).getContatoWhats(), pessoainformacaofake);
            }
                
            }
        }
    }

           //Ia onde faz com que a pessoa mal informada fique informada
    public void DestroiAInformacaoFake() {
        for (Pessoa pessoa : ArrayPessoas) {            
            if ((pessoa instanceof PessoaInformacaoFake) && pessoa.getPosY() >= 25 && pessoa.getPosY() <= 28 && pessoa.getPosX() >= 2 && pessoa.getPosX() <= 9) {
                IAInformacaoCerta.setContagem(IAInformacaoCerta.getContagem() + 1);
                PessoaInformada pessoainformada = new PessoaInformada(pessoa);
                ArrayPessoas.set(pessoa.getContatoWhats(), pessoainformada);
            }
             //Adiciona a pessoa no contato da outra  
            for(Integer contato :pessoa.getContatos()){
                if ((ArrayPessoas.get(contato) instanceof PessoaInformacaoFake) && ArrayPessoas.get(contato).getPosY() >= 25 && ArrayPessoas.get(contato).getPosY() <= 28 && ArrayPessoas.get(contato).getPosX() >= 2 && ArrayPessoas.get(contato).getPosX() <= 9) {
                IAInformacaoCerta.setContagem(IAInformacaoCerta.getContagem() + 1);
                PessoaInformada pessoainformada = new PessoaInformada(ArrayPessoas.get(contato));
                ArrayPessoas.set(ArrayPessoas.get(contato).getContatoWhats(), pessoainformada);
            }
        }
    }
    }
           //Protege as pessoas por 30 segundos
    public void Emissora() {
        for (Pessoa pessoa : ArrayPessoas) {
            if ((pessoa instanceof Pessoa) && pessoa.getPosY() >= 11 && pessoa.getPosY() <= 17 && pessoa.getPosX() >= 50 && pessoa.getPosX() <= 57) {
                EmissoraConfiavel.setContagem(EmissoraConfiavel.getContagem() + 1);
                PessoaSegura pessoaSegura = new PessoaSegura(pessoa);
                pessoaSegura.setTempoImunidade(30);
                
                ArrayPessoas.set(pessoa.getContatoWhats(), pessoaSegura);
            }
        }
    }
        //Onde as pessoas se "comunicam" entre elas
    public void Agenda(){
        
        for(Pessoa pessoa1: ArrayPessoas){
            for(Pessoa pessoa2: ArrayPessoas){
                if(pessoa1.getPosX()== pessoa2.getPosX()&&
                        pessoa1.getPosY()==pessoa2.getPosY()){
                    pessoa1.getContatos().add(pessoa2.getContatoWhats());
                    pessoa2.getContatos().add(pessoa1.getContatoWhats());
                }else if(pessoa1.getPosX()== pessoa2.getPosX()-1&&
                        pessoa1.getPosY()==pessoa2.getPosY()){
                    pessoa1.getContatos().add(pessoa2.getContatoWhats());
                    pessoa2.getContatos().add(pessoa1.getContatoWhats());
                }else if(pessoa1.getPosX()== pessoa2.getPosX()+1&&
                        pessoa1.getPosY()==pessoa2.getPosY()){
                   pessoa1.getContatos().add(pessoa2.getContatoWhats());
                    pessoa2.getContatos().add(pessoa1.getContatoWhats());
                }else if(pessoa1.getPosX()== pessoa2.getPosX()&&
                        pessoa1.getPosY()==(pessoa2.getPosY()-1)){
                    pessoa1.getContatos().add(pessoa2.getContatoWhats());
                    pessoa2.getContatos().add(pessoa1.getContatoWhats());
                }else if(pessoa1.getPosX()== pessoa2.getPosX()&&
                        pessoa1.getPosY()==(pessoa2.getPosY()+1)){
                    pessoa1.getContatos().add(pessoa2.getContatoWhats());
                    pessoa2.getContatos().add(pessoa1.getContatoWhats());
                }
            
            }
        }
                        
    }
     
    
    public void DesenhaOMundo(){
     
        DesenhaAsPessoas();

        for (int i = 0; i < mapaMundo.length; i++) {

            for (int j = 0; j < mapaMundo[i].length; j++) {
                
                switch (mapaMundo[i][j]) {
                    case 0 -> System.out.print(" ");
                    case 1 -> System.out.print("\033[47m \033[0m");
                    case 2 -> System.out.print("\033[45m \033[0m");
                    case 3 -> System.out.print("\033[44m \033[0m");
                    case 4 -> System.out.print("\033[46m \033[0m");
                    case 5 -> System.out.print("\033[43m \033[0m");
                    case 6 -> System.out.print("\033[41m \033[0m");
                    case 7 -> System.out.print("\033[42m \033[0m");
                    default -> {
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void DadosColetados() {
        int contagemPessoasBemInformadas = 0, contagemPessoasSeguras = 0, contagemPessoasDesinformadas = 0;
        System.out.println("A SIMULAÇÃO DE UM MUNDO COM FAKENEWS");
        System.out.println("A simulação foi feita com "+100+" pessoas");
        System.out.println(" ");        
        for (Pessoa pessoa : ArrayPessoas) {
            if (pessoa instanceof PessoaSegura) {
                contagemPessoasSeguras += 1;
            }
            if (pessoa instanceof PessoaInformada) {
                contagemPessoasBemInformadas += 1;
            }
            if (pessoa instanceof PessoaInformacaoFake) {
                contagemPessoasDesinformadas += 1;
            }
        }
            
        System.out.println("A quantidade de pessoas INFORMADAS são : "+contagemPessoasBemInformadas);
        System.out.println("A quantidade de pessoas DESINFORMADAS são :"+contagemPessoasDesinformadas);              
        System.out.println("A quantidade de pessoas SEGURAS: " +contagemPessoasSeguras);
        

    }

}
