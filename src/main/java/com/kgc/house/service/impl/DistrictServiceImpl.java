package com.kgc.house.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.house.entity.District;
import com.kgc.house.entity.DistrictExample;
import com.kgc.house.mapper.DistrictMapper;
import com.kgc.house.mapper.StreetMapper;
import com.kgc.house.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {

 @Autowired
 private DistrictMapper districtMapper;
 @Autowired
 private StreetMapper streetMapper;

 @Override
 public int upDistrict ( District district ) {
  return districtMapper.updateByPrimaryKeySelective (district);
 }

 @Override
 public int delDistrict ( Integer id ) {
  try {
   //删除街道 通过区域
   streetMapper.deleteStreetByDid (id);
   //删除区域
   districtMapper.deleteByPrimaryKey (id);
   return 1;
  } catch (Exception e) {
   e.printStackTrace ();
  }
  return 0;
 }

 @Override
 public int delMoreDistrict ( Integer[] ids ) {
  return districtMapper.deleteMoreDistrict (ids);
 }
 @Override
 public int addDistrict ( District district ) {
  return districtMapper.insertSelective (district);
 }

 @Override
 public PageInfo<District> getDistrictByPage ( int page, int pageSize ) {
  //开启分页支持
  PageHelper.startPage (page, pageSize);
  //调用dao层查询所有
  DistrictExample example =new DistrictExample ();
  //获得criteria对象添加条件
  //DistrictExample.Criteria criteria=example.createCriteria ();
  //criteria.andNameLike("%东%");

  List<District> list =districtMapper.selectByExample (example);
  return new PageInfo<District> (list);
 }


}
