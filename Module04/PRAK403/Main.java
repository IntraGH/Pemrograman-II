package Module04.PRAK403;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int choice = input.nextInt();
        input.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String name = input.nextLine();

        System.out.print("Ras: ");
        String race = input.nextLine();

        if (choice == 1) {
            System.out.print("Warna Bulu: ");
            String furColor = input.nextLine();

            Cat cat = new Cat(name, race, furColor);

            System.out.println();
            cat.displayCatDetails();
        } else {
            System.out.print("Warna Bulu: ");
            String furColor = input.nextLine();

            System.out.print("Kemampuan : ");
            String[] abilities = input.nextLine().split(",");

            Dog dog = new Dog(name, race, furColor, abilities);

            System.out.println();
            dog.displayDogDetails();
        }
    }
}