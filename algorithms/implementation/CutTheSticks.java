package algorithms.implementation;

import java.util.*;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		List<Integer> sticks = new LinkedList<Integer>();
		
		for(int i = 0; i < n; i++) {
			sticks.add(in.nextInt());
		}
		
		
		while(sticks.size() != 0) {
			System.out.println(sticks.size());	
			Integer min = Collections.min(sticks);
			while(sticks.contains(min)) {
				sticks.remove(min);
			}
			for(int i = 0; i < sticks.size(); i++) {
				Integer temp = sticks.remove(i);
				temp -= min;
				sticks.add(i, temp);
			}
		}

	}

}
