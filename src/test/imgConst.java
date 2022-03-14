package test;

import aboutTFT.imgAnalyse;

public class imgConst {
    //图片比较
    public static void main(String[] args) {
        String img2="C:\\Users\\qq523\\Pictures\\downloads_photo\\Allcard\\eluoyi.png";
        String  img1="C:\\Users\\qq523\\Pictures\\downloads_photo\\card4\\4test.png";
        imgAnalyse ima=new imgAnalyse();
        int a= ima.compareImage(img1,img2);
        System.out.println(a);
    }
}
