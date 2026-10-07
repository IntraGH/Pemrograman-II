package Module02.PRAK201;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Fruit apple = new Fruit("Apel", 7000.0, 0.4, 40.0);
        Fruit mango = new Fruit("Mangga", 3500.0, 0.2, 15.0);
        Fruit avocado = new Fruit("Alpukat", 10000.0, 0.25, 12.0);

        apple.printInfo();
        mango.printInfo();
        avocado.printInfo();
    }
}