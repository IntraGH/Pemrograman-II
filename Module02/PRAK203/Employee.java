package Module02.PRAK203;

//Di baris 4 Nama class diubah dari "Pegawai" agar sesuai saat dipanggil
//public class Pegawai {
public class Employee {
    public String name;
    //Di baris 9 muncul error karna tipe data 'char' cuma bisa nyimpan 1 karakter atau huruf aja.
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

    //Di baris 23 Error karena gak ada parameter
    //public void setRole() {
    public void setRole(String r) {
        this.role = r;
    }
}
