public class Main {

    public static void main(String[] args) {
        Camel camel = new Camel();
        Horse horse = new Horse();
        Tiger tiger = new Tiger();
        Dolphin dolphin = new Dolphin();
        Eagle eagle = new Eagle();

        camel.eat();
        horse.move();
        tiger.type();
        dolphin.eat();
        eagle.type();
    }

}