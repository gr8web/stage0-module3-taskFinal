package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float result = temperatureCelsius * 1.8f + 32;
        System.out.println(result);
    }
}
