package com.ntnguyen.learning.springkotlinpg.service

import com.ntnguyen.learning.springkotlinpg.repository.PersonRepository
import com.ntnguyen.learning.springkotlinpg.entity.PersonEntity
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class PersonServiceImpl(val personRepository: PersonRepository) : PersonService {

    override fun create(person: PersonEntity): PersonEntity = personRepository.save(person)

    override fun getById(id: Int): Optional<PersonEntity> = personRepository.findById(id)

    override fun getAll(): List<PersonEntity> = personRepository.findAll()

    override fun updatePerson(id: Int, person: PersonEntity): PersonEntity {
        person.id = id
        return personRepository.save(person)
    }

    override fun deletePerson(id: Int) = personRepository.deleteById(id)
}