package de.codecentric

import kotlin.browser.window

/**
 * Example main function. Started at script body.
 * At first time you have to run `mvn package`. 
 * Open example index.html in browser once you compile it.
 */
fun onRequest(request: dynamic, response: dynamic) {
    console.log("Request headers: " + toJson(request.headers))
    console.log("Request body: " + toJson(request.body))

    response.send("Hello Serverless!")
}
