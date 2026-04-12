class A{
    public void a(){
        System.out.println("In A");
    }
    class B{
        public void b(){
        System.out.println("In B");
    }
    class innerclass
    {
        public static void main(String a[]){
         A obj=new A();
         obj.a();
         A.B obj1=obj.new B();
         obj1.b();
            
        }
    }

    }
}