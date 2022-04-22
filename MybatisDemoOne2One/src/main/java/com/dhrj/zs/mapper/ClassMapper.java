package com.dhrj.zs.mapper;

import com.dhrj.zs.entity.ClassBean;

/**
 * created by on 2022/4/22
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-04-22-16:18
 */
public interface ClassMapper {
    //根据教室id查询教室信息以及所属的老师信息
    ClassBean getClassAndTerByClassId(Integer classId);
}
