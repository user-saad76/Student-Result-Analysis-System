

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
               double Average =  (double) sum/totalSubjects;
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
                         System.out.println(students[row] + "has passed in " + subjects[column]);
                     }
                 }
             }
    }
    static void calculateGrade(int[][] marks,String[] students,int totalStudents,int totalSubjects,String[] subjects){
                   for(int row = 0;row<totalStudents;row++){
                       for(int column = 0;column<totalSubjects;column++){
                           if(marks[row][column]>=90){
                               System.out.println(students[row] + " has got A grade in " + subjects[column]);
                           }
                           else if(marks[row][column]<90&&marks[row][column]>=75){
                               System.out.println(students[row] + " has got B grade in " + subjects[column]);
                           }
                           else if(marks[row][column]<75&&marks[row][column]>=55){
                               System.out.println(students[row] + " has got C grade in " + subjects[column]);
                           }
                           else if(marks[row][column]<55&&marks[row][column]>=40){
                               System.out.println(students[row] + " has got D grade in " + subjects[column]);
                           }
                           else{
                               System.out.println(students[row] + " has got F grade in " + subjects[column]);
                           }
                       }
                   }
    }
     static void highestMark(int[][] marks,String[] students,int totalStudents,int totalSubjects){

                 String student  = " ";
                 int highest = 0;
                 for(int row = 0;row<totalStudents;row++){
                     int sum = 0;
                     for(int column = 0;column<totalSubjects;column++){
                        sum = sum + marks[row][column];

                     }
                     if(sum>highest){
                         highest = sum;
                         student = students[row];
                     }

                 }
           System.out.println(student + " has got highest total marks " + highest);
     }
     static void subjectHighestScore(int[][] marks,String[] students,int totalStudents,int totalSubjects,String[] subjects){

                  String subject = " ";
                  for(int row = 0;row<totalStudents;row++){
                      int highest = 0;
                      for(int column = 0;column<totalSubjects;column++){
                         if(marks[row][column]>highest){
                             highest = marks[row][column];
                             subject = subjects[column];
                         }
                      }
                      System.out.println(students[row] + " has got highest score " + highest + " in " + subject);
                  }




     }
   static void CountfailedStudent(int[][] marks,int totalStudents,int totalSubjects){
          int count = 0;
         for(int row = 0;row<totalStudents;row++){
             for(int column = 0;column<totalSubjects;column++){
                 if(marks[row][column]<40){
                     count++;
                     break;
                 }
             }
         }
       System.out.println("There are total " + count + " failed students");
   }
   static void SpecialSearch(int[][] marks,String[] students,int totalStudents,int totalSubjects,String[] subjects,String search){
        boolean isSearch = false;
        for(int row = 0;row<totalStudents;row++){
            if(search.equalsIgnoreCase(students[row])){
                for(int i = 0;i<totalSubjects;i++){
                    System.out.print(subjects[i] + " ");
                }
                System.out.println();
                for(int column = 0;column<totalSubjects;column++){
                    System.out.print(marks[row][column] + " ");
                }
                System.out.println();
                isSearch = true;
            }
        }
        if(!isSearch){
            System.out.println("You have search invalid ");
        }
   }

   static void SubjectWiseAverage(int[][] marks,int totalStudents,int totalSubjects ,String[] students,String[] subjects){
         for(int column = 0;column<totalSubjects;column++){
             int sum = 0;
             for(int row = 0;row<totalStudents;row++){
                  sum = sum + marks[row][column];
             }
             int average = sum/totalStudents;
             System.out.println(subjects[column] + " average: " + average);

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
        for(int y= 0;y<totalSubjects;y++){
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
        System.out.println("6,Find highest score student in subjects ");
        System.out.println("7,Find failed students count ");
        System.out.println("8,Specific student search ");
        System.out.println("9,Calculate subject wise Average ");
        System.out.println("10,Exit ");
        System.out.println();
         int choice = 0;
        while(choice!=10){
            System.out.print("Enter your choice : ");
             choice = input.nextInt();
           if(choice==1){
               System.out.println("Total marks of students : ");
               System.out.println();
               TotalMarksOfStudents(marks,students,totalStudents, totalSubjects);


           }
           else if(choice == 2){
               System.out.println("Average of students : ");
               System.out.println("******************************************");
               Average(marks,students,totalStudents,totalSubjects);
               System.out.println("******************************************");

           }
           else if(choice == 3){
               System.out.println("Pass/Fail subjects of all students :");
               System.out.println("******************************************");
               checkFailPass(marks,students,totalStudents,totalSubjects,subjects);
               System.out.println("******************************************");

           }
           else if(choice == 4){
               System.out.println("Grades of students in subjects");
               System.out.println("******************************************");
               calculateGrade( marks,students,totalStudents,totalSubjects,subjects);
               System.out.println("******************************************");


           }
           else if(choice == 5){
               System.out.println(" Student who get highest marks : ");
               System.out.println();
               highestMark(marks,students, totalStudents, totalSubjects);

           }
           else if(choice == 6){
               System.out.println(" Students score highest in subject : ");
               System.out.println();
               subjectHighestScore( marks, students,totalStudents, totalSubjects, subjects);

           }
           else if(choice == 7){
               System.out.println(" Failed students : ");
               System.out.println();
               CountfailedStudent(marks,totalStudents,totalSubjects);
           }
           else if(choice == 8){
               input.nextLine();
               System.out.print("Search the specific student : ");
               String search = input.nextLine();
               SpecialSearch( marks, students, totalStudents,totalSubjects,subjects, search);

           }
           else if(choice == 9){
               System.out.println(" Subject-wise average :");
               SubjectWiseAverage( marks, totalStudents, totalSubjects ,students,subjects);
           }
           else{
               System.out.println("You have invalid choice ");
           }
        }

    }
}
