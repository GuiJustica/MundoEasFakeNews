/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

import java.util.Random;
import java.util.ArrayList;


public class Pessoa implements IMovable{
    Random numAleatorio = new Random();

    private int posX , posY, corIdentidade, ContatoWhats, Velocidade = 1, tempoImunidade = 0;
    ArrayList<Integer> Contatos = new ArrayList<>();

    public Pessoa(){
        this.posX = numAleatorio.nextInt(58) + 1;
        this.posY = numAleatorio.nextInt(28) + 1;
        this.corIdentidade = 5;
    }
    

    public int getTempoImunidade() {
        return tempoImunidade;
    }

    public void setTempoImunidade(int tempoImunidade) {
        this.tempoImunidade = tempoImunidade;
    }     

    public Random getNumAleatorio() {
        return numAleatorio;
    }

    public void setNumAleatorio(Random numAleatorio) {
        this.numAleatorio = numAleatorio;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getCorIdentidade() {
        return corIdentidade;
    }

    public void setCorIdentidade(int corIdentidade) {
        this.corIdentidade = corIdentidade;
    }

    public int getContatoWhats() {
        return ContatoWhats;
    }

    public void setContatoWhats(int ContatoWhats) {
        this.ContatoWhats = ContatoWhats;
    }

    public int getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(int Velocidade) {
        this.Velocidade = Velocidade;
    }

    public ArrayList<Integer> getContatos() {
        return Contatos;
    }

    public void setContatos(ArrayList<Integer> Contatos) {
        this.Contatos = Contatos;
    }

    

    @Override
    public void Movimentacao(){
        int movimentacao = numAleatorio.nextInt(5);
        switch(movimentacao){

            case 1:
            posX -=getVelocidade();
            if (posX<=0){
                posX+=58;
            }   
            else if (posX >= 59){
                posX -=58;
            } break;

            case 2:
                posX +=getVelocidade();
                if (posX<=0){
                    posX += 58;
                }
                else if (posX >= 59){
                    posX-=58;
                } break;

            case 3:
                posY +=getVelocidade();
                if (posY<=0){
                    posY += 28;
                }
                else if (posY >= 29){
                    posY-=28;
                } break; 

            case 4:
                posY -= getVelocidade();
                if (posY <= 0){
                    posY +=28;
                }
                else if( posY >=29){
                    posY-=28;
                }break;
                
            default:
            break;

            }

    }
      
}

