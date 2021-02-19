public class CalculaBhaskara {

    private double a;
    private double b;
    private double c;

    public double bhaskaraX1() {
        return (-(getB()) + Math.sqrt(delta())) / 2 * getA();
    }

    public double bhaskaraX2() {
        return (-(getB()) - Math.sqrt(delta())) / 2 * getA();
    }

    public double delta() {
        return (b * b) + (- 4 * (a * c));
    }

    public double getA() {
        return a;
    }

    public void setA(double r) {
        a = r;
    }

    public double getB() {
        return b;
    }

    public void setB(double r) {
        b = r;
    }

    public double getC() {
        return c;
    }

    public void setC(double r) {
        c = r;
    }
    
}
