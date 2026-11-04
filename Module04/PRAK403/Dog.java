package Module04.PRAK403;

public class Dog extends Pet {
    private String furColor;
    private String[] abilities;

    public Dog(String name, String race, String furColor, String[] abilities) {
        super(name, race);
        this.furColor = furColor;
        this.abilities = abilities;
    }

    public void displayDogDetails() {
        super.display();
        System.out.println("Memiliki warna bulu : " + furColor);
        System.out.print("Memiliki kemampuan :");
        for (String ability : abilities) {
            System.out.print(" " + ability.trim());
        }
        System.out.println();
    }
}