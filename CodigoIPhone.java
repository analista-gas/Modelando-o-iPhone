/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Codigos;

/**
 *
 * @author Gilmar
 */
public class CodigoIPhone {


    public static void main(String[] args) {
        ReprodutorMusical meuReprodutor = new ReprodutorMusical();
        meuReprodutor.ligar();
        meuReprodutor.selecionarMusica("Minha Música Favorita");
        meuReprodutor.tocar();
        meuReprodutor.pausar();
        meuReprodutor.desligar();

        AparelhoTelefonico meuTelefone = new AparelhoTelefonico();
        meuTelefone.ligar();
        meuTelefone.ligar("123-4567");
        meuTelefone.atender();
        meuTelefone.iniciarCorreioVoz();
        meuTelefone.desligar();

        NavegadorInternet meuNavegador = new NavegadorInternet();
        meuNavegador.ligar();
        meuNavegador.exibirPagina("www.google.com");
        meuNavegador.adicionarNovaAba();
        meuNavegador.atualizarPagina();
        meuNavegador.desligar();
        
        

    }

}
