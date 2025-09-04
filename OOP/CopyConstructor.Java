class Student{
    String name;
    int id;

    Student(String name,int id){

        this.name=name;
        this.id=id;
    }


        Student(Student s){
            this.name=s.name;
            this.id=s.id;
        }

    
    public void show(){
        System.out.println("name :" + name +", id: " +id);
        //System.out.println(id);
    }

}
class Practice{
    public static void main(String[] args) {
        Student obj=new Student("punam",101);
        Student obj2=new Student(obj);
        obj.show();
        obj2.show();

        
    }

}

