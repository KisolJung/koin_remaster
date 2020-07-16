package koreatech.in.repository;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleMapper {
    @Select(value = "select now()")
    public String thisTime();

    public String getTime();

}
