public class ClassA {
    protected void sayHello(){
        System.out.println("Hello");
    }
    public int returnANumber(int a){
        return a;
    }
    public final void sayFinal() {
        System.out.println("I final function from ClassA");
    }
    public static void sayStatic() {
        System.out.println("I'm static function from ClassA");
    }
    private void sayPrivate() {
        System.out.println("I'm private function from ClassA");
    }
}