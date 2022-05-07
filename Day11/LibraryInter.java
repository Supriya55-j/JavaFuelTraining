interface LibraryUser{
 void registerAccount(int age);
 void requestBook(String book);
}
class KidUsers implements LibraryUser{
    int age;
    String book;
    @Override
    public void registerAccount(int age) {
        this.age = age;
        if(age>12){
        System.out.println("You have successfully registered under a Kids Account");
        }else{
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook(String book) {
        this.book = book;
        if(book.equals("Kids")){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}
class AdultUsers implements LibraryUser{
    int age;
    String book;
    @Override
    public void registerAccount(int age) {
        this.age = age;
        if(age<12){
            System.out.println("You have successfully registered under an Adult Account");
        }else{
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }

    }

    @Override
    public void requestBook(String book) {
        this.book = book;
        if(book.equals("Fiction")){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }else{
            System.out.println("Oops, you are allowed to take only adult Fiction books");

        }
    }
}
public class LibraryInter {
    public static void main(String[] args){
        KidUsers k1 = new KidUsers();
        k1.registerAccount(18);
        k1.requestBook("Kids");
        AdultUsers a1 = new AdultUsers();
        a1.registerAccount(50);
        a1.requestBook("Fiction");
    }
}