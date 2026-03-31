class A {
    void showA() {
        System.out.println("Method from class A");
    }
}
interface B {
    void showB();
}
interface C {
    void showC();
}

class D extends A implements B, C {

    public void showB() {
        System.out.println("Implementation of Interface B");
    }

    public void showC() {
        System.out.println("Implementation of Interface C");
    }

    void showD() {
        System.out.println("Method from class D");
    }
}

public class Main {
    public static void main(String[] args) {
        D obj = new D();

        obj.showA(); 
        obj.showB(); 
        obj.showC();
        obj.showD(); 
    }
}
