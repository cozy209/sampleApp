package org.sam.mines.address.service

import org.sam.mines.address.model.Schooling
import org.sam.mines.address.model.Town
import java.util.*

interface SchoolingService {
    fun getAll(): List<Schooling>

    operator fun get(uuid: UUID): Schooling?

    fun save(schooling: Schooling): Schooling

    fun delete(uuid: UUID)
}