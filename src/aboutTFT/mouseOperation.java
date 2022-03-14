package aboutTFT;


import util.getRobot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;

//鼠标操作事件
public class mouseOperation {
    //机器人实例获取
    public  static    getRobot  get=new getRobot();
    public static   Robot  robot=get.getRobot();

    //坐标数据  五组牌库的  数据  二维数组 记录 X 和Y
   // int [][]  CL=new int[5][5];  //去复习下数组相关知识
    //二维数组头晕  就简单的一维数组 取值吧


        //记录XY坐标就直接使用 二维数组记录好了 找到每个坐标点位   一行一列
    /*牌一位置
     get mouse X=485
     get mouse Y=740
    * 牌二位置
    get mouse X=641
    get mouse Y=738
    * 牌三为hi
    get mouse X=785
    get mouse Y=746
    * 牌四位置
    get mouse X=934
    get mouse Y=744
    * 牌五位置
    get mouse X=1074
    get mouse Y=751
    */
            //1~5  X坐标    1~5  y坐标  坐标填充完毕


    public   int[] getLocationX(){
        int locationX[]=new int[5];
        int locationY[]=new int[5];
        int [][] lAll=new int[][]{{485,641,785,934,1074},{740,738,746,744,751}};

        // 以上文字说明皆是步步分析  现在为一维数组赋值
        /*我不知道为什么在外面的全局变两中 无法
        对数组 添加元素
        无法直接引用变量  反而在类中就可以  试过了public  也不行*/
        //[x][y]取值   第一个是X轴  第二个是Y轴
        locationX[0]=lAll[0][0];
        locationX[1]=lAll[0][1];
        locationX[2]=lAll[0][2];
        locationX[3]=lAll[0][3];
        locationX[4]=lAll[0][4];

        locationY[0]=lAll[1][0];
        locationY[1]=lAll[1][1];
        locationY[2]=lAll[1][2];
        locationY[3]=lAll[1][3];
        locationY[4]=lAll[1][4];
        //要是你们觉得数组都看不懂的话 那么你就直接弄一大堆变量吧 ....
        return locationX;
    }
    public   int[] getLocationY(){
        //其实这个Y坐标可以统一用一个值     没关系 没影响
        int locationX[]=new int[5];
        int locationY[]=new int[5];
        int [][] lAll=new int[][]{{485,641,785,934,1074},{740,738,746,744,751}};

        // 以上文字说明皆是步步分析  现在为一维数组赋值
        /*我不知道为什么在外面的全局变两中 无法
        对数组 添加元素
        无法直接引用变量  反而在类中就可以  试过了public  也不行*/
        //[x][y]取值   第一个是X轴  第二个是Y轴
        locationX[0]=lAll[0][0];
        locationX[1]=lAll[0][1];
        locationX[2]=lAll[0][2];
        locationX[3]=lAll[0][3];
        locationX[4]=lAll[0][4];

        locationY[0]=lAll[1][0];
        locationY[1]=lAll[1][1];
        locationY[2]=lAll[1][2];
        locationY[3]=lAll[1][3];
        locationY[4]=lAll[1][4];
        //要是你们觉得数组都看不懂的话 那么你就直接弄一大堆变量吧 ....
        return locationY;
    }
/*上述代码冗余  但是我懒得思考和加工了 能用就行*/
    //由于拿牌卡牌的缘故
public   int[]  getAddY(){
    int []AddY={640,638,646,644,651};
    return AddY; }

    //分别要移动到五张牌库所在牌的位置  1 2 3 4 5
    public    void  MousePosition0(){
        /*直接获取坐标数据吧*/
        int[]locationX=  getLocationX();
        int[]locationY=getLocationY();
        int[]addY=getAddY();
        //牌库位置一
            robot.delay(500);
        robot.mouseMove(locationX[0],locationY[0]);     //牌库一卡牌位置
            /*为防止管理员乱动 再来一次 之后开始点击操作  */
        //    robot.mouseMove(locationX[0],locationY[0]);
        robot.delay(500);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            //拖拽操作
        robot.mouseMove(locationX[0],addY[0]);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
       // JOptionPane.showMessageDialog(null,"拿牌区域一","OK!",JOptionPane.PLAIN_MESSAGE);

         //   System.out.println("取牌库一位置 取牌成功!");
    }
    public  void  MousePosition1(){
        int[]locationX=  getLocationX();
        int[]locationY=getLocationY();
        int[]addY=getAddY();
        //牌库位置二
        robot.delay(500);
       // robot.mouseMove(locationX[1],locationY[1]);
        robot.mouseMove(locationX[1],locationY[1]);

        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(500);
        robot.mouseMove(locationX[1],addY[1]);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
      //  JOptionPane.showMessageDialog(null,"拿牌区域二","OK!",JOptionPane.PLAIN_MESSAGE);

        //   System.out.println("获取牌库二 位置  取牌成功!");
    }
    public  void  MousePosition2(){
        int[]locationX=getLocationX();
        int[]locationY=getLocationY();
        int[]addY=getAddY();
        //牌库位置三
        robot.delay(500);
      //  robot.mouseMove(locationX[2],locationY[2]);
        robot.mouseMove(locationX[2],locationY[2]);

        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(500);
        robot.mouseMove(locationX[2],addY[2]);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
       // JOptionPane.showMessageDialog(null,"拿牌区域三","OK!",JOptionPane.PLAIN_MESSAGE);

        //System.out.println("获取牌库三 位置  取牌成功!");
    }
    public  void  MousePosition3(){
        int[]locationX=getLocationX();
        int[]locationY=getLocationY();
        int[]addY=getAddY();
        //牌库位置三
        robot.delay(500);
      //  robot.mouseMove(locationX[3],locationY[3]);
        robot.mouseMove(locationX[3],locationY[3]);

        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(500);
        robot.mouseMove(locationX[3],addY[3]);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
      // JOptionPane.showMessageDialog(null,"拿牌区域四","OK!",JOptionPane.PLAIN_MESSAGE);

        //  System.out.println("获取牌库四位置  取牌成功!");
    }
    public  void  MousePosition4(){
        int[]locationX=getLocationX();
        int[]locationY=getLocationY();
        int[]addY=getAddY();
        //牌库位置三
        robot.delay(500);
      //  robot.mouseMove(locationX[4],locationY[4]);
        robot.mouseMove(locationX[4],locationY[4]);

        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(500);
        robot.mouseMove(locationX[4],addY[4]);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
       // JOptionPane.showMessageDialog(null,"拿牌区域五","OK!",JOptionPane.PLAIN_MESSAGE);

        //System.out.println("获取牌库五位置  取牌成功!");
    }




}
