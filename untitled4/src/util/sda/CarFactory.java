package util.sda;

public class CarFactory {

    public static Masina getMasina(String CarStr) {
        if (CarStr.equalsIgnoreCase("dacia")) {
            return new Dacia();

        } else if (CarStr.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else if (CarStr.equalsIgnoreCase("X1")) {
            return new X1();
        } else if (CarStr.equalsIgnoreCase("X2")) {
            return new X2();
        } else if (CarStr.equalsIgnoreCase("X3")) {
            return new X3();
        }
        return null; // mergea cu else, dar pt ca nu a fost cazurile de mai sus se poate pune direct return null
    }

}