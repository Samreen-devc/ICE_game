/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Random random= new Random();
        
        for(int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(random.nextInt(1,13));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[random.nextInt(1,3)]);
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
            magicHand[i]=c;
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner s=new Scanner(System.in);  
        System.out.print("Choose any number from1-13: ");
        int uservalue=s.nextInt();
        System.out.print("Choose any Suit from 0-3, 0:Hearts, 1:Diamonds,2:Clubs, 3:Spades ");
        int userSuit=s.nextInt();
        String NewSuit=Card.SUITS[userSuit]; 
        
        // and search magicHand here
        for(Card c: magicHand ){
        if(uservalue == c.getValue()){        
            if(NewSuit.equals(c.getSuit())){
                System.out.println("Your card is in the magic hand ");
            }
        }
        else{
            System.out.println("Your card is not in the magic hand. Sorry");
            break;
            }
        
    }
        luckCard luc=new luckcard;
        luc.setValue(3);
        luc.SetSuit("Heart");
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
