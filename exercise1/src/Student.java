public class Student {
    String name;
    String metricNo;
    String course;
    String semester;


    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMetricNo() {
        return metricNo;
    }

    public void setMetricNo(String metricNo) {
        this.metricNo = metricNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student info {" +
                "name='" + name + '\'' +
                ", metricNo='" + metricNo + '\'' +
                ", course='" + course + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }
}
