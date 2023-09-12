import java.util.Objects;

public class Employee {
    private int id;
    private String name;

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setId(int id){
        id = this.id;
    }

    public void setName(String name){
        name = this.name;
    }

    public boolean equals(Object obj){
//        Checking if both the objects has same reference
        if(obj == this) {
            return true;
        }

//        Checking if the object is null or the object doesn't belong to the class
//        if(obj == null || this.getClass() != obj.getClass()){
//            return false;
//        }
//        Checking if a particular field of two objects are same or not
//        Employee emp = (Employee) obj;
//        return(this.getId() == emp.getId());

        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            if (Objects.equals(id, e.getId()))
                return true;
        }
        return false;
    }

    public int hashCode(){
        return getId();
    }
}
