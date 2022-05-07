class demo2
{

 public static void main(String[] ags)
{
StringBuffer sb;
sb=new StringBuffer("Hello");
System.out.println(sb.capacity());
System.out.println(sb.length());
System.out.println(sb);
sb.setCharAt(0,'h');
System.out.println(sb);

//append()
sb.append(10);
sb.append(45.2);
sb.append("pktg");
System.out.println(sb);

//ssb.deleteCharAt(0)
sb.delete(1,7);

System.out.println(sb);
  StringBuffer sb1;
  sb1=new StringBuffer("I JAVA");
  System.out.println(sb1);
  sb1.insert(2,"like");
  System.out.println(sb1);
  sb1.reverse();
  System.out.println(sb1);
  String s3=sb1.toString();
  }
  }







