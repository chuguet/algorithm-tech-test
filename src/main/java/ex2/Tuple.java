package ex2;

import java.util.Objects;

public class Tuple {

    private int num1;
    private int num2;

    public Tuple(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple tuple = (Tuple) o;
        return num1 == tuple.num1 &&
                num2 == tuple.num2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num1, num2);
    }

    @Override
    public String toString() {
        return "(" + this.num1 + ", " + this.num2 + ")";
    }

}
