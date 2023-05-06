import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

        public class Work10 {
            public static void main(String[] args) {
                System.out.println("   ---   BEGIN   ---   ");
                Student student01 = new Student("Askar", 20, 3, 3.7);
                Student student02 = new Student("Medet", 19, 2, 3.3);
                Student student03 = new Student("Aidana", 22, 4, 3.9);
                Student student04 = new Student("Azamat", 21, 3, 3.5);
                Student student05 = new Student("Bakyt", 19, 2, 2.5);
                Student student06 = new Student("Dana", 20, 3, 3.2);
                Student student07 = new Student("Erkin", 18, 1, 3.1);
                Student student08 = new Student("Gulnara", 22, 4, 4.0);
                Student student09 = new Student("Jyldyz", 21, 3, 3.7);
                Student student10 = new Student("Kairat", 19, 2, 2.8);
                Student student11 = new Student("Marat", 20, 3, 3.3);
                Student student12 = new Student("Nargiza", 18, 1, 3.6);
                Student student13 = new Student("Oleg", 22, 4, 3.8);
                Student student14 = new Student("Sultan", 21, 3, 3.4);
                Student student15 = new Student("Talgat", 19, 2, 2.9);
                Student student16 = new Student("Ulan", 20, 3, 3.5);
                Student student17 = new Student("Vladimir", 18, 1, 3.2);
                Student student18 = new Student("Yerzhan", 22, 4, 3.9);
                Student student19 = new Student("Zhanar", 21, 3, 3.6);


                //TODO добавьте еще 18 студентов разных курсов, и с разными GPA


                List<Student> listOfStudents= new ArrayList<>();
                listOfStudents.add(student01);
                listOfStudents.add(student02);
                listOfStudents.add(student03);
                listOfStudents.add(student04);
                listOfStudents.add(student05);
                listOfStudents.add(student06);
                listOfStudents.add(student07);
                listOfStudents.add(student08);
                listOfStudents.add(student09);
                listOfStudents.add(student10);
                listOfStudents.add(student11);
                listOfStudents.add(student12);
                listOfStudents.add(student13);
                listOfStudents.add(student14);
                listOfStudents.add(student15);
                listOfStudents.add(student16);
                listOfStudents.add(student17);
                listOfStudents.add(student18);
                listOfStudents.add(student19);
                //TODO Добавьте всех студентов в listOfStudents


                System.out.println("List of Students : ");
                System.out.println(listOfStudents);
                System.out.println("**********");


                System.out.println("TASK #1 :");
                for (Student student : listOfStudents) {
                    if (student.getGpa() > 3.5) {
                        System.out.println(student);
                    }
                }
                //TODO ЗАДАНИЕ 1: напечатайте всех студентов у кого GPA больше 3.5


                System.out.println("TASK #2 :");
                for (Student student : listOfStudents) {
                    if (student.getGpa() > 2.8 && student.getGpa() < 3.5) {
                        System.out.println(student);
                    }
                }
                //TODO ЗАДАНИЕ 2: напечатайте всех студентов у кого GPA больше 2.8 и меньше 3.5


                System.out.println("**********");

                Map<Integer, Student> mapOfStudents = new HashMap<>();
                int id = 0;
                for(Student student : listOfStudents) {
                    mapOfStudents.put(id++, student);
                }

                System.out.println("Список студентов с присвоенным ID : ");
                System.out.println(mapOfStudents);
                for (Map.Entry<Integer, Student> entry : mapOfStudents.entrySet()) {
                    if (entry.getValue().getAge() > 20) {
                        System.out.println(entry.getKey());
                    }
                }


                System.out.println("**********");
                System.out.println("TASK #4 :");
                for (Map.Entry<Integer, Student> entry : mapOfStudents.entrySet()) {
                    if (entry.getValue().getName().startsWith("A")){
                        System.out.println();
                    }
                }
                //TODO ЗАДАНИЕ 3: Напичатать ID тех студентов, у которых возраст больше 20.



                System.out.println("TASK #5 :");
                for (int i = 0; i < listOfStudents.size(); i++) {
                    Student student = listOfStudents.get(i);
                    // Check if the name of the student starts with the letter "A"
                    if (student.getName().startsWith("A")) {
                        // If so, print out the student's ID and full information
                        System.out.println("ID: " + i + ", " + student.toString());
                    }
                }
                //TODO ЗАДАНИЕ 4: Напичатать ID и полную информацию тех студентов, у которых имя начинается на А.


                System.out.println("   ---   END OF APP!   ---   ");
            }
        }

