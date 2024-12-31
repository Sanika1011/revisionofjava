package sanikaworksspace;

public class reverseString {
public static void main(String[] args) {
	String s1="hello";
	//covert string to array
//	char ca[]=s1.toCharArray();
//	int start=0;
//	int end=s1.length()-1;
//	
//	//reverse using shift
//	while(start < end) {
//		char temp=ca[start];
//		ca[start]=ca[end];
//		ca[end]=temp;
//		start++;
//		end--;
//		}
//	
//	//convert again to string
//	String s2=new String(ca);
//	System.out.println(ca);
	
	for(int i=s1.length()-1; i>=0; i--) {
		System.out.print(s1.charAt(i));
	}
}
}
