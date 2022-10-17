package mintic.apiseguridad.Repositorios;

import mintic.apiseguridad.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioRol extends MongoRepository<Rol,String> {
}
