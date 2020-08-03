package Spring2.pojo;

import org.springframework.stereotype.Repository;

@Repository
public class BookDao {

    private String name = "时间简史";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
