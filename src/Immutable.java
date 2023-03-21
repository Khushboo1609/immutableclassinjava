 final class Immutable {
    private  final int h;
    private final String  name;

     public Immutable(int h, String name) {
         this.h = h;
         this.name = name;
     }

     public int getH() {
         return h;
     }

     public String getName() {
         return name;
     }
 }
//class A extends Immutable{} one cannot make subclass of immutable class
class demooo{
    public static void main(String[] args) {
        Immutable i=new Immutable(20,"khushboo");
        System.out.println(i.getH());
        System.out.println(i.getName());
        //i.name="musskan"; as the object is private its valuse cannot be changed
        Immutable i1=new Immutable(20,"muskaan");
        System.out.println(i1.getH());
        System.out.println(i1.getName());
    }
}