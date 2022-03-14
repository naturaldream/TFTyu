package aboutTFT;

import otherUnless.ImageHistogram;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

//这个类写的是主功能  screenshot 和imgAnalyse都被废弃了
/*确定好实现路线
* 完成五个区域的截图  每张截图与本地图库进行比较
* 根据相似度是否进行鼠标操作
* 因此
*截图和比较应该同时进行不能分离 只需要一个大循环就可以 */
public class newChange {
    /*将截图和比较分开来写 逻辑上错误 卡在截图内部循环 或者是仅仅截图名称就不到变化 仅截图一次 */
    //于是这次就将它们整合在一起尝试一下
    /*first step  import  and initialize class and parameter*/

    //这堆变量太乱了  加工的时候我把它们包装下 弄漂亮点  但是现在我只管实现功能  不弄了  能用就行

    /*牌库定位*/
    String eluoyi = "D:\\softareLearn\\ProjectAll\\LOLtft\\Allcard\\eluoyi.png";
    /*创建截图所在文件夹*/
    String path1 = "D:\\softareLearn\\ProjectAll\\LOLtft\\Allcard\\card1\\";
    String path2 = "D:\\softareLearn\\ProjectAll\\LOLtft\\Allcard\\card2\\";
    String path3 = "D:\\softareLearn\\ProjectAll\\LOLtft\\Allcard\\card3\\";
    String path4 = "D:\\softareLearn\\ProjectAll\\LOLtft\\Allcard\\card4\\";
    String path5 = "D:\\softareLearn\\ProjectAll\\LOLtft\\Allcard\\card5\\";
    //每一牌位所对应图像文件名 目录/名称
    String defaultname = "tftCard1_";
    String defaultname2 = "tftCard2_";
    String defaultname3 = "tftCard3_";
    String defaultname4 = "tftCard4_";
    String defaultname5 = "tftCard5_";
    String imageFormat = "png";

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


    //方法
    mouseOperation mou = new mouseOperation();
    localImgData localImg = new localImgData();
    //imgAnalyse img=new imgAnalyse();
    //imgAnalyse类已经废弃 使用巴氏系数计算  也就是积分 我不懂的高数  末日哪
    ImageHistogram imgH=new ImageHistogram();
    //先找好所需英雄

    public void screenAndCompare() {
        //处理好本地库英雄数据
        // 0俄洛依  1艾希  2蛤蟆 3婕拉  4杰斯   5烬 6奎因  7圣枪游侠 8维克托 9船长
       ArrayList hero= localImg.getHero();
       String eluoyi=(String) hero.get(0);
       String skipper=(String) hero.get(9);
       String aixi=(String)hero.get(1);
       String hama=(String)hero.get(2);
       String  jiela=(String)hero.get(3);
       String  jiesi=(String) hero.get(4);
       String  jin=(String) hero.get(5);
       String  kuiyin=(String) hero.get(6);
       String  luxian=(String)hero.get(7);
       String weiketuo=(String)hero.get(8);
       File file=new File(kuiyin);   //默认拿俄洛依!
       //这里暂时修改你需要拿牌的英雄  卡牌就是上面一系列变量

        /*截图处理  五个位置的截图同时进行*/
        while (true) {
            try {
                    //五张截图
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

                //截图与本地图库比较  判断是否执行鼠标操作!
                    System.out.println("开始图片比较操作!");
             double i0=imgH.match(file,file1);
                if (i0>=0.8){
                    System.out.println("于第一区域i0的值"+i0);
                    mou.MousePosition0();
                }
             double i1=imgH.match(file,file2);
                if (i1>=0.8){
                    System.out.println("于第二区域i1的值"+i1);
                    mou.MousePosition1();
                }
              double i2=imgH.match(file,file3);
                if (i2>=0.8){
                    System.out.println("于第三区域i2的值"+i2);
                    mou.MousePosition2();
                }
              double i3=imgH.match(file,file4);
                if(i3>=0.8){
                    System.out.println("于第四区域i3的值"+i3);
                    mou.MousePosition3();
                }
              double i4=imgH.match(file,file4);
                if(i4>=0.8){
                    System.out.println("于第五区域i4的值"+i4);
                    mou.MousePosition4();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }//循环结束

    }

}
