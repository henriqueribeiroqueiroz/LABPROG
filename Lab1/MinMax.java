import java.util.Scanner;


public class MinMax {
	public static void main(String[] args){
		int n1,n2,n3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite N1: ");
		n1 = scan.nextInt();
		System.out.println("Digite N2: ");
		n2 = scan.nextInt();
		System.out.println("Digite N3: ");
		n3 = scan.nextInt();
		
			if(n1<n2 && n1<n3 && n2>n3 && n2>n3){
				System.out.println("O menor número é: "+n1+"\nO maior número é:"+n2);
			}else if (n2<n1 && n2<n3 && n1>n3 && n1>n2){
				System.out.println("O menor número é: "+n2+"\nO maior número é:"+n1);
			}else if (n3<n2 && n3<n1 && n1>n2 && n1>n3){
				System.out.println("O menor número é: "+n3+"\nO maior número é:"+n1);
			}else if (n2<n3 && n2<n1 && n3>n1 && n3>n2){
				System.out.println("O menor número é: "+n2+"\nO maior número é:"+n3);
			}else if(n1<n2 && n1<n3 && n3>n2 &&n3>n1){
				System.out.println("O menor número é: "+n1+"\nO maior número é:"+n3);
			}else if (n3<n1 && n3<n2 && n2>n3 && n2>n1){
				System.out.println("O menor número é: "+n3+"\nO maior número é:"+n2);
			}
		
			/*
			if(n1 < n2 && n1 < n3){
				if (n2<n3){
					System.out.println(n1+" "+n2+" "+n3);
				}else if(n3<n2){
					System.out.println(n1+" "+n3+" "+n2);
				}
			}else if (n2<n1 && n2<n3){
				if (n1<n3){
					System.out.println(n2+" "+n1+" "+n3);
				}else if(n3<n1){
					System.out.println(n2+" "+n3+" "+n1);
				}
			}else if (n3<n1 && n3<n2){
				if (n1<n2){
					System.out.println(n3+" "+n1+" "+n2);
				} else if (n2<n1){
					System.out.println(n3+" "+n2+" "+n1);
				}
			}else{
				System.out.println("Dados inseridos incorretamente! Execute novamente o programa.");
			}
			*/
			
	}
}



