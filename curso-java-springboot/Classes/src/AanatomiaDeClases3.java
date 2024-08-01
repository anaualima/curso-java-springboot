public class AanatomiaDeClases3 {
    
    public static void main (String [] args){
        String primeiroNome = "Anauá";
        String segundonOme = "Lima";

        String nomeCompleto = nomeCompleto(primeiroNome, segundonOme);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
