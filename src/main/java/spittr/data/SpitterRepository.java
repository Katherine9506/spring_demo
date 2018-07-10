package spittr.data;

import org.springframework.stereotype.Repository;
import spittr.domain.Spitter;

@Repository
public interface SpitterRepository {
    Spitter save(Spitter spitter);
}
