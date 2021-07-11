package liubei.sharding_jdbc.spring_boot.mybatis.controller;

import liubei.sharding_jdbc.spring_boot.mybatis.dao.ShopInfoMapper;
import liubei.sharding_jdbc.spring_boot.mybatis.entity.ShopInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopInfoController {

    private ShopInfoMapper shopInfoMapper;

    @Autowired
    public ShopInfoController(ShopInfoMapper shopInfoMapper) {
        this.shopInfoMapper = shopInfoMapper;
    }

    @GetMapping("/shops")
    public List<ShopInfo> getShops() {
        return shopInfoMapper.selectAllShopInfos();
    }

    @GetMapping("/shop/{shopId}")
    public ShopInfo getShopById(@PathVariable Long shopId) {
        return shopInfoMapper.selectByPrimaryKey(shopId);
    }

    @PostMapping("/shop")
    public Integer addShopInfo(@RequestBody ShopInfo shopInfo){
        return shopInfoMapper.insert(shopInfo);
    }

}
