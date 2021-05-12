package com.exemple.pocmongodb.frete

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.*

@RequestMapping("/frete")
@RestController
class FreteController(
    private val service: FreteService
) {

    @PostMapping
    fun save(@RequestBody frete: Frete): String = service.save(frete)

    @GetMapping
    fun get(): List<Frete> = service.get()

}