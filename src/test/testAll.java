package test;

import aboutTFT.imgAnalyse;
import aboutTFT.localImgData;
import aboutTFT.mouseOperation;
import aboutTFT.screenShot;

import java.util.ArrayList;

public class testAll {
    /*这里单纯为了测试一些方法和变量啥的*/
    public static void main(String[] args) {
        /*初始化一些  类和方法*/
        mouseOperation mouse = new mouseOperation();
        screenShot ss = new screenShot();
        imgAnalyse img = new imgAnalyse();
        /*载入英雄数据*/
        localImgData localImg=new localImgData();
        ArrayList  hero=new ArrayList();
        hero=localImg.getHero();
       String hero0=(String)hero.get(0);

        // 0俄洛依  1艾希  2蛤蟆 3婕拉  4杰斯   5烬 6奎因  7圣枪游侠 8维克托 9船长

        while (true) {

            ArrayList screenImg = ss.screenShot();  /*直接使用方法*/
            /*获取五个截图区域*/
            String Area1 =(String)screenImg.get(0);
            String  Area2=(String) screenImg.get(1);
            String  Area3=(String) screenImg.get(2);
            String  Area4=(String) screenImg.get(3);
            String  Area5=(String) screenImg.get(4);
            System.out.println("不是很放心 测试下screenImg.get类型"+Area1);
            /*不停将俄洛依与五个区域图对比 只要发现相似的 就移动到相应区域并取牌*/
         int i0=   img.compareImage(hero0,Area1);
         if (i0>30){
            mouse.MousePosition0();
         }
         int i1=img.compareImage(hero0,Area2);
                 if(i1>30){
                     mouse.MousePosition1();
                 }
         int i2=img.compareImage(hero0,Area3);
                 if(i2>30){
                     mouse.MousePosition2();
                 }
         int i3=img.compareImage(hero0,Area4);
                 if(i3>30){
                     mouse.MousePosition3();
                 }
         int i4=img.compareImage(hero0,Area5);
                 if(i4>30){
                     mouse.MousePosition4();
                 }
                 System.out.println("不断输出i0到i4五个区域的相似度"+i0+"\n"+i1+"\n"+i2+"\n"+i3+"\n"+i4);

        }




        /*我突然忘记了字符串拼接 在复习下  一言难尽 直接用+号  尴尬了 */
//                    String  x="path1"+"file.txt";
//                    System.out.println(x);  //path1file.txt

        // System.out.println(listPath);
        // status  OK
        /*拿到图片后 可以开始下一步操作  和本地图库进行比对*/

        /*数组*/
//        ArrayList  list=new ArrayList();
//        list.add("this is a  test word");
//        list.add("C:user\\document\\download");
//        list.add("D:passwd\\test\\1.png");
//        System.out.println(list);
//        System.out.println(list.get(2).getClass());
        /*[this is a  test word, C:user\document\download, D:passwd\test\1.png]class java.lang.String*/
    }

}