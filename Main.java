import java.util.Scanner;

class Product {
    int productid;
    String name;
    double price;

    void getDetails(Scanner sc) {
        System.out.print("Enter Product ID: ");
        productid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        name = sc.nextLine();

        System.out.print("Enter Product Price: ");
        price = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("Product ID: " + productid);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }
}

// Child class
class ElectronicProduct extends Product {
    int warranty;

    void getWarranty(Scanner sc) {
        System.out.print("Enter Warranty (in years): ");
        warranty = sc.nextInt();
    }

    void displayWarranty() {
        System.out.println("Warranty: " + warranty + " years");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ElectronicProduct ep = new ElectronicProduct();

        ep.getDetails(sc);
        ep.getWarranty(sc);

        System.out.println("\n--- Product Details ---");
        ep.displayDetails();
        ep.displayWarranty();

        sc.close();
    }
}