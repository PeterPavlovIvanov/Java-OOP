package InterfacesAndAbstractionExercise.SmartTelephonyNotIncluded;

import java.util.List;

public class Smartphone implements Callable,Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getUrls() {
        return urls;
    }

    @Override
    public String browse() {
        if(this.urls.size()>0){
            String url = this.urls.get(0);
            this.urls.remove(0);
            if(checkUrl(url)){
                System.out.println("Browsing: " + url +"!");
            }else{
                System.out.println("Invalid URL!");
            }
            return url;
        }else{
            return null;
            //TODO smth
        }
    }

    @Override
    public String call() {
        if(this.numbers.size()>0){
            String number = this.numbers.get(0);
            this.numbers.remove(0);
            if(checkNumber(number)){
                System.out.println("Calling... " + number);
            }else{
                System.out.println("Invalid number!");
            }
            return number;
        }else{
            return null;
            //TODO smth
        }
    }

    private boolean checkUrl(String url) {
        for (int i = 0; i < url.length(); i++) {
            if(url.charAt(i) >= '0' && url.charAt(i) <= '9'){
                return false;
            }
        }
        return true;
    }


    private boolean checkNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            if(number.charAt(i)< '0' || number.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }
}