package club.zhanshen.gulimall.product;

import club.zhanshen.gulimall.product.entity.BrandEntity;
import club.zhanshen.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("名字");
        brandService.save(brandEntity);
    }

}
