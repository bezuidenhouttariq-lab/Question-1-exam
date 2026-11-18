package mattresssales;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {
                "Cozy Nights Monarch mattress",
                "Restonic Barbados mattress",
                "Sealy Phuket mattress"
        };
        int months = 3;
        int[][] sales = new int[names.length][months];

        for (int p = 0; p < names.length; p++) {
            for (int m = 0; m < months; m++) {
                System.out.print("Enter number of sales for month " + (m + 1) + " for " + names[p] + ": ");
                sales[p][m] = input.nextInt();
            }
            System.out.println();
        }

        Product product = new Product(names, sales);
        PrintProduct printer = new PrintProduct(product);

        printer.printHeader();
        printer.printTotalProductSales();
        printer.printAverageProductSales();
        printer.printMostPopularProduct();

        input.close();
    }
}