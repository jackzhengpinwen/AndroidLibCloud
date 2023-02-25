package io.johnsonlee.springboot.starter.helloworld.controller

import io.johnsonlee.springboot.starter.helloworld.entity.BaseResponse
import io.johnsonlee.springboot.starter.helloworld.entity.User
import io.johnsonlee.springboot.starter.helloworld.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(@Autowired private val userService: UserService) {

    @PostMapping("/add")
    @ResponseBody
    fun add(@RequestBody user: User): BaseResponse<User> {
        userService.addUser(user)
        return BaseResponse("200", "", user)
    }

    @GetMapping("/list")
    fun list(): List<User> {
        return userService.list()
    }
}