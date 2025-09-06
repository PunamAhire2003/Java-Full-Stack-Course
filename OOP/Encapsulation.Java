class Bank{
    private int accNum;
    private String name;
    private long mobileNo;

    public void setaccnum(int accNum){
        this.accNum=accNum;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setmobileNo(long mobileNo){
        this.mobileNo=mobileNo;
    }
    public int getaccNum(){
        return accNum;
    }
    public String getname(){
        return name;
    }
    public long getmobileNo(){
        return mobileNo;
    }
}
    public class Practice1{
        public static void main(String[] args) {
            Bank s=new Bank();
            s.setaccnum(123456);
            s.setname("ram");
            s.setmobileNo(9845643679l);

            System.out.println("name:"+s.getname());
            System.out.println("accountNumber:"+s.getaccNum());
            System.out.println("mobileNum:"+s.getmobileNo());
        }
    }

