import bean.Student;
import bean.Teacher;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        HashMap<Teacher, Student> students =new HashMap<>();
//Teacher teacher=new Teacher("Nihad","Askerli",1);
//Teacher teacher1=new Teacher("Niko","Asker",2);
//students.put(teacher,new Student("Qabil","samirov",1));
//students.put(teacher1,new Student("Samir","Qabilov",2));
//        System.out.println("get is called");
//        students.get(teacher1); arasdirmaq ucun

//        String s1="FB";
//        String s2="Ea";
//        System.out.println(s1.hashCode()+"  "+s2.hashCode());
//        Map<String ,Integer> students=new HashMap<>();
//        students.put(s1,1);
//        students.put(s2,2); youtube arasdirmasi
//        HashMap<Teacher, Student> students =new HashMap<>();
//Teacher teacher=new Teacher("Nihad","Askerli",1);
//Teacher teacher1=new Teacher("Niko","Asker",2);
//students.put(teacher,new Student("Qabil","samirov",1));
//students.put(teacher1,new Student("Samir","Qabilov",2));
//        System.out.println("get is called");
//        System.out.println(students.get(teacher1)); burada equals ve hashcode conventiona aid
//        Hashtable t;
//        Map m= Collections.synchronizedMap(new HashMap<>());
//        System.out.println(m.getClass().getName()); hashtable dir bu
//        TreeMap<Integer,String> treeMap =new TreeMap<>();
//        treeMap.put(3,"");
//        treeMap.put(20,"");
//        treeMap.put(1,"");
//        System.out.println(treeMap.keySet()); // tree map compare usulu
//                HashMap<Teacher, Student> students =new HashMap<>();
//Teacher teacher=new Teacher("Nihad","Askerli",1);
//Teacher teacher1=new Teacher("Niko","Asker",2);
//        Teacher teacher2=new Teacher("Nahid","yaqubov",3);
//students.put(teacher,new Student("Qabil","samirov",1));
//students.put(teacher1,new Student("Samir","Qabilov",2));
//        students.put(teacher2,new Student("Yusif","Yusifov",3));
//        System.out.println(students.keySet());
//        System.out.println(students.values()); burada hashlara gore output cixir
        Map<Teacher, Student> students =new TreeMap<>();
        Teacher teacher=new Teacher("Nihad","Askerli",1);
        Teacher teacher1=new Teacher("Niko","Asker",2);
        Teacher teacher2=new Teacher("Nahid","yaqubov",3);
        students.put(teacher,new Student("Qabil","samirov",1));
        students.put(teacher1,new Student("Samir","Qabilov",2));
        students.put(teacher2,new Student("Yusif","Yusifov",3));
        System.out.println(students.keySet());
        System.out.println(students.values()); // tree map keyleri comparable olmalidir












//        Map<Integer,String> students =new HashMap<>();
//        students.put(1,"Nihad");
//        students.put(2,"Niko");
//        String value=students.get(2);
//        System.out.println("key=2"+" value"+value); bu put methodu idi


    }
}
