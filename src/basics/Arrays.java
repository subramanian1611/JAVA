package basics;

public class Arrays {

	int arr[]= new int[6];
	void fillArray(){
		int j =100;
		for (int i =0;i<6;i++) {
			++j;
			arr[i]=j;
		}	
	}
	
	void getArray() {
		for(int x : arr) {
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		Arrays a = new Arrays();
		a.fillArray();
		a.getArray();
	}
}
