public class Avtomat {

	private boolean state;
	
	 public boolean getState(){
		return state;
	}
	
	public void setState( boolean state){
		this.state = state;
	}
	
	public String toString(){
		String result = "Avt state is ";
		if(state){
			result+=" on";
		}
		else result += "off";	
		return result+"\n";
	}
		
	
		
		
} //class


/*grsh1AvtGPA -- */
/*grsh1AvtKTP-1 -- */
/*grsh1AvtKTP-2 -- */
/*grsh1AvtKTP-1 -- */
/*grsh1VvodKTP-1 -- */
/*grsh1VvodKTP-2 -- */
/*grsh1AvtDGU -- */

