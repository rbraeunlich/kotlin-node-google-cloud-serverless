package de.codecentric

fun toJson(obj: dynamic) = JSON.stringify(obj) { key, value -> value ?: undefined }