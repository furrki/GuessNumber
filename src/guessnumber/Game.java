/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;

import java.util.Random;


/**
 *
 * @author furrki
 */
public class Game {
    public int pickedNumber;
    public int tryCount;
    
    public Game() {
        tryCount = 0;

        Random rand = new Random();
        pickedNumber = rand.nextInt(100);
    }
}
