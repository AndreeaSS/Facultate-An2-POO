public class Complex {


    private int real;
    private int imaginary;

    public Complex(int r, int i) {
        this.real = r;
        this.imaginary = i;
    }

    public Complex() {
        this(0, 0);
    }

    public Complex(Complex no) {
        this.real = no.real;
        this.imaginary = no.imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void addWithComplex(Complex no) {
        this.real += no.real;
        this.imaginary += no.imaginary;
    }

    public void showNumber() {
        System.out.println("Complex number is " + this.real + " + i" + this.imaginary);
    }
}
