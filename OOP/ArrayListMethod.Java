import java.util.*;
class ExampleDriver{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List list1=new ArrayList();
        System.out.println(list1.add(10));
        System.out.println(list1.add(20));
        System.out.println(list1.add(30));
        System.out.println(list1.add(40));
        System.out.println(list1);

        list1.add(2,16);
        System.out.println(list1);
        Collection list2=new ArrayList();
        System.out.println(list2);
        System.out.println(list1.add(30));
        System.out.println(list1.add(50));
        System.out.println(list1.add(20));
        System.out.println(list2);
        list1.addAll(3,list1);

        System.out.println(list1.remove(5));

        list1.get(2);
        System.out.println(list1);
        list1.set(3,20);
        System.out.println(list1);






       


    }
}


       

      