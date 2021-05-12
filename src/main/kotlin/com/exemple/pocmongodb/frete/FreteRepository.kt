package com.exemple.pocmongodb.frete

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface FreteRepository: MongoRepository<Frete, String>{
}