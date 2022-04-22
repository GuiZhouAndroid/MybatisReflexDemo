package com.dhrj.zs.mapper;

import com.dhrj.zs.entity.TeacherBean;

/**
 * created by on 2022/4/22
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-04-22-16:18
 */
public interface TeacherMapper {
    //根据老师id查询老师信息以及使用的教室信息
    TeacherBean getTerAndClassByTerId(Integer teacherId);
}
