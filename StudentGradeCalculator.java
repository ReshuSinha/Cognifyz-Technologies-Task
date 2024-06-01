import java.util.Scanner;
public class StudentGradeCalculator{
    public static void cal(double total,int numgrade){
        int avg=(int)total/numgrade;
        char grade;
        switch (avg/10) {
            case 9:
                System.out.println("Average marks: "+avg+"\nGrade: A1");
                break;
            case 8:
                System.out.println("Average marks: "+avg+"\nGrade: A2");
                break;
            case 7:
                System.out.println("Average marks: "+avg+"\nGrade: B1");
                break;
            case 6:
                System.out.println("Average marks: "+avg+"\nGrade:  B2");
                break;
            case 5:
                System.out.println("Average marks: "+avg+"\nGrade: C1");
                break;
            case 4:
                System.out.println("Average marks: "+avg+"\nGrade: C2");
                break;
            case 3:
                System.out.println("Average marks: "+avg+"\nGrade: D");
                break;
            case 2:
                System.out.println("Average marks: "+avg+"\nGrade: E1");
                break;
            default:
                grade='E';
                break;
        }
    }
    public static void input(){
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the number of grades you want to enter:");
        int numgrade=sn.nextInt();
        System.out.println("Enter each grade:");
        double marks[]=new double[numgrade];
        double total=0.0;
        for(int i=0;i<numgrade;i++){
            marks[i]=sn.nextDouble();
            total=total+marks[i];
        }
        cal(total,numgrade);
    }
    public static void main(String args[]){
        input();
    }
}
