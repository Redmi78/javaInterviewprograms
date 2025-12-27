package stringPrograms;

import java.awt.*;

public class subStringsProgram {
    public static void main(String[] args) {
        String str="test";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                System.out.println(str.substring(i,j+1));
            }
            System.out.print(" ");
        }
    }
}
