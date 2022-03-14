package otherUnless;

import java.io.File;

public class useIt {
  public static ImagePHash im=new ImagePHash();
  public  static   File file1=new File("C:\\Users\\qq523\\Pictures\\downloads_photo\\Allcard\\eluoyi.png");
  public  static   File file2=new File("C:\\Users\\qq523\\Pictures\\downloads_photo\\card4\\4.png");

    public  static     ImageHistogram  im2=new ImageHistogram();



    public static void main(String[] args) {
      try {
//          int i=  im.distance(file1,file2);
//          System.out.println("输出值"+i);
       double i1= im2.match(file1,file2);  //返回值大于等于0.8可以
        System.out.println("查看值"+i1);
      }catch (Exception e){
          e.printStackTrace(); /*10之内就一致了*/
      }

      /*内容比较   绝杀 OK  完美成功!*/

    }
}
