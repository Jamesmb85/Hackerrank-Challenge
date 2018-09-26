/*Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array.

The Player class is provided for you in your editor. It has 2 fields: a name String and a score integer.

Given an array of Player objects, write a comparator that sorts them in order of decreasing score; 
if 2 or more players have the same score, sort those players alphabetically by name. 
To do this, you must create a Checker class that implements the Comparator interface, 
then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.

Input Format

Input from stdin is handled by the locked stub code in the Solution class.

The first line contains an integer, n, denoting the number of players.
Each of the subsequent lines contains a player's name and score, respectively.

Constraints
	0<=score<=1000
    2 players can have the same name.
    Player names consist of lowercase English letters.

Output Format

You are not responsible for printing any output to stdout. 
The locked stub code in Solution will create a Checker object, use it to sort the Player array, and print each sorted element. */



/*Collections.sort(Collection, Comparator) and Collections.sort(Collection) are overloaded method. 
And we need to use the first form here, which will take a Comparator as the second parameter, 
since reference type does not have a natural ordering.

The Comparator interface consists of a single method.

public interface Comparator<T> {
    int compare(T o1, T o2);
}

The compare method compares its two arguments, returning a negative integer, 0, or a positive integer depending on whether 
the first argument is less than, equal to, or greater than the second.

As we need decreasing order, therefore the comperator should return a positive value when the order appears to be increasing, 
so that it will change the order and make it decreasing again. Hence, b.score - a.score. */

import java.util.*;

// Write your Checker class here
class Checker implements Comparator<Player>{
    @Override
    public int compare(Player a, Player b){
        //compare by score first
        int differenceInScore = a.score - b.score;
        //if scores are the same
        if(differenceInScore == 0){
            return a.name.compareTo(b.name); //alphabetically
        }
        else{
            return differenceInScore = b.score-a.score; //decreasing
        }
        
    }
}


class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

