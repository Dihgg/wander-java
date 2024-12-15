/*  S - SINGLE RESPONSIBILITY PRINCIPLE

    A class should have only one reason to change.
    This means a class should only perform one specific task or responsibility.

    class Report {
        public String generateReport() {
            return "Report";
        }
        public void printReport() {
            System.out.println("Printing report");
        }
    }

    class ReportGenerator {
        public String generateReport() {
            return "Report";
        }
    }

    class ReportPrinter {
        public void printReport() {
            System.out.println("Printing report");
        }
    }

 */

/* O - OPEN/CLOSED PRINCIPLE
        A class should be open for extension but closed for modification.
        You should be able to extend a class's behavior without altering its existing code.
    // BAD EXAMPLE
    class Circle {
        public double radius;
    }
    class Rectangle {
        public double length;
        public double width;
    }
    class AreaCalculator {
        public double calculateArea(Object shape) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                return Math.PI * circle.radius * circle.radius;
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                return rectangle.length * rectangle.width;
            }
            return 0;
        }
    }

    // GOOD EXAMPLE
    interface Shape {
        double calculateArea();
    }

    class Circle implements Shape {
        double radius;
        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * (radius * radius);
        }
    }

    class Rectangle implements Shape {
        double length;
        double width;
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double calculateArea() {
            return length * width;
        }
    }

    class Trapezoid implements Shape {
        double base1;
        double base2;
        double height;
        public Trapezoid(double base1, double base2, double height) {
            this.base1 = base1;
            this.base2 = base2;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return ((base1 + base2) / 2) * height;
        }
    }

    class AreaCalculator {
        public double calculateArea(Shape shape) {
            return shape.calculateArea();
        }
    }

*/

/*
    L - LISKOV SUBSTITUTION PRINCIPLE
        Objects of a superclass should be replaceable with objects of its subclasses without affecting the functionality of the program.

    // BAD EXAMPLE
    class Bird {
        public void fly() {
            System.out.println("The bird is flying");
        }
    }

    class Penguin extends Bird {
        @Override
        public void fly() {
            throw new UnsupportedOperationException("Penguin can't fly");
        }
    }

    // GOOD Example
    interface Bird {
        public void eat();
    }
    interface FlyingBird extends Bird {
        void fly();
    }

    class Eagle implements FlyingBird {
        @Override
        public void fly() {
            System.out.println("The bird is flying");
        }

        @Override
        public void eat() {
            System.out.println("The bird is eating");
        }
    }

    class Penguin implements Bird {

        @Override
        public void eat() {
            System.out.println("The bird is eating");
        }
    }
 */

/* I - INTERFACE SEGREGATION PRINCIPLE

    // BAD Example
    interface Worker {
        void work();
        void eat();
    }

    class Robot implements Worker {

        @Override
        public void work() {
            System.out.println("Robot working.");
        }

        @Override
        public void eat() {
            throw new UnsupportedOperationException("Robots don't eat!");
        }
    }

    // GOOD Example
    interface Workable {
        void work();
    }

    interface Eatable {
        void eat();
    }


    class HumanWorker implements Workable, Eatable {

        @Override
        public void eat() {
            System.out.println("Human is working!");
        }

        @Override
        public void work() {
            System.out.println("Human is eating");
        }
    }

    class RobotWorker implements Workable {

        @Override
        public void work() {
            System.out.println("Robot is working!");
        }
    }

 */

/*
    D - DEPENDENCY INVERSION PRINCIPLE
    High-level modules should not depend on low-level modules; both should depend on abstractions.

    // BAD EXAMPLE
    class Keyboard {
        public void input() {
            System.out.println("Keyboard input");
        }
    }

    class Computer {
        private Keyboard keyboard;
        public Computer() {
            this.keyboard = new Keyboard();
        }
        public void useKeyboard() {
            keyboard.input();
        }
    }

    // GOOD Example

    interface InputDevice {
        void input();
    }

    class Keyboard implements InputDevice {

        @Override
        public void input() {
            System.out.println("Keyboard input");
        }
    }

    class Mouse implements InputDevice {

        @Override
        public void input() {
            System.out.println("Mouse input");
        }
    }

    class Computer {
        private InputDevice inputDevice;
        public Computer(InputDevice inputDevice) {
            this.inputDevice = inputDevice;
        }
        public void useInputDevice() {
            this.inputDevice.input();
        }
    }
    public static void main(String[] args) {
        InputDevice keyboard = new Keyboard();
        InputDevice mouse = new Mouse();
        Computer computer = new Computer(mouse);
        computer.useInputDevice();
    }
 */



public class Main {
    public static void main(String[] args) {
        /*
            S - SINGLE RESPONSIBILITY PRINCIPLE
            O - OPEN/CLOSED PRINCIPLE
            L - LISKOV SUBSTITUTION PRINCIPLE
            I - INTERFACE SEGREGATION PRINCIPLE
            D - DEPENDENCY INVERSION PRINCIPLE
        */
    }
}
