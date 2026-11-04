package Module04.PRAK403;

public class Pet {
    private String name;
    private String race;

    public Pet(String name, String race) {
        this.name= name;
        this.race= race;
    }

    public void display() {
        System.out.println("Detail hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah: " + name);
        System.out.println("Dengan ras: " + race);
    }
}