package tech.yassine.sa_backend.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "test")
public class TestController {
    @GetMapping(path = "string")
    public String getString(){
        return "Chaine transmise par sa";
    }
    @GetMapping()
    public List<String> getList(){
        return List.of("Chaine transmise par sa","Chaine transmise par sa","Chaine transmise par sa");
    }



}
