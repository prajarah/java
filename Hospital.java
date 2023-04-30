import java.util.*;


class Facility{
    int v;
             int x;
    void features(){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome Sarvodaya Hospital");
        System.out.println("Home Page");
        System.out.println("press key 1 to 7 for below information");
        System.out.println("1: Doctors speciality");
        System.out.println("2: toll free number");
        System.out.println("3: ambulance");
        System.out.println("4: Beds Facility");
        System.out.println("5: Emergncy Service ");
        System.out.println("6: log into account");
        System.out.println("7: New Registration");
       
       
       
        x=input.nextInt();
       
        switch(x) {
            case 1:{
            System.out.println("doctors and specification");
            System.out.println("Rohan: Bone Specilalist");
            System.out.println("Mohan: Dentist");
            System.out.println("Sohan: Eye Specialist");
        break;}

            case 2:{

            System.out.println("you can consult doctor free on toll free number  18001234");
        break;}

        case 3:{
            System.out.println("call 	 ambulance on toll free number 18004455");
            break;
        }
        case 4:
        System.out.println("There are 18 numbers of beds in hospital");
        System.out.println("press on v to get the information of vacant bed");
        String v=input.next();
        if(v=="v")
        System.out.println("3 beds are vacant as per pattern");
        System.out.println("Entry point O O O O O O");
        System.out.println("            V O O O O V");
        System.out.println("            O O O V O O");


        break;
        
        case 5:
        System.out.println("Emergency Service");
        
        case 6:

       
        System.out.println("enter userame");
         String s=input.next();
        System.out.println("enetr pswd");
         int x=input.nextInt();
         
         if(s.equals("rahul") && x==123){
            System.out.println("welcome rahul to Sarvodaya Hospital");

            System.out.println("click on money to see charges");
 String c1=input.next();
if(c1.equals("money")){
           int charges=18516;
System.out.println("your charges are 18516, click on submit to submit fees");
String s2=input.next();
if(s2.equals("submit"))

do{
    System.out.println("choose method UPI|  DEBIT CARD | CREDIT CARD");
System.out.println("ENTER AMOUNT");
int amount=input.nextInt();
System.out.println("OTP sent to your phone");

System.out.println("processing.....fees submitted");
   
   charges=charges-amount;
}while(charges>0);
System.out.println("You can take your patient HOME");}
            
            }
            else if(s.equals("bhola")&& x==456){
                System.out.println("welcome bhola to Sarvodaya Hospital");

                System.out.println("click on money to see charges");
 String c1=input.next();
if(c1.equals("money")){
           int charges=10916;
System.out.println("your charges are 10916, click on submit to submit fees");
String s2=input.next();
if(s2.equals("submit"))

do{
    System.out.println("choose method UPI|  DEBIT CARD | CREDIT CARD");
System.out.println("ENTER AMOUNT");
int amount=input.nextInt();
System.out.println("OTP sent to your phone");

System.out.println("processing.....fees submitted");
   
   charges=charges-amount;
}while(charges>0);
System.out.println("You can take your patient HOME");}
        }
            else 
            System.out.println("username and password are incorrect");

            case 7:
            System.out.println("enter name");
            String name=input.next();
System.out.println("enter age");
            int age=input.nextInt();
            System.out.println("Occupation");
            String Occ=input.next();
            System.out.println("enter symptoms");
            String symptoms=input.next();
            System.out.println(name+" "+age+" "+" Occupation is " +Occ+" "+"Registerd succesfully");





        }


    }
}

class Hospital{
    public static void main(String[] args) {
        
    Facility f=new Facility();
        f.features();
        
      }

}