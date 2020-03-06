
package semana4.practica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class Disco {
    protected String titulo;
    protected String autor;

    public Disco(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

   
    public String toStringD() {
        return "Disco{" + "titulo=" + titulo + ", autor=" + autor +  '}';
    }
   
}

class Genero extends Disco{
    protected String tipoGenero=null;

    public Genero(String tipoGenero, String titulo, String autor) {
        super(titulo, autor);
        this.tipoGenero = null;
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    public String toStringG() {
        return "Genero{" + "tipoGenero=" + tipoGenero + '}';
    }

    
    
}

class Formato extends Genero{
    protected String tipoFormato=null;

    public Formato(String tipoFormato, String tipoGenero, String titulo, String autor) {
        super(tipoGenero, titulo, autor);
        this.tipoFormato = null;
    }

    public String getTipoFormato() {
        return tipoFormato;
    }

    public void setTipoFormato(String tipoFormato) {
        this.tipoFormato = tipoFormato;
    }

    
    public String toStringF() {
        return "Formato{" + "tipoFormato=" + tipoFormato + '}';
    }
    
}

class Valor extends Formato{
    private double valor=0;

    public Valor(double valor, String tipoFormato, String tipoGenero, String titulo, String autor) {
        super(tipoFormato, tipoGenero, titulo, autor);
        this.valor = valor;
    }

    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.toStringD()+"\n"+this.toStringG()+"\n"+this.toStringF()+"\n"+"Valor{" + "valor=" + valor +"$"+ '}'+"\n";
    }
    
}
class main{
    public static void main(String[] args) {
        
        ArrayList<Disco>listaMultimedia=new ArrayList<Disco>();
                
        Disco d1=new Valor(0, "", "", "TITANIC", "RAUL");
        Disco d2=new Valor(0, "", "", "ALTA", "MIGUEL");
        Disco d3=new Valor(0, "", "", "FIN", "STEP");
        Disco d4=new Valor(0, "", "", "TERREMOTO", "WILSON");
         
        llenar(listaMultimedia, d1);
        llenar(listaMultimedia, d2);
        llenar(listaMultimedia, d3);
        llenar(listaMultimedia, d4);
        
        
        
        Iterator<Disco> it=listaMultimedia.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
       
    }
    
    public static void llenar(ArrayList lis, Disco d){
        int tope=3;
        try{
            if(lis.size()<tope){
                lis.add(d);
            }else{
                System.out.println("LISTA LLENA");
            }
        }catch(Exception e){
            
            e.getMessage();
            
            System.out.println("lleno");
        }
        
    }
}
