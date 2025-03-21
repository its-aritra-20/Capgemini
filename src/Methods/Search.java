package Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 10, 15, 3 };
		List<Integer> newe=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int ans = Search(arr, 10);
		System.out.println(ans);
		ans = Search(arr, 6);
		System.out.println(ans);

	}

	public static int Search(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("Key Found");
				return i;
			}

		}
		System.out.println("Not Found!");
		return -1;
	}

}
