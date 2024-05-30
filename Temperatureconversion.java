import java.util.Scanner;
public class Temperatureconversion{
    public static void conversion(char unit,double temp){
    Scanner n=new Scanner(System.in);
        switch(unit){
            case 'F':{
                double F=temp*(double)9/5+32;
                System.out.println("The temperature "+temp+" in Fahrenheit is:\n"+F+" Degree Fahrenheit");
            }
            break;
            case 'C':{
                double C=(double)5/9*(temp-32);
                System.out.println("The temperature "+temp+" in Celsius is:\n"+C+" Degree Celsius");
            }
            break;
            default:{System.out.println("Enter valid unit of temperature.");
            System.out.println("Wants to try again\n"+"Y for Yes and N for No");
            char ag=n.next().charAt(0);
            if(ag=='Y'){
                input();
            }
            }
            break;
        }
    }
    public static void input(){
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the temperature:");
        double temp=sn.nextDouble();
        System.out.println("Enter the temperature you want to convert. Enter accordingly:");
        System.out.println("1- For Celsius enter C"+"\n"+"2- For Fahrenheit enter F");
        char unit=sn.next().charAt(0);
        conversion(unit,temp);
    }
    public static void main(String args[]){
      input();
    }
}

