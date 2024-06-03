import java.util.Scanner;
public class PasswordStrengthChecker{
    public static void check(String pass){
        int u=0,l=0,n=0,s=0;
        for(int i=0;i<pass.length();i++){
            if(Character.isUpperCase(pass.charAt(i)))     //check for uppercase letters
            u++;
            if(Character.isLowerCase(pass.charAt(i)))     //check for lowercase letter
            l++;
            if(Character.isDigit(pass.charAt(i)))         //check for numbers
            n++;
            if(!Character.isLetter(pass.charAt(i))&&!Character.isDigit(pass.charAt(i))&&!Character.isWhitespace(pass.charAt(i)))  //check for special characters
            s++;
        }
        if(u!=0&&l!=0&&n!=0&&s!=0)
        System.out.println("STRONG PASSWORD!");
        else{
            System.out.println("WEAK PASSWORD!");
            System.out.println("Password must contain:"+"\n1- At least one number.\n2- At least one Lowercase letter.\n3- At least one Uppercase letter.\n4- At least one special character.");
            System.out.println("ENTER AGAIN!\n");
            input();
        }
    }
    public static void input(){
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the password:");
        String pass=sn.nextLine();
        check(pass);
    }
    public static void main(String args[]){
        input();
    }
}
