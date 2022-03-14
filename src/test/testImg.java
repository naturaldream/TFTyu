package test;

import aboutTFT.imgAnalyse;
import aboutTFT.mouseOperation;
import org.w3c.dom.css.Rect;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class testImg {
    //启动类 主程序  窗口化  1920*1080


    //牌库 第一张 卡片位置410,625,180,180
    int lX = 410;  //X坐标
    int lY = 625; //Y坐标
    int width1 = 180;
    int height1 = 180;  //截图  宽和高 大小
    //第二张 卡牌位置 550,625,180,180
    int lX2 = 550;
    int lY2 = 625;
    int width2 = 180;
    int height2 = 180;
    //第三张 卡牌位置 690,625,180,180
    int lX3 = 690;
    int lY3 = 625;
    int width3 = 180;
    int height3 = 180;

    //第四张 卡牌位置 840,625,180,180
    int lX4 = 840;
    int lY4 = 625;
    int width4 = 180;
    int height4 = 180;
    //第五张 卡牌位置 690,625,180,180
    int lX5 = 990;
    int lY5 = 625;
    int width5 = 180;
    int height5 = 180;

    //截图记录  如果说不进行内部循环  name就单独对这几个数字进行循环 就可以做到我想要的文件取名了!
    int serialNumCard1 = 0;
    int serialNumCard2 = 0;
    int serialNumCard3 = 0;
    int serialNumCard4 = 0;
    int serialNumCard5 = 0;
    public static void main(String[] args) {
        /*测试下相似度分析效果*/
        testImg  te=new testImg();
        te.testImg();
        /*相似度判断25625825812581458？*/
//        String  localImg="C:\\Users\\qq523\\Pictures\\downloads_photo\\Allcard\\eluoyi.png";
//
//        String  img="C:\\Users\\qq523\\Pictures\\downloads_photo\\card4\\4test.jpg";
//        imgAnalyse im=new imgAnalyse();
//      int i=  im.compareImage(localImg,img);
//

    }

    public  void  testImg(){
        mouseOperation mou=new mouseOperation();
        imgAnalyse imga=new imgAnalyse();
        /*首先  确定图片*/
        String  localImg="C:\\Users\\qq523\\Pictures\\downloads_photo\\Allcard\\aixi.png";

        while (true) {
            try {
                Thread.sleep(2000);
                BufferedImage bf = (new Robot()).createScreenCapture(new Rectangle(lX, lY, width1, height1));
                String name1 = "C:\\Users\\qq523\\Pictures\\downloads_photo\\card1\\1.jpg";
                File file1 = new File(name1);
                ImageIO.write(bf, "jpg", file1);


                BufferedImage bf2 = (new Robot()).createScreenCapture(new Rectangle(lX2, lY2, width2, height2));
                String name2 = "C:\\Users\\qq523\\Pictures\\downloads_photo\\card2\\2.jpg";
                File file2 = new File(name2);
                ImageIO.write(bf2, "jpg", file2);

                BufferedImage bf3 = (new Robot()).createScreenCapture(new Rectangle(lX3, lY3, width3, height3));
                String name3 = "C:\\Users\\qq523\\Pictures\\downloads_photo\\card3\\3.jpg";
                File file3 = new File(name3);
                ImageIO.write(bf3, "jpg", file3);

                BufferedImage bf4 = (new Robot()).createScreenCapture(new Rectangle(lX4, lY4, width4, height4));
                String name4 = "C:\\Users\\qq523\\Pictures\\downloads_photo\\card4\\4.jpg";
                File file4 = new File(name4);
                ImageIO.write(bf4, "jpg", file4);

                BufferedImage bf5 = (new Robot()).createScreenCapture(new Rectangle(lX5, lY5, width5, height5));
                String name5 = "C:\\Users\\qq523\\Pictures\\downloads_photo\\card5\\5.jpg";
                File file5 = new File(name5);
                ImageIO.write(bf5, "jpg", file5);

                System.out.println("截图操作完成");

                /*获取每个截图文件后 将文件 与图片对比*/
             int i0=   imga.compareImage(localImg,name1);
             System.out.println("i0="+i0);
             if (i0>5){

                 mou.MousePosition0();
                 //JOptionPane.showMessageDialog(null,"拿牌第一区域","OK", JOptionPane.PLAIN_MESSAGE);
             }
                int i1=   imga.compareImage(localImg,name2);
                System.out.println("i1="+i1);
                if (i1>5){
                 mou.MousePosition1();
                // JOptionPane.showMessageDialog(null,"拿牌第二区域","OK", JOptionPane.PLAIN_MESSAGE);

             }
                int i2=   imga.compareImage(localImg,name3);
                System.out.println("i2="+i2);
                if (i2>5){
                    mou.MousePosition2();
                   // JOptionPane.showMessageDialog(null,"拿牌第三区域","OK", JOptionPane.PLAIN_MESSAGE);
                }
                int i3=   imga.compareImage(localImg,name4);
                System.out.println("i3="+i3);
                if (i3>5){
                    mou.MousePosition3();
                    //JOptionPane.showMessageDialog(null,"拿牌第四区域","OK", JOptionPane.PLAIN_MESSAGE);
                }
                int i4=   imga.compareImage(localImg,name5);
                System.out.println("i4="+i4);
                if (i4>5){
                    mou.MousePosition4();
                    //JOptionPane.showMessageDialog(null,"拿牌第五区域","OK", JOptionPane.PLAIN_MESSAGE);
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
