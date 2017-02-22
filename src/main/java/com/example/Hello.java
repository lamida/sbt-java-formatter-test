package com.example;

import com.google.common.collect.ImmutableMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class Hello {
  public static void main(String[] args) {
    System.out.println("Hello World");
    Map<String, String> map = ImmutableMap.of(
        "SomeKey",            "SomeValue",         //nicely aligned for readability
        "OtherKeyName",       "FooBar");
    List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5);
    map.keySet().stream().forEach(x -> { lists.forEach(i -> System.out.println(String.format("Writting some long code bla %s bla %d sdaf sdfa sdf dasfsda f", x, i)));});
  }
}
