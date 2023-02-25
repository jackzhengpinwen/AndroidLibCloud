package io.johnsonlee.springboot.starter.helloworld.service.impl

import io.johnsonlee.springboot.starter.helloworld.dao.UserRepository
import io.johnsonlee.springboot.starter.helloworld.entity.User
import io.johnsonlee.springboot.starter.helloworld.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(@Autowired private val userDao: UserRepository): UserService {

    override fun addUser(user: User) {
        userDao.saveUser(user)
    }

    override fun list(): List<User> {
        return userDao.findAll()
    }
}