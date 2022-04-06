package Package;
public class Task2 {
	public static void main(String[] args) {
		int[]array=new int[20];
		for (int i=0;i<array.length;i++) {
			array[i] = (int) (Math.random() * 9);
//			System.out.print(array[i]+" ");
			if(i%2!=0) {
				array[i]=0;
			}
		System.out.print(array[i]+" ");
		}
		System.out.print("Finish arrays");
	}
}
