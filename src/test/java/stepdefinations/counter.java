package stepdefinations;

public class counter {

	public static void main(String[] args) {
		for(int i=1;i<=16;i++) {
			int temp=i;
			for(int j=i;j>=1;j--) {
				
				System.out.print(temp+" ");
				temp= temp+2;
				
			}
			System.out.println();
			for(int k=i;k>=1;k--) {
			i++;
			}
		}

	}

}
