
public class UnitConverter {
    /*Conversiones de temperatura y ángulos.

            Métodos:

    Celsius a Fahrenheit

    Fórmula: F = (C × 9/5) + 32
    Parámetro: double celsius
    Salida: double (fahrenheit)
    Fahrenheit a Celsius

    Fórmula: C = (F - 32) × 5/9
    Parámetro: double fahrenheit
    Salida: double (celsius)
    Grados a Radianes

    Fórmula: radianes = grados × π / 180
    Parámetro: double grados
    Salida: double (radianes)
    Radianes a Grados

    Fórmula: grados = radianes × 180 / π
    Parámetro: double radianes
    Salida: double (grados)

   */

    public double celsiusToFarenheit  (double celsius){
        return (celsius * 9/5) + 32;
    }

    public double farenheitToCelsius  (double farenheit){
        return (farenheit-32)*(5/9);
    }

    public double degreesToRadians  (double degrees){
        return (degrees*180)/Math.PI;
    }

    public double radiansToDegrees (double radians) {
        return (radians*180)/Math.PI;
    }


}
