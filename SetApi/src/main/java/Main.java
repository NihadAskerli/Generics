import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Set<String> set= new HashSet<>();
//        set.add("Nihad");
//        set.add("Nihad");
//        set.add("Nihad");
//        for (String s:set
//             ) {
//            System.out.println(s);
//        }// set unikdir biri cixacaq
//        List<String> list=new ArrayList<>();
//        list.add("Nihad");
//        list.add("Nihad");
//        list.add("Nihad");
//        list.add("Nihad");
//list.add("Niko");
//        list.add("Niko");
//        list.add("Niko");
//        list.add("Niko");
//        list.add("Niko");
//        list.add("Niko");
//        list.add("Yaqub");
//        list.add("Yaqub");
//        list.add("Yaqub");
//        list.add("Yaqub");
//        list.add("Yaqub");
////        for (String s:list
////             ) {
////            System.out.println(s);
////        }
//        Set<String>set=new HashSet<>(list);
//        for (String n:set
//             ) {
//            System.out.println(n);
//        }
        Student student=new Student(25,"Nihad","Askerli");
        Teacher teacher=new Teacher(25,"Nihad","Askerli");
//        System.out.println(student.hashCode());
//        System.out.println(teacher.hashCode());
//
//        System.out.println(       System.identityHashCode(student));
        Map<Person,Integer> map=new HashMap<>();
        map.put(student,1);
        map.put(teacher,2);
        System.out.println(map);
        System.out.println(map.values());
    }
}
