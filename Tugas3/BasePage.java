package Pemrograman2Tugas.Tugas3;

import java.util.Scanner;

abstract class BasePage implements Page {
    private final String title;
    private final Scanner scanner;

    BasePage(String title, Scanner scanner) {
        this.title = title;
        this.scanner = scanner;
    }

    public String getTitle() {
        return title;
    }

    protected String ask(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}