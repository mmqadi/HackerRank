package algorithms.implementation;

import java.util.*;

public class EqualizeTheArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] arr = new int[n];
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			if(m.containsKey(arr[i])) {
				Integer v = m.get(arr[i]) + 1;
				m.put(arr[i], v);
			}
			else {
				m.put(arr[i], 1);
			}
		}
		int max = -1;
		Iterator<Integer> set = m.keySet().iterator();
		
		while(set.hasNext()) {
			Integer v = set.next();
			
			if(m.get(v) > max) {
				max = m.get(v);
			}
		}
		Arrays.sort(arr);
		
		System.out.print(arr.length - max);
		in.close();
	}

}
