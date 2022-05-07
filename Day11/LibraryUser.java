
interface  KidUsers//
 {
 int age;
    String booktype;
   void registerAccount();//function
   if(age<12)
   {
   System.out.println("You have succesfully registered under Kids Account");
   }   
    if(age>12)
    {
   System.out.println("Sorry, Age must be greater than 12 to register  ");
   }
   void requestBook();//method
   if(booktype==kids)
    {
    System.out.println("Book issued succefully Plz return the book within 10 days");
    else()
    {
    System.out.println("Oops,you are allowed to take only kids books");
    }

 }
 
interface  AdultUsers//
 {

   int age;
    String booktype;
    
void registerAccount();//function
   if(age>12)
   {
   System.out.println("You have succesfully registered under Adult Account");
   }
   if(age<12)
   {
   System.out.println("Sorry, Age must be greater than 12 to register as an adult ");
   }
    void requestBook();//method
   if(booktype==fiction)
   {
   System.out.println("Book issued succefully Plz return the book within 7 days");
   else()
   {
   System.out.println("Oops,you are allowed to take only adult fiction books");}
   }
   


 }
 
 
class LibraryUser implements kidUser, AdultUser//

{
   @Override
   public void registerAccount(int age,String booktype);
   {
   }
   public void requestBook(int age,String booktype);
   {
   }//kid
   
   @Override
   public void registerAccount(int age,String booktype);
   {
   }
   public void requestBook(int age,String booktype);
   {
   }//adult

}

class LibraryInterfaceDemo
 {
public static void main(String[] args)
{
   KidUser ob=new KidUser();
   AdultUser ob1=new  AdultUser();
   ob.registerAccount();
   ob.requestBook();
    ob1.registerAccount();
   ob1.requestBook();
   
   

   
   
}
}
