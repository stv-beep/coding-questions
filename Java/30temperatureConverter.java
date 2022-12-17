package questions;

public class Solution {
	
	
    /* # 30. - com.mouredev.weeklychallenge2022 #42 */
    /* Crea una función que transforme grados Celsius en Fahrenheit y viceversa.
    Para que un dato de entrada sea correcto debe poseer un símbolo "°" y su unidad ("C" o "F"). En caso contrario retornará un error. */
	
	
	public String temperatureConveter(String degrees) {
		try {
			if (degrees.contains("ºC")) {
				String celsiusDegrees = degrees.replace(" ", "").replace("ºC","");
				if (celsiusDegrees != null) {
					float celsiusDegreesNum = Float.parseFloat(celsiusDegrees);
					float fahrenheit = (float) (celsiusDegreesNum * (9.0 / 5.0) + 32);
					String fahrenheitString = Float.toString(fahrenheit);
					fahrenheitString = fahrenheitString + "ºF";
					return fahrenheitString;
				}		
			} else if (degrees.contains("ºF")) {
				String fahrenheitDegrees = degrees.replace(" ", "").replace("ºF","");
				if (fahrenheitDegrees != null) {
					float fahrenheitDegreesNum = Float.parseFloat(fahrenheitDegrees);
					float celsius = (float) ((fahrenheitDegreesNum - 32) * (5.0/9.0));
					String celsiusString = Float.toString(celsius);
					celsiusString = celsiusString + "ºC";
					return celsiusString;
				}	
			}
		} catch(Exception e) {
			return null;
		}
		return null;
	}


    System.out.println(solution.temperatureConveter("100ºC"));
    System.out.println(solution.temperatureConveter("100ºF"));
    System.out.println(solution.temperatureConveter("100C"));
    System.out.println(solution.temperatureConveter("100"));
    System.out.println(solution.temperatureConveter("- 100ºC"));
    System.out.println(solution.temperatureConveter("- 100ºF"));
    System.out.println(solution.temperatureConveter("100AºC"));
    System.out.println(solution.temperatureConveter("ºC"));
}
