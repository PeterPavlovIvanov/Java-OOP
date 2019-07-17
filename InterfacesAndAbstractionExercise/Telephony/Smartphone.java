package InterfacesAndAbstractionExercise.Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        String url = this.urls.get(0);
        this.urls.remove(0);
        if (checkUrl(url)) {
            return "Browsing: " + url + "!";
        } else {
            return "Invalid URL!";
        }
    }

    @Override
    public String call() {
        String number = this.numbers.get(0);
        this.numbers.remove(0);
        if (checkNumber(number)) {
            return "Calling... " + number;
        } else {
            return "Invalid number!";
        }
    }

    private boolean checkUrl(String url) {
        for (int i = 0; i < url.length(); i++) {
            if (url.charAt(i) >= '0' && url.charAt(i) <= '9') {
                return false;
            }
        }
        return true;
    }


    private boolean checkNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) < '0' || number.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}