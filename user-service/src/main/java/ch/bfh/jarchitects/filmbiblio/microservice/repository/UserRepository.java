package ch.bfh.jarchitects.filmbiblio.microservice.repository;

import ch.bfh.jarchitects.filmbiblio.microservice.model.Userr;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Jasmin on 17.11.2016.
 */
@RepositoryRestResource(path = "users")
public interface UserRepository extends CrudRepository<Userr, String>
{
}
