
public class ResultProcessing {

    public static void main(String[] args) {
        Student s1 = new Student(111,"AAA",90);
        Student s2 = new Student(112,"BBB",80);
        Student s3 = new Student(113,"CCC",70);
        Student s4 = new Student(114,"DDD");
        s1.showResult();
        s2.showResult();
        s3.showResult();
        s4.showResult();
        Student.showAvg(s1, s2);
        Student.showAvg(s1, s2, s3);
        Student.showAvg(s1, s2, s3, s4);

        //s3.showAvg(s2);
        //Student.showOverallResult();
        //s1.showGrade();
        //Student.showGrade(s1);
    }
}
