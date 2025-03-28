/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class PessoaSegura extends Pessoa{
        
        
    public PessoaSegura(){
        super.setCorIdentidade(7);
    }
    public PessoaSegura(Pessoa pessoa){
        super();
        super.setCorIdentidade(7);
        this.setPosX(pessoa.getPosX());
        this.setPosY(pessoa.getPosY());
        this.setContatoWhats(pessoa.getContatoWhats());
        this.getContatos().addAll(pessoa.getContatos());
    }

}

