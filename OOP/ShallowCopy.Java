class Student{
    String name;


    Student(String name){
        this.name=name;
    }
    Student(Student s){//copy
        this.name=s.name;
    }
}
    class Person extends Student{
        int id;

        Person(String name,int id){
             super(name);
            this.id=id;
        
       
    }
    Person(Person p){
         super(p);//call student copy constructor
        this.id=p.id;
        
    }
}
    class Practice{
        public static void main(String[] args) {
            Person obj1=new Person("Punam",101);
            Person obj2=new Person(obj1);
            System.out.println(obj1.name);
            System.out.println(obj1.id);
            System.out.println(obj2.name);
            System.out.println(obj2.id);
           System.out.println(obj2.name+ " "+ obj2.id);
            System.out.println(obj1.name + " " + obj1.id);


        }
    
    }

