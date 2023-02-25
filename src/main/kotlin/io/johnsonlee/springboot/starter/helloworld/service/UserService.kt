package io.johnsonlee.springboot.starter.helloworld.service

import io.johnsonlee.springboot.starter.helloworld.entity.User

interface UserService {
    fun addUser(user: User)
    fun list(): List<User>
}