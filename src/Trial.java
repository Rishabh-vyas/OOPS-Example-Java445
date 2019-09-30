
public class Trial {

    private int x, y;



    public static void main(String[] args) {
        Trial t1=new Trial(10,20);
        Trial t2=new Trial(30,40);
        t1.show();
        t2.show();
    }

    public void show() {
        int x=55;
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println("_______________________");
    }

    public Trial(int a, int b) {
        this.x = a;
        this.y = b;
    }

    

}
