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

public class MCQ3 {
    public static void main(String[] args) {
        B b = new A();
        b.show();        
    }
}

// The output is:
// 1. A
// 2. B
// 3. Compilation error --> my guess, cannot type cast from subclass to base class 
// 4. Runtime error
