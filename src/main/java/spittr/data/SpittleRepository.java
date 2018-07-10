package spittr.data;

import org.springframework.stereotype.Repository;
import spittr.domain.Spittle;

import java.util.List;

/**
 * @description: TODO
 * @author: Katherine
 * @create: 2018/5/29 15:57
 */
@Repository
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long spittleId);
}
