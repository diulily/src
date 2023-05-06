public class Student {
        String name;
        int age;
        int course;
        double gpa;

        public Student(String name, int age, int course, double gpa) {
            this.name = name;
            this.age = age;
            this.course = course;
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", course=" + course +
                    ", gpa=" + gpa +
                    '}';
        }


    public double getGpa() {
        return gpa;
    }

    public double getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public int getCourse(){
            return course;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}


