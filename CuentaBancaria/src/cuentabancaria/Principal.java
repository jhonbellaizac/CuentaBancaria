package cuentabancaria;
public class Principal {
    public static void main(String[] args) {
        
       Cuenta cuenta = new Cuenta (100000, 0); 
       cuenta.imprimir();
        System.out.println("");
        
       cuenta.consignar(56500);
       cuenta.imprimir();
        System.out.println("");
        
       cuenta.retirar(25200);
       cuenta.imprimir();
        System.out.println("");







    }
    
}
