import java.lang.System;
import java.util.Scanner;
class problem14
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int count =0;
        System.out.print("Enter a String : ");
        String str = scan.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == 'A'|| ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U'|| ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }

        }
        System.out.print("The Number of vowels in a entered string is : "+count);
    }
}
