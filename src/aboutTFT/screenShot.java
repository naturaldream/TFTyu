package aboutTFT;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class screenShot {
    public ArrayList screenShot(){
        ArrayList  list=new ArrayList();/*用于存储五个文件所在路径*/
            /*牌库定位*/
        //无效代码 测试用的   String  eluoyi="D:\\softareLearn\\ProjectAll\\LOLtft\\Allcard\\eluoyi.png";
                /*创建截图所在文件夹*/
            String path1="D:\\softareLearn\\ProjectAll\\LOLtft\\Allcard\\card1\\";
            String path2="D:\\softareLearn\\ProjectAll\\LOLtft\\Allcard\\card2\\";
            String path3="D:\\softareLearn\\ProjectAll\\LOLtft\\Allcard\\card3\\";
            String path4="D:\\softareLearn\\ProjectAll\\LOLtft\\Allcard\\card4\\";
            String path5="D:\\softareLearn\\ProjectAll\\LOLtft\\Allcard\\card5\\";
        //每一牌位所对应图像文件名 目录/名称
        String  defaultname="tftCard1_";
        String  defaultname2="tftCard2_";
        String  defaultname3="tftCard3_";
        String  defaultname4="tftCard4_";
        String  defaultname5="tftCard5_";
        String  imageFormat="png";

        //牌库 第一张 卡片位置410,625,180,180
        int lX=410;  //X坐标
        int lY=625; //Y坐标
        int width1=180;
        int height1=180;  //截图  宽和高 大小
        //第二张 卡牌位置 550,625,180,180
        int lX2=550;
        int lY2=625;
        int width2=180;
        int height2=180;
        //第三张 卡牌位置 690,625,180,180
        int lX3=690;
        int lY3=625;
        int width3=180;
        int height3=180;

        //第四张 卡牌位置 840,625,180,180
        int lX4=840;
        int lY4=625;
        int width4=180;
        int height4=180;
        //第五张 卡牌位置 690,625,180,180
        int lX5=990;
        int lY5=625;
        int width5=180;
        int height5=180;

        //截图记录  如果说不进行内部循环  name就单独对这几个数字进行循环 就可以做到我想要的文件取名了!
        int serialNumCard1=0;
        int serialNumCard2=0;
        int serialNumCard3=0;
        int serialNumCard4=0;
        int serialNumCard5=0;

        /*截图处理  五个位置的截图同时进行*/
try {
    /*首先 这边不间断截图*/
    //while (true) {


        BufferedImage bf = (new Robot()).createScreenCapture(new Rectangle(lX, lY, width1, height1));
        serialNumCard1++;
        String name1 = path1 + defaultname + String.valueOf(serialNumCard1) + "." + imageFormat;
        File file1 = new File(name1);
        System.out.println("save file1 success");
        ImageIO.write(bf, imageFormat, file1);
        System.out.println("写入file1 成功");
        Thread.sleep(2000);
        //牌库第二章卡牌
        BufferedImage bf2 = (new Robot()).createScreenCapture(new Rectangle(lX2, lY2, width2, height2));
        serialNumCard2++;
        String name2 = path2 + defaultname2 + String.valueOf(serialNumCard2) + "." + imageFormat;
        File file2 = new File(name2);  //写入文件种风格
        ImageIO.write(bf2, imageFormat, file2);
        //牌库第三张牌位置
        BufferedImage bf3 = (new Robot()).createScreenCapture(new Rectangle(lX3, lY3, width3, height3));
        serialNumCard3++;
        String name3 = path3 + defaultname3 + String.valueOf(serialNumCard3) + "." + imageFormat;
        File file3 = new File(name3);
        ImageIO.write(bf3, imageFormat, file3);
        //牌库第四张位置
        BufferedImage bf4 = (new Robot()).createScreenCapture(new Rectangle(lX4, lY4, width4, height4));
        serialNumCard4++;
        String name4 = path4 + defaultname4 + String.valueOf(serialNumCard4) + "." + imageFormat;
        File file4 = new File(name4);
        ImageIO.write(bf4, imageFormat, file4);
        //牌库第五张卡牌位置
        BufferedImage bf5 = (new Robot()).createScreenCapture(new Rectangle(lX5, lY5, width5, height5));
        serialNumCard5++;
        String name5 = path5 + defaultname5 + String.valueOf(serialNumCard5) + "." + imageFormat;
        File file5 = new File(name5);
        ImageIO.write(bf5, imageFormat, file5);

        //存储 name中
        list.add(name1);
        list.add(name2);
        list.add(name3);
        list.add(name4);
        list.add(name5);

   // }
}catch (Exception e){ e.printStackTrace(); }

return list;

    }


}
