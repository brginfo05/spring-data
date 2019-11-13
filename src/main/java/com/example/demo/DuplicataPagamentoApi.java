package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RepositoryRestResource(collectionResourceRel = "duplicatas-pagamento", path = "duplicatas-pagamento")
public interface DuplicataPagamentoApi extends CrudRepository<DuplicataPagamento, Long>, Custom {

}

interface Custom {

    Page<DuplicataPagamento> search(Integer borderoKey,
                                    Boolean conferida,
                                    Pageable pageable);
}

@Repository
class CustomImpl implements Custom {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Page<DuplicataPagamento> search(Integer borderoKey,
                                           @Valid @NotNull Boolean conferida,
                                           Pageable pageable) {

        StringBuilder hql = new StringBuilder()
            .append("from DuplicataPagamento ")
            .append(" where borderoKey = :borderoKey");

        return new PageImpl<>(entityManager
                                  .createQuery(hql.toString())
                                  .setParameter("borderoKey", borderoKey)
                                  .getResultList(), pageable, 0);
    }
}
