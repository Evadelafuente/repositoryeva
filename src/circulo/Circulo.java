package circulo;
/*
 * Clase code> Circulo para pruebas en NetBeans 
 * Primer comentario
 */
public class Circulo {
	/**
	 * valor de x
	 */
    private int x;
    private int y;
    private double radio;

    /*
     * Constructor para la clase Circulo que asigna los valores de las
     * coordenadas x, y y el valor del radio
     */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    
    /**
     * 
     * @param valorX valor de variable x
     */
    
    public void establecerX(int valorX) {
        x=valorX;
    }

    public int obtenerX() {
        return x;
    }
    
    /**
     * 
     * @param valorY
     * @deprecated esta funcion deberia de no emplearse en nuevos proyectos
     */

    public void establecerY(int valorY) {
        y=valorY;
    }

    public int obtenerY() {
        return y;
    }
    /**
     * 
     * @param valorRadio esta e a valor da radio
     */
    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    public double obtenerRadio() {
        return radio;
    }
    /**
     * 
     * @return non sei que poñer 
     */

    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * 
     * @return comentarios
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
   /**
    * Este e outro comentario
    */
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
