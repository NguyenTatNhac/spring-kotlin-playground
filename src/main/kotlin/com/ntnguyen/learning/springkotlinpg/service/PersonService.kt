package com.ntnguyen.learning.springkotlinpg.service

import com.ntnguyen.learning.springkotlinpg.entity.PersonEntity
import java.util.Optional

interface PersonService {

    fun create(person: PersonEntity): PersonEntity

    fun getById(id: Int): Optional<PersonEntity>

    fun getAdults(): List<PersonEntity>

    fun getAll(): List<PersonEntity>

    fun updatePerson(id: Int, person: PersonEntity): PersonEntity

    fun deletePerson(id: Int)
}