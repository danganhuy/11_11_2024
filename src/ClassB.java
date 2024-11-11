public class ClassB extends ClassA{
    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }

    @Override
    public int returnANumber(int a) {
        return a + 9;
    }

    public int returnANumber(int a, int b) {
        return a + b;
    }

//    @Override
//    public void declare() {
//        super.declare();
//    }
//    public static void sayStatic() {
//        System.out.println("I'm static function from ClassB");
//    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();

        a.sayHello();
        b.sayHello();

        System.out.println(a.returnANumber(5));
        System.out.println(b.returnANumber(5));

        ClassA.sayStatic();
        ClassB.sayStatic();

        a.sayFinal();
    }
}