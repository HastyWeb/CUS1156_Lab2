import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
	
   public static int countUnique(ArrayList<String> list) {
	  //temporary arrayList
	  ArrayList<String> tempArr = new ArrayList<String>();
	  //take temp arrayList, go through list,if word it isn't in temp put it in and increase count by 1.
	  int count = 0;
	  for(String word: list) {
		  if(!tempArr.contains(word)) {
			  tempArr.add(word);
			  count++;
		  }
	  }
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
	  //testing
	  words.add("moon");
	  words.add("computer");
	  words.add("apple");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
