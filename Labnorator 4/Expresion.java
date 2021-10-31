class Expresion
{
    static String exp;
    Expresion(String s)
    {
        exp=s;
    }
    static boolean countParentheses()
    {
        int parentheses=0;
        for (int i=0;i<exp.length();i++)

            if(exp.charAt(i)=='(')parentheses++;
              else
                if(exp.charAt(i)==')')parentheses--;
                 if (parentheses!=0)
                    return false;
                  else
                    return true;
    }
    static boolean result()
    {
        StringBuilder s = new StringBuilder(exp);
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)==')')
                for(int j=i;j>=0;j--)
                {
                    boolean cont1,cont2;
                       cont1=false;
                       cont2=false;
                         if(s.charAt(j)=='(')
                    {
                           s.setCharAt(i, ' ');
                           s.setCharAt(j, ' ');
                             cont1=true;
                             cont2=true;
                               break;
                    }
                    if(cont1 && cont2)return false;
                }
        }
        return true;
    }
    static void output(String s)
    {
        if (countParentheses())
        {
            if(result())
            {
                System.out.println(exp+ " - Correct Math Expression ");
            }
            else System.out.println(exp+ " -  Incorrect Math Expression ");
        }
        else System.out.println(exp+ " - Incorrect Math Expression ");
    }
}
