exports.get = function (req) {
    return {
        body: {
            message: 'Hello from Demo API!',
            time: new Date().toISOString()
        }
    };
}
