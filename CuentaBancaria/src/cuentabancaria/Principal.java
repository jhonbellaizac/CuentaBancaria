package cuentabancaria;
public class Principal {
    public static void main(String[] args) {
        
        System.out.println("Cuenta de Ahorro: ");
        
        final float  SALDO = 15000;
        final float TASA_ANUAL =  0.10f;
        
       Cuenta cuentaAhorros1 = new Cuenta (SALDO, TASA_ANUAL); 
       
        System.out.println("");
        
        cuentaAhorros1.imprimir();
        
        System.out.println("");
        
        cuentaAhorros1.consignar(5000);
        cuentaAhorros1.consignar(5000);
        cuentaAhorros1.consignar(5000);
        cuentaAhorros1.consignar(5000);
        cuentaAhorros1.imprimir();
        
        System.out.println("");
        
        cuentaAhorros1.retirar(2000);
        cuentaAhorros1.retirar(200);
        cuentaAhorros1.retirar(500);
        cuentaAhorros1.retirar(100);
        cuentaAhorros1.retirar(3000);
        cuentaAhorros1.retirar(700);
        cuentaAhorros1.retirar(800);
        cuentaAhorros1.imprimir();
        
       
     
       
        
      







    }
    
}
