
/**
 * Write a description of class Punto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto {
    
    private double x;
    private double y;
    
    public Punto(double x, double y) {
    this.x=x;
    this.y=y;
    }
    
    public double getX() {
    return x;
    }
    public double getY() {
    return y;
    }
    
    public void setX(double x1) {
    this.x=x;
    }
    public void setY(double y) {
    this.y=y;
    }
    
    public double calcularDistanciaDesde(Punto parametros) {
    double cateto1 = x - parametros.getX();
    double cateto2 = y - parametros.getY();
    double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
    return hipotenusa;
    }
    
    public String IndicaCuadrante(){
      String Res="";
      if(x > 0 && y > 0){
       Res="El punto (" + x + "," + y + ") esta en el primer cuadrante"; 
      }
      else 
       if(x < 0 && y > 0){
        Res="El punto (" + x + "," + y + ") esta en el segundo cuadrante"; 
       }
       else
        if(x < 0 && y < 0){
         Res="El punto (" + x + "," + y + ") esta en el tercer cuadrante"; 
        }
        else
         if(x > 0 && y < 0){
          Res="El punto (" + x + "," + y + ") esta en el cuarto cuadrante"; 
         }
        return Res;
    }
    
    public String toString(){
    return "(x= " + getX() + ", y= " + getY() + " )";
    }
}
