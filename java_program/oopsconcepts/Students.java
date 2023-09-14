package java_practice.oopsconcepts;
//There are many ways to copy the values of one object into another in Java. They are:
//By constructor
//By assigning the values of one object into another
//By clone() method of Object class

  class Students{
      //In this example, we are going to copy the values of one object into another using Java constructor.
      //Java program to initialize the values from one object to another object.
      int id;
      String name;
      //constructor to initialize integer and string
      Students(int i,String n){
          id = i;
          name = n;
      }
      //constructor to initialize another object
      Students(Students s){
          id =id;
          name =name;
      }
      void display(){System.out.println(id+" "+name);}

      public static void main(String args[]){
          Students s1 = new Students(111,"Karan");
          Students s2 = new Students(s1);
          s1.display();
          s2.display();
      }
  }

