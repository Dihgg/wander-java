package patterns;

class X {
    Singleton singleton;
    public X() {
        singleton = Singleton.getInstance();
    }
    public void doSomething () {
        singleton.value++;
        System.out.println("O valor de x é:" + singleton.value);
    }
}

class Y {
    Singleton singleton;
    public Y() {
        singleton = Singleton.getInstance();
    }
    public void doSomething () {
        singleton.value++;
        System.out.println("O valor de x é:" + singleton.value);
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        System.out.println("Singleton Pattern");
        Singleton singleton = Singleton.getInstance();

        new X().doSomething();
        new Y().doSomething();

        singleton.value++;
        System.out.println("O valor de x é:" + singleton.value);
    }
}
