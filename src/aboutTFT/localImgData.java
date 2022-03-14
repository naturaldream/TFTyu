package aboutTFT;

import java.util.ArrayList;

public class localImgData {
    /*本地图库数据*/
    ArrayList list=new ArrayList();
    /*静态文件定义*/
   String path="D:\\softareLearn\\ProjectAll\\LOLtft\\Allcard\\";
   String  eluoyi="eluoyi.png";
   String aixi="aixi.png";
   String  frog="frog.png";
   String jiela="jiela.png";
   String jiesi="jiesi.png";
   String jin="jin.png";
   String kuiyin="kuiyin.png";
   String luxian="luxian.png";
   String  weiketuo="weiketuo.png";
   String skipper="skipper.png";

    public ArrayList getHero(){
        /*全部英雄导入*/
        list.add(path+eluoyi);
        list.add(path+aixi);
        list.add(path+frog);
        list.add(path+jiela);
        list.add(path+jiesi);
        list.add(path+jin);
        list.add(path+kuiyin);
        list.add(path+luxian);
        list.add(path+weiketuo);
        list.add(path+skipper);
        // 0俄洛依  1艾希  2蛤蟆 3婕拉  4杰斯   5烬 6奎因  7圣枪游侠 8维克托 9船长




        return list;
    }



//    public static void main(String[] args) {
//        /*为保证 真实性 故此 证明下*/
//        localImgData lo=new localImgData();
//        ArrayList hero=new ArrayList();
//      hero=  lo.getHero();
//      System.out.println(hero.get(8));
//      /*No problem!*/
//    }

}
