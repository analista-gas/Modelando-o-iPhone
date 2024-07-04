/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigos;

/**
 *
 * @author Gilmar
 */
public class NavegadorInternet implements IPhone{

  @Override
  public void ligar() {
    System.out.println("Navegador de Internet ligado!");
  }

  @Override
  public void desligar() {
    System.out.println("Navegador de Internet desligado!");
  }

  public void exibirPagina(String url) {
    System.out.println("Exibindo página: " + url);
  }

  public void adicionarNovaAba() {
    System.out.println("Nova aba adicionada.");
  }

  public void atualizarPagina() {
    System.out.println("Página atualizada.");
  }
}

