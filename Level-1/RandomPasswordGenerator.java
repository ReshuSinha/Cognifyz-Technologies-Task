import java.util.*;
public class RandomPasswordGenerator{
    public static void passwordgenerator(int len){
        Scanner s=new Scanner(System.in);
        String upperal="ABCDEFGHIJKLMNOPQRSTUVWXYZ";       
        String loweral="abcdefghijklmnopqrstuvwxyz";  
        String num="0123456789";                          
        String specialchar="<>,.?/{}+=-!@#$%^&*_:|;'()[]~";   
        String combination=upperal+loweral+specialchar+num;    //Concatenation of all the string
        StringBuilder sb=new StringBuilder();                  //Creating a string builder
        Random ran=new Random();                               //Creating an object of random class
        for(int i=0;i<len;i++){
            //generate random index number
            int index=ran.nextInt(combination.length());
            //Appending that random index character from the combination string to sb string builder
            sb.append(combination.charAt(index));
        }  
        System.out.println(sb);
        System.out.println("Wants to try again. For yes enter Y and for no enter N:");
        char choice=s.next().charAt(0);
        if(choice=='Y'){
            input();
        }
     }
    public static void input(){
        Scanner sn=new Scanner(System.in);
        System.out.println("Please enter the password length:");
        int len=sn.nextInt();
        passwordgenerator(len);
    }
    public static void main(String args[]){
        input();
    }
}  
