package handle;

import entity.Student;

import java.util.Scanner;

public class StudentHandle {
    public Student creatStudent(Scanner sc) {
        Student student = new Student();
        System.out.println("Enter your name: ");
        student.setName(sc.nextLine());
        student.setScoreMath(inputScore(sc, "Math"));
        student.setScoreChemistry(inputScore(sc, "Chemistry"));
        student.setScorePhysic(inputScore(sc, "Physic"));
        return student;
    }

    public double inputScore(Scanner sc, String subject) {
        double score = -1;
        while (score < 0 || score > 10) {
            System.out.println("Enter your score of " + subject + ": ");
            score = Double.parseDouble(sc.nextLine());
            if (score < 0 || score > 10) {
                System.out.print("Score must be between 0 and 10. Please try again! ");
            }
        }
        return score;
    }


    public double getAverage(Student student) {
        return (student.getScoreMath() + student.getScoreChemistry() + student.getScorePhysic()) / 3;
    }

    public String getGrade(double scoreAverage) {
        if (scoreAverage >= 8) {
            return "- Grade: A";
        } else if (scoreAverage < 8 && scoreAverage >= 6.5) {
            return "- Grade: B";
        } else {
            return "- Grade: C";
        }
    }

    public void displayAllStudent(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
            System.out.println("- Average Score = " + getAverage(student));
            System.out.println(getGrade(getAverage(student)) + "\n");
        }
    }


    public void percentageEachGrade(Student[] students) {
        int countGradeA = 0;
        int countGradeB = 0;
        int countGradeC = 0;
        for (Student student : students) {
            String grade = getGrade(getAverage(student));
            if (grade.equals("- Grade: A")) {
                countGradeA++;
            } else if (grade.equals("- Grade: B")) {
                countGradeB++;
            } else {
                countGradeC++;
            }
        }
            int total = countGradeA + countGradeB + countGradeC;
            double percentA = Math.round(((double) countGradeA / total) * 100);
            double percentB = Math.round(((double) countGradeB / total) * 100);
            double percentC = Math.round(((double) countGradeC / total) * 100);
            System.out.println("Percentage of each type of student:");
            System.out.println("- A: " + percentA + "%");
            System.out.println("- B: " + percentB + "%");
            System.out.println("- C: " + percentC + "%");

    }
}


