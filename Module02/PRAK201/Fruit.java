package Module02.PRAK201;

public class Fruit {
    private String fruitName;
    private double price;
    private double weight;
    private double purchaseTotal;

    private double pricePerKg;

    public Fruit(String fruitName, double price, double weight, double purchaseTotal) {
        this.fruitName = fruitName;
        this.price = price;
        this.weight = weight;
        this.purchaseTotal = purchaseTotal;

        this.pricePerKg = this.price / this.weight;
    }

    public void printInfo() {
        System.out.println("Nama Buah: " + fruitName);
        System.out.println("Berat: " + weight);
        System.out.println("Harga: " + price);
        System.out.println("Jumlah Beli: " + purchaseTotal + "kg");
        System.out.println("Harga Sebelum Diskon: Rp" + getPreDiscountPrice());
        System.out.println("Total Diskon: Rp" + getDiscountTotal());
        System.out.println("Harga Setelah Diskon: Rp" + getPostDiscountPrice());
        System.out.println();
    }

    public double getPreDiscountPrice() {
        return this.purchaseTotal * this.pricePerKg;
    }

    public double getDiscountTotal() {
        int discountThresholdKg = 4;
        double discountPercentage = 0.02;

        int discountBatches = (int)(this.purchaseTotal / discountThresholdKg);
        return discountBatches * (this.pricePerKg * discountThresholdKg) * discountPercentage;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}