package figuras;

public class Circunferencia {
	private double radio;
	private String color;

	public Circunferencia(double radio) {
		this.setRadio(radio);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void imprimir() {
		color = "rojo";
		System.out.println("Diametro: " + (2 * getRadio()));
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * getRadio() * getRadio();
		System.out.println(area);
	}

	public boolean esIgual(Circunferencia otro, boolean considerarDecimales) {
		double radio1 = this.getRadio();
		double radio2 = otro.getRadio();
		if (considerarDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
