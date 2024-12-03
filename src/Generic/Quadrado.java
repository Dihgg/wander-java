package Generic;

public class Quadrado extends Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um quadrado!");
        /// super.desenhar();
    }

    public void desenhar(Integer ladoA, Integer ladoB) {
        System.out.println("Desenhando um com a área" + ladoA * ladoB);
    }
}
