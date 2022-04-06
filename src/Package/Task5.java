package Package;
public class Task5 {
	public static void main(String[] args) {
		int[]array=new int[15];
		int a=0;
		for (int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*10);
			System.out.print(array[i]+" ");
			if (array[i]%2==0) {
				a+=1;	
			}
		}
		System.out.println();
		System.out.print("Кількість парних елементів: "+a);
	}
}
