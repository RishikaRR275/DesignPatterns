package observerDP;

public class GpaObserver extends Observer {
    private Marks marks;
    GpaObserver(Marks marks){
        this.marks = marks;
        this.marks.attach(this);
    }
    @Override
    public void update(){
        double gpa = this.marks.getState()/10.0;
        System.out.println("Gpa = "+gpa);

    }
}
