import java.util.*;
import java.io.*;


public class McDuffTommy {

	public static void main(String[] args) throws FileNotFoundException{
		
		ArrayList<String> words= new ArrayList<String>();
		
		File file = new File("macbeth.txt");
		Scanner sc = new Scanner(file);
		
		//System.out.println(file.exists());
	
		//System.out.println(sc.next());
		//System.out.println(sc.next());
		
		while (sc.hasNext()){
			//System.out.println(sc.next());
			String word = sc.next();
			word=word.replace(",", "");
			word=word.replace(".", "");
			word=word.replace("?", "");
			word=word.replace(":", "");
			word=word.replace(";", "");
			word=word.replace("!", "");
			if (word.length()>4){
				words.add(word);
			}
		}
		String mostword="";
		int mostcount=0;
		int currentcount=0;
		
		//find top word
		for (String object: words){
			for (String object2:words){
				if (object2.equalsIgnoreCase(object)){
					currentcount=currentcount+1;
				}
			}
			if (currentcount>mostcount){
				mostcount=currentcount;
				mostword=object;
				//System.out.println(mostword);
				//System.out.println(mostcount);
			}
			currentcount=0;
			
		}
	

		//print current top word and count
		System.out.println("1st word count: "+mostcount);
		System.out.println("1st word: "+mostword);
		
		
		//reset the counters
		currentcount=0;
		mostcount=0;
		
		//create second most word
		String mostword2="";
		
		
		//find second top word
		for (String object: words){
			for (String object2:words){
				if (object2.equalsIgnoreCase(object)&&!object.equalsIgnoreCase(mostword)){
					currentcount=currentcount+1;
				}
			}
			if (currentcount>mostcount){
				mostcount=currentcount;
				mostword2=object;
				//System.out.println(mostword2);
				//System.out.println(mostcount);
			}
			currentcount=0;
			
		}
	
		System.out.println("2nd word count: "+mostcount);
		System.out.println("2nd word: "+mostword2);
	}
	
	
	
	
}
