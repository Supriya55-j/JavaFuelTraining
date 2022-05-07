import java.util.*;


@FunctionalInterface
interface A<T>//fonctional interface
{ 
    T add(T x, T y);
}
class demoLambdaFun
{
public static void main(String[]args)
{
A<Integer> ob=(x,y)->x+y;//lambda funaction
System.out.println(ob.add(200,300));
}
}