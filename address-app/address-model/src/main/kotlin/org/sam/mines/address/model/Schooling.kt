package org.sam.mines.address.model

import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
data class Schooling(
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(unique = true, nullable = false)
        @Type(type = "pg-uuid")
        var uuid: UUID? = null,

        @ManyToOne
        var user: @NotNull User? = null,

        @Column(name = "enteringyear")
        var enteringYear: @NotBlank Int? = null,
        @Column(name = "exitingyear")
        var exitingYear: Int? = null,
        @OneToOne
        var cursus: @NotNull Cursus
)