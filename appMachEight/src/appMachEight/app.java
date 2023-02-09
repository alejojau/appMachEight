package appMachEight;

import java.util.ArrayList;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		System.out.println("To see the same exercise in python and an example of javascript code for the same exercise check: https://colab.research.google.com/drive/1-U_InLVLudElF80IqQuG4sJVl9IvPQ5Q?usp=sharing");
		try {
			Scanner sc= new Scanner(System.in);
			String strList = "";
			//app([1,9,5,0,20,-4,12,16,7], 12)
			while(strList.length()==0) {
				System.out.print("Enter a list of numbers separeted with commas ex: 1,9,5,0,20,-4,12,16,7 ");  
				strList= sc.nextLine();
			}
			String[] initialList = strList.trim().split(",");
			ArrayList<Integer> num = new ArrayList<>();
			for (String numStr : initialList) {
				int value = Integer.parseInt(numStr);
				num.add(value);
			}
			System.out.print("Enter the number your looking to sum:");  
			int number= sc.nextInt();
			app(num,number);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private static ArrayList<String> app(ArrayList<Integer> list,int number){
		ArrayList<String> answ= new ArrayList<>();
		for(int i = 0; i<list.size(); i++){
			for(int j = i+1; j<list.size(); j++){
				if(list.get(i) + list.get(j) == number){
					String textAns = list.get(i)+","+list.get(j);
					answ.add(textAns);
					System.out.println(textAns);
				}
			}
		}
		return answ;
	}
}
