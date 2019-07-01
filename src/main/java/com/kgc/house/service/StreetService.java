package com.kgc.house.service;

import com.github.pagehelper.PageInfo;
import com.kgc.house.entity.Street;

import java.util.List;

public interface StreetService {

 //通过区域显示街道
 PageInfo<Street>getStreetByDistrict ( Integer page, Integer pageSize, Integer districtId );
//通过区域显示街道
 List<Street> getStreetByDistrict(Integer district);

}
