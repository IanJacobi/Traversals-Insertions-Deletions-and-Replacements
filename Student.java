public class Student
{
   public String name;
   public int qz1;
   public int qz2;
   public int qz3;
   public int qz4;
   public int qz5;

   public Student(String name, int qz1, int qz2, int qz3, int qz4, int qz5)
   {
   this.name = name;
   this.qz1 = qz1;
   this.qz2 = qz2;
   this.qz3 = qz3;
   this.qz4 = qz4;
   this.qz5 = qz5;
   }
   public int getQuiz(int q)
   {
      if(q == 1)
      {
         return qz1;
      }
      else if(q == 2)
      {
         return qz2;
      }
      else if(q == 3)
      {
         return qz3;
      }
      else if(q == 4)
      {
         return qz4;
      }
      else if(q == 5)
      {
         return qz5;
      }
      return 0;
   }
   public void setQuiz(int q, int s)
   {
   {
      if(q == 1)
      {
         qz1 = s;
      }
      else if(q == 2)
      {
         qz2 = s;
      }
      else if(q == 3)
      {
         qz3 = s;
      }
      else if(q == 4)
      {
         qz4 = s;
      }
      else if(q == 5)
      {
         qz5 = s;
      }
      
   }  
   }
   public void myToString()
   {
      System.out.printf("%14s :  %3d  %3d  %3d  %3d %3d %n",name,qz1,qz2,qz3,qz4,qz5);
      //return name + ": " + qz1 + " " + qz2 + " " + qz3 + " " + qz4 + " " + qz5;
   }
}