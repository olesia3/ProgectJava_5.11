package Package;
public class Task4 {
	public static void main(String[] args) {
		int[]array1=new int[10];
		int[]array2=new int[10];
		int[]array3=new int[10];
		int i=0;
		int a=0;
		int c=0;
	for (;i<array3.length;i++) {
		for (;a<array1.length;a++) {
		array1[a]=(int)(Math.random()*10);
//		System.out.print(array1[c]+" ");
		break;
		}
		for (;c<array2.length;c++) {
		array2[c]=(int)(Math.random()*10); 
//		System.out.print(array2[c]+" ");
		break;
		}
		array3[i]=array1[a]+array2[c];
		System.out.print(array3[i]+" ");
	}
	System.out.print("-сумарний масив");
	}
}
