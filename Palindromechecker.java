import java.util.*;
public class Palindromechecker{
    public static void check(String q){
        String p="",a="";        //taken two empty string
        String w=q.toLowerCase();      //converting whole string into lowercase
        for(int i=0;i<w.length();i++){
            int t=w.length()-i-1;
            if((Character.isLetter(w.charAt(t)))){    //Checking whether at index t of given string is a character or not
                p=p+w.charAt(t);
            }
            if((Character.isLetter(w.charAt(i)))){
                a=a+w.charAt(i);
            }
        }
        if((a.compareTo(p))==0){       //Comapring to string
            System.out.println("The word or phrase "+q+" is a PALINDROME.");
        }
        else{
            System.out.println("The word or phrase "+q+" is NOT A PALINDROME.");
        }
    }
    public static void main(String args[]){
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the word or phrase you want to check:");
        String s=sn.nextLine();
        check(s);
    }
}
