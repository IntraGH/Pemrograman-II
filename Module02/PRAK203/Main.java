package Module02.PRAK203;

public class Main {
    public static void main(String[] args) {

        Module02.PRAK203.Employee e = new Module02.PRAK203.Employee();
        e.name = "Roi";
        e.origin = "Kingdom of Orvel";
        e.setRole("Assasin");
        e.age = 17;

        System.out.println("Nama: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);
        System.out.println("Umur: " + e.age + " tahun");
    }
}
