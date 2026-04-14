interface a{
    void show();
}

class AnonymousInnerClass{
    public static void main(String[] args) {
        a obj = new a(){
        public void show(){
            System.out.println("in show");
            // obj.show();
        }
        } ;   
  obj.show();  }   
        
}
