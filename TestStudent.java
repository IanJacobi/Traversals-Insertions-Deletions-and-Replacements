import java.util.*;
public class TestStudent
{
   public static void main (String [ ] args)
   {
      ArrayList<Student> myClass = new ArrayList<Student>();
         myClass.add(new Student("Mark Kennedy", 70, 80, 90, 100, 90));
         myClass.add(new Student("Max Gerard", 80, 85, 90, 85, 80));
         myClass.add(new Student("Jean Smith", 50, 79, 89, 99, 100));
         myClass.add(new Student("Betty Farm", 85, 80, 85, 88, 89));
         myClass.add(new Student("Dilbert Gamma", 70, 70, 90, 70, 80));
      System.out.println("Starting grade book");
      printBook(myClass);
      replaceName(myClass, "Betty Farm", "Betty Boop");
      System.out.println();
      System.out.println("Changed Betty's name to Betty Boop");
      printBook(myClass);
      replaceQuiz(myClass, "Jean Smith", 80, 1);
      System.out.println();
      System.out.println("Changed Jean's q1 grade to 80");
      printBook(myClass);
      replaceStudent(myClass, "Dilbert Gamma", 80 , 80 , 80 ,90 , 90 , "Mike Kappa");
      System.out.println();
      System.out.println("Replaced Dilbert Gamma with Mike Kappa");
      printBook(myClass);
      System.out.println();
      System.out.println("Inserting Lily Mu 85 95 70 0 100 Before Betty");
      insertStudent(myClass, "Betty Boop", 85, 95, 70, 0, 100, "Lily Mu");
      printBook(myClass);
      System.out.println();
      System.out.println("Deleting Max Gerard");
      removeStudent(myClass, "Max Gerard");
      printBook(myClass);
   }
   public static void printBook(ArrayList<Student> a)
   {
      System.out.printf("%14s :  %3s  %3s  %3s  %3s %3s %n","Candidate","Q1","Q2","Q3","Q4","Q5");
      for(int i = 0; i < a.size(); i++)
      {
         a.get(i).myToString();
         //String s = a.get(i).toString();
         //System.out.printf(" %20s %n",s);
      }
   }
   public static void replaceName(ArrayList<Student> e, String n, String newName)
   {
      for(int i = 0; i < e.size(); i ++)
      {
         if(e.get(i).name.equals(n))
         {
            e.get(i).name = newName;
         }
         
      }
   } 
   public static void replaceQuiz(ArrayList<Student> q, String n, int newScore, int quiz)
   {
      for(int i = 0; i < q.size(); i ++)
      {
         if(q.get(i).name.equals(n))
         {
            q.get(i).setQuiz(quiz, newScore);
         }
         
      }
   } 
   public static ArrayList<Student> insertStudent(ArrayList<Student> e, String n, int qz1,int qz2,int qz3,int qz4,int qz5, String newName)
   {
      for(int i = 0; i < e.size(); i ++)
      {
         if(e.get(i).name.equals(n))
         {
            e.add(i, new Student(newName, qz1, qz2, qz3, qz4, qz5));
            return e;
         }
         
      }
      return e;
   } 
   public static ArrayList<Student> removeStudent(ArrayList<Student> e, String n)
   {
      for(int i = 0; i < e.size(); i ++)
      {
         if(e.get(i).name.equals(n))
         {
            e.remove(i);
            return e;
         }
      }
      return e;
   }
   public static ArrayList<Student> replaceStudent(ArrayList<Student> e, String n, int qz1,int qz2,int qz3,int qz4,int qz5, String newName)   {
      replaceName(e, n, newName);
      replaceQuiz(e, newName, qz1, 1);   
      replaceQuiz(e, newName, qz2, 2); 
      replaceQuiz(e, newName, qz3, 3);
      replaceQuiz(e, newName, qz4, 4); 
      replaceQuiz(e, newName, qz5, 5); 
      return e;
   } 

}