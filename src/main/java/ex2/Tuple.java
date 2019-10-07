package ex2;

public class Tuple {

    private int num1;
    private int num2;

    public Tuple (int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "(" + this.num1 + ", " + this.num2 + ")";
    }

}
