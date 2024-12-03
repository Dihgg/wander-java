package abstractClassExample;

public abstract class Automovel implements Motor {

    public abstract void mover(Integer metros);

    protected void ligar() {
        System.out.println("O Automóvel liga!");
    }

    @Override
    public void freiar() {
        System.out.println("O automóvel freia");
    }
}
