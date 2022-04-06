package Package;
public class Task3 {
	public static void main(String[] args) {
		int[]array1=new int[5];
		int[]array2=new int[5];
		int[]array3=new int[5];
		int avarage1=0;
		int avarage2=0;
		int avarage3=0;
		System.out.print("Масив1: ");
		for(int i=0;i<array1.length;i++) {
			array1[i]=(int)(Math.random() * 5);
			System.out.print(array1[i]+" ");
			avarage1+=array1[i];	
		}
		avarage1/=5;
		System.out.println();
		System.out.print("Масив2: ");
		for(int i=0;i<array2.length;i++) {
			array2[i]=(int)(Math.random() * 5);
			System.out.print(array2[i]+" ");
			avarage2+=array2[i];	
		}
		avarage2/=5;
		System.out.println();
		System.out.print("Масив3: ");
		for(int i=0;i<array3.length;i++) {
			array3[i]=(int)(Math.random() * 5);
			System.out.print(array3[i]+" ");
			avarage3+=array3[i];	
		}
		avarage3/=5;
		System.out.println();
		if (avarage1>avarage2 && avarage1>avarage3) 	System.out.println("Найбільше середнє значення "+avarage1);	
		if (avarage2>avarage1 && avarage2>avarage3) 	System.out.println("Найбільше середнє значення "+avarage2);
		if (avarage3>avarage2 && avarage3>avarage1) 	System.out.println("Найбільше середнє значення "+avarage3);
	}
}
