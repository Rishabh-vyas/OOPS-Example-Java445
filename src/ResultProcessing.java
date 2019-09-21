
public class ResultProcessing {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        s1.setData(111, "AAA", 90);
        s2.setData(112, "BBB", 80);
        s3.setData(113, "CCC", 70);
        s4.setData(114, "DDD", 25);
        s1.showResult();
        s2.showResult();
        s3.showResult();
        s4.showResult();

        Student.showAvg(s1, s2);
        Student.showAvg(s2, s3);

        //s3.showAvg(s2);
        //Student.showOverallResult();
        //s1.showGrade();
        //Student.showGrade(s1);
    }
}
