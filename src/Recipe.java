// why do I use an abstract class here...
// Answer: you shouldn't be able to initiate Recipe from here
// at least at this moment. Maybe in the future to create your own recipes

public abstract class Recipe {
    private String recipeName;

    public Recipe(String recipeName){

        this.recipeName = recipeName;
    }
    public String toString(){

        return this.recipeName;
    }

    public String getRecipeName() {
        return recipeName;
    }

}
