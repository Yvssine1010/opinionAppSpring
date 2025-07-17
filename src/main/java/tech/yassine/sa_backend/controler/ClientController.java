package tech.yassine.sa_backend.controler;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tech.yassine.sa_backend.entities.Client;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "client")
public class ClientController {
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)//La méthode n’accepte que les requêtes dont le Content-Type est application/json
    public void creer (@RequestBody Client client ){
    }
    @GetMapping("/test")
    public String test() {
        return "ça marche";
    }
}
