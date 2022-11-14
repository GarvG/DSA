package OOPS;

class A {
    void Show() {
        System.out.println("class A");
    }
}
class B extends A
{

    @Override
    void Show()
    {
        super.Show();
        System.out.println("class B");
        super.Show();
    }
}
public class Test {
    public static void main(String[] args) {
        B ref=new B();
        ref.Show();
    }
}
