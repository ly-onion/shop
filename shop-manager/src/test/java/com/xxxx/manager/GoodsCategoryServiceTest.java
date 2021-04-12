package com.xxxx.manager;

import com.xxxx.manager.service.GoodsCategoryService;
import com.xxxx.manager.vo.GoodsCategoryVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @PROJECT_NAME: shop
 * @DESCRIPTION:
 * @USER: 洋葱
 * @DATE: 2021/4/11 18:05
 */
@SpringBootTest
public class GoodsCategoryServiceTest {

    @Autowired
    private GoodsCategoryService goodsCategoryService;

    @Test
    public void testSelectCategoryListForView(){
        List<GoodsCategoryVo> gcvList = goodsCategoryService.selectCategoryListForView();
//        System.out.println("gcvList = " + gcvList.get(1));
        for (GoodsCategoryVo goodsCategoryVo : gcvList) {
            System.out.println("goodsCategoryVo = " + goodsCategoryVo);
        }
    }
}
