package com.company;

import com.company.enums.Group;
import com.company.enums.classes.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static com.company.enums.Group.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Dima", 25, JAVA));
        students.add(new Student("Tima", 15, JAVA));
        students.add(new Student("Rob", 45, JAVASCRIPT));
        students.add(new Student("Bob", 24, JAVASCRIPT));
        students.add(new Student("Jim", 78, JAVA));
        students.add(new Student("Dan", 13, JAVASCRIPT));
        students.add(new Student("Azamat", 54, JAVA));
        students.add(new Student("Yura", 8, JAVASCRIPT));
        students.add(new Student("Alim", 32, JAVA));
        students.add(new Student("Salim", 62, JAVASCRIPT));
        students.add(new Student("Mira", 83, JAVA));
        students.add(new Student("Ira", 15, JAVASCRIPT));
        students.add(new Student("Sasha", 42, JAVASCRIPT));
        students.add(new Student("Masha", 70, JAVASCRIPT));
        students.add(new Student("Molya", 17, JAVA));
        students.add(new Student("Kolya", 12, JAVA));
        students.add(new Student("Pol", 24, JAVA));
        students.add(new Student("Mad", 20, JAVA));
        students.add(new Student("Chad", 12, JAVASCRIPT));
        students.add(new Student("Rad", 57, JAVA));
        students.add(new Student("Katana", 30, JAVASCRIPT));

        ArrayList<Student> javaGroupArrayList = new ArrayList<>();
        javaOnlyArrayList(students, javaGroupArrayList);
        printElementsOfArrayList(javaGroupArrayList);

        System.out.println("----------------------------------------------------------");

        ArrayList<Student> javascriptGroupArrayList = new ArrayList<>();
        javaScriptOnlyArrayList(students, javascriptGroupArrayList);
        printElementsOfArrayList(javascriptGroupArrayList);

        System.out.println("----------------------------------------------------------");

        ArrayList<Student> age18_25OnlyArrayList = new ArrayList<>();
        ageFilter(students, age18_25OnlyArrayList);
        printElementsOfArrayList(age18_25OnlyArrayList);

        System.out.println("----------------------------------------------------------");

        ArrayList<Student> nameFilterArrayList = new ArrayList<>();
        nameFilterMethod(students, nameFilterArrayList);
        printElementsOfArrayList(nameFilterArrayList);

        System.out.println("----------------------------------------------------------");

        ArrayList<Student> java30YearsArrayList = new ArrayList<>();
        javaYearFilter(javaGroupArrayList, java30YearsArrayList);
        printElementsOfArrayList(java30YearsArrayList);

        System.out.println("----------------------------------------------------------");

        ArrayList<Student> javaScriptNameArrayList = new ArrayList<>();
        javaScriptNameFilter(javascriptGroupArrayList, javaScriptNameArrayList);
        printElementsOfArrayList(javaScriptNameArrayList);

        System.out.println("----------------------------------------------------------");

        ArrayList<Student> moreThan16AgeArrayList = new ArrayList<>();
        age16RemoveMethod(students, moreThan16AgeArrayList);
        printElementsOfArrayList(moreThan16AgeArrayList);

    }
    public static void age16RemoveMethod(ArrayList<Student> students, ArrayList<Student> moreThan16AgeArrayList) {
        moreThan16AgeArrayList.addAll(students);
        moreThan16AgeArrayList.removeIf(i -> i.getAge() < 16);
    }

    public static void javaScriptNameFilter(ArrayList<Student> javascriptGroupArrayList,
                                            ArrayList<Student> javaScriptNameArrayList) {
        for(Student i: javascriptGroupArrayList) {
            if(i.getName().contains("K")) {
                javaScriptNameArrayList.add(i);
            }
        }

    }

    public static void javaYearFilter(ArrayList<Student> javaGroupArrayList, ArrayList<Student> java30YearsArrayList) {
        for(Student i: javaGroupArrayList) {
            if(i.getAge() > 30) {
                java30YearsArrayList.add(i);
            }
        }
    }

    public static void nameFilterMethod(List<Student> students, ArrayList<Student> nameFilterArrayList) {
        char letter = 'A';
        for(Student i: students) {
            if(i.getName().charAt(0) == letter) {
                nameFilterArrayList.add(i);
            }
        }
    }

    public static void ageFilter(List<Student> students, ArrayList<Student> age18_25OnlyArrayList) {
        for(Student i: students) {
            if(i.getAge() <= 25 && i.getAge() >= 18) {
                age18_25OnlyArrayList.add(i);
            }
        }
    }

    public static void javaScriptOnlyArrayList(List<Student> students, ArrayList<Student> javascriptGroupArrayList) {
        for(Student i: students) {
            if (i.getGroup().equals(JAVASCRIPT)) {
                javascriptGroupArrayList.add(i);

            }
        }
    }

    public static void printElementsOfArrayList(ArrayList<Student> str) {
        for(Student i: str) {
            System.out.println(i + " ");
        }
    }

    public static void javaOnlyArrayList(List<Student> students, ArrayList<Student> javaGroupArrayList) {
        for(Student i: students) {
            if(i.getGroup().equals(JAVA)) {
                javaGroupArrayList.add(i);

            }
        }
    }
}
