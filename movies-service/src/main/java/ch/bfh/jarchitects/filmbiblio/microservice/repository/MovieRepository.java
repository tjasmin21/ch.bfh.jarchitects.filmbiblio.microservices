package ch.bfh.jarchitects.filmbiblio.microservice.repository;

import ch.bfh.jarchitects.filmbiblio.microservice.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Jasmin on 17.11.2016.
 */
@RepositoryRestResource(path = "movies")
public interface MovieRepository extends CrudRepository<Movie, Long>
{


}
