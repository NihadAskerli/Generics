package genericslesson;

public class Main {
    public static void main(String[] args) {
//        doSomething(container);
//Container<User>  container= new Container(new String());
//        Container container= new Container(new User()); raw type oz halinda
//        Container<Integer>  container= new Container<Integer>(new Integer(4)); number extends
//        Container<User>  container= new Container<User>(new User()); user type
//    User u= container.doItAndReturn();
//        Container<Double,Integer>  container= new Container<>(new Double(4.5));
//        Double u= contai
        //       Double d=  container.doItAndReturn2(3.4); ikili type tipe gore teyin edir melum olmayan tipi
//        System.out.println("instance of="+(u instanceof User));
//        System.out.println("instance of="+(u instanceof Object)); auto cast tapdiq
//        Container <Integer> container1= new Container<>();
//        Container <User> container2= new Container<>();
//        method(container1);
//        method2(container2); serhedlere aid numune
// Container <User3> container = new Container<>();
//        method2(container); ikili tip super extends cardwild serhedleri

        Container <User2> container = new Container<>(new User2());
method2(container);
        Container <User4> container2 = new Container<>(new User4());
method(container2);












    }
    public static void Nihad(Container<?>container){

    }

    private static void method( Container<? extends User3>container) // serhed deyilir buna
     {
//container.castAndReturn(); bu pis yani odurki biz bilmirik hansi tip gelir onun ucun iceri birsey oture bilmirik
//         ama superde bilirik. Bu ne ucun istifade oluna biler methodlari istifade ucun
         User3 u=container.doo();
//         bu bize imkan verirki bize qayidan yuz faiz user3 den extends edibdir;
    }
    public static void method2( Container<? super User3 >container) {
        container.castAndReturn(new User4());

    }

//    public static void doSomething(Container<Double> container){
//        User u= container.doItAndReturn();
//        System.out.println("u="+u);
//    } Genericsin istifadesi

}
