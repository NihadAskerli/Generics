package genericslesson;

public class Container <E>{
    private E stored;

public Container(E obj){

    this.stored=obj;
}
public E castAndReturn(E passed){
    System.out.println("passed="+passed.getClass().getName());
    System.out.println("stored="+stored.getClass().getName());
    return (E)passed;

}
public E doo(){
  return stored;
}




//    private Object object;
//    private E object2;
//    public Container(T object){
//        this.object=object;
//    }
//    public <T> T doItAndReturn(String s){
//        T e=null;
//
//        System.out.println("i did something");
//        T e2=(T)s;
//        return e2;
//    }
//
//    public <E> E doItAndReturn2(E object){
//        System.out.println("i did something");
//        return object;
//    }








//    public E doItAndReturn2(){
//        System.out.println("i did something");
//        return this.object2;
//    }
}
