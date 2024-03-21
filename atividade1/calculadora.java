public class Calculadora {
    int numA;
    int numB;

    int somar(){
        return numA + numB;
    }
    int subtrair(){
        return numA - numB;
    }
    int multiplicar(){
        return numA * numB;
    }
    double dividir(){
        return (double) numA / numB;
    }
    boolean verificarNumeroPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
