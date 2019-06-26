/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresure;

/**
 *
 * @author M.Asad
 */
public class Start {
    public static void main (String[] args) {
    Treasure t1 = new Treasure(5);
    Treasure t2 = new Treasure(3);
    Treasure t3 = new Treasure(1);
    Treasure t4 = new Treasure(2);
    Treasure t5 = new Treasure(4);
    
    t1.setNextTreasure(t2);
    t2.setPrevTreasure(t1);
    t2.setNextTreasure(t3);
    t3.setPrevTreasure(t2);
    t3.setNextTreasure(t4);
    t4.setPrevTreasure(t3);
    t4.setNextTreasure(t5);
    t5.setPrevTreasure(t4);
    
        System.out.println(t3);
        System.out.println("t4 " +t4.getPrevTreasure().getNextTreasure().getNextTreasure().getGoldCoin());
        System.out.println("t2 " + t2.getNextTreasure().getPrevTreasure().getGoldCoin());
        System.out.println("t2 " + t2.getPrevTreasure().getGoldCoin());
        System.out.println("");
        int coins = t4.getPrevTreasure().getGoldCoin()+t2.getNextTreasure().getPrevTreasure().getGoldCoin();
        System.out.println(coins);
        
        System.out.println("NEW GIT ENTRY**********8");
    
    
    
    }
    
}
