import java.util.Scanner;
 
public class Main {
 
public static void main(String[] args) {
 
Scanner sc = new Scanner(System.in);
 int count = 0 ;
 int n = sc.nextInt();

 while (true) {
 if (n == 0) {
 break;
 }
 if(count>0) {
 System.out.println();
 }
  int [] input = new int[n];
 for (int i = 0; i < n; i++) {
 input[i] = sc.nextInt();
 }
 	for (int a = 0; a < input.length; a++) {
 for (int b = a+1; b < input.length; b++) {
 for (int c = b+1; c < input.length; c++) {
 for (int d = c+1; d < input.length; d++) {
 for (int e = d+1; e < input.length; e++) {
 for (int f = e+1; f < input.length; f++) {
 System.out.println(input[a] +" "+ input[b] +" "+ input[c] +" "+ input[d] + " "+ input[e] +" "+ input[f]);
 }
 }
 }
 }
 }
 }
 	count++;
 	n=sc.nextInt();
 }
 }
}