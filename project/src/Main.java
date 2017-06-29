
//import java.util.Date;



public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Ivanov", 20, 'm', "Java Elementary");
        Student student2 = new Student("Petr", "Petrov", 18, 'm', "Java Elementary");
        Student student3 = new Student("Igor", "Sidorov", 23, 'm', "Java Elementary");
        Student student4 = new Student("Illya", "Koval", 22, 'm', "Java Elementary");
        Student student5 = new Student("Anna", "Popova", 19, 'f', "Java Elementary");

        Teacher teacher1 = new Teacher("Oleg", "Ivanchenko", 27, 'm', "Java");
        Teacher teacher2 = new Teacher("Anton", "Doyle", 28, 'm', "PHP");
        Teacher teacher3 = new Teacher("Mariya", "Sinichkina", 23, 'f', "English");

        Group group1 = new Group("Java Elementary", 4);
        Group group2 = new Group("PHP Elementary", 3);

        String s1 = student1.printStudentInfo();
        System.out.println(s1);
        String s2 = student2.printStudentInfo();
        System.out.println(s2);
        String s3 = student3.printStudentInfo();
        System.out.println(s3);
        String s4 = student4.printStudentInfo();
        System.out.println(s4);
        String s5 = student5.printStudentInfo();
        System.out.println(s5);

        System.out.println();

        String t1 = teacher1.printTeacherInfo();
        System.out.println(t1);
        String t2 = teacher2.printTeacherInfo();
        System.out.println(t2);
        String t3 = teacher3.printTeacherInfo();
        System.out.println(t3);

        System.out.println();

        String g1 = group1.printGroupInfo();
        System.out.println(g1);
        String g2 = group2.printGroupInfo();
        System.out.println(g2);

    }


}