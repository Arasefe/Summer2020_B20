package ExtraStudy.iterator;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Collection<Integer>nums=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        removeIterator(nums);
        ArrayList<Integer>numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        removeForLoop(numbers);
    }

    public static void removeIterator(Collection<Integer>list){
        Iterator<Integer>it= list.iterator();
        while(it.hasNext()){
            Integer each=it.next();
            if(each<3){
                it.remove();
            }
        }
        System.out.println(list);
    }

    public static void removeForLoop(ArrayList<Integer>list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<7){
                Integer a=list.get(i);
                list.remove(a);
            }
        }
        System.out.println(list);

    }
}
