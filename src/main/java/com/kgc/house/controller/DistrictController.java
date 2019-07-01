package com.kgc.house.controller;

import com.github.pagehelper.PageInfo;
import com.kgc.house.entity.District;
import com.kgc.house.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin/")
public class DistrictController {
 @Autowired
 private DistrictService districtService;

 @RequestMapping("getDistrict")
 @ResponseBody
 public Map<String, Object> getDistrict ( Integer page, Integer rows ) {
  //调用业务
  PageInfo<District> pageInfo = districtService.getDistrictByPage (page, rows);
  Map<String, Object> map = new HashMap<String, Object> ();
  map.put ("total", pageInfo.getTotal ());
  map.put ("rows", pageInfo.getList ());

  return map;
 }

 //增加
 @RequestMapping("addDistrict")
 @ResponseBody
 public String addDistrict ( District district ) {
  System.out.println (district.getName ());
  //调用业务
  int temp = districtService.addDistrict (district);
  System.out.println (temp);
  return "{\"result\":" + temp + "}";

 }

 //修改
 @RequestMapping("upDistrict")
 @ResponseBody
 public String upDistrict ( District district ) {
  //调用业务
  int temp = districtService.upDistrict (district);
  return "{\"result\":" + temp + "}";
 }
 //删除
 @RequestMapping("delDistrict")
 @ResponseBody
 public String delDistrict ( Integer id ) {
  //调用业务
  int temp = districtService.delDistrict (id);
  return "{\"result\":" + temp + "}";
 }
 /**
  * 批量删除的控制器
  */
 @RequestMapping("delMoreDistrict")
 @ResponseBody
 public String delDistrict(String ids){  // ids=1,2,3,4
  //将字符串转化为整型数组
  String [] arys=ids.split(",");
  Integer [] id=new Integer[arys.length];
  for (int i=0;i<arys.length;i++){
   id[i]=Integer.parseInt(arys[i]);
  }
  //调用业务
  int temp=districtService.delMoreDistrict (id);
  System.out.println (1);
  return "{\"result\":"+temp+"}";
 }

}

