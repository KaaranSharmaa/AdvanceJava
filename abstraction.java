abstract class car {
    public abstract void drive();

    public void music() {
        System.out.println("Play Music");
    }
}

class ac extends car {

    public void drive() {
        System.out.println("Driving car");
    }

    public void ac() {
        System.out.println("turn on ac");
    }
}

class abstraction {
    public static void main(String[] args) {

        ac obj = new ac();
        obj.music();
        obj.drive();
    }
}
