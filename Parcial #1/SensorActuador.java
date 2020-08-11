public class SensorActuador {
    private int temperatura;
    private int minTemp;
    private int maxTemp;

    public SensorActuador(int t, int min, int max){
        temperatura = t;
        minTemp = min;
        maxTemp = max;
    }

    public int getTemperatura() {
        return this.temperatura;
    }

    public void disminuirTemp(int i){
        int aux = temperatura - i;
        if(aux >= minTemp) {
            temperatura = aux;
        }
    }

    public void aumentarTemp(int i){
        int aux = temperatura + i;
        if(aux <= maxTemp ){
            temperatura = aux;
        }
    }

}
