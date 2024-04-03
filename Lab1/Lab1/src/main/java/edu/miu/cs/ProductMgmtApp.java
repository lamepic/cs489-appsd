package edu.miu.cs;

import edu.miu.cs.module.Product;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;

public class ProductMgmtApp {
    public static void main(String[] args) throws IOException {
        Product[] products = {
                new Product(3128874119L, "Banana", LocalDate.of(2023,1,24), 124, 0.55),
                new Product(2927458265L, "Apple", LocalDate.of(2022,12, 9), 18, 1.09),
                new Product(9189927460L, "Carrot", LocalDate.of(2023,3,31), 89, 2.99)
        };
        Arrays.sort(products);
        printProducts(products);
    }

    public static void printProducts(Product[] products) throws IOException {
        System.out.println("Printed in JSON Format");
        System.out.println("[");
        for (Product product : products) {
            System.out.println(product + ", ");
        }
        System.out.println("]");

        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Printed in XML Format");
        System.out.println("<?xml version=1.0?>");
        System.out.println("<products>");
        for (Product product : products) {
            System.out.println(product.printXML());
        }
        System.out.println("</products>");
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Printed in CSV Format");
        for (Product product : products) {
            System.out.println(product.printCSV());
        }
    }
}
