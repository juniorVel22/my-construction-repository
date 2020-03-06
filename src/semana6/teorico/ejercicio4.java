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
public class ejercicio4 {

}

interface daddy {

    void c();

    int d();

    int e();

    float f();
}

interface Ison {

    void a();

    void b();
}

class pantalla implements daddy, Ison {

    public void a() {

    }

    public void b() {

    }

    public void c() {

    }

    public int d() {
        return 0;
    }

    public int e() {
        return 0;
    }

    public float f() {
        return 0;
    }
}

class son implements Ison {

    public void a() {

    }

    public void b() {

    }
}
