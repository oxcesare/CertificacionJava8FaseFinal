/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.capitulo2.general;

/**
 *
 * @author cesaralducinruiz
 */
interface LivesInOcean {
    
    public void makeSound();
    
}

class Whale implements LivesInOcean {
    
    @Override
    public void makeSound() {
        System.out.println("Sing");
    }
    
}

class Dolphin implements LivesInOcean {
    
    @Override
    public void makeSound() {
        System.out.println("Whistle");
    }
    
}

class Lion implements LivesInOcean {

    @Override
    public void makeSound() {
       System.out.println("Lion");
    }
    
}

public class Oceanographer {
    
    public void checkSound(LivesInOcean animal) {
        animal.makeSound();
    }
    
    public static void main(String[] args) {
        Oceanographer o = new Oceanographer();
        o.checkSound(new Dolphin());
        o.checkSound(new Whale());       
        o.checkSound(new Lion());
    }
}
