package tools;

public class JavaHello {

    private String text;

    public JavaHello(String text) {
        this.text = text;
    }

    public String say (){
        return "Hello, " + this.text + ", from java class!";
    }
}
