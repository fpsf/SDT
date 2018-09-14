package ex1;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Bean1 {

    private String txt2;
    private String txt1;
    private int id;
    private Bean2 ref;


    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getTxt1() {
        return txt1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setRef(Bean2 ref) {
        this.ref = ref;
    }

    public Bean2 getRef() {
        return ref;
    }
}
