package MathWork;

import java.util.ArrayList;
/*
筛选字符串。
    - 定义ArrayList集合，存入多个字符串。
    - 长度大于5的字符串，打印删除后的集合。
 */
public class Test06 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = getArrayList();
        System.out.println("源字符串：");
        System.out.println(arrayList);
        //删除集合中长度大于5的元素
        delStrsFromList01(arrayList);
        System.out.println("删除后");
        System.out.println(arrayList);
    }

    //返回存储多个字符串的ArrayList集合
    public static ArrayList<String> getArrayList(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaaaaaaaaaaaaaaa");
        arrayList.add("bbbb");
        arrayList.add("bbbbb");
        arrayList.add("蔡徐坤");
        arrayList.add("温玮豪是傻逼");
        arrayList.add("吴亦凡小米6");
        return arrayList;
    }

    //删除ArrayList集合中所有长度>5的字符串
    public static  void delStrsFromList01(ArrayList<String> arrayList){
        //创建一个新数组
        ArrayList<String> newlist = new ArrayList<>();
        //遍历原集合元素
        for (int i = 0; i < arrayList.size(); i++) {
            //获取当前元素
            String string = arrayList.get(i);
            //判断长度>5的，将他们保存在新数组中
            if (string.length() > 5){
                newlist.add(string);
            }
        }
        //**************
        //**************
        //**************
        //遍历新集合（不懂）
        for (Object str : newlist) {
            //因为新集合中的元素就是要删除的元素
            arrayList.remove(str);
        }
    }
}
