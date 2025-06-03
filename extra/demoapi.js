const contextLib = require('/lib/xp/context');

exports.get = () => {
    const timeZone = contextLib.get()['attributes']['xp8demo.timeZone'];

    return {
        body: {
            message: 'Hello from Demo API! 🕑',
            timeZone: timeZone,
            time: __.newBean('demo.DemoTime').nowString(__.nullOrValue(timeZone)),
        }
    };
}
