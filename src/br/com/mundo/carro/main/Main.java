package br.com.mundo.carro.main;

import br.com.mundo.carro.model.Carro;

public class Main {
    public static void main(String[] args){
        Carro carro = new Carro(
                "Ferrari",
                "1HGCM82633A123456",
                "P07NR",
                false,
                false,
                100,
                300
        );
        carro.ligar();
        carro.acelerar();
        carro.freiar();
        carro.exiberInfos();


    }
}
