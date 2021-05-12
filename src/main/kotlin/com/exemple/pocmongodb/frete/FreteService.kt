package com.exemple.pocmongodb.frete

import org.springframework.stereotype.Service

@Service
class FreteService(
    private val repository: FreteRepository
){


    fun save(frete: Frete): String = repository.save(frete).id

    fun get(): List<Frete> = repository.findAll()

}