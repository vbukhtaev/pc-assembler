package ru.bukhtaev.pcassembler.util.sort;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;

@Getter
@RequiredArgsConstructor
public enum ExpansionBaySort {

    ID_ASC(Sort.by(Sort.Direction.ASC, "id")),
    ID_DESC(Sort.by(Sort.Direction.DESC, "id")),
    CREATED_AT_ASC(Sort.by(Sort.Direction.ASC, "createdAt")),
    CREATED_AT_DESC(Sort.by(Sort.Direction.DESC, "createdAt")),
    MODIFIED_AT_ASC(Sort.by(Sort.Direction.ASC, "modifiedAt")),
    MODIFIED_AT_DESC(Sort.by(Sort.Direction.DESC, "modifiedAt")),
    SIZE_ASC(Sort.by(Sort.Direction.ASC, "size")),
    SIZE_DESC(Sort.by(Sort.Direction.DESC, "size"));

    private final Sort sortValue;
}
