public class compute
{
    static int compute_words(text t)
    {
        int count=0;
         for(int i=0;i<t.a.length();i++)
         {
         if(t.a.charAt(i)>=65 && t.a.charAt(i)<=90  || t.a.charAt(i)>=97 && t.a.charAt(i)<=122)
         {
                count++;
                char ne=t.a.charAt(i);
                while ((ne!=32 )&& i<t.a.length()-1)
                {
                    i++;
                    ne=t.a.charAt(i);
                }
            }
        }
                return(count);
    }
    static void compute_s(text t)
    {
        int count=0;
            for(int i=0;i<t.a.length();i++)
            {
            if (t.a.charAt(i)=='.' )count++;
        }
        System.out.println("Number of Sentences: "+count);
    }
}
