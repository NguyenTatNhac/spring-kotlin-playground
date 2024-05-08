package com.ntnguyen.learning.springkotlinpg.controller

import com.ntnguyen.learning.springkotlinpg.entity.PersonEntity
import com.ntnguyen.learning.springkotlinpg.service.PersonService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/persons")
class PersonController(val personService: PersonService) {

    @PostMapping
    fun createUser(@RequestBody person: PersonEntity) = personService.create(person)

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Int) = personService.getById(id)

    @GetMapping("/adults")
    fun getAdults() = personService.getAdults()

    @PutMapping("/{id}")
    fun updateUser(@PathVariable id: Int, @RequestBody person: PersonEntity) = personService.updatePerson(id, person)

    @GetMapping
    fun getAll(): List<PersonEntity> = personService.getAll()

    @DeleteMapping("/{id}")
    fun deletePerson(@PathVariable id: Int) = personService.deletePerson(id)
}