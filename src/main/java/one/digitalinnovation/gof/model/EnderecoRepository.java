package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
    O Repository serve para prover todos os metodos de acesso a dados daquela Entity
 */


@Repository
//CrudRepository nada mais é que um Strategy que me obriga a seguir essa estratégia de implementação
//Só de estar estendendo de um CrudRepository o Spring já entende que eu quero implementar algo concreto de persistencia a dados e até injetar tudo se eu quiser
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
