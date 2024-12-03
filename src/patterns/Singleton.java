package patterns;

public class Singleton {
    private static Singleton instance;
    public Integer value = 1;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Singleton instance!");
    }
}
