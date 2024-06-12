import java.util.*;
import java.io.*;
public class FileEncrDecr{
    public static void decryption(int secretkey){
        try{
           Scanner sn=new Scanner(System.in);
           System.out.println("Enter file name:");
           String filename=sn.nextLine();
           FileInputStream din=new FileInputStream(filename);   //Attaching file to a FileInputStream
           String dencrypt="";
           int dn;
           while((dn=din.read())!=-1){      //Reading data from the file
            dn-=secretkey;                  //decrypting the data of file
            dencrypt=dencrypt+(char)dn;    
           }
           din.close();                     //closing the file
           write(dencrypt,'D');
        }
        catch(Exception e){
            System.out.print("Exception: "+e.getMessage());
        }
    }
    public static void write(String content,char check){
        if(check=='E'){
            try {
                FileWriter ew=new FileWriter("myfile2.txt");  
                for(int i=0;i<content.length();i++){
                    ew.write(content.charAt(i));    //writing the encrypted data into the new file
                }
                ew.close();        //closing the file
            }
            catch(Exception e) {
                System.out.println("Exception: "+e.getMessage());
            }
        }
        else{
            try{
                FileWriter dw=new FileWriter("myfile3.txt");  //opening file in write mode
                for(int i=0;i<content.length();i++){
                    dw.write(content.charAt(i));     //writing decrypted data into the new file
                }
                dw.close();   //closing the file
            }
            catch(Exception e){
                System.out.println("Exception: "+e.getMessage());
            }
        }
    }
    public static void encryption(int secretkey)
    {
        try {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the file name:");
            String filename=s.nextLine();
            FileInputStream ein=new FileInputStream(filename);  //Attaching file to a FileInputStream
            String encrypt="";
            int en;
            while((en=ein.read())!=-1){      //Reading data from the file
                en+=secretkey;             
                encrypt=encrypt+(char)en;    //Encrypting the data of file
            }
            ein.close();                     //closing the file
            write(encrypt,'E');  
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
    public static void input(){
        Scanner sn=new Scanner(System.in);
        System.out.println("Wants to Encrypts a file or Decrypts a file.");
        System.out.println("- For Encryption press E "+"\n- For Decryption press D");
        int secretkey=10;      //taking an random number as secret key
        char choice=sn.next().charAt(0);
        if(choice=='E')
        encryption(secretkey);
        else
        decryption(secretkey);
    }
    public static void main(String args[]){
        input();
    }
}
