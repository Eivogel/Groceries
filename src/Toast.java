public class Toast extends Recipe{
    private double slicesBreadNeeded;

    public Toast(){
        super("Toast");
        slicesBreadNeeded = 2;
    }

    @Override
    public String toString(){
        return super.toString() + ": ingredients needed are:\n"
                + slicesBreadNeeded + " slices of bread.\n" +
                "To make toast, take 2 slices of bread and put them in a toaster.\n" +
                "Now wait till the toaster is finished.\n" +
                "Enjoy a sad meal\n";
    }

    public double getSlicesBreadNeeded() {
        return slicesBreadNeeded;
    }

}
