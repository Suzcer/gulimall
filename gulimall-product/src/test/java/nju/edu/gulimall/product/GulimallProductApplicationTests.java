package nju.edu.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import nju.edu.gulimall.product.entity.BrandEntity;
import nju.edu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("huawei");
//        brandService.save(brandEntity);
//        System.out.println("save");
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华为");
//
//        brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
