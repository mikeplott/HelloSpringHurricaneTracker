package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by michaelplott on 10/24/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findFirstByName(String name);
}
