class Student{
    int rollNo;
    String name;
    String email;
    long mobileno;


protected Student(){//No argument
    rollNo=121;
    name="punam";
    email="punam123@gmail.com";
    mobileno=8790543234l;
}

}
class Practice{
    public static void main(String[] args) {
        
    
    Student obj=new Student();

    System.out.println(obj.rollNo);
    System.out.println(obj.name);
    System.out.println(obj.email);
    System.out.println(obj.mobileno);

}
}