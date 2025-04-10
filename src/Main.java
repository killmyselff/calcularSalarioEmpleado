import java.util.Scanner;
import java.util.concurrent.CancellationException;
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
        System.out.println("Ingrese el valor de la hora: ");
        valorHora = x.nextDouble();
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        horasTrabajadas = x.nextDouble();

        salarioBruto = horasTrabajadas * valorHora;
        if (salarioBruto <= 2 * salarioMinimo) {
            auxilioTransporte = 200000;
            bonificacionEmpleado = salarioBruto * 0.1;
        } else {
            auxilioTransporte = 0;
            bonificacionEmpleado = 0;
        }
        deduccionPension = salarioBruto * 0.04;
        deduccionSalud = salarioBruto * 0.04;
        if (horasTrabajadas > 96) {
            cantidadHorasExtras = horasTrabajadas - 96;
            valorHoraExtra = valorHora * 1.25;
            totalValorHorasExtra = cantidadHorasExtras * valorHoraExtra;
        } else {
            cantidadHorasExtras = 0;
            valorHoraExtra = 0;
            totalValorHorasExtra = 0;
        }
        if (horasTrabajadas < 24) {
            System.out.println("Aún no le puedo pagar, trabaje más");
        } else {
            salarioNeto = salarioBruto - deduccionPension - deduccionSalud + auxilioTransporte + bonificacionEmpleado + totalValorHorasExtra;
            System.out.println("El salario neto del empleado es: " + salarioNeto);
            System.out.println("El salario bruto es : " + salarioBruto);
            System.out.println("La deducción de la pensión es de: " + deduccionPension);
            System.out.println("La deducción de la salud es de: " + deduccionSalud);
            System.out.println("El auxilio de transporte es de: " + auxilioTransporte);
            System.out.println("La bonificación del empleado" + nombreEmpleado + "es de:"  + bonificacionEmpleado);
            System.out.println("El total de las horas extra son: " + totalValorHorasExtra);
        }

    }
}