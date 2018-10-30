public class Panel {

	private boolean state;
	
	 public boolean getState(){
		return state;
	}
	
	public void setState( boolean state){
		this.state = state;
	}
	
	public String toString(){
		String result = " Some Panel ";
		/* if(state){
			result+=" on";
		}
		else result += "off"; */	
		return result+"\n";
	}
		
	
		
		
}