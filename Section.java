public class Section {
	
	private int sectionNmb;
	private Panel[] panels;
	
	public Section(String sectNmb){
			
		this.sectionNmb = sectionNmb;
		
		panels = new Panel[getCountPanel()/*stub*/];
		
		for(int i=0; i< panels.length;i++){
			panels[i] = new Panel();
	    }
	}
	
	public String toString(){
		String result = "Section # " + sectionNmb + "\n";
		
		for(Panel panel: panels){
			result+=panel.toString();
		}
		return result;
	}	
	
	public int getCountPanel(){
		return 5; //
	}
}