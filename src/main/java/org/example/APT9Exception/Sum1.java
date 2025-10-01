package org.example.APT9Exception;

public class Sum1 {

    public static double sumStrings(String[] args) {
    double sum = 0.0;
    String numberPattern = "^[-+]?\\d*(\\.\\d+)?$"; // простое число, включая знаки +/-

    for (String arg : args) {
        if (arg != null && arg.matches(numberPattern)) {
            sum += Double.parseDouble(arg);
        } else {
            
        }
    }
    return sum;
}
}


