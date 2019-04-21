package APIWork;

public class TestSeven {
    public static void main(String[] args) {
        MyList myList = new MyList();
        for (int i = 0; i < 3; i++) {
            myList.add(i);
        }
        System.out.println("添加元素后：");
        myList.show();

        Integer remove = myList.remove();
        System.out.println("获取元素");
        System.out.println(remove);
        System.out.println("获取元素后：");
        myList.show();
    }
}
