public class Bicycle {
        public int cadence;
        public int speed;
        public int gear;

        public Bicycle(int startCadence, int startSpeed, int startGear) {
            gear = startGear;
            speed = startSpeed;
            cadence = startCadence;
        }

        public void setCadence(int newValue) {
            cadence = newValue;
        }

        public void applyBrake(int increment) {
            speed += increment;
        }

        public void speedUp(int increment) {
            speed += increment;
        }
 }


