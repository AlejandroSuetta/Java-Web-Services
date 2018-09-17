package javaapplicationejemplob;

public class JavaApplicationEjemploB {

    public static void main(String[] args) {
       HolaMundoWebService_Service service = new HolaMundoWebService_Service();
       HolaMundoWebService clienteWS = service.getHolaMundoWebServicePort();
       double total = clienteWS.sumar(50, 200);
       System.out.println("El total es: " + total);
    }
    
}
