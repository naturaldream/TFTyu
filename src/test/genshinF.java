package test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class genshinF {
    public static void main(String[] args) {
     while (true) {
         try {
             Robot robot = new Robot();
             Random random=new Random();
             int x=random.nextInt(500);
             robot.delay(x);
             robot.keyPress(KeyEvent.VK_F);
             robot.keyRelease(KeyEvent.VK_F);
         } catch (Exception e) {
             e.printStackTrace();
         }
     }

    }
}
