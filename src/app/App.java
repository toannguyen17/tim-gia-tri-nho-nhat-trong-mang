package app;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào độ dài mảng: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("\nNhập giá trị cho [" + i + "] = ");
			arr[i] = scanner.nextInt();
		}

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println("\nGiá trị nhỏ nhất trong mảng là: " + min);
	}
}
