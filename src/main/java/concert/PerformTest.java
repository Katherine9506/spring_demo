package concert;

import org.springframework.stereotype.Component;

@Component
public class PerformTest implements Performance {
    public void perform() {
        System.out.println("performing....");
    }
}
