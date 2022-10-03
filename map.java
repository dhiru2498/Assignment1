import java.util.HashMap;
import java.util.Map;
class Emp{
    int emp_id;
    String emp_name;
    Emp(int i,String n)
    {
        this.emp_id=i;
        this.emp_name=n;
    }

    public String toString()
    {
        return emp_id+" : "+emp_name;
    }
}

public class map {
    public static void main(String[] args) {

//        Emp obj=new Emp(1,"Dhiraj");
//        Emp objD=new Emp(1,"Dhiraj");
//
//        Emp obj1=new Emp(2,"Ravi");
//        Emp obj2=new Emp(3,"Raju");
//        Emp obj3=new Emp(4,"Ram");
//        Emp obj5=new Emp(5,"Raj");
//        Map<Emp,Integer> empmap=new HashMap<>();
//        empmap.put(obj,1);
//        empmap.put(objD,1);
//        empmap.put(obj1,2);
//        empmap.put(obj2,3);
//        empmap.put(obj3,4);
//        empmap.put(obj5,5);
//        System.out.println(empmap);/*






        Map<Integer, String> map = new HashMap<>();
        map.put(5, "Dhiraj");
        map.put(6, "surya");
        map.put(7, "Ravi");
        System.out.println(map);
        System.out.println(map.get(6));

        for (Map.Entry<Integer,String> d: map.entrySet())
        {
            String val=d.getValue();
            if(val.equals("surya"))
            {
                int key= d.getKey();
                System.out.println(key);
            }
        }
    }
}

