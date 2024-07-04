/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigos;

/**
 *
 * @author Gilmar
 */
public class ReprodutorMusical implements IPhone{
    private String musicaAtual;

  @Override
  public void ligar() {
    System.out.println("Reprodutor Musical ligado!");
  }

  @Override
  public void desligar() {
    System.out.println("Reprodutor Musical desligado!");
  }

  public void tocar() {
    if (musicaAtual != null) {
      System.out.println("Reproduzindo música: " + musicaAtual);
    } else {
      System.out.println("Nenhuma música selecionada.");
    }
  }

  public void pausar() {
    System.out.println("Música pausada.");
  }

  public void selecionarMusica(String musica) {
    this.musicaAtual = musica;
    System.out.println("Música selecionada: " + musica);
  }
}

