package com.ntnguyen.learning.springkotlinpg.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "person")
class PersonEntity(@Id @GeneratedValue var id: Int? = null, val name: String?, val age: Int?)