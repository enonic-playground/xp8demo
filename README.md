# xp8demo
Demo repository for XP8 Universal API

## Demo Time

In one tab run 
        
    enonic sandbox start

In another tab run

    enonic project deploy

Welcome app shows Demo API
http://localhost:8080/

Show JSON API Discovery 
http://localhost:8080/api

Visit API on Generic Endpoint
http://localhost:8080/api/xp8demo:demoapi

Add xp8demo app to a Site

Show Demo Site
http://localhost:8080/site/xp8-demo-project/master/demo-site

Try Service - it gives 200.
http://localhost:8080/site/xp8-demo-project/master/demo-site/_/service/xp8demo/demoservice

Try API - it gives 404
http://localhost:8080/site/xp8-demo-project/master/demo-site/_/xp8demo:demoapi

Turn on API on site. And Try API again - it gives 200.
http://localhost:8080/site/xp8-demo-project/master/demo-site/_/xp8demo:demoapi


If Guillotine bug is fixed
Try Guillotine - it gives 404
http://localhost:8080/site/xp8-demo-project/master/demo-site/_/com.enonic.app.guillotine:graphql

Turn on Guillotine API on site - it gives 200.
http://localhost:8080/site/xp8-demo-project/master/demo-site/_/com.enonic.app.guillotine:graphql


Demo VHost Context


[com.enonic.xp.web.vhost.cfg](../../.enonic/sandboxes/xp8demo/home/config/com.enonic.xp.web.vhost.cfg)

We have two vhosts For same API. for Norway and for the USA (East). 
Replace with [demoapi.js](extra/demoapi.js).

Try vhost URLs. See That context attributes are read from vhost config.
http://api-norway.example.internal:8080/api/xp8demo:demoapi

http://api-us-east.example.internal:8080/api/xp8demo:demoapi
