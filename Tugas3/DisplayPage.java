package Pemrograman2Tugas.Tugas3;

import java.util.List;
import java.util.Scanner;

class DisplayPage extends BasePage {
    private final TextStore store;

    DisplayPage(Scanner scanner, TextStore store) {
        super("Output Text", scanner);
        this.store = store;
    }

    public void show() {
        List<String> texts = store.getAll();
        if (texts.isEmpty()) {
            System.out.println("Nothing...");
        } else {
            System.out.println("Entered texts:");
            for (int i = 0; i < texts.size(); i++) {
                System.out.println((i + 1) + ". " + texts.get(i));
            }
        }
    }
}