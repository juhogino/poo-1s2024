public class Main {

    public static void main(String [] args){
        Calculadora calc = new Calculadora(); 

        calc.somar(2, 3);
        calc.somar(2.5, 3.5);

        Animal a1= new Animal();
        a1.fazersom();

        Cachorro c1= new Cachorro();
        c1.fazersom();

        Carro c2= new Carro();
        Moto m1= new Moto();
        acelerarveiculo(c2);
        acelerarveiculo(m1);
    }
    
    public static void acelerarveiculo(Veiculo v){
        v.acelerar();
    }
}
