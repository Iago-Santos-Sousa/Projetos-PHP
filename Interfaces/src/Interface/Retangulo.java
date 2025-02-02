package Interface;

public class Retangulo implements AreaCalculavel {
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Retangulo(double c, double d) {
        base = c;
        altura = d;
    }

    @Override
    public double calculaArea() {
        return this.getAltura() * this.getBase();
    }
}
