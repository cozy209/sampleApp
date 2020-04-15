package org.sam.mines.address.model

import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
data class Cursus(
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(unique = true, nullable = false)
        @Type(type = "pg-uuid")
        var uuid: UUID? = null,
        @Column(name = "name")
        var name:String? = null,
        @Column(name = "duration")
        var duration:Int? = null,
        @ManyToOne
        var school: @NotNull School? = null
)