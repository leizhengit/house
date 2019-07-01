package com.kgc.house.service;

import com.github.pagehelper.PageInfo;
import com.kgc.house.entity.District;

public interface DistrictService {

  //查询分页
  PageInfo<District>getDistrictByPage ( int page, int pageSize );
  /**
   * 添加区域
   * @param district
   * @return
   */
  public int addDistrict ( District district );
  /**
   * 修改
   * @param district
   * @return
   */
  public int upDistrict ( District district );
  /**
   * 删除
   * @param id
   * @return
   */
  public int delDistrict ( Integer id );
  /**
   * 删除区域
   * @param ids
   * @return
   */
  public int delMoreDistrict ( Integer[] ids );
}
