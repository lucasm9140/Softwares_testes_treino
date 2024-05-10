public class Main {
    public static void main(String[] args) {
        Dynamometer dyno = new Dynamometer();
        dyno.setSpeed(100); // Defina a velocidade para 50 km/h para fins de teste
        dyno.setThrottle(30); // Defina o acelerador para 30% para fins de teste
        dyno.setEngineLoad(70); // Defina a carga do motor para 70% para fins de teste

        double power = dyno.measurePower();
        double powerInWHP = power * 1.34102; // 1 kW = 1.34102 whp
        System.out.printf("Potência medida: %.2f WHP%n", powerInWHP);
    }
}

    class Dynamometer {
    private double speed;
    private double throttle;
    private double engineLoad;

    public Dynamometer() {
        speed = 0;
        throttle = 0;
        engineLoad = 0;
    }

    public void setThrottle(double throttle) {
        this.throttle = throttle;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setEngineLoad(double engineLoad) {
        this.engineLoad = engineLoad;
    }

    public double measurePower() {
        // Simulação da medição de potência com base na velocidade, aceleração e carga do motor
        double power = speed * throttle * engineLoad / 1000; // Potência em kW
        return power;
    }

    // Getters para acesso aos campos privados
    public double getSpeed() {
        return speed;
    }

    public double getThrottle() {
        return throttle;
    }

    public double getEngineLoad() {
        return engineLoad;
    }
}

