package Extends;

public class Cachorro extends Animal {
    public Cachorro() {
        nome = "Bob cleiton";
    }

    public void latir() {
        System.out.println("Au! Au!");
    }

    @Override
    public String getNome() {
        System.out.println("XPTO!!!!");
        return super.getNome();
    }
}
