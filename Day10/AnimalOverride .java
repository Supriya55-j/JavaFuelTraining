/*create a class named 'Animal'*/

class Animal 
{
void eat()
{
System.out.println("eat method");
}
void sleep()
{
System.out.println("eat method");
}
}
class Bird extends Animal
{
void eat()
{
super.eat();
System.out.println("override eat");
}
void sleep()
{
super.sleep();
System.out.println("override sleep");
}
void fly()
{
super.sleep();
System.out.println("in fly method");
}
}

class AnimalOverride
{
public static void main(String[] args){
Animal ob1=new Animal();
Bird ob2=new Bird();
ob1.eat();
ob1.sleep();
ob2.eat();
ob2.eat();
ob2.sleep();
ob2.fly();
}
}