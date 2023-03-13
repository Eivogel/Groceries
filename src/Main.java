import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // groceries

        Groceries bread = new Groceries("Bread", 12);
        Groceries eggs = new Groceries("Eggs", 5);
        Groceries ham = new Groceries("Ham", 4);
        Groceries cheese = new Groceries("Cheese", 1);
        Groceries lettuce = new Groceries("Lettuce", 0);
        Groceries mayo = new Groceries("Mayo", 1);

        // recipes
        Toast toast;
        toast = new Toast();

        Sandwich sandwich;
        sandwich = new Sandwich();

        Omelet omelet;
        omelet = new Omelet();

        // using recipes
        lettuce.addQuantity(1);
        cheese.addQuantity(4);

        //TODO trying to get scanner to work, but stuck on matching input String to recipeName
        // Ran out of time. Heard tip to use '.equals' or something to match String input

//        System.out.println(toast.getRecipeName());

//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Enter recipe (Toast, Sandwich or Omelet)");
//        // String input
//        String recipe = myObj.nextLine();
//        // Numerical input
////        double quantity = myObj.nextDouble();
//
//        // Output input by user
//        System.out.println("Recipe chosen = " + recipe);
////        System.out.println("Quantity entered = " + quantity);
//
//        if (recipe == toast.getRecipeName() ) {

            if (bread.getQuantity() < toast.getSlicesBreadNeeded()) {
                System.out.println("You don't have enough slices of bread to make " + toast.getRecipeName() + ", please get more");
            } else {
                System.out.println(toast.toString());
                bread.setQuantity(bread.getQuantity() - toast.getSlicesBreadNeeded());
                System.out.println("You have " + bread.getQuantity() + " slices of bread remaining\n");
            }


        if (eggs.getQuantity() < omelet.getEggsNeeded()){
            System.out.println("You don't have enough eggs to make an " + omelet.getRecipeName() + ", please get more");
        } else {
            System.out.println(omelet.toString());
            eggs.setQuantity(eggs.getQuantity() - omelet.getEggsNeeded());
            System.out.println("You have " + eggs.getQuantity() + " eggs remaining\n");
        }

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
            System.out.println(sandwich.toString());
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



    }
}
// Build a grocery cupboard that allows users to add groceries and there amounts to a grocery cupboard.
// Each grocery must inherit a class of type Grocery.
// you get to decided how groceries are added and to which groceries can be added.
//
// Next you need to build a recipe book that has a minimum grocery’s required list
// as well as a method to follow to prepare the recipe.
// All of your recipes need to inherit an abstract class called Recipe.
// You get to decide what happens if there is not enough of a particular grocery to complete the recipe