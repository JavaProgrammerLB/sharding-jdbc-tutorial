package liubei.sharding_jdbc.spring_boot.mybatis.controller;

import liubei.sharding_jdbc.spring_boot.mybatis.entity.Dog;
import liubei.sharding_jdbc.spring_boot.mybatis.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

    @Autowired
    private DogService dogService;

    @GetMapping("/dogs")
    public List<Dog> getAll(){
       return dogService.selectAllDogs();
    }

}
