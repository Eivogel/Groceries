public class Sandwich extends Recipe{
    private double slicesBreadNeeded;
    private double hamNeeded;
    private double cheeseNeeded;
    private double lettuceNeeded;
    private double mayoNeeded;


    public Sandwich(){
        super("Sandwich");
        slicesBreadNeeded = 3;
        hamNeeded = 2;
        cheeseNeeded = 2;
        lettuceNeeded = 0.5;
        mayoNeeded = 0.5;
    }

    @Override
    public String toString(){
        return super.toString() + ": ingredients needed are:\n" +
                slicesBreadNeeded + " slices of bread\n" +
                hamNeeded + " slices of ham\n" +
                cheeseNeeded + " slices of cheese\n" +
                lettuceNeeded + " crop of lettuce\n" +
                mayoNeeded + " jar of mayo\n" +
                "To make a sandwich, use Google as I'm to lazy to type it out\n";
    }

    public double getSlicesBreadNeeded() {
        return slicesBreadNeeded;
    }

    public double getHamNeeded() {
        return hamNeeded;
    }

    public double getCheeseNeeded() {
        return cheeseNeeded;
    }

    public double getLettuceNeeded() {
        return lettuceNeeded;
    }

    public double getMayoNeeded() {
        return mayoNeeded;
    }

}