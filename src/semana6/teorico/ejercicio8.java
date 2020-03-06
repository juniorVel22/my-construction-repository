/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6.teorico;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author JHUNIOR
 */
public class ejercicio8 {
    public static void main(String[] args) throws Exception {
        leer la=new leer();
        la.leerEntero();
    }
}
class leer{
    InputStreamReader is=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(is);
    int leerEntero()throws Exception{
        int x=br.read();
        return x;
    }
}