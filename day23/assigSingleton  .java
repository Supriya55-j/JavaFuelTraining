//create your own implementation to show how design pattern works 
/*create your class to show working of 1.Singleton pattern 2.Factory Pattern 3.Prototype pattern*/

class assigFirst
{
static  assigFirst obj;
private  assigFirst()
{
}

 static synchronized assigFirst getInstance()
 {
 if(obj==null)
 {
 obj=new  assigFirst();
 System.out.println("Singleton assignment created ");
 }
    return obj;
 }
}

 class assigSingleton 
{
 public static void main(String[]args)
 {
 
 assigFirst d=assigFirst.getInstance();
}
}