
public class Test {

    
    public Test(){
        this(1);
        System.out.println("Test-0-1");
        System.out.println("Test-0-2");
    }
    public Test(int p){
        this(1,2);
        System.out.println("Test-1-1");
        System.out.println("Test-1-2");
    }
    public Test(int p, int q){
        System.out.println("Test-2-1");
        System.out.println("Test-2-2");
    }
    
    public void f1() {
        System.out.println("hello user");
        System.out.println("how are you");
    }

    public void f2() {
        f1();
        System.out.println("welcome to indore");
    }

    public static void main(String[] args) {
        Test t=new Test();
        
    }

}
