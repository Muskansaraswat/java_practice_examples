package java_practice.oopsconcepts;
 class Details {
    int roll_no;
    String name;
    String company_name;

   Details() {
        company_name = "GOOGLE";
    }

}
public class MyConstructor{
    public static void main(String[] args) {
            Details emp1=new Details();
            emp1.roll_no=1;
            emp1.name="Avinash";
            System.out.println("Employee One:\n"+emp1.roll_no+" "+emp1.name+" "+emp1.company_name);
            Details emp2=new Details();
            emp2.roll_no=2;
            emp2.name="Abhishek";
            System.out.println("Employee Two:\n"+emp2.roll_no+" "+emp2.name+" "+emp2.company_name);

    }
}

