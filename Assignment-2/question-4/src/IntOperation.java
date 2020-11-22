public class IntOperation extends Number {
    //Overview: A util Class for data type Int for its operation
    //mutable : value of Int change when any operation is called and default value x will be added

    private  Integer x;

    public IntOperation() {
    }

    @Override
    public int intValue() {
        return x;
    }

    @Override
    public long longValue() {
        return Long.valueOf(this.x);
    }

    @Override
    public float floatValue() {
        //EFFECTS : will not mutate x value, only return the float value of x
        return Float.valueOf(this.x);
    }

    @Override
    public double doubleValue() {
        //EFFECTS : will not mutate x value, only return the double value of x
        return Double.valueOf(this.x);
    }

    public Integer getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public  Integer add(int y) {
        //MODIFIES: will add value y into current x value
        //EFFECTS : will mutate the initial value of x
        return  this.x = this.x + y; }

    public  Integer substract(int y) {
        //MODIFIES: will substract value y into current x value
        //EFFECTS : will mutate the initial value of x
        return this.x = this.x - y;
    }

    public Integer multiply(int y) {
        //MODIFIES: will multiply value y into current x value
        //EFFECTS : will mutate the initial value of x
        return this.x = this.x * y;
    }

    @Override
    public String toString() {
        return "IntOperation{" +
                "x=" + x +
                '}';
    }
}
