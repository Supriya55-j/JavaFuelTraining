
class Address{
   int housenum;
   String areaname;
   String city;
   //Getter and setter for variables
   void setHousenum(int x)
   {
      housenum =x;
   }
   void getHousenum()
   {
      }
 //set get housenum
   void setAreaname(String abc)
   {
      areaname="abc";
   }
   String getAreaname()
   {
     return areaname;
     }
 //set n get areaname
   void setCity(String xyz)
   {
      city="xyz";
   }
String getCity()
   {
     return city;
     }
   }
   
   //get n set city  
   
   
class student{
   int id;
   String name;
   Address adr;

   public void setId(int id)
   {
      this.id=id;
    }
   public void setAdr(int adr)
   {
      this.adr=adr;
   }
    public void setName(int name)
   {
      this.name=name;
   }
int getId()
   {
     return id;;
   }
Address getadr()
   {
      return adr ;
   }
   

   public void getName()
   {
      return name ;
   }

class Demo{
public static void main(String[]args){
     Address ad=new Address();
       ad.setHousenum(1);
       ad.setAreaname("abc");
       ad.setCity("Aurangabad");
 //create student class object
 Student st=new Student();
 int x=101;
 st.setId(x);
 st.setAdr(ad);
 st.setname("xyz");
 //read values
 int id;
 id1 = st.getId();
 String n;
 n=st.getName;
 Address ad1;
 ad1=st.getAdr();
 //read adress obejct values
 int hn;
 hn=ad1.getHousenum;
 String area;
 area=ad1.getAreaname();
 String city=ad1.getCity();
   }
   }


      }