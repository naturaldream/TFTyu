package util;

import java.awt.*;

public class getRobot {
    Robot robot=null;
    public   Robot getRobot(){
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        return  robot;
    }
}
