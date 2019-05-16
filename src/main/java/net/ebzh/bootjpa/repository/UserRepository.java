package net.ebzh.bootjpa.repository;

import net.ebzh.bootjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: John Ming
 * @Date: 2019/5/16 15:59
 * @Version 1.0
 * @describe:
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
