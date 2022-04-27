import java.util.*;
public class test20211220 {

	public static void main(String[] args) {
		int[][] arr2= {
				{100,21},
				{200},
				{300,78}
		};
	
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		
		for (int[] dsf : arr2) {
			for (int is2 : dsf) {
				System.out.println(is2);
			}
		}
		
		ArrayList<Integer> arr =new ArrayList<>(); 
		arr.add(15);
		arr.add(155);
		arr.add(113);
		arr.sort(null);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr.get(i));
		}
		System.out.println(arr.size());
		
		int[][] result={{0,0},{0,0}};
		int[][] list1= {{1,2},{2,3}};
		int[][] list2= {{3,4},{5,6}};
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list1[i].length; j++) {
				result[i][j]=list1[i][j]+list2[i][j];
			}
		}
		System.out.printf("result = {{%d,%d},{%d,%d}}\n",result[0][0],result[0][1],result[1][0],result[1][1]);
		
		ArrayList<Integer> list_arr =new ArrayList<>(); 
		ArrayList<Integer> list_arr2 =new ArrayList<>(); 
		list_arr.add(4);
		list_arr.add(3);
		list_arr.add(2);
		list_arr.add(1);
		list_arr2.add(2);
		list_arr2.add(20);
		list_arr2.add(10);
		list_arr2.add(3);
		list_arr2.add(5);
		list_arr.sort(null);
		list_arr2.sort(null);
		list_arr.remove(0);
		list_arr2.remove(0);
		System.out.printf("list_arr = %d, %d, %d\n",list_arr.get(0),list_arr.get(1),list_arr.get(2));
		System.out.printf("list_arr2 = %d, %d, %d, %d\n",list_arr2.get(0),list_arr2.get(1),list_arr2.get(2),list_arr2.get(3));
		
	}

}
