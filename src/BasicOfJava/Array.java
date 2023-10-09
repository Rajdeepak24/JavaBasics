package BasicOfJava;

public class Array {
	public static void main(String[] args) {
		
		//Array
//		int i[] = new int[5];      // same datatypes and array size 
//		i[0]=12;
//		i[1]=23;
//		i[2]=31;
//		i[3]=43;
//		i[4]=25;
//		System.out.println(i[2]);
//		System.out.println(i.length);
		
		
		
		///Object Array
//		Object ob[] = new Object[6]; // same ko solve kr diye, but size issue is still here
//		ob[0]= "bittu";
//		ob[1]= 124;
//		ob[3]= 'c';
//		ob[4]= 123.56f;
//	System.out.println("************Object Array***********"+ob);
//	for(int j=0;j<ob.length;j++ ) {
//		System.out.println("*******in loop of object****");
//		System.out.println(ob[j]);
		
//	}
		
		//2D array
		
		String a[][]   = new String [2][3];	
		 a[0][0] = "00";
		 a[0][1] = "01";
		 a[0][2] = "02";
		 
		 a[1][0] = "10";
		 a[1][1] = "11";
		 a[1][2] = "12";
		 
//		 System.out.println(a[0][2]);
		 
		 for (int i = 0; i<a.length;i++) {
			 for( int j = 0; j<a[0].length; j++){
				 System.out.println(i+"i");
				 System.out.println(j+"j");
//				 System.out.println(a[i][j]);
			 }
		 }
	
		
		
	}

}
