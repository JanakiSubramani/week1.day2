package week1.day2;

public class Calculator {
public int sub(int a,int b) {
return(a-b);

}
public int mul(int a,int b) {
return(a*b);	

}
public static void main(String[] args) {
	Calculator cal=new Calculator();
	int sub=cal.sub(7, 3);
	int mul=cal.mul(5, 4);
	System.out.println(sub);
	System.out.println(mul);
}
}
