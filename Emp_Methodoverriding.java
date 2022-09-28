public class Emp_Methodoverriding {
    int id;
    String name, address;
    String phone;
    String type;

    public void display(int i){
        System.out.println("Name:"+id+"\nphone:"+phone);
    }


}
class Hr extends Emp_Methodoverriding {

    public void display(int i){
        System.out.println("\nName:"+"Dhiraj"+"\nAddress:"+"Gaya");
    }
}


class Demo{
    public static void main(String args[]){

        Emp_Methodoverriding obj=new Hr();
        obj.display(2);
    }
}

