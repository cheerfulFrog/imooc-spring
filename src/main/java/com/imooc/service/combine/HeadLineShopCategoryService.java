package com.imooc.service.combine;

import com.imooc.entity.bo.ShopCategory;
import com.imooc.entity.dto.MainPageInfoDTO;
import com.imooc.entity.dto.Result;

import java.util.List;

public interface HeadLineShopCategoryService {

    Result<MainPageInfoDTO> getMainPageInfo();
}
