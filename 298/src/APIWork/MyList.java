package APIWork;

import java.util.ArrayList;

public class MyList {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public void add(Integer i) {
        arrayList.add(i);
    }

    public Integer remove(){
        Integer remove = arrayList.remove(arrayList.size() - 1);
        return remove;
    }

    public void show(){
        System.out.println(arrayList);
    }
}
