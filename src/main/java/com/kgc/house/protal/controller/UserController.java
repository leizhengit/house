/*
package com.kgc.house.protal.controller;

import com.kgc.house.entity.Users;
import com.kgc.house.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/page/")
public class UserController {

 private UserService userService;

 @RequestMapping("/checkUname/")
 @ResponseBody
 public String checkUname ( String username ) {
  //调用业务
  int temp = userService.checkUname (username);
  return "{\"result\":" + temp + "}";//返回 jason
 }

 @RequestMapping("regUser")
 @ResponseBody
 public String regUser ( Users users ) {
  //调用业务
  int temp = userService.addUser (users);
  if (temp > 0)
   return "login";
  else
   return "error";
 }
*/

/* @RequestMapping("login")
 public String regUser (String username,String password) {
  //调用业务
 // int temp = userService.login (username, password);
  if (temp > 0)
   return "login";
  else
   return "error";
 }
 }*/
