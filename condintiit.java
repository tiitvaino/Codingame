import java.util.*;
import java.io.*;
import java.math.*;

/**
 * This code automatically collects game data in an infinite loop.
 * It uses the standard input to place data into the game variables such as x and y.
 * YOU DO NOT NEED TO MODIFY THE INITIALIZATION OF THE GAME VARIABLES.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        boolean boostLeft = true;
        
        // game loop
        while (true) {
            int x = in.nextInt(); // x position of your pod
            int y = in.nextInt(); // y position of your pod
            int nextCheckpointX = in.nextInt(); // x position of the next check point
            int nextCheckpointY = in.nextInt(); // y position of the next check point
            int nextCheckpointDist = in.nextInt();
            int nextCheckpointAngle = in.nextInt();           
            int opponentX = in.nextInt();
            int opponentY = in.nextInt();
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            // Edit this line to output the target position
            // and thrust (0 <= thrust <= 100)
            // i.e.: "x y thrust"  
            int thrust;
            if (nextCheckpointAngle > 90 || nextCheckpointAngle < -90)
                thrust = 0;
            else{
                if (nextCheckpointDist < 500)
                    thrust = Math.max(10,nextCheckpointDist/5);
                    //thrust = (int) Math.round(1/900000* Math.pow(nextCheckpointDist, 3)) + 10;
                else
                    thrust = 100;
                }
            //System.err.println("1  thurst " + thrust);
            System.err.println("2 angel " + nextCheckpointAngle + ", distance " + nextCheckpointDist);
            //System.err.println("3 me " + x + " " + y);
            //System.err.println(("4 target " + nextCheckpointX) + " " + (nextCheckpointY));
            //System.err.println("5 opponent " + opponentX + " " + opponentY);
            if (boostLeft){
                if (nextCheckpointDist > 7000){
                    System.out.println((nextCheckpointX) + " " + (nextCheckpointY) + " BOOST");
                    boostLeft = false;
                    continue;
                    }
            }
            
            System.out.println((nextCheckpointX) + " " + (nextCheckpointY) + " " + thrust);
        }
    }

}