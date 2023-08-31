package ru.bukhtaev.pcassembler.model.dictionary;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ru.bukhtaev.pcassembler.model.NameableEntity;

import java.util.Date;

@Entity
@Table(
        name = "pci_express_connector_version",
        uniqueConstraints = @UniqueConstraint(columnNames = "name")
)
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PciExpressConnectorVersion extends NameableEntity {

    @Builder
    public PciExpressConnectorVersion(
            final String id,
            final Date createdAt,
            final Date modifiedAt,
            final String name
    ) {
        super(id, createdAt, modifiedAt, name);
    }
}
