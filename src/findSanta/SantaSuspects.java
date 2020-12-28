package findSanta;

public class SantaSuspects {

	String[] suspects;
	
	int nextIndex = 0;
	int arraySize = 0;
	
	public SantaSuspects(int size) {
		this.arraySize = size;
		this.suspects = new String[size];
	}
	
	public void addSuspect(String suspect) {
		this.suspects[this.nextIndex] = suspect;
		this.nextIndex++;
		if (this.nextIndex >= this.arraySize) {
			this.nextIndex = 0;
		}
	}
	
	public void printSuspects() {
		for(String x: this.suspects) {
			
			if (null == x) {
				continue;
			}
			System.out.println(x);
		}
	}
	
	public boolean foundMatch(String input) {
		for(int i = 0; i < arraySize; i++) {
			
			if(suspects[i] == null){
				continue;
			}
			
			if(suspects[i].equalsIgnoreCase(input)){
				return true;
			}
			
		}
		
		return false;
	}
}
