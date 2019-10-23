public class countInstances
{
    public static void main (String []args)
    {//create many slogan objects and call them later
        Slogan obj;
        obj = new Slogan("Remember the Alamo");
        System.out.println(obj);
        obj = new Slogan("Don't Worry. Be Happy");
        System.out.println(obj);
        obj = new Slogan("Live Free or Die.");
        System.out.println(obj);
        obj = new Slogan("Talk is Cheap.");
        System.out.println(obj);
        obj = new Slogan("Write Once, Run Anywhere");
        System.out.println(obj);

        System.out.println();
        System.out.println("Slogans Created: " + Slogan.getCount());

    }
}
