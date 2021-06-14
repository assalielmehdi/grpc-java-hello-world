package io.assalielmehdi.helloworld;

import io.assalielmehdi.helloworld.client.HelloWorldClient;

public class ClientRunner {

  public static void main(String[] args) {
    final var client = HelloWorldClient.getInstance();

    System.out.println(client.request(10));
  }

}
