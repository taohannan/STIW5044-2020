import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstExercise {

    public static void main(String[] args) {

        Student student = new Student();

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        try {
            System.out.println("Please enter your name");
            String name = bufferedReader.readLine();
            student.setName(name);

            System.out.println("Please enter your Metric No");
            String metricNo = bufferedReader.readLine();
            student.setMetricNo(metricNo);

            System.out.println("Please enter your course");
            String course = bufferedReader.readLine();
            student.setCourse(course);

            System.out.println("Please enter your semester");
            String semester = bufferedReader.readLine();
            student.setSemester(semester);

            System.out.println("Hi "+ student.getName());
            System.out.println("This is the entered info");
            System.out.println(student.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
