package com.nguyendinhdoan.view_binding_kotlin.bindings

import com.nguyendinhdoan.view_binding_kotlin.databinding.ActivityMainBinding
import com.nguyendinhdoan.view_binding_kotlin.models.User

fun ActivityMainBinding.bind(user: User) {
    with(user) {
        tvId.text = id.toString()
        tvName.text = name
    }
}