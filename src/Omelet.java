public class Omelet extends Recipe{
    private double eggsNeeded;

    public Omelet(){
        super("Omelet");
        eggsNeeded = 3;
    }

    @Override
    public String toString(){
        return super.toString() + ": ingredients needed are:\n"
                + eggsNeeded + " eggs\n" +
                "To make an omelet, first you will have to break some eggs.\n";
    }

    public double getEggsNeeded() {
        return eggsNeeded;
    }

}
