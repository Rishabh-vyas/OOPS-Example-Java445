public class Student {
    private int rno;
    private String name;
    private int marks;
    private static int totalPass;
    private static int totalFail;
    
    
    public static void showAvg(Student tmp1, Student tmp2){
        System.out.println("Avg of 2 : "+(tmp1.marks+tmp2.marks)/2);
    }
    
    public static void showGrade(Student tmp){
        String grade="";
        if(tmp.marks>=90){
            grade="A";
        }else if(tmp.marks>=80){
            grade="B";
        }else{
            grade="C";
        }
        System.out.println("Grade of "+tmp.rno+"=>"+grade);
    }
    
    public static void showOverallResult(){
        
        System.out.println("TOTAL NO OF PASSED CAND : "+totalPass);
        System.out.println("TOTAL NO OF FAILED CAND : "+totalFail);
        System.out.println("========================================");
    }
    public void showResult(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Stud Name   : "+name);
        System.out.println("Marks Obtnd : "+marks);
        if(marks>=33){
            System.out.println("PASSED");
            totalPass++;
        }else{
            System.out.println("FAILED");
            totalFail++;
        }
        System.out.println("_________________________________");
    }
    
    public void setData(int a, String b, int c){
        rno=a;
        name=b;
        marks=c;
    }
            
    
}
