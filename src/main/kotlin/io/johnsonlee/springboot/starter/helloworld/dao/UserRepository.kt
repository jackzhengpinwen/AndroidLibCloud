package io.johnsonlee.springboot.starter.helloworld.dao

import io.johnsonlee.springboot.starter.helloworld.entity.User
import org.springframework.stereotype.Repository

@Repository
class UserRepository {
    private val userList = ArrayList<User>()

    fun saveUser(user: User) {
        userList.add(user)
    }

    fun findAll(): List<User> {
        return userList
    }
}