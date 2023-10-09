package com.litongjava.demo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaInfoTest {
  public static void main(String[] args) {
    String javaVersion=System.getProperty("java.version");
    String javaHome=System.getProperty("java.home");
    log.info("java-version:{}",javaVersion);
    log.info("java-home:{}",javaHome);
  }
}
