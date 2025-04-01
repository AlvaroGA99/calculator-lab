/*Clase 5: Module
Operaciones de módulo y valor absoluto.

Métodos:

Cálculo del módulo

Parámetros: int a, int b
Salida: int (a % b)
Valor absoluto

Parámetro: double a
Salida:
Si a ≥ 0: |a| = a
Si a < 0: |a| = -a
*/


public class Module {

        public double module (int a, int b){
            return a%b;
        }

        public double abs (double a){
            return Math.abs(a);
        }
    }

