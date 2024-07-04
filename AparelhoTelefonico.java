/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigos;

/**
 *
 * @author Gilmar
 */
public class AparelhoTelefonico implements IPhone{
    @Override
  public void ligar() {
    System.out.println("Aparelho Telefônico ligado!");
  }

  @Override
  public void desligar() {
    System.out.println("Aparelho Telefônico desligado!");
  }

  public void ligar(String numero) {
    System.out.println("Ligando para: " + numero);
  }

  public void atender() {
    System.out.println("Chamada atendida.");
  }

  public void iniciarCorreioVoz() {
    System.out.println("Redirecionando para correio de voz.");
  }
}

