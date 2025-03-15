package cuentabancaria;
public class Cuenta {
protected float saldo;
protected int numConsignacion = 0;
protected int numRetiro = 0;
protected float tasaAnual;
protected float comisionMensual = 0;

public Cuenta (float saldo, float tasaAnual){
    this.saldo = saldo;
    this.tasaAnual = tasaAnual;
}

public void imprimir (){
    System.out.println("Saldo: " + saldo);
    System.out.println("Numero de consignacion: " + numConsignacion);
    System.out.println("Numero de retiro: " + numRetiro);
    System.out.println("Tasa anual: " + tasaAnual);
    
}
    


    




























}


