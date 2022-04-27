/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import teste.Animal;

/**
 *
 * @author diego
 */
public class Principal {
    public static void main(String[] args) {
        Animal objeto = new Animal();
        System.out.println(objeto.tipo);
        objeto.fazerBarulho();
    }
    
}
