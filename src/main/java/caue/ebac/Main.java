package caue.ebac;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * Classe principal onde o objeto Carro é criado e seus métodos são chamados.
 * @author caue.gallizzi
 */
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("VW", "Gol", "Verde", 1997);
        String informacoesCarro = "Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo() + ", Cor: " + carro.getCor() + ", Ano de Fabricação: " + carro.getAnoFabricacao() + ".";
        System.out.println(informacoesCarro);
        carro.ligar();
        carro.desligar();
    }
}