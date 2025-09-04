class Student{
    String name;
    int id;



    Student(String name,int id){
        this.name=name;
        this.id=id;
    }

        public void display(){

            System.out.println(name);
            System.out.println(id);
        }
    }
    class Practice{
        public static void main(String[] args) {
            Student obj1=new Student("Punam",101);
            Student obj2=new Student("Anu",102);
            obj1. display();
            obj2.display();
        }
    }

