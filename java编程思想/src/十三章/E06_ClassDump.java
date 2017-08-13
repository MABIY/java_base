package 十三章;

import 第七章.SprinklerSystem;

import java.util.Locale;

import static java.lang.String.*;

/**
 * Created by lh on 17-8-7.
 * Create a class that contains int,long,float
 * and double fields.Create a toString() method
 * for this class that uses String.format(), and
 * demonstrate that your class works correctly
 */
class DataHolder {
    int intField = 1;
    long longField = 2L;
    float floatField = 3.0f;
    double doubleField = 4.0;

    public String toString() {
        StringBuilder result = new StringBuilder("DataHolder: \n");
        result.append(format(Locale.US, "intField: %d\n", intField));
        result.append(format(Locale.US, "LongField: %d\n", longField));
        result.append(format(Locale.US, "floatFiled: %f\n", floatField));
        result.append(format(Locale.US, "doubleField: %e\n", doubleField));
        return result.toString();
    }
}

public class E06_ClassDump {
    public static void main(String[] args) {
        System.out.println(new DataHolder());
    }
}


