package com.galid.account_platform.account.presentation.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class TestController {
    @GetMapping("/")
    fun test(model: Model): String {
        return "index"
    }
}