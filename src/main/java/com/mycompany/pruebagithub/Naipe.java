/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebagithub;

import java.util.Random;

/**
 *
 * @author nuria
 */
public class Naipe {
   
        //clase naipe que tendrá cartas (1-7, 8 (sota), 9(caballo) 10(rey))
        //palo  (oros, bastos, espada, copas)
       
        //constructor aleatorio por defecto y parámetros () lanza excepción en caso de parámetros erróneos
        
        //creamos una clase baraja, que, como atributo va a tener un array de naipe que como constructor por defecto relleno el aray con todos los naipes
    
    private int carta;
    private String palo;
   
    //generamos una carta random 
    public Naipe(){
        
        Random random = new Random();
        this.carta = random.nextInt(1,11);
        String [] naipes = {"oros", "bastos", "espadas", "copas"};
        this.palo = naipes[random.nextInt(naipes.length)];
}
                                                                   
        
    
        
    
}
