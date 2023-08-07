/**
 * Program to find the item which has least discount
 * @author Abhishek Mateti
 * @Since 31th July 2023
 */
package com.techzenure.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item {
    String name;
    int price;
    int discount;

    public Item(String name, int price, int discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public int calculateDiscountAmount() {
        return (price * discount) / 100;
    }
}

public class LeastOffer {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int itemCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<Item> items = new ArrayList<>();

        for (int i = 0; i < itemCount; i++) {
            System.out.print("Enter item details (name, price, discount percentage): ");
            String input = scanner.nextLine();
            String[] itemDetails = input.split(",");

            if (itemDetails.length != 3) {
                System.out.println("Invalid input format. Please try again.");
                return;
            }

            String name = itemDetails[0].trim();
            int price = Integer.parseInt(itemDetails[1].trim());
            int discount = Integer.parseInt(itemDetails[2].trim());

            items.add(new Item(name, price, discount));
        }

        List<Item> itemsWithMinDiscount = getItemsWithMinDiscount(items);
        System.out.print("Items with Minimum Discount:");
        for (Item item : itemsWithMinDiscount) {
            System.out.print(item.name + "	");
        }
    }

    public static List<Item> getItemsWithMinDiscount(List<Item> items) {
        List<Item> minDiscountItems = new ArrayList<>();
        int minDiscountAmount = Integer.MAX_VALUE;

        for (Item item : items)
        {
            int discountAmount = item.calculateDiscountAmount();
            if (discountAmount < minDiscountAmount)
            {
                minDiscountItems.clear();
                minDiscountItems.add(item);
                minDiscountAmount = discountAmount;
            } else if (discountAmount == minDiscountAmount)
            {
                minDiscountItems.add(item);
            }
        }

        return minDiscountItems;
    }
}