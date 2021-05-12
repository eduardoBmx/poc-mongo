package com.exemple.pocmongodb.frete

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.io.Serializable
import java.util.*

@Document(collection = "frete")
class Frete(
    @Id
    val id: String = UUID.randomUUID().toString(),
    val origem: String,
    val terminal: String
): Serializable {
    override fun toString(): String {
        return "Frete(id='$id', origem='$origem', terminal='$terminal')"
    }
}