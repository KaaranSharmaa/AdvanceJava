interface a {
    void show();
}

class b implements a {
    public void show() {   // ✅ must implement coz not abstraction 
        System.out.println("in show from b");
    }

    void display() {
        System.out.println("in display");
    }
}

class c implements a {
    public void show() {   // ✅ must be public
        System.out.println("in show");
    }
}

public class Interface {
    public static void main(String[] args) {
        a obj = new c();   // ✅ better (polymorphism)
        obj.show();
    }
}