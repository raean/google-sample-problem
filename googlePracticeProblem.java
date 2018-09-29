import java.util.*;

class Solution {
    	public String solution(String S, int K) {
        
		// This loop copies over the requested string wihtout the dashes.
		String copyWithoutDashes = "";
		for (int i = 0 ; i < S.length(); i++) {
			if (S.charAt(i) != '-') {
				copyWithoutDashes = copyWithoutDashes + S.charAt(i);
			}	
		}

		/* This loop starts from the end of the copy and adds the dash 
		on every K-th number added to the result. */
		String result = "";
		int j = copyWithoutDashes.length();
		for (int i = (copyWithoutDashes.length() - 1) ; i >= 0 ; i--) {
			result = result + copyWithoutDashes.charAt(i);	
			if ((i+1) % K == 0 && i != 0) {
				result = result + "-";
			} 	
		}

		/* Since we initially worked our way from the back of the String,
		we must now reverse the order and make any lowercase character 
		uppercase.*/
		String resultReversed = "";
		for (int i = result.length()-1 ; i >= 0 ; i--) {
			if (result.charAt(i) >= 97 && result.charAt(i) <= 122) {
				char s = (char) ((int) result.charAt(i) - 32);
				resultReversed = resultReversed + (s+"");	
			} else {
				resultReversed = resultReversed + result.charAt(i);
			}
		}

		return resultReversed;       
    	}

	public static void main(String[] args) {
		// A test case. Try changing the K value to 3.
		K = 3;
		// K = 4;
		Solution s = new Solution();
		String ans = s.solution("2-4A0r7-4k", K);
		System.out.println(ans);
	}
 	
}
