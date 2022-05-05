/**
 * @ClassName OrderRepository
 */
package test.demo.rest.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.demo.rest.login.entity.UserEntity;

import java.util.Optional;

/**
 *@ClassName OrderRepository
 *@Description TODO
 */
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    Optional<UserEntity> findByLoginName(String loginName);

}
