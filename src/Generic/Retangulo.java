package Generic;

public class Retangulo<T> {

    private T content;

    public Retangulo(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public void print() {
        System.out.println("Content:" + content);
    }

}
