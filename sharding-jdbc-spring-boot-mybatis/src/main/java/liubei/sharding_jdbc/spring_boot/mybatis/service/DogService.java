package liubei.sharding_jdbc.spring_boot.mybatis.service;

import liubei.sharding_jdbc.spring_boot.mybatis.dao.DogMapper;
import liubei.sharding_jdbc.spring_boot.mybatis.entity.Dog;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DogService {

    @Resource
    private DogMapper dogMapper;

    public List<Dog> selectAllDogs() {
        return dogMapper.queryAll();
    }

}
