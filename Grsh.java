public class Grsh {
	
	private int grshNmb;
	private Section[] sections;
	//private Avtomat[] avtomates;
	
	public Grsh(int grshNmb){
			
		this.grshNmb = grshNmb;
		sections = new Section[getCountSections()];
		
		for(int i=0; i< sections.length; i++){
			sections[i] = new Section("1");
	    }
	}
	
	 int getCountSections(){
	 return 2;
	 }
		 
		 
		 
		 
	public String toString(){
		String result = "This GRSH # " + grshNmb + "\n";
		for(Section sect: sections){
			result+=sect.toString();
		}
		return result;
	}		
}