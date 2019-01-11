package reflection.week08;


import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {
    Predicate<Double> condition;
    Function<Double, String> display;

    public Thermostat(Predicate<Double> condition, Function<Double, String> display) {
        this.condition = condition;
        this.display = display;
    }


    public String sense(Double temperature) {
        if (condition.test(temperature)) {

            return "Warning";
        }
        return display.apply(temperature);


    }
}
