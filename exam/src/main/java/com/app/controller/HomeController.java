package com.app.controller;

public class HomeController {

  @GetMapping("/get")
  public String m1()
  {
    return "Login page";
  }

}
