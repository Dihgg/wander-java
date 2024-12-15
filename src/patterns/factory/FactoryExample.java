package patterns.factory;

interface Delivery {
    void deliver();
}

interface RoadDelivery extends Delivery {
    void runInRoad();
}

class Truck implements RoadDelivery {

    @Override
    public void deliver() {
        System.out.println("O caminhão entrega!");
    }

    @Override
    public void runInRoad() {
        System.out.println("O caminhão anda pela terra!");
    }
}

class Train implements RoadDelivery {

    @Override
    public void deliver() {
        System.out.println("O Trem entrega!");
    }

    @Override
    public void runInRoad() {
        System.out.println("O Trem anda na terra!");
    }
}

class Ship implements Delivery {

    @Override
    public void deliver() {
        System.out.println("O navio entrega!");
    }
}

class DeliveryFactory {
    public static Delivery createDelivery(String type) {
        if (type.equalsIgnoreCase("TRUCK")) {
            return new Truck();
        } else if (type.equalsIgnoreCase("SHIP")) {
            return new Ship();
        } else if (type.equalsIgnoreCase("TRAIN")) {
            return new Train();
        }
        throw new IllegalArgumentException("Método de entrega não reconhecido");
    }
}


public class FactoryExample {
    public static void main(String[] args) {
        Delivery truck = DeliveryFactory.createDelivery("TRUCK");
        truck.deliver();

        Delivery ship = DeliveryFactory.createDelivery("SHIP");
        ship.deliver();

        Delivery train = DeliveryFactory.createDelivery("TRAIN");
        train.deliver();

        Delivery unknown = DeliveryFactory.createDelivery("PLANE");
        unknown.deliver();
    }
}
