package org.sam.mines.address.service.impl

import org.sam.mines.address.model.Schooling
import org.sam.mines.address.model.Town
import org.sam.mines.address.persistence.SchoolingRepository
import org.sam.mines.address.persistence.TownRepository
import org.sam.mines.address.service.SchoolingService
import org.sam.mines.address.service.TownService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class SchoolingServiceImpl @Autowired constructor(val schoolingRepository : SchoolingRepository ) : SchoolingService {
    override fun getAll(): List<Schooling> = schoolingRepository.findAll()

    override fun get(uuid: UUID): Schooling? = schoolingRepository.findById(uuid).orElse(null)

    override fun save(schooling: Schooling): Schooling = schoolingRepository.save(schooling)

    override fun delete(uuid: UUID) = schoolingRepository.deleteById(uuid)
}