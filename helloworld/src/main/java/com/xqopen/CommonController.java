package com.xqopen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommonController {

  @GetMapping("hello")
  @ResponseBody
  public String hello(@RequestParam(value = "name", required = false) String name) {
    return "hello " + name;
  }

}
