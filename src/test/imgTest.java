package test;

import aboutTFT.ImageHistogram;

import java.io.File;

public class imgTest {
    /*还是图片测试*/
    public static void main(String[] args) throws  Exception {
        ImageHistogram im=new ImageHistogram();
        File file1=new File("D:\\softareLearn\\ProjectAll\\LOLtft\\Allcard\\card3\\tftCard3_7.png");
        File file2=new File("D:\\softareLearn\\ProjectAll\\LOLtft\\Allcard\\luxian.png");
        //file2本地图库
        File file=new File("D:\\softareLearn\\ProjectAll\\LOLtft\\Allcard\\card4\\tftCard4_10.png");
        double i= im.match(file1,file2);
        System.out.println("截图游戏比啊"+i);
        double i2=im.match(file2,file);
        System.out.println("buxiang不相干比较 泰隆"+i2);

    }
}
