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
		System.out.println(caneDiRazza.getOggetto());
		System.out.println(caneDiRazza.getOggetto());
		
		Gatto gatto = new Gatto();
		System.out.println("Output: ");
		System.out.println(gatto.getOggetto());
		System.out.println(gatto.getOggetto());
		System.out.println(gatto.getOggetto());
		System.out.println(gatto.getOggetto());
		System.out.println(gatto.getOggetto());
		System.out.println(gatto.getOggetto());
		
		for(int i = 0; i< 10; i++){
			System.out.println("modifica del master");
			System.out.println("modifica da marco");
			System.out.println("modifica da marco");
			System.out.println("modifica da marco");
			System.out.println("modifica da marco");
		}
		/*
		String stringa = "";
		String s = "";
		String[] str = new String[10];
		str[0] = "Ciao";
		str[1] = "come";
		str[2] = "stai?";
		str[3] = "io";
		str[4] = "bene";
		str[5] = "spero";
		str[6] = "che";
		str[7] = "anche";
		str[8] = "te";
		str[9] = "ok";
		for(int i = 0; i < 10; i++){
			System.out.println(str[i]); 
			s = str[i];
			stringa = stringa + " " + s;
			System.out.println(stringa);
		}
		System.out.println(stringa);
		System.out.println(str[4]);
		*/
		for(int i = 0; i<10; i++){
			System.out.println("Ciao mondo ");
			System.out.println("Ciao mondo ");
		}
		
	}
}
