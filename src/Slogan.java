public class Slogan
{//represent single slogan phrase
    private String phrase;
    private static int count = 0;

    public Slogan (String str)
    {//set up slogan and counts number of instances created
        phrase = str;
        count++;
    }

    public String toString()
    {
        //return slogan as a string
        return phrase;
    }

    public static int getCount()
    {
        //returns number of instances created
        return count;
    }
}//noah triche per 5
