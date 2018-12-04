package com.xqopen.web;


import com.xqopen.service.IFooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p> 前端控制器 </p>
 *
 * @author ${author}
 * @since 2017-08-16
 */
@RestController
@RequestMapping("/foo")
public class FooController {

  @Autowired
  IFooService fooService;

  @GetMapping("get")
  public Object get() {
    return "";
  }

  @PostMapping("add")
  public Object add() {
    return "";
  }

  @PutMapping("edit")
  public Object edit() {
    return "";
  }

  @DeleteMapping("del")
  public Object del() {
    return "";
  }

  @GetMapping("list")
  public Object list() {
    System.out.println(fooService);
    return fooService.selectList(null);
  }


}
