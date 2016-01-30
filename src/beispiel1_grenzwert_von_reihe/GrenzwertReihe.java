package beispiel1_grenzwert_von_reihe;

public class GrenzwertReihe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(berechneGrenzwert(0.001));
		
	}

	public static double berechneGrenzwert(double genauigkeit){
		/*
		double z=1.0;
		double n=1.0;
		double vWert=0;
		double aWert=1;
		
		while(true){
			aWert = vWert + (z/n);
			if(aWert-vWert < genauigkeit){
				break;
			}
			else{
				vWert = aWert;
				n*=2;
			}
			
		}
		return aWert;
		*/
		
		// test mit for-schleife
		
		double aWert = 1;
		double vWert = 0;
		double z = 1.0;
		for(double n = 1.0;;n*=2){
			aWert = vWert + (z/n);
				if(aWert-vWert < genauigkeit){
					break;
				}
				else{
					vWert = aWert;
				}
		}
		return aWert;
	}

	
}
