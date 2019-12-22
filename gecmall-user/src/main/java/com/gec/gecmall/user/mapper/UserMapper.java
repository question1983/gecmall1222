package com.gec.gecmall.user.mapper;

import com.gec.gecmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember>{

    List<UmsMember> selectAllUser();

}
