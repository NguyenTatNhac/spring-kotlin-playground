package com.ntnguyen.learning.springkotlinpg.repository

import com.ntnguyen.learning.springkotlinpg.entity.PersonEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository : JpaRepository<PersonEntity, Int>