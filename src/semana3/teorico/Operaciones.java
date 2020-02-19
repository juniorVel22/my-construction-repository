
package semana3.teorico;

public class Operaciones <T>{
    
    T a;
    T b;
    
    public Operaciones(T x, T y){
        this.a=x;
        this.b=y;
    }
    
    Double sumaD(){
        if(this.a instanceof Number && this.b instanceof Number){
            return Double.parseDouble(a.toString()) + Double.parseDouble(b.toString());
        }else{
            return 0.0;
        }
    }
    Double restaD(){
        if(this.a instanceof Number && this.b instanceof Number){
            return Double.parseDouble(a.toString()) - Double.parseDouble(b.toString());
        }else{
            return 0.0;
        }
    }
    Double multiplicacionD(){
        if(this.a instanceof Number && this.b instanceof Number){
            return Double.parseDouble(a.toString()) * Double.parseDouble(b.toString());
        }else{
            return 0.0;
        }
    }
    int sumaIn(){
        if(this.a instanceof Number && this.b instanceof Number){
            return Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());
        }else{
            return 0;
        }
    }
    int restaIn(){
        if(this.a instanceof Number && this.b instanceof Number){
            return Integer.parseInt(a.toString()) - Integer.parseInt(b.toString());
        }else{
            return 0;
        }
    }
    int productoIn(){
        if(this.a instanceof Number && this.b instanceof Number){
            return Integer.parseInt(a.toString()) * Integer.parseInt(b.toString());
        }else{
            return 0;
        }
    }
    
   
}

class main{
    public static void main(String[] args) {
        Operaciones<Double> o=new Operaciones(5,6);
        System.out.println(o.sumaD());
        System.out.println(o.restaD());
        System.out.println(o.multiplicacionD());
        
        Operaciones<Integer> o1=new Operaciones(6,7);
        System.out.println(o1.sumaIn());
        System.out.println(o1.restaIn());
        System.out.println(o1.productoIn());
    }
}

