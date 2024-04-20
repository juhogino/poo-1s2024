import heranca.empresa.Engenheiro;
import heranca.empresa.Gerente;
import heranca.empresa.Diretor;

public class Sistema {
    public static void main(String[] args) {
        
        Engenheiro eng1 = new Engenheiro("jaoo",123,12345,"crea 1","orientação a objetos",1000.00);
        Engenheiro eng2 = new Engenheiro("julia",223,12445,"crea 2","orientação a objetos",1100.00);
        Gerente ger1 = new Gerente("jose",234,3456,200000.0,2 );
        Diretor dir1 = new Diretor("ana",234,3456,30000.0,3 );

        System.out.println(eng1);
        System.out.println(eng2);
        System.out.println(ger1);
        System.out.println(dir1);
    }
    
}
