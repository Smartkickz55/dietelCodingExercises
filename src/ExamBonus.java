import java.util.Scanner;
public class ExamBonus {
 public static void main(String[] args){

 Scanner input = new Scanner(System.in);
int pass = 0;
int fail = 0;
int gradeCounter = 1;

  while (gradeCounter <= 6) {
 System.out.print("Enter result (1 = pass, 2 = fail):");
  int result = input.nextInt();

if (result == 1){
  pass = pass + 1;

}
else{
  fail = fail + 1;
}
 
 gradeCounter = gradeCounter + 1;

}
System.out.printf("Pass: %d%nFail: %d%n", pass, fail);

 if (pass > 3) {
   System.out.println("Bonus awarded!");
}

}


}