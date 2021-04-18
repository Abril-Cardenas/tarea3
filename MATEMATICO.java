
/**
 * Write a description of class MATEMATICO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MATEMATICO
{
    public String MayorMenorMedio(int PrimerN,int SegundoN,int TercerN){
        String Cadena="";
        int Mayor,Menor;
        if (PrimerN>SegundoN&&PrimerN>TercerN){
            Cadena="Mayor("+PrimerN+") ";
            Mayor=1;
        }else{
            if(SegundoN>PrimerN&&SegundoN>TercerN){
                Cadena="Mayor("+SegundoN+") ";
                Mayor=2;
            }else{
                if(TercerN>PrimerN&&TercerN>SegundoN){
                    Cadena="Mayor("+TercerN+") ";
                    Mayor=3;
                }else{
                    Mayor=4;
                }
            }
        }
        
        if (PrimerN<SegundoN&&PrimerN<TercerN){
            Cadena+="Menor("+PrimerN+") ";
            Menor=1; 
        }else{
            if(SegundoN<PrimerN&&SegundoN<TercerN){
                 Cadena+="Menor("+SegundoN+") ";
                 Menor=2;
            }else{
                if(TercerN<PrimerN&&TercerN<SegundoN){
                        Cadena+="Menor("+TercerN+") ";
                        Menor=3;
                }else{
                        Menor=4;
                }
            }
        }
        
        if(Mayor!=1&&Mayor!=2){
            Cadena+="Medio("+TercerN+") ";
        }else{
            if(Mayor!=2&&Mayor!=1){
                Cadena+="Medio("+SegundoN+") ";
            }else{
                if(Mayor!=1&&Mayor!=3){
                    Cadena+="Medio("+PrimerN+") ";
                }else{
                    Cadena+="Medio("+PrimerN+") ";
                }
            }
        }
        
      return Cadena;  
    }
    //solo pido Base o Altura ya que es un cuado mide igual la altura como la base
    public double CalculaAreaCuadrado(int BaseoActura){
        return Math.pow(BaseoActura,2);
    }
    
    public double calcularDistanciaDesde(double x1,double x2,double y1,double y2) {
        Punto p1 = new Punto(x1,x2);
        Punto p2 = new Punto(y1,y2);
        double distancia = p1.calcularDistanciaDesde(p2);
        return distancia;
    }
    
    public String IndicaCuadrante(double x1,double x2) {
        Punto p1 = new Punto(x1,x2);
        String distancia = p1.IndicaCuadrante();
        return distancia;
    }
    
    public String EcuacionSegundoGrado(double a,double b,double c){
        Calculadora Cal = new Calculadora(a,b,c);
        return Cal.Ecuacion(Cal);
    }
    
    public String EcuacionRecta(double x,double y,double x1,double y1){
        Calculadora Cal=new Calculadora(x,y,x1,y1);
        return Cal.EcuacionRecta();
    }
    
        public String CatetoFaltante(double Cateto,double hipotenusa){
        Calculadora Cal = new Calculadora(Cateto,hipotenusa,0);
        return "Cateto Faltante = ("+Cal.CalculaCateto()+")";
    }
}
