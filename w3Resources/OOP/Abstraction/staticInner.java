package w3Resources.OOP.Abstraction;

class OuterClass2 {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}
public class StaticInner {
    public static void main(String[] args) {
        OuterClass2.InnerClass myInner = new OuterClass2.InnerClass();
        System.out.println(myInner.y);
    }
}
