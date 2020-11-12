public class Poly {

    // OVERVIEW: Polys are immutable: state do not change
    // polynomials with integer coefficients
    // Typical: c0 + c1x + …
    int x;
    int y;


    // constructors
    public Poly(){
        // EFFECTS: initializes this to be zero polynomial
    }

    public Poly(int c, int n) throws NegativeExponentException {
        // EFFECTS: if n < 0 throws NegativeExponentException
        // else initializes this to be the Poly cxn
        this.x = c;
        this.y = n;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // methods
    public int degree (){
        // EFFECTS: Returns the degree of this, i.e., the largest exponent with a
        // non-zero cofficient. Returns 0 if this is the zero Poly.

    }

    public int coeff (int d){
        // EFFECTS: Returns the coefficient of the term of
        // this whose exponent is d
    }

    public Poly add(Poly q) throws NullPointerException {
        // EFFECTS: if q is null throws NPE else returns
        // the Poly this + q

    }

    public Poly mul(Poly q) throws NullPointerException {
        // EFFECTS: if q is null throws NPE else returns
        // the Poly this * q
    }


    public Poly sub(Poly q) throws NullPointerException {
        // EFFECTS: if q is null throws NPE else returns
        // the Poly this – q

    }

    public Poly minus(Poly q){
        // EFFECTS: Returs the Poly – this

    }


    @Override
    public String toString() {
        return "Poly{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
