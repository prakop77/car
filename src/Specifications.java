
public class Specifications {
    int power;
    int maxspeed;
    int traction;
    int brake;
    int volumeOfTheTank;
    int fuel;
    int consumption;

}

        public Specifications(int power, int maxspeed, int traction, int brake,int volumeOfTheTank, int fuel, int consumption ) {
            this.power = power;
            this.maxspeed = maxspeed;
            this.traction = traction;
            this.brake = brake;
            this.volumeOfTheTank = volumeOfTheTank;
            this.fuel = fuel;
            this.consumption = consumption;
        }

        public int getPower() {
            return power;
        }

        public int getSpeed() {
            return maxspeed;
        }

        public int getTraction() {
            return traction;
        }
    public int getBrake() {
        return brake;
    }

    public int getVolumeOfTheTank() {
        return volumeOfTheTank;
    }

    public int getFuel() {
        return fuel;
    }
    public int getConsumption() {
        return consumption;
    }
    }

