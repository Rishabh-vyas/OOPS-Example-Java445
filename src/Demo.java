public class Demo {
    
    private int x, y;           

    public void show(){
        System.out.println(x+","+y);
    }
    
    public Demo(Demo tmp){
        x=tmp.x;
        y=tmp.y;
    }
    
    public Demo(int a, int b){
        x=a; y=b;
    }
    
    public static void main(String[] args) {
       Demo d1=new Demo(10,20);
       Demo d2=new Demo(30,40);
       Demo d3=new Demo(d2);
       d1.show();
       d2.show();
       d3.show();
       
       
       
    
    }
}
/*
    1) method like bodies having same name as their class.
    2) they do not have any return type (not even void also)
    3) they may have access modifiers (public,private etc)
    4) they may or may not have parameters (varargs are allowed)
    5) they can be overloaded also.
    6) they need not to be called, they are invoked implicitly
       (automatically) during object creation.
       (matching parameters, whose actual parameters matches
       with the formal parameter)
    7) when you do not write any constructor from your side
       in that case one zero arg constructor is internally
       provided, that is called default constructor.
    8) once you write your own constructor, default will lost   
    9) java do not provides a copy constructor.
       (because for copy constructors are used for creating
       clone objects and java is having a clone() method in 
       Object class for creating clone objects therefore they
       do not provide copy constructor)
    10)generally they are used for intialization purpose.
       (initialization during object creation itself)
    11)a constructor will be called once only on an object
       where as methods can be called n times.
    12) you can call one constructor from another one using
       this keyword.
*/