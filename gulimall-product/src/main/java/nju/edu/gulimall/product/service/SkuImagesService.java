package nju.edu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import nju.edu.common.utils.PageUtils;
import nju.edu.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author Musss
 * @email 201250104@smail.nju.edu.cn
 * @date 2022-09-11 16:25:48
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

