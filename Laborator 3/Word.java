public class Word
{
    static void tmow(text t)
    {
        StringBuilder m= new StringBuilder(t.a);
            for (int i=0;i<m.length();i++)
            {
            if (m.charAt(i)<65 || (m.charAt(i)>90  && m.charAt(i)<97) || m.charAt(i)>122)
            {
                if (m.charAt(i)!=32)m.setCharAt(i,' ');
            }
        }
        String s=m.toString();
        s=s.toLowerCase();

        String words[]=s.split(" ");
        int nr=compute.compute_words(t);
        int arr[];
        arr=new int[nr];
        for (int i=0;i<nr;i++)
        {
            arr[i]=0;
            for (int j=0;j<nr;j++)
            {
                if (words[i].equals(words[j]))arr[i]++;
            }
        }
        for (int i=1;i<nr;i++)
            for(int j=0;j<i;j++)
            {
                if(words[i].equals(words[j]))arr[i]=0;
                if (words[i]=="")arr[i]=0;
            }
        for (int i=0;i<nr;i++)
            for (int j=0;j<nr-1;j++)
                if(arr[j]<arr[j+1]) {
                    int temp1=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp1;
                    String temp=words[j];
                    words[j]=words[j+1];
                    words[j+1]=temp;
                }
        System.out.println("the most used words are :");
        for (int i=0;i<5;i++)System.out.println(words[i]+" : "+arr[i]+" times");
    }
    static void tl(text t)
    {
        StringBuilder m= new StringBuilder(t.a);
        for (int i=0;i<m.length();i++)
        {
            if (m.charAt(i)<65 || (m.charAt(i)>90  && m.charAt(i)<97) || m.charAt(i)>122)
            {
                if (m.charAt(i)!=32)m.setCharAt(i,' ');
            }
        }
        String s=m.toString();
        String words[]=s.split(" ");
         String a;
         a=words[0];
        int index=0,nr=compute.compute_words(t);
        for (int i=1;i<nr;i++)
        {
            if (a.length()<words[i].length())
            {
                index=i;
                a=words[index];
            }
        }
        System.out.println("the longgest word is : "+words[index]);
    }
}
