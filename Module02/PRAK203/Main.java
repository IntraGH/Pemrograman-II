package Module02.PRAK203;

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee();
        //Di baris 9 terjadi error karena kurangnya titik koma (;)
        //e.name = "Roi"
        e.name = "Roi";
        e.origin = "Kingdom of Orvel";
        e.setRole("Assasin");
        //Di baris 13 kode umur belum diisi
        e.age = 17;

        //Di baris 17 menyesuaikan dengan permintaan Output soal
        //System.out.println("Nama Pegawai: " + e.getName());
        System.out.println("Nama: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);
        //Di baris 22 output tabelnya ada kata "tahun" di belakang angka umur
        //System.out.println("Umur: " + e.age);
        System.out.println("Umur: " + e.age + " tahun");
    }
}
