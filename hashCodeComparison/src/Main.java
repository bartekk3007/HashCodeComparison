public class Main
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Andrzej", "Nowak", 30);
        Person p2 = new Person("Bartek", "Kołakowski", 40);
        Person p3 = new Person("Bartek", "Kołakowski", 40);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println();
        System.out.println(System.identityHashCode(p1));
        System.out.println(System.identityHashCode(p2));
        System.out.println(System.identityHashCode(p3));
    }
}