package ex1;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Bean2 implements Interface{

    private int id;
    private String txt3;
    private String txt2;
    private String txt1;

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setTxt3(String txt3) {
        this.txt3 = txt3;
    }

    @Override
    public String getTxt3() {
        return txt3;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }

    @Override
    public String getTxt2() {
        return txt2;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    @Override
    public String getTxt1() {
        return txt1;
    }
}
