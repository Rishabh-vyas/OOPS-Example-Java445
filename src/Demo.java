public class Demo {
    
    int x, y;           //non-static (instance variables)
    static int p, q;    //static (class variables)
    
    
    
    public static void main(String[] args) throws Exception {
        //instantiating the class Demo (thrice)
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        
        System.out.println(d1.p);
        System.out.println(d2.p);
        System.out.println(d3.p);
        System.out.println("___________________");
        d1.p=100;
        d2.p=200;
        d3.p=300;
        System.out.println(d1.p);
        System.out.println(d2.p);
        System.out.println(d3.p);
        
        /*
        System.out.println(d1.x);
        System.out.println(d2.x);
        System.out.println(d3.x);
        System.out.println("_______________________");
        d1.x=10;
        d2.x=20;
        d3.x=30;
        System.out.println(d1.x);
        System.out.println(d2.x);
        System.out.println(d3.x);
        System.out.println("_______________________");
        */
    }
}
