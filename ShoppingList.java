package LabProgram1021;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class ShoppingList {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// TODO: Declare a LinkedList called shoppingList of type ListItem
		LinkedList<String> shoppingList = new LinkedList<String>();

		String item;


		// TODO: Scan inputs (items) and add them to the shoppingList LinkedList
		// Read inputs until a -1 is input

		boolean flag = true;
		while (flag) {
			item = scnr.nextLine();
			if (item.equals("-1")) {
				flag = false;
			} else {
				shoppingList.add(item);
			}
		}

		// TODO: Print the shoppingList LinkedList using the printNodeData() method
		ListIterator<String> listIterator = shoppingList.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}
}