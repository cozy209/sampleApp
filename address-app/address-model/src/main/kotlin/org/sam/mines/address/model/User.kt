package org.sam.mines.address.model

import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
data class User(
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(unique = true, nullable = false)
        @Type(type = "pg-uuid")
        var uuid: UUID? = null,

        @Column(name = "firstname")
        var firstName: @NotBlank String? = null,

        @Column(name = "lastname")
        var lastName: @NotBlank String? = null
)