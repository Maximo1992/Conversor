public class Procesos {
    public static String SeleccionMoneda(int numeroMoneda){
        String codigoMoneda = null;
        if(numeroMoneda<10 && numeroMoneda>=0){
            switch (numeroMoneda){
                case 1:
                    codigoMoneda = "PEN";
                    break;
                case 2:
                    codigoMoneda = "USD";
                    break;
                case 3:
                    codigoMoneda = "BRL";
                    break;
                case 4:
                    codigoMoneda = "BOB";
                    break;
                case 5:
                    codigoMoneda = "CLP";
                    break;
                case 6:
                    codigoMoneda = "COP";
                    break;
                case 7:
                    codigoMoneda = "CNY";
                    break;
                case 8:
                    codigoMoneda = "JPY";
                    break;
                default:
                    codigoMoneda = "EUR";
            }
        }
        return codigoMoneda;
    }
}
