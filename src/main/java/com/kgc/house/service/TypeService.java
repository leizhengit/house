package com.kgc.house.service;

import com.github.pagehelper.PageInfo;
import com.kgc.house.entity.Type;

public interface TypeService {

  //查询区域带分页
  PageInfo<Type> getTypeByPage ( Integer page, Integer pageSize );

  /**
   * 添加类型
   * @param
   * @return
   */
  public int addType ( Type type );


  /**
   * 修改类型
   * @param type
   * @return
   */
  public int updateType ( Type type );


  /**
   * 删除类型
   * @param
   * @return
   */
  public int deleteType ( Integer id );

  /**
   *
   * @param ids
   * @return
   */
  int deleteMoreType ( Integer[] ids );
}

