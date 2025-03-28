/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.ArrayList;

public class PessoaInformada extends Pessoa{

    public PessoaInformada(ArrayList<Pessoa> ArrayDasPessoas){

        super.setCorIdentidade(5);
    }

public PessoaInformada(Pessoa pessoa){

    super();
    super.setCorIdentidade(5);
    this.setPosY(pessoa.getPosY());
    this.setPosX(pessoa.getPosX());
    this.setContatoWhats(pessoa.getContatoWhats());
    this.getContatos().addAll(pessoa.getContatos());

}
    
}
