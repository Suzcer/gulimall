package nju.edu.gulimall.member.feign;

import nju.edu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")//写服务名
public interface CouponFeignService {
    @RequestMapping("coupon/coupon/member/list")
    public R membercoupons();

}
