class Student{
    String name;
    int id;

    Student(String name,int id){
        this.name=name;
        this.id=id;

    }

    Student(Student s){
        this.name=new String(s.name);
        this.id=s.id;
    }
    public void display(){
        System.out.println(name);
        System.out.println(id);

    }
}

class Practice{
    public static void main(String[] args) {
       
        Student obj1=new Student("Punam",11);
        Student obj2=new Student (obj1);
        obj1.name="omkar";
        System.out.println("original copy");
        obj1.display();

         System.out.println("deep copy");
        obj2.display();
    }
}

