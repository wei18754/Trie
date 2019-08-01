import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	//This is using Trie to put all the word in words file to create dictionary
	//Did not handle case sensitive issue
	public static void main(String[] args) throws FileNotFoundException {
		String filename = "c:\\tmp\\words";
		try {
			Scanner input = new Scanner(new File(filename));
			Trie trie = new Trie();
			//Assume all the words are small
			//TODO#check the cap or not
			while (input.hasNext()) {
				String word = input.nextLine();
				trie.insert(word);
			}

			//Trie trie = new Trie();
			//trie.insert("art");
			//trie.insert("bunny");
			//trie.insert("buck");
			//trie.insert("dog");
			//trie.insert("Apostate");
			//With all the possible word in words, you will see bunny and apostleship was found
			boolean res = trie.search("bunny");
			System.out.println(res);
			//Try to search apostolate
			res = trie.search("apostleship");
			System.out.println("apostleship is in dictionary: " + res);
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
