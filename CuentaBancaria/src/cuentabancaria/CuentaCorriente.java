package cuentabancaria;
public class CuentaCorriente extends Cuenta{
    protected float sobregiro;
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        sobregiro=0;
    }
    
    public void retirar (float cantidad){
        float saldoTemporal = saldo - cantidad;
        if (saldoTemporal < 0 ){
            sobregiro = sobregiro - saldoTemporal;
            saldo = 0;
            
        }else{
            super.retirar(cantidad);
        }
    }
    
    public void consignar (float cantidad ){
        float sobregiroTemporal = sobregiro - cantidad;
        
        if (sobregiro > 0){
            if (sobregiroTemporal > 0){
                sobregiro= sobregiroTemporal;
            }else {
                saldo = saldo - sobregiroTemporal;
                sobregiro = 0;
            }
        }else {
            super.consignar(cantidad);
        }
    }
    
    public void extractoMensual(){
        super.extratoMensual();
    }
    public void imprimir() {
         
        System.out.println("saldo: " + saldo);
        System.out.println("COMISION MENSUAL: " + comisionMensual);
        System.out.println("Numero DE TRANSACIONES: " + (numConsignacion + numRetiro));
    }
    































    
}
