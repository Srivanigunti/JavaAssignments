
public class CheckingOfString {

	public int stringCheck(String[] names, String name) {
		int count=0;
		
		for(int i=0; i< names.length; i++){
			if(names[i]==name){
				count++;
			}
		}
		
		return count;
	}

}
