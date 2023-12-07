package com.example.loginpage


class HelperClass(
    var name: String? = null,
    var email: String? = null,
    var username: String? = null,
    var contact: String? = null
) {
    // No need to declare getters and setters explicitly in Kotlin

    // Secondary constructor with default values
    constructor() : this(null, null, null, null)
}