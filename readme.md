abstraction-:We use it when when we dont know what the method woill do so we just mention it and leave it there 
for future and  it has to be define in the object when the class is called for sure
and we canot create the object of asbract class
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
