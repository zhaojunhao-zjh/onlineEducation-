package com.hnguigu.api.ucenter;

import com.hnguigu.common.model.response.ResponseResult;
import com.hnguigu.domain.ucenter.XcCompany;
import com.hnguigu.domain.ucenter.XcCompanyUser;
import com.hnguigu.domain.ucenter.ext.XcUserExt;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "用户中心",description = "用户中心管理")
public interface UcenterControllerApi {
    @ApiOperation("根据用户账号查询用户信息")
    public XcUserExt getUserext(String username);


    XcCompanyUser findByuserId(String userId);

    XcCompany findCompany(String userId);

    ResponseResult addAndUpdate(XcCompany xcCompany);
}
