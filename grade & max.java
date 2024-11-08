package ir.ics.traning;

public class B {
	public static void main(String[] args) {
	double[] list= {10.25,5.9,17,4.8};
	int j=0;
	double max=0;
	for(int i=0; i<list.length; i++) {
		if(list[i]>list[j]) {
			max=list[i];
			j++;
		}
	System.out.println(max);
if(list[i]>15) {
		System.out.println("your score is " + list[i]+ " and grade is A");
	}
	if(list[i]<10) {
		System.out.println("your score is " + list[i]+ " and grade is B");
	}
		if(list[i]<5) {
			System.out.println("your score is " + list[i]+ " and grade is C");	
}
	}
	}
}
