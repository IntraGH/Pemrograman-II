package Module04.PRAK403;

public class Cat extends Pet {
    private String furColor;

    public Cat(String name, String race, String furColor) {
        super(name, race);
        this.furColor = furColor;
    }

    public void displayCatDetails() {
        super.display();
        System.out.println("Memiliki warna bulu : " + furColor);
    }
}