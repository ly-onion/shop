package com.xxxx.manager.controller;

import com.xxxx.common.result.BaseResult;
import com.xxxx.manager.pojo.GoodsCategory;
import com.xxxx.manager.service.GoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @PROJECT_NAME: shop
 * @DESCRIPTION:商品分类
 * @USER: 洋葱
 * @DATE: 2021/4/9 16:22
 */
@Controller
@RequestMapping("goods")
public class GoodsCategoryController {

    @Autowired
    private GoodsCategoryService goodsCategoryService;

    /*
     * 跳转商品列表页
     * */
    @RequestMapping("category/list")
    public String categoryList(Model model) {
        model.addAttribute("gcvList", goodsCategoryService.selectCategoryListForView());
        return "goods/category/category-list";
    }

    /*
     * 跳转商品新增页
     * */
    @RequestMapping("category/add")
    public String categoryAdd(Model model) {
        List<GoodsCategory> gcList = goodsCategoryService.selectCategoryTopList();
        model.addAttribute("gcList", gcList);
        return "goods/category/category-add";
    }

    /*
     * 商品分类-新增分类-级联查询
     * */
    @RequestMapping("category/{parentId}")
    @ResponseBody
    public List<GoodsCategory> selectCatagoryList(@PathVariable Short parentId) {
        return goodsCategoryService.selectCategoryByParentId(parentId);
    }

    /*
     * 商品分类-新增分类-保存分类
     * */
    @RequestMapping("category/save")
    @ResponseBody
    public BaseResult categorySave(GoodsCategory goodsCategory) {
        int result = goodsCategoryService.categorySave(goodsCategory);
        return result > 0 ? BaseResult.success() : BaseResult.error();
    }
}
