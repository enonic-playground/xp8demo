const contextLib = require('/lib/xp/context');

exports.get = () => {
    const timeZone = __.nullOrValue(contextLib.get()['attributes']['xp8demo.timeZone']);

    return {
        body: {
            message: 'Hello from Demo API!!',
            timeZone: timeZone,
            time: __.newBean('demo.DemoTime').nowString(timeZone),
        }
    };
}
