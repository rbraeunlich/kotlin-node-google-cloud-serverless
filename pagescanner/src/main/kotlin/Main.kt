@JsName("onRequest")
fun onRequest(request: dynamic, response: dynamic) {
    console.log("Request headers: " + toJson(request.headers))
    console.log("Request body: " + toJson(request.body))

    response.send("Hello Serverless!")
}
