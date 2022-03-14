package aboutTFT;

import java.awt.*;
import java.awt.event.InputEvent;

public class mouseOp {
    //不知道这鬼发什么神经 模拟按键失败!
    public static void main(String[] args) {
    //  er();
        /*一  485  750    二 641 745  */
    while (true) {
        try {
            /*鼠标操作事件*/
            Robot r = new Robot();
            r.delay(1000);
            r.mouseMove(665, 733);
            r.mousePress(InputEvent.BUTTON1_MASK);
            r.mouseRelease(InputEvent.BUTTON1_MASK);
            r.delay(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }

    public static void  er(){
        /*while*/
        while (true){
            try {
                Robot r=new Robot();
                r.delay(1000);
            Point point=new Point();
            point=MouseInfo.getPointerInfo().getLocation();
            int x=(int) point.getX();
            int y=(int) point.getY();
            System.out.println("xx="+x);
            System.out.println("|||"+"Y=="+y);

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
