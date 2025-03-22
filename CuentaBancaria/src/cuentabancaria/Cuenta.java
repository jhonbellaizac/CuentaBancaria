package cuentabancaria;
public class Cuenta {
protected float saldo;
protected int numConsignacion = 0;
protected int numRetiro = 0;
protected float tasaAnual = 9;
protected float comisionMensual = 0;



public Cuenta (float saldo, float tasaAnual){
    this.saldo = saldo;
    this.tasaAnual = tasaAnual;
}
public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConsignaciones() {
        return numConsignacion;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numConsignacion = numeroConsignaciones;
    }

    public int getNumeroRetiros() {
        return numRetiro;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numRetiro = numeroRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }

    

public void consignar (float cantidad){
    saldo = saldo + cantidad;
}
    

public void retirar (float cantidad){
    float nuevoSaldoTemporal = saldo-cantidad;
    
    if (nuevoSaldoTemporal >= 0) {
        saldo = nuevoSaldoTemporal;
    }else {
        System.out.println("La cantidad a retirar excede a la cantidad actual");
    }
}

public void interesMensual (){
    
    float tasaMensual = tasaAnual  /12;
    float interesMensual =  saldo * tasaMensual;
    saldo = saldo + interesMensual;
}

public void extratoMensual(){
    saldo = saldo-comisionMensual;
    interesMensual();
}
public void imprimir (){
    System.out.println("Saldo: " + saldo);
    System.out.println("Numero de consignacion: " + numConsignacion);
    System.out.println("Numero de retiro: " + numRetiro);
    System.out.println("Tasa anual: " + tasaAnual);
    System.out.println("Comision mensual:" + comisionMensual);
}


    
























}


