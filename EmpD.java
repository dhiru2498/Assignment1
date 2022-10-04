import java.util.HashMap;
import java.util.Map;
class EmpD {
    int emp_id;
    String emp_name;
    EmpD(int i, String n)
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

        EmpD obj=new EmpD(1,"Dhiraj");
        EmpD objD=new EmpD(1,"Dhiraj");

        EmpD obj1=new EmpD(2,"Ravi");
        EmpD obj2=new EmpD(3,"Raju");
        EmpD obj3=new EmpD(4,"Ram");
        EmpD obj5=new EmpD(5,"Raj");
        Map<EmpD,Integer> empmap=new HashMap<>();
        empmap.put(obj,1);
        empmap.put(objD,1);
        empmap.put(obj1,2);
        empmap.put(obj2,3);
        empmap.put(obj3,4);
        empmap.put(obj5,5);
        System.out.println(empmap);






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

