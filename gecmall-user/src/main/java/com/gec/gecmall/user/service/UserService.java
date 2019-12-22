package com.gec.gecmall.user.service;


import com.gec.gecmall.user.bean.UmsMember;
import com.gec.gecmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
