package ir.ics.traning;

public class Q {

	public static void main(String[] args) {
	
String[] list1= {"a","b","c","d","e"};
String[] list2= {"a","d","e","n","x"};
for(int i=0; i<list1.length; i++) {
	if(list1[i]==list2[i]) {
	System.out.println(list2[i]);
	}
}
	}

}
