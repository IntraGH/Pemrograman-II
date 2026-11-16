package Pemrograman2Tugas.Tugas3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new App().run();
    }
}

interface Page {
    String getTitle();
    void show();
}

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

class TextStore {
    private final List<String> texts = new ArrayList<>();

    void add(String text) {
        texts.add(text);
    }

    List<String> getAll() {
        return new ArrayList<>(texts);
    }
}

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

class Menu {
    private final List<Page> pages = new ArrayList<>();
    private final Scanner scanner;

    Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    void add(Page page) {
        pages.add(page);
    }

    Page get(int index) {
        return pages.get(index);
    }

    int choose() {
        while (true) {
            System.out.println("\n--- MAIN MENU ---");
            for (int i = 0; i < pages.size(); i++) {
                System.out.println((i + 1) + ". " + pages.get(i).getTitle());
            }
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            try {
                int n = Integer.parseInt(scanner.nextLine().trim());
                if (n >= 0 && n <= pages.size()) {
                    return n;
                }
            } catch (NumberFormatException e) {
                // fall through to the error message
            }
            System.out.println("Invalid");
        }
    }
}

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