package deploy.deploy1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/api")
public class SumController {

    @GetMapping("/sum")
    public String getSum() {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int sum = a + b;
        return "Sum of " + a + " and " + b + " is " + sum;
    }
}
