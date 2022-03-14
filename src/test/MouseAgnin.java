package test;

import java.awt.*;
import java.awt.event.InputEvent;

public class MouseAgnin {
    public static  int[] getLocationX(){
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
    public static  int[] getLocationY(){
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
    //Y 加上100  拖拽终点处!  其实这里每个Y可以统一用一个值 没关系的
    //740,738,746,744,751

//    public   int[]  getAddY(){
//        int []AddY={840,838,846,844,851};
//        return AddY; }

    public static void main(String[] args) {
//        int [] x=getLocationX();
//        int []y=getLocationY();


    }
}
