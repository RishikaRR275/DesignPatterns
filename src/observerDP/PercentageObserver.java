package observerDP;

public class PercentageObserver extends Observer {
    private Marks marks;
    PercentageObserver(Marks marks){
        this.marks = marks;
        this.marks.attach(this);
    }
    @Override
    public void update(){
        int percentage= marks.getState();
        System.out.println("Percentage = " +percentage +"%");

    }
}
