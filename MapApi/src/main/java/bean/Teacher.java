package bean;

public class Teacher extends Person implements Comparable<Teacher>{
    public Teacher(String name,String surname,int id){
        super(name,surname,id);
    }

    @Override
    public int compareTo(Teacher o) {
        if(this.getId()>o.getId()){
            return 1;
        }else if(this.getId()==o.getId()){
            return 0;
        }else{
            return -1;
        }

    }
//    @Override
//    public int hashCode(){
//        System.out.println("teacher hashcode="+super.getName());
//        return 1;
//    }
//    @Override
//    public boolean equals(Object obj){
//        System.out.println("equals called"+obj);
//        return  super.equals(obj);
//    }
}
