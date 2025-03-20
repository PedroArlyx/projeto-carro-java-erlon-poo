package br.com.mundo.carro.model;

public class Carro {

    public String modelo;
    public String chassi;
    public String placa;
    public boolean estaLigado;
    public boolean emMovimento;
    public double quantidadeCombustivel;
    public int velocidade;

    public  Carro(String modelo,String chassi,String placa,boolean estaLigado,boolean emMovimento,double quantidadeCombustivel,int velocidade){

        this.modelo =modelo;
        this.chassi= chassi;
        this.placa =placa;
        this.estaLigado= estaLigado;
        this.emMovimento =emMovimento;
        this.quantidadeCombustivel= quantidadeCombustivel;
        this.velocidade= velocidade;

    }
    public void ligar() {
        if( 0 <= quantidadeCombustivel) {
            if (this.estaLigado) {
                System.out.println("o carro ja estar ligando! ");
            } else {
                this.estaLigado = true;
                System.out.println("o carro estar ligando...");
            }
        }else{
            System.out.println("o carro estar sem combustivel!");
        }
    }
    public void desligar(){
        if (this.estaLigado) {
            System.out.println("o carro ja estar desligando! ");
        } else {
            this.estaLigado = true;
            System.out.println("o carro estar desligando...");
        }
    }
    public void acelerar(){
        if(this.emMovimento){
            System.out.println("o carro nao estar em movimento!");
        }else{
            quantidadeCombustivel -= 1;
            velocidade += 50;
            System.out.println("o carro estar acelerando!");
            System.out.printf("Quantidade de cumbutivel: %.3f \n",quantidadeCombustivel);
            System.out.printf("velocidade: %d\n",velocidade);
        }
    }
    public void freiar(){
        if(this.emMovimento){
            System.out.println("o carro nao estar em movimento!");
        }else{
            velocidade -=30;
            System.out.println("o carro estar freiando!");
            System.out.printf("km: %d",velocidade);
        }
    }
    public void parar(){
        if(this.emMovimento){
            System.out.println("o carro ja estar parado!");
        }else{
            System.out.println("o carro estar parando!");
        }
    }
    public void exiberInfos(){
        System.out.printf("modelo: %s",modelo);
        System.out.printf("chassi %s",chassi);
        System.out.printf("placa %s",placa);
        System.out.println(estaLigado);
        System.out.println(emMovimento);
        System.out.printf("quantidade: %.3f \n",quantidadeCombustivel);
        System.out.printf("km: %d",velocidade);
    }
}
