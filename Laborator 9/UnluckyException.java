public class UnluckyException extends Exception
{
    UnluckyException(String in1, String in2) 
    {
        super(in1, in2);
    }
    String exception()
    {
        if(input2.equals("13")) return "Oh, it seems to be something very unlucky";
        else return "";
    }
}
