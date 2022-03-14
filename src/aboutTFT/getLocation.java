package aboutTFT;

import java.awt.*;

public class getLocation {
    public static void main(String[] args) {
        getLocation();
    }

    public  static Robot  getRobot(){
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        return robot;
    }
    //获取坐标
    public static void   getLocation(){
        while (true){
        Point point=new Point();
        point=MouseInfo.getPointerInfo().getLocation();
        int x=0;
        int y=0;
        x=(int) point.getX();
        y=(int)point.getY();
      Robot robot=getRobot();

          System.out.println("get mouse X="+x);
          System.out.println("get mouse Y="+y);
          robot.delay(3000);
      }

    }
}
