import java.util.*;

class Solution {
	public String[] solution(String myStr) {
		String[] splitArray = myStr.split("[abc]");
		
		List<String> arrList = new ArrayList<>();
		for (int i = 0; i < splitArray.length; i++) {
			if(!splitArray[i].equals("")) arrList.add(splitArray[i]);
		}
		
		if(arrList.isEmpty()) arrList.add("EMPTY");
        return arrList.stream().toArray(String[]::new);
    }
}
 