package ru.bukhtaev.pcassembler.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.bukhtaev.pcassembler.model.Psu;

import java.util.Optional;

@Repository
public interface PsuRepository extends JpaRepository<Psu, String> {

    Slice<Psu> findAllBy(final Pageable pageable);

    @Query("SELECT u FROM Psu u WHERE u.name = :#{#entity.name} AND (:id IS NULL OR u.id <> :id)")
    Optional<Psu> findAnotherByName(
            @Param("id") final String id,
            @Param("entity") final Psu entity
    );
}
