package hw;
/*
 * Topic: 讓使用者輸入一正整數，利用函式呼叫找出一連續整數數列讓該數列的和為此一正整數，有些正整數並不能找出連續整數，若找不到時，請印出「No」。
 例如: 15 =1+2+3+4+5 =4+5+6=7+8
 * Date: 2016/11/28
 * Author: 1050210XX 周永振老師
 */
import java.util.*;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(),i=0,a=0,j=0;
		boolean flag=true;
		while(flag){
			int sum=0;
			if(n%2==0){
				for(j=a;j<=n/2;j++){
					sum+=j;
					//System.out.println("sum= "+sum+" a= "+a+" j= "+j);
					if(sum==n){
						System.out.println("Yes!");
						flag=false;
					}
				}
				a++;
				//System.out.println("  a= "+a);
				if(a>=n){
					System.out.println("No!!!");
					flag=false;
				}
			}else{
				for(j=a;j<=n/2+1;j++){
					sum+=j;
					//System.out.println("sum= "+sum);
					if(sum==n){
						System.out.println("Yes!");
						flag=false;
					}
				}
				a++;
				//System.out.println("  a= "+a);
				if(a>=n){
					System.out.println("No!!!");
					flag=false;
				}
			}
		}
	}

}