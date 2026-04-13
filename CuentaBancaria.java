public class CuentaBancaria {

    //Atributos
    private String nombreTitular;
    private double saldo;

    //Constructor
    public CuentaBancaria(String nombreTitular, double saldo){
        this.nombreTitular=nombreTitular;
        this.saldo=saldo;
    }

    //Metodos
    public void mostrarInformacion(){
        System.out.println("Nombre del titular: "+nombreTitular);
        System.out.println("Saldo: "+saldo);
        System.out.println("-------------------------------------");
    }

    public void depositar(double monto){
        saldo = saldo + monto;
        System.out.println("Se depositó: $"+monto);
    }

    public void retirar(double monto){
        if(saldo >= monto){
            saldo = saldo - monto;
            System.out.println("Se retiró: "+monto);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
