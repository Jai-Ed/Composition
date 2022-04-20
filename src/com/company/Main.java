package com.company;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        products.add("Red Hot Doritos");
        products.add("Cool Ranch Doritos");
        products.add("Coke");
        products.add("Diet Coke");
        products.add("Pepsi");
        products.add("5 Hour Energy");
        products.add("Sunflower Seeds");
        products.add("Peanuts");
        products.add("Mac Charger");
        products.add("Dell Charger");
        prices.add(2.99);
        prices.add(2.99);
        prices.add(0.99);
        prices.add(0.99);
        prices.add(0.99);
        prices.add(3.99);
        prices.add(0.99);
        prices.add(120.00);
        prices.add(50.00);

        ArrayList<String> purchases = new ArrayList<>();

        int input = 0;
        while (input != 10)
        {
        System.out.println("What are you buying?: 0.Red Hot Doritos, 1.Cool Ranch Doritos, 2.Coke, 3.Diet Coke, 4.Pepsi, 5.5 Hour Energy, 6. Sunflower Seeds, 7.Peanuts, 8. Mac Charger, 9.Dell Charger, 10. Finish");
        Scanner keyboard = new Scanner(System.in);
        input = keyboard.nextInt();
        if(input >= 0 && (input < 10)) {
            purchases.add (products.get(input));}
        double totalcost = 0.0;
        for (int i = 0; i < products.size()-9; i++)
            {
            int x = 0;
            do {
                if (purchases.get(i). equals(products.get(x)) )
                {
                    totalcost = totalcost + prices.get(x);
                } x++;
            } while (x < products.size());
        } System.out.println("Your total is : "+ "$" + totalcost);
            System.out.println(purchases);

        }
    }}


