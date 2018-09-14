package ex1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Fernando Passacantilli Silva Ferrari
 * @author Graziele Galvão Silva
 * @author Leonardo Livans de Souza
 * @author Rafael Marinho de Andrade
 * @author Thiago de Oliveira Alves
 * @author Vinícius de Souza Cardoso
 */

public class Main {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("exercicio.xml");

        Bean1 bean1 = (Bean1) context.getBean("bean1");

        System.out.println(bean1.getId());
        System.out.println(bean1.getTxt1());
        System.out.println(bean1.getTxt2());

        Bean2 bean2 = bean1.getRef();

        System.out.println(bean2.getId());
        System.out.println(bean2.getTxt1());
        System.out.println(bean2.getTxt2());
        System.out.println(bean2.getTxt3());

    }

}
