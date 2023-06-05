package top.ppnt.demo;

import com.litongjava.hotswap.wrapper.app.SimpleApp;

public class HelloWorld {
    public static void main(String[] args) {
        SimpleApp.run(HelloWorld.class.getName(),"index");
    }

    public void index(){
        System.out.println("Hello World 1");
    }
}
