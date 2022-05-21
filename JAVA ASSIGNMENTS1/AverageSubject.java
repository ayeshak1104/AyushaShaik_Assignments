import java.util.Scanner;
public class AverageSubject {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks of student 1:");
    System.out.println("Subject A:");
    int a = sc.nextInt();
    
    System.out.println("Subject B:");
    int b = sc.nextInt();
    
    System.out.println("Subject C:");
    int c = sc.nextInt();
    
    System.out.println("Enter the marks of student 2:");
    System.out.println("Subject A:");
    int a1 = sc.nextInt();
    
    System.out.println("Subject B:");
    int b1 = sc.nextInt();
    
    System.out.println("Subject C:");
    int c1 = sc.nextInt();
    
    System.out.println("Enter the marks of student 3:");
    System.out.println("Subject A:");
    int a2 = sc.nextInt();
    
    System.out.println("Subject B:");
    int b2 = sc.nextInt();
    
    System.out.println("Subject C:");
    int c2 = sc.nextInt();
    
    int sum1 = a+b+c;
    int sum2 = a1+b1+c1;
    int sum3 = a2+b2+c2;
    
    int avg1 = sum1/3;
    int avg2 = sum2/3;
    int avg3 = sum3/3;
    
    int A_subTotal = a+a1+a2; // sub A sum for 3 students
    int B_subTotal = b+b1+b2; // sub B sum for 3 students
    int C_subTotal = c+c1+c2; // sub C sum for 3 students
    
    int A_Avg = A_subTotal/3;
    int B_Avg = B_subTotal/3;
    int C_Avg = C_subTotal/3;
    
    System.out.println("student 1 total " +sum1+ " and average marks "+avg1);
    System.out.println("student 2 total " +sum2+ " and average marks "+avg2);
    System.out.println("student 3 total " +sum3+ " and average marks "+avg3);
    
    System.out.println("student Subject A total " +A_subTotal+ " and average marks "+A_Avg);
    System.out.println("student Subject B total " +B_subTotal+ " and average marks "+B_Avg);
    System.out.println("student Subject C total " +C_subTotal+ " and average marks "+C_Avg);
    
        }
    }
    