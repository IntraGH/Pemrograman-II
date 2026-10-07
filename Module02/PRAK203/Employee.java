package Module02.PRAK203;

public class Employee {
    public String name;
    //Di baris 7 muncul error karna tipe data 'char' cuma bisa nyimpan 1 karakter atau huruf aja.
    //public char origin;
    public String origin;
    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    //Di baris 21 Error karena gak ada parameter
    //public void setRole() {
    public void setRole(String r) {
        this.role = r;
    }
}
