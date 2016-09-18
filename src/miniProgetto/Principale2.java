
public class Principale2 {
	public static void main(String[] args){
		
		//branch marco per provare il merge
		
		System.out.println("Sono nella classe principale");
		
		Cane cane = new Cane();
		System.out.println(cane.getOggetto());	
		System.out.println(cane.getOggetto());
		System.out.println(cane.getOggetto());
		System.out.println(cane.getOggetto());
		System.out.println(cane.getOggetto());
		System.out.println(cane.getOggetto());
		
		CaneDiRazza caneDiRazza = new CaneDiRazza();
		System.out.println(caneDiRazza.getOggetto());
		
		caneDiRazza = new CaneDiRazza();
		System.out.println(caneDiRazza.getOggetto());
		
		Gatto gatto = new Gatto();
		System.out.println(gatto.getOggetto());
		System.out.println(gatto.getOggetto());
		System.out.println(gatto.getOggetto());
		System.out.println(gatto.getOggetto());
		System.out.println(gatto.getOggetto());
		System.out.println(gatto.getOggetto());
		
		for(int j = 0; j < 20; j++){
			System.out.println("Sono la modifica");	
		}
	}
}
