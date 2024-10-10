package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

  @GetMapping("/get")
  public String m1()
  {
    return "Login page";
  }

  
  @GetMapping("/log")
  public String m2()
  {
    return "Logout";
  }
  
 @GetMapping("/m3")
  public String m3()
  {
    return "Register";
  }



  
}
