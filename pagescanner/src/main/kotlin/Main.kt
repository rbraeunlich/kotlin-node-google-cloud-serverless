external val exports: dynamic

fun onRequest(request: dynamic, response: dynamic) {
    console.log("Request headers: " + toJson(request.headers))
    console.log("Request body: " + toJson(request.body))

    response.send("Hello Serverless!")
}

fun main(args: Array<String>){
    // this is necessary because cloud functions ignores module.exports. It only reads exports.
    exports.onRequest = ::onRequest
}
