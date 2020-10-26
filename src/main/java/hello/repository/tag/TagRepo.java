package hello.repository.tag;

import hello.entity.tag.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.List;

@Repository
public interface TagRepo extends JpaRepository<Tag,String>,TagRepoCustom {
    //Tag findByTagName(String tag_name);
}
