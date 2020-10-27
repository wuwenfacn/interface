package com.fa.mapper;

import com.fa.entity.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {
    List<Address> selectAddressByUId(@Param("uId")int uId);
}
