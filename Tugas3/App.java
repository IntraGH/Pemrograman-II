package Pemrograman2Tugas.Tugas3;

import java.util.Scanner;

class App {
    private final Menu menu;

    App() {
        Scanner scanner = new Scanner(System.in);
        TextStore store = new TextStore();
        menu = new Menu(scanner);
        menu.add(new InputPage(scanner, store));
        menu.add(new DisplayPage(scanner, store));
    }

    void run() {
        int choice;
        while ((choice = menu.choose()) != 0) {
            menu.get(choice - 1).show();
        }
        System.out.println("Bye-bye");
    }
}