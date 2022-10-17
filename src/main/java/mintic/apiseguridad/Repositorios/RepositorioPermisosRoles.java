package mintic.apiseguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import mintic.apiseguridad.Modelos.PermisosRol;


public interface RepositorioPermisosRoles extends MongoRepository<PermisosRol,String> {
    @Query("{'rol.$id': ObjectId(?0),'permiso.$id': ObjectId(?1)}")
    PermisosRol getPermisoRol(String id_rol,String id_permiso);
}
