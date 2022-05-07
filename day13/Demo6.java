//user defined exception
class MyException extends Exception
{
  @Override
  public String toString()
  {
    return "Enter non negative value of ID";
  }
}
class Student{
  private int id;
  private String name;
  public int getId()
  {
  return id;
  }
  public void setId(int id) throws Myexception{
      if(id<0)
      {
          Myexception ob;
          ob=new
     Myexception();
               throw ob;
       }
       this.id=id;
       }
       public void getName
       {
       return name;
       }
       
       }