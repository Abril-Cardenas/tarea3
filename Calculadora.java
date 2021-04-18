
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
private double A, B, C;
  private Punto p1;
  private Punto p2;
public Calculadora(double a,double b,double c){
this.A=a;
this.B=b;
this.C=c;
}
  Calculadora (double x,double y,double x1,double y1) {
    p1 = new Punto(x,y); 
    p2 = new Punto(x1,y1);
  }
public double getA(){
    return this.A;
}
public double getB(){
    return this.B;
}
public double getC(){
    return this.B;
}

public String  Ecuacion(Calculadora otro){
    double a, b, c, x1, x2,D;
    String Res="";
    a=otro.getA();
    b=otro.getB();
    c=otro.getC();
    D=Math.pow(b,2)-4*a*c;
    if(D<0){
        Res="La ecuacion no tiene soluciones reales";
    }else if(D==0){
        x1=-b/(2*a);
        Res="La solucion unica es x = "+x1;
    }else{
        x1=(-b-(Math.pow(D,0.5)))/(2*a);
        x2=(-b+(Math.pow(D,0.5)))/(2*a);
        Res="Las dos soluciones reales son: X1 = "+x1+" X2= "+x2;
    }
    return Res;
}

  public String EcuacionRecta() {
    if (p1.getY() == p2.getY())
      return "y = " + p1.getY();  //Recta paralela al eje x.

    if (p1.getX() == p2.getX())
      return "x = " + p1.getX();  //Recta paralela al eje y.

    double m = pendiente();
    double b = p1.getY() - p1.getX()*m;
    return (b >= 0) ? "y = "+ m +"x + "+b
                   : "y = "+ m +"x "+b;
  }
  
    public double pendiente() {
    double divisor = p2.getX() - p1.getX();
    return (divisor != 0) ? (p2.getY() - p1.getY())/divisor
	: Double.POSITIVE_INFINITY;            //Recta paralela al eje Y
  }

  public double CalculaCateto(){
      return Math.sqrt(Math.pow(B,2)-Math.pow(A,2));
 }
}
