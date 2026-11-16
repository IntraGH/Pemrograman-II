package Pemrograman2Tugas.Tugas3;

import java.util.Scanner;

class InputPage extends BasePage {
    private final TextStore store;

    InputPage(Scanner scanner, TextStore store) {
        super("Input Text", scanner);
        this.store = store;
    }

    public void show() {
        store.add(ask("Text: "));
        System.out.println("Text saved");
    }
}