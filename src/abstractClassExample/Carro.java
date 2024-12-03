package abstractClassExample;

public class Carro extends Automovel {

    @Override
    public void ligar() {
        System.out.println("O Caro liga!");
    }
    @Override
    public void mover(Integer metros) {
        System.out.print("O carro andou ");
        System.out.print(metros);
        System.out.print(" metros");
        System.out.println("\n");
    }

    @Override
    public void acelerar() {
        System.out.println("O carro acelera");
    }
}
