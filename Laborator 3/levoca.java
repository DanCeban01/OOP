public class levoca
{
    static void leters(text t)
    {
        int count=0;
            for (int i=0;i<t.a.length();i++)
            if (t.a.charAt(i)>=65 && t.a.charAt(i)<=90  || t.a.charAt(i)>=97 && t.a.charAt(i)<=122)count++;
                  System.out.println("Letters: "+count);
    }
    static void voca(text t)
    {
        int count=0,count1=0;
        for (int i=0;i<t.a.length();i++)
        {
                if (t.a.charAt(i)=='A'||t.a.charAt(i)=='a'||t.a.charAt(i)=='E'||t.a.charAt(i)=='e'||t.a.charAt(i)=='I'||t.a.charAt(i)=='i'||t.a.charAt(i)=='O'||t.a.charAt(i)=='o'||t.a.charAt(i)=='U'||t.a.charAt(i)=='u'||t.a.charAt(i)=='Y'||t.a.charAt(i)=='y')
                count++;
              else 
                if (t.a.charAt(i)>=65 && t.a.charAt(i)<=90  || t.a.charAt(i)>=97 && t.a.charAt(i)<=122) count1++;
        }
        System.out.println("Vowels: "+count);
        System.out.println("Consonants: "+count1);
    }
}
