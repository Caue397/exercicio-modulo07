package caue.ebac;

/**
 * Classe onde o objeto carro é criado.
 * @author caue.gallizzi
 */
public class Carro {

    // Criação das variaveis
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabricacao;
    private boolean carroLigado;

    // Construtor da classe
    public Carro(String marca, String modelo, String cor, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.carroLigado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    // Metodo para ligar o carro
    public void ligar() {
        this.carroLigado = true;
        System.out.println("O carro está ligado");
    }

    //Metodo para desligar o carro
    public void desligar() {
        this.carroLigado = false;
        System.out.println("O carro foi desligado.");
    }
}
