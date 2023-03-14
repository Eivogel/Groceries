// Build a grocery cupboard that allows users to add groceries and there amounts to a grocery cupboard.
// Each grocery must inherit a class of type Grocery.
// you get to decided how groceries are added and to which groceries can be added.
//
// Next you need to build a recipe book that has a minimum grocery’s required list
// as well as a method to follow to prepare the recipe.
// All of your recipes need to inherit an abstract class called Recipe.
// You get to decide what happens if there is not enough of a particular grocery to complete the recipe

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // groceries
        Grocery bread = new Grocery("Bread", 12);
        Grocery eggs = new Grocery("Eggs", 5);
        Grocery ham = new Grocery("Ham", 4);
        Grocery cheese = new Grocery("Cheese", 1);
        Grocery lettuce = new Grocery("Lettuce", 0);
        Grocery mayo = new Grocery("Mayo", 1);

        lettuce.addQuantity(1);
        bread.removeQuantity(2);
        cheese.addQuantity(2);

        // recipes
        Toast toast;
        toast = new Toast();

        Sandwich sandwich;
        sandwich = new Sandwich();

        Omelet omelet;
        omelet = new Omelet();

        // using recipes through Scanner
        Scanner in = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("Type recipe you want to make (Toast, Sandwich or Omelet), or type exit to exit: ");
            String myChosenRecipe = in.nextLine();
            if (myChosenRecipe.equalsIgnoreCase("exit")) {
                loop = false;
            } else if (myChosenRecipe.equalsIgnoreCase("toast")) {
                System.out.println(toast.toString());
                if (bread.getQuantity() < toast.getSlicesBreadNeeded()) {
                    System.out.println("You don't have enough slices of bread to make " + toast.getRecipeName() + ", please get more");
                } else {
                    bread.setQuantity(bread.getQuantity() - toast.getSlicesBreadNeeded());
                    System.out.println("You have " + bread.getQuantity() + " slices of bread remaining\n");
                }
            } else if (myChosenRecipe.equalsIgnoreCase("omelet")) {
                System.out.println(omelet.toString());
                if (eggs.getQuantity() < omelet.getEggsNeeded()) {
                    System.out.println("You don't have enough eggs to make an " + omelet.getRecipeName() + ", please get more");
                } else {
                    eggs.setQuantity(eggs.getQuantity() - omelet.getEggsNeeded());
                    System.out.println("You have " + eggs.getQuantity() + " eggs remaining\n");
                }
            } else if (myChosenRecipe.equalsIgnoreCase("sandwich")) {
                System.out.println(sandwich.toString());
                if (bread.getQuantity() < sandwich.getSlicesBreadNeeded()) {
                    System.out.println("You don't have enough slices of bread to make a " + sandwich.getRecipeName() + ", please get more");
                } else if (ham.getQuantity() < sandwich.getHamNeeded()) {
                    System.out.println("You don't have enough slices of ham to make a " + sandwich.getRecipeName() + ", please get more");
                } else if (cheese.getQuantity() < sandwich.getCheeseNeeded()) {
                    System.out.println("You don't have enough slices of cheese to make a " + sandwich.getRecipeName() + ", please get more");
                } else if (lettuce.getQuantity() < sandwich.getLettuceNeeded()) {
                    System.out.println("You don't have enough lettuce to make a " + sandwich.getRecipeName() + ", please get more");
                } else if (mayo.getQuantity() < sandwich.getMayoNeeded()) {
                    System.out.println("You don't have enough mayo to make a " + sandwich.getRecipeName() + ", please get more");
                } else {
                    bread.setQuantity(bread.getQuantity() - sandwich.getSlicesBreadNeeded());
                    System.out.println("You have " + bread.getQuantity() + " slices of bread remaining");
                    ham.setQuantity(ham.getQuantity() - sandwich.getHamNeeded());
                    System.out.println("You have " + ham.getQuantity() + " slices of ham remaining");
                    cheese.setQuantity(cheese.getQuantity() - sandwich.getCheeseNeeded());
                    System.out.println("You have " + cheese.getQuantity() + " slices of cheese remaining");
                    lettuce.setQuantity(lettuce.getQuantity() - sandwich.getLettuceNeeded());
                    System.out.println("You have " + lettuce.getQuantity() + " crop of lettuce remaining");
                    mayo.setQuantity(mayo.getQuantity() - sandwich.getMayoNeeded());
                    System.out.println("You have " + mayo.getQuantity() + " jar of mayo remaining\n");
                }
            } else {
                System.out.println("I do not know how to make " + myChosenRecipe);
            }
        }
    }
}