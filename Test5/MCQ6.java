class A {
    protected void show() {
        System.out.println("A");
    }
}

class B extends A {
    public void show() {
        System.out.println("B");
    }
}

public class MCQ6 {
    public static void main(String[] args) {
        A a = new B();
        B b = (B) a;
        b.show();   
    }
}

// The output is:
// 1. A
// 2. B --> my guess
// 3. Compilation error
// 4. Runtime error
