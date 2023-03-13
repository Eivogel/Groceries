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
