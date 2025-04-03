import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String nombreEmpleado, documentoEmpleado, diaDeDescanso = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double deduccionPension = 0;
        double deduccionSalud = 0;
        double horasTrabajadas = 0;
        double valorHora = 0;
        double bonificacionEmpleado = 0;
        double salarioMinimo = 1423500;
        double auxilioTransporte = 200000;
        double cantidadHorasExtras = 0;
        double valorHoraExtra = 0;
        double totalValorHorasExtra = 0;

        System.out.println("Ingrese el nombre del empleado: ");
        nombreEmpleado = x.nextLine();
        System.out.println("Ingrese el documento del empleado: ");
        documentoEmpleado = x.nextLine();
        System.out.println("Ingrese el dia de descanso (Lunes - Viernes): ");
        diaDeDescanso = x.nextLine();

    }
}