package com.litongjava.demo;

import com.litongjava.hotswap.wrapper.app.SimpleApp;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloWorldWithIndex {
  public static void main(String[] args) {
    SimpleApp.run(HelloWorldWithIndex.class.getName(), "index");
  }

  public void index() {
    System.out.println("Hello World 1");
    String javaVersion = System.getProperty("java.version");
    log.info("java version:{}",javaVersion);
  }
}
