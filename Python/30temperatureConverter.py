# 30. - com.mouredev.weeklychallenge2022 #42
""" Crea una función que transforme grados Celsius en Fahrenheit y viceversa.
Para que un dato de entrada sea correcto debe poseer un símbolo "°" y su unidad ("C" o "F"). En caso contrario retornará un error. """


def temperatureConverter(degrees):
    try:
        if "ºC" in degrees:
            celsiusDegrees = degrees.replace(" ","").replace("ºC", "")
            
            if celsiusDegrees is not None:
                fahrenheit = int(celsiusDegrees) * (9 / 5) + 32
                return str(round(fahrenheit,2))+" ºF"
            
        elif "ºF" in degrees:
            fahrenheitDegrees = degrees.replace(" ","").replace("ºF", "")

            if fahrenheitDegrees is not None:
                celsius = (int(fahrenheitDegrees) - 32) * 5 / 9 
                return str(round(celsius,2))+" ºC"
    except:
        return None


print(temperatureConverter("100ºC"))
print(temperatureConverter("100ºF"))
print(temperatureConverter("100C"))
print(temperatureConverter("100"))
print(temperatureConverter("- 100ºC"))
print(temperatureConverter("- 100ºF"))
print(temperatureConverter("100AºC"))
print(temperatureConverter("ºC"))
