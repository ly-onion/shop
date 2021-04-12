package com.xxxx.manager.service;

import com.xxxx.manager.pojo.GoodsCategory;
import com.xxxx.manager.vo.GoodsCategoryVo;

import java.util.List;

/**
 * @PROJECT_NAME: shop
 * @DESCRIPTION:
 * @USER: 洋葱
 * @DATE: 2021/4/10 17:35
 */
public interface GoodsCategoryService {

    /*
    * 商品分类-新增分类-查询所有顶级分类
    * */
    List<GoodsCategory> selectCategoryTopList();

    /*
    * 商品分类-新增分类-级联查询
    * */
    List<GoodsCategory> selectCategoryByParentId(Short parentId);

    /*
    * 商品分类-新增分类-保存分类
    * */
    int categorySave(GoodsCategory goodsCategory);

    /*
    * 商品分类-列表
    * */
    List<GoodsCategoryVo> selectCategoryListForView();
}
