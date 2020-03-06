/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6.teorico;

/**
 *
 * @author JHUNIOR
 */
public class ejercicio6 {
    public static void main(String[] args) {
        servicioPerson ser=new servicioPerson();
        ser.setipersistem(new dataoracle());
        ser.saveperson(new person());
    }
}

interface Ipersisten{
    public void save(Object o);
}
class person{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }    
}
class dataMysql implements Ipersisten{
    public void save(Object o){
        if(o instanceof person){
            System.out.println("La persona fue almacenada!!");
        }
    }
}
class dataoracle implements Ipersisten{
    public void save(Object o){
        if(o instanceof person){
            System.out.println("La persona fue almacenada!!");
        }
    }
}
class servicioPerson{
    Ipersisten ipersisten;
    void setipersistem(Ipersisten ipersisten){
        this.ipersisten=ipersisten;
    }
    void saveperson(person p){
        ipersisten.save(p);
    }
}