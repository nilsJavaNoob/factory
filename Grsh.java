public class Grsh {
	
	private int grshNmb;
	private Avtomat[] avtomates;
	
	public Grsh(int grshNmb){
			
		this.grshNmb = grshNmb;
		avtomates = new Avtomat[getCountAvt()];
		
		for(int i=0; i< avtomates.length;i++){
			avtomates[i] = new Avtomat();
	}
	}
	
	public String toString(){
		String result = "This GRSH # " + grshNmb + "\n";
		for(Avtomat avt: avtomates){
			result+=avt.toString();
		}
		return result;
	}	
	
	public int getCountAvt(){
		return 5;
	}
}