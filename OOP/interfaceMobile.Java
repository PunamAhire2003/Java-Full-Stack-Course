interface Mobile{
    public abstract void call();
    public abstract void photo();
    public abstract void song();
    public abstract void game();
}
class mobileFeature implements Mobile{
    @Override
    public void call(){
    System.out.println("call on mobile");
}
@Override
public void photo(){
System.out.println("click the photo on mobile");
}
@Override
public void song(){
    System.out.println("clicks on song button");
}
@Override
public void game(){
    System.out.println("playing a games");
}
}
public class Practice1{
    public static void main(String[] args) {
        Mobile m=new mobileFeature();//cant create object of interface so this
        m.call();
        m.song();
        m.photo();
        m.game();
    }
}


