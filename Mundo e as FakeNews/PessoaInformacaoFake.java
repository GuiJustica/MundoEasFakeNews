/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.ArrayList;

public class PessoaInformacaoFake extends Pessoa{

    public PessoaInformacaoFake(ArrayList<Pessoa> ArrayDasPessoas){

        super.setCorIdentidade(6);
    }


public PessoaInformacaoFake(Pessoa pessoa){
    super();
    super.setCorIdentidade(6);
    this.setPosX(pessoa.getPosX());
    this.setPosY(pessoa.getPosY());
    this.setContatoWhats(pessoa.getContatoWhats());
    this.getContatos().addAll(pessoa.getContatos());
    }

}
