package org.sam.mines.address.persistence

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.sam.mines.address.model.Schooling
import org.sam.mines.address.model.Town
import org.sam.mines.address.persistence.config.PersistenceTestConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.TestExecutionListeners
import org.springframework.test.context.jdbc.Sql
import org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener
import org.springframework.test.context.transaction.TransactionalTestExecutionListener

@ExtendWith(SpringExtension::class)
@TestExecutionListeners(SqlScriptsTestExecutionListener::class, TransactionalTestExecutionListener::class, DependencyInjectionTestExecutionListener::class)
@ContextConfiguration(classes = [PersistenceTestConfig::class])
@Sql(scripts = ["/data/clear.sql", "/data/schooling.sql"])
class SchoolingRepositoryTest {
    @Autowired
    private val schoolingRepository : SchoolingRepository? = null

    @Test
    fun shouldFindAll() {
        val all: List<Schooling> = schoolingRepository!!.findAll()
        Assertions.assertEquals(1, all.size)
    }
}