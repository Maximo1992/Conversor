import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaCambio consulta = new ConsultaCambio();
        int numMoneda;
        boolean actuador = true;
        while(actuador) {
            System.out.println("**********************************************************");
            System.out.println("Estas son las divisas con las que se cuenta actualmente: ");
            System.out.println("""
                                    
                    1. Sol Peruano
                    2. Dólar Estadounidense
                    3. Real Brazileño
                    4. Boliviano Boliviano
                    5. Peso Chileno
                    6. Peso Colombiano
                    7. Renminbi Chino
                    8. Yen Japones
                    9. Euro Europeo
                                    
                    **********************************************************
                    """);
            System.out.println("Elija la moneda base que desea transformar: ");
            String monedaBase = Procesos.SeleccionMoneda(Integer.valueOf(lectura.nextLine()));
            System.out.println("Elija la moneda a la cual quiere hacer el cambio: ");
            String monedaCambio = Procesos.SeleccionMoneda(Integer.valueOf(lectura.nextLine()));

            System.out.println("Ingrese el monto que desea cambiar:");
            Double monedaMonto = lectura.nextDouble();

            try {
                Cambio cambio = ConsultaCambio.procesarCambio(monedaBase, monedaCambio, monedaMonto);
                System.out.println("El valor de los " + monedaMonto + cambio.base_code() + " es de " + cambio.conversion_result() + cambio.target_code() + " con una taza de cambio de " + cambio.conversion_rate());
                System.out.println(cambio);
            } catch (NumberFormatException e) {
                System.out.println("Introduca datos adecuados");
            }

            System.out.println("Desea realizar otra convercion de monedas? S/N");

            String respuesta = lectura.nextLine(); //por alguna razon no lo lee

            String prueba = lectura.nextLine();

            if (prueba.equals("N")) {
                actuador = false;
            }
        }

    }
}