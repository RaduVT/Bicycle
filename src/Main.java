public class Main {
        public static void main(String[] args) {

            Bicycle b = new Bicycle(10, 20, 30);

            MountainBike m = new MountainBike(1, 2, 300, 4);

            System.out.println("Value of speed of bicycle" + b.speed);
            b.speedUp(7);
            System.out.println("Value of speed increase" + b.speed);
            System.out.println("Value of speed of mountainBike " + m.speed);
            m.speedUp(7);
            System.out.println("Value of speed after increase " + m.speed);
        }
    }


