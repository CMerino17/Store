package com.kreitek.store.infrastructure.specs;


import com.kreitek.store.domain.entity.Item;
import com.kreitek.store.infrastructure.specs.shared.EntitySpecification;
import com.kreitek.store.infrastructure.specs.shared.SearchCriteria;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import java.util.List;

public class ItemSpecification extends EntitySpecification<Item> implements Specification<Item> {


    public ItemSpecification(List<SearchCriteria> criteria) {
        this.criteria = criteria;
    }


    @Override
    public Predicate toPredicate(Root<Item> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public Specification<Item> and(Specification<Item> other) {
        return Specification.super.and(other);
    }

    @Override
    public Specification<Item> or(Specification<Item> other) {
        return Specification.super.or(other);
    }

    @Override
    public jakarta.persistence.criteria.Predicate toPredicate(jakarta.persistence.criteria.Root<Item> root, jakarta.persistence.criteria.CriteriaQuery<?> query, jakarta.persistence.criteria.CriteriaBuilder criteriaBuilder) {
        return null;
    }


}