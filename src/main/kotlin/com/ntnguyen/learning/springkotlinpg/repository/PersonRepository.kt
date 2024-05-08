package com.ntnguyen.learning.springkotlinpg.repository

import com.ntnguyen.learning.springkotlinpg.entity.PersonEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository : JpaRepository<PersonEntity, Int> {

    /**
     * Find all people older than 18 years old.
     */
    @Query("FROM PersonEntity WHERE age > 18")
    fun findAdult(): List<PersonEntity>
}