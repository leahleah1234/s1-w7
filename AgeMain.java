public class AgeMain{
    public static void main(String[] args) {
        Age a = new Age();
        boolean one = a.isTeenAger(12);
        System.out.println(one + " : should be false");

        one = a.isTeenAger(13);
        System.out.println(one + " : should be false");

         one = a.isTeenAger(15);
        System.out.println(one + " : should be false");

        one = a.isTeenAger(19);
        System.out.println(one + " : should be false");

        one = a.isTeenAger(22);
        System.out.println(one + " : should be false");
    }
   
}