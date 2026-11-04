package Module04.PRAK402;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String name = input.nextLine();

        System.out.print("Ras: ");
        String race = input.nextLine();

        System.out.println();

        Pet pet = new Pet(name, race);
        pet.display();
    }
}