package Generic;

public class Generic {

        public static void main(String[] args) {
            Retangulo<String> retangulo = new Retangulo<>("Retângulo");
            retangulo.print();
            Retangulo<Integer> retangulo2 = new Retangulo<>(10);
            retangulo2.print();
        }
}
