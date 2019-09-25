public class VADemo {
    public static void add(){
        System.out.println("NOTHING TO ADD");
    }
    public static void add(double a, double b){
        System.out.println("SUM= "+(a+b));
    }
    public static void add(String...s){
        String res="";
        for(String tmp:s){
            res=res+tmp;
        }
        System.out.println(res);
    }
    public static void add(int...v){
        int sum=0;
        for(int tmp:v){
            sum=sum+tmp;
        }
        System.out.println(sum);
    }
    
    
    public static void main(String[] args) {
        add();
        add(10,20);
        add(10,20,30);
        add(10,20,30,40,50);
        add("xx","yy");
        add("pp","qq","rr");
        
    }
}
/*
    1) only one varargs per method.
    2) non-varargs parameter are allowed with varargs
    3) varargs must be always on last position.
    4) varargs methods can be overloaded
*/
