import java.util.*;
public class ArraySeperation
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a String");
        String name=input.nextLine();
        char[] reverse=new char[name.length()];
        for(int i=0;i<=name.length()-1;i++)
        {
            reverse[i]=name.charAt(i);
        }
        for(int j=reverse.length-1;j>=0;j--)
        {
            System.out.println(reverse[j]);
        }
    }
}
