
import java.util.Scanner;

public class main {


    static void TotalMarksOfStudents(int[][] marks,String[] students, int totalStudents,int totalSubjects){
        for(int i = 0;i<totalStudents;i++){
            int sum = 0;
            for(int j = 0;j<totalSubjects;j++){
               sum = sum + marks[i][j];
            }
            System.out.println(students[i] + " has total marks = " + sum);
        }
    }
    static void Average(int[][] marks,String[] students,int totalStudents,int totalSubjects){
           for(int row = 0;row<totalStudents;row++){
               int sum = 0;
               for(int column = 0;column<totalSubjects;column++){
                   sum = sum + marks[row][column];
               }
               double Average = sum/totalStudents;
               System.out.println(students[row] + " has average = " + Average);
           }
    }
    static void checkFailPass(int[][] marks,String[] students,int totalStudents,int totalSubjects,String[] subjects){
             for(int row = 0;row<totalStudents;row++){
                 for(int column = 0;column<totalSubjects;column++){
                     if(marks[row][column]<40){
                         System.out.println(students[row] + "has failed in " + subjects[column]);
                     }
                     else{
                         System.out.println(students[row] + "has failed in " + subjects[column]);
                     }
                 }
             }
    }







    public static void main(String[] args) {
        System.out.println("****************Student Result & Analysis System********************");
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter total students : ");
         int totalStudents = input.nextInt();
        System.out.print("Enter total subjects : ");
        int totalSubjects = input.nextInt();
        input.nextLine();
        String[] students = new String[totalStudents];
        String[] subjects = new String[totalSubjects];
        System.out.println();
        for( int n = 0;n<totalStudents;n++){
            System.out.print("Enter student name " + (n+1) + " : ");
            students[n] = input.nextLine();
        }
        System.out.println();
        System.out.println("Subjects: ");
        for(int i = 0;i<totalSubjects;i++){
            System.out.print("Enter subject name " + (i+1) + " : ");
            subjects[i] = input.nextLine();
        }
//        for(int x = 0;x<totalStudents;x++){
//            System.out.println(students[x]);
//        }
        System.out.println("Marks : ");
        int[][] marks = new int[totalStudents][totalSubjects];
        for(int row = 0;row<totalStudents;row++){
            System.out.println("Student : " + students[row]);
            for(int column = 0;column<totalSubjects;column++){
                System.out.println("Subject : " + subjects[column]);
                System.out.print("Enter marks out of 100 : ");
                 marks[row][column] = input.nextInt();
            }
        }
        System.out.println();
        for(int y= 0;y<totalStudents;y++){
            System.out.print(subjects[y] + "   ");
        }
        System.out.println();
        for(int row = 0;row<totalStudents;row++){
            for(int column = 0;column<totalSubjects;column++){
                System.out.print(marks[row][column]  + "   ");
            }
            System.out.println(students[row]  + "   ");
        }
        System.out.println();

        System.out.println("*********FEATURES**********");
        System.out.println("1,Calculate total marks of students");
        System.out.println("2,Calculate average ");
        System.out.println("3,Check Fail/Pass ");
        System.out.println("4,Calculate grade ");
        System.out.println("5,Find highest marks student ");
        System.out.println("6,Find failed students count ");
        System.out.println("7,Calculate subject wise Average ");
        System.out.println("8,Specific student search ");
        System.out.println("9,Exit ");
        int t = 0;
        System.out.println();
        System.out.print("Enter your choice : ");
        int choice = input.nextInt();
        boolean isMove = false;
        while(t<=8){
           if(choice==1){
               System.out.println("Total marks of students : ");
               System.out.println();
               TotalMarksOfStudents(marks,students,totalStudents, totalSubjects);
               isMove = true;

           }
           else if(choice == 2){
               System.out.println("Average of students : ");
               Average(marks,students,totalStudents,totalSubjects);
               isMove = true;

           }
           else if(choice == 3){
               System.out.println("Pass/Fail subjects of all students :");
               checkFailPass(marks,students,totalStudents,totalSubjects,subjects);
               isMove = true;
           }
           else if(choice == 4){
               isMove = true;
           }
           else if(choice == 5){
               isMove = true;
           }
           else if(choice == 6){
               isMove = true;
           }
           else if(choice == 7){
               isMove = true;
           }
           else if(choice == 8){
               isMove = true;
           }
           else if(choice == 9){

           }
            if(isMove){
                t++;
            }
            else{
                break;
            }

        }

    }
}
