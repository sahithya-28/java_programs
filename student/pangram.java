package student;
import java.util.HashSet;
import java.util.Set;

public class pangram {
    public static void main(String[] args) {
    	String str="hello";
    	String str1=str.toLowerCase();
    	int ispangram;
    	int a[]=new int[26];
    	for (int i=0;i<26;i++) {
    		a[i]=0;
    	}
    	for (int i=0;i<str.length();i++) {
    		if (str.charAt(i)>='a' && str.charAt(i)<='z');{
    			int pos=str.charAt(i)-97;
    			a[pos]=1;
    		}
    	}
    	ispangram=0;
    	for(int i=0;i<26;i++) {
    		if (a[i]==1)
    			continue;
    		else
    			ispangram=0;
    	}
    	if (ispangram==1)
    		System.out.println("pangram");
    	else
    		System.out.println("not pangram");
}
}
