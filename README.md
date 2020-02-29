# Laravel
Android App Phone Verification Using  
https://dashboard.nexmo.com/sign-in


<!DOCTYPE html>
<html lang="en">
  <head>
  <meta charset="utf-8" />
<script>window.NREUM||(NREUM={});NREUM.info={"beacon":"bam.nr-data.net","errorBeacon":"bam.nr-data.net","licenseKey":"NRJS-65b677777d7e9e7ecdc","applicationID":"499161595","transactionName":"clcLRxRXD1RUSkkMUUNTAVwRVkxLWVcR","queueTime":3,"applicationTime":457,"agent":""}</script>
<script>(window.NREUM||(NREUM={})).loader_config={licenseKey:"NRJS-65b677777d7e9e7ecdc",applicationID:"499161595"};window.NREUM||(NREUM={}),__nr_require=function(e,n,t){function r(t){if(!n[t]){var i=n[t]={exports:{}};e[t][0].call(i.exports,function(n){var i=e[t][1][n];return r(i||n)},i,i.exports)}return n[t].exports}if("function"==typeof __nr_require)return __nr_require;for(var i=0;i<t.length;i++)r(t[i]);return r}({1:[function(e,n,t){function r(){}function i(e,n,t){return function(){return o(e,[u.now()].concat(f(arguments)),n?null:this,t),n?void 0:this}}var o=e("handle"),a=e(4),f=e(5),c=e("ee").get("tracer"),u=e("loader"),s=NREUM;"undefined"==typeof window.newrelic&&(newrelic=s);var p=["setPageViewName","setCustomAttribute","setErrorHandler","finished","addToTrace","inlineHit","addRelease"],l="api-",d=l+"ixn-";a(p,function(e,n){s[n]=i(l+n,!0,"api")}),s.addPageAction=i(l+"addPageAction",!0),s.setCurrentRouteName=i(l+"routeName",!0),n.exports=newrelic,s.interaction=function(){return(new r).get()};var m=r.prototype={createTracer:function(e,n){var t={},r=this,i="function"==typeof n;return o(d+"tracer",[u.now(),e,t],r),function(){if(c.emit((i?"":"no-")+"fn-start",[u.now(),r,i],t),i)try{return n.apply(this,arguments)}catch(e){throw c.emit("fn-err",[arguments,this,e],t),e}finally{c.emit("fn-end",[u.now()],t)}}}};a("actionText,setName,setAttribute,save,ignore,onEnd,getContext,end,get".split(","),function(e,n){m[n]=i(d+n)}),newrelic.noticeError=function(e,n){"string"==typeof e&&(e=new Error(e)),o("err",[e,u.now(),!1,n])}},{}],2:[function(e,n,t){function r(e,n){var t=e.getEntries();t.forEach(function(e){"first-paint"===e.name?c("timing",["fp",Math.floor(e.startTime)]):"first-contentful-paint"===e.name&&c("timing",["fcp",Math.floor(e.startTime)])})}function i(e,n){var t=e.getEntries();t.length>0&&c("lcp",[t[t.length-1]])}function o(e){if(e instanceof s&&!l){var n,t=Math.round(e.timeStamp);n=t>1e12?Date.now()-t:u.now()-t,l=!0,c("timing",["fi",t,{type:e.type,fid:n}])}}if(!("init"in NREUM&&"page_view_timing"in NREUM.init&&"enabled"in NREUM.init.page_view_timing&&NREUM.init.page_view_timing.enabled===!1)){var a,f,c=e("handle"),u=e("loader"),s=NREUM.o.EV;if("PerformanceObserver"in window&&"function"==typeof window.PerformanceObserver){a=new PerformanceObserver(r),f=new PerformanceObserver(i);try{a.observe({entryTypes:["paint"]}),f.observe({entryTypes:["largest-contentful-paint"]})}catch(p){}}if("addEventListener"in document){var l=!1,d=["click","keydown","mousedown","pointerdown","touchstart"];d.forEach(function(e){document.addEventListener(e,o,!1)})}}},{}],3:[function(e,n,t){function r(e,n){if(!i)return!1;if(e!==i)return!1;if(!n)return!0;if(!o)return!1;for(var t=o.split("."),r=n.split("."),a=0;a<r.length;a++)if(r[a]!==t[a])return!1;return!0}var i=null,o=null,a=/Version\/(\S+)\s+Safari/;if(navigator.userAgent){var f=navigator.userAgent,c=f.match(a);c&&f.indexOf("Chrome")===-1&&f.indexOf("Chromium")===-1&&(i="Safari",o=c[1])}n.exports={agent:i,version:o,match:r}},{}],4:[function(e,n,t){function r(e,n){var t=[],r="",o=0;for(r in e)i.call(e,r)&&(t[o]=n(r,e[r]),o+=1);return t}var i=Object.prototype.hasOwnProperty;n.exports=r},{}],5:[function(e,n,t){function r(e,n,t){n||(n=0),"undefined"==typeof t&&(t=e?e.length:0);for(var r=-1,i=t-n||0,o=Array(i<0?0:i);++r<i;)o[r]=e[n+r];return o}n.exports=r},{}],6:[function(e,n,t){n.exports={exists:"undefined"!=typeof window.performance&&window.performance.timing&&"undefined"!=typeof window.performance.timing.navigationStart}},{}],ee:[function(e,n,t){function r(){}function i(e){function n(e){return e&&e instanceof r?e:e?c(e,f,o):o()}function t(t,r,i,o){if(!l.aborted||o){e&&e(t,r,i);for(var a=n(i),f=v(t),c=f.length,u=0;u<c;u++)f[u].apply(a,r);var p=s[y[t]];return p&&p.push([b,t,r,a]),a}}function d(e,n){h[e]=v(e).concat(n)}function m(e,n){var t=h[e];if(t)for(var r=0;r<t.length;r++)t[r]===n&&t.splice(r,1)}function v(e){return h[e]||[]}function g(e){return p[e]=p[e]||i(t)}function w(e,n){u(e,function(e,t){n=n||"feature",y[t]=n,n in s||(s[n]=[])})}var h={},y={},b={on:d,addEventListener:d,removeEventListener:m,emit:t,get:g,listeners:v,context:n,buffer:w,abort:a,aborted:!1};return b}function o(){return new r}function a(){(s.api||s.feature)&&(l.aborted=!0,s=l.backlog={})}var f="nr@context",c=e("gos"),u=e(4),s={},p={},l=n.exports=i();l.backlog=s},{}],gos:[function(e,n,t){function r(e,n,t){if(i.call(e,n))return e[n];var r=t();if(Object.defineProperty&&Object.keys)try{return Object.defineProperty(e,n,{value:r,writable:!0,enumerable:!1}),r}catch(o){}return e[n]=r,r}var i=Object.prototype.hasOwnProperty;n.exports=r},{}],handle:[function(e,n,t){function r(e,n,t,r){i.buffer([e],r),i.emit(e,n,t)}var i=e("ee").get("handle");n.exports=r,r.ee=i},{}],id:[function(e,n,t){function r(e){var n=typeof e;return!e||"object"!==n&&"function"!==n?-1:e===window?0:a(e,o,function(){return i++})}var i=1,o="nr@id",a=e("gos");n.exports=r},{}],loader:[function(e,n,t){function r(){if(!x++){var e=E.info=NREUM.info,n=d.getElementsByTagName("script")[0];if(setTimeout(s.abort,3e4),!(e&&e.licenseKey&&e.applicationID&&n))return s.abort();u(y,function(n,t){e[n]||(e[n]=t)}),c("mark",["onload",a()+E.offset],null,"api");var t=d.createElement("script");t.src="https://"+e.agent,n.parentNode.insertBefore(t,n)}}function i(){"complete"===d.readyState&&o()}function o(){c("mark",["domContent",a()+E.offset],null,"api")}function a(){return O.exists&&performance.now?Math.round(performance.now()):(f=Math.max((new Date).getTime(),f))-E.offset}var f=(new Date).getTime(),c=e("handle"),u=e(4),s=e("ee"),p=e(3),l=window,d=l.document,m="addEventListener",v="attachEvent",g=l.XMLHttpRequest,w=g&&g.prototype;NREUM.o={ST:setTimeout,SI:l.setImmediate,CT:clearTimeout,XHR:g,REQ:l.Request,EV:l.Event,PR:l.Promise,MO:l.MutationObserver};var h=""+location,y={beacon:"bam.nr-data.net",errorBeacon:"bam.nr-data.net",agent:"js-agent.newrelic.com/nr-1167.min.js"},b=g&&w&&w[m]&&!/CriOS/.test(navigator.userAgent),E=n.exports={offset:f,now:a,origin:h,features:{},xhrWrappable:b,userAgent:p};e(1),e(2),d[m]?(d[m]("DOMContentLoaded",o,!1),l[m]("load",r,!1)):(d[v]("onreadystatechange",i),l[v]("onload",r)),c("mark",["firstbyte",f],null,"api");var x=0,O=e(6)},{}],"wrap-function":[function(e,n,t){function r(e){return!(e&&e instanceof Function&&e.apply&&!e[a])}var i=e("ee"),o=e(5),a="nr@original",f=Object.prototype.hasOwnProperty,c=!1;n.exports=function(e,n){function t(e,n,t,i){function nrWrapper(){var r,a,f,c;try{a=this,r=o(arguments),f="function"==typeof t?t(r,a):t||{}}catch(u){l([u,"",[r,a,i],f])}s(n+"start",[r,a,i],f);try{return c=e.apply(a,r)}catch(p){throw s(n+"err",[r,a,p],f),p}finally{s(n+"end",[r,a,c],f)}}return r(e)?e:(n||(n=""),nrWrapper[a]=e,p(e,nrWrapper),nrWrapper)}function u(e,n,i,o){i||(i="");var a,f,c,u="-"===i.charAt(0);for(c=0;c<n.length;c++)f=n[c],a=e[f],r(a)||(e[f]=t(a,u?f+i:i,o,f))}function s(t,r,i){if(!c||n){var o=c;c=!0;try{e.emit(t,r,i,n)}catch(a){l([a,t,r,i])}c=o}}function p(e,n){if(Object.defineProperty&&Object.keys)try{var t=Object.keys(e);return t.forEach(function(t){Object.defineProperty(n,t,{get:function(){return e[t]},set:function(n){return e[t]=n,n}})}),n}catch(r){l([r])}for(var i in e)f.call(e,i)&&(n[i]=e[i]);return n}function l(n){try{e.emit("internal-error",n)}catch(t){}}return e||(e=i),t.inPlace=u,t.flag=a,t}},{}]},{},["loader"]);</script>
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />

  <title>Nexmo Developer</title>

  <meta name="google-site-verification" content="_DNZpugW9Fl4BUMbPsepvc_2McwbRvNBHHuI99MZH7c" />


      <script src="//d2wy8f7a9ursnm.cloudfront.net/v4/bugsnag.min.js"></script>
      <script>
        window.bugsnagClient = bugsnag('7e6520ad117670166c584190654109db')
        bugsnagClient.app.releaseStage = 'production'
      </script>

    <script type="text/javascript">
      !function(){var analytics=window.analytics=window.analytics||[];if(!analytics.initialize)if(analytics.invoked)window.console&&console.error&&console.error("Segment snippet included twice.");else{analytics.invoked=!0;analytics.methods=["trackSubmit","trackClick","trackLink","trackForm","pageview","identify","reset","group","track","ready","alias","debug","page","once","off","on"];analytics.factory=function(t){return function(){var e=Array.prototype.slice.call(arguments);e.unshift(t);analytics.push(e);return analytics}};for(var t=0;t<analytics.methods.length;t++){var e=analytics.methods[t];analytics[e]=analytics.factory(e)}analytics.load=function(t){var e=document.createElement("script");e.type="text/javascript";e.async=!0;e.src=("https:"===document.location.protocol?"https://":"http://")+"cdn.segment.com/analytics.js/v1/"+t+"/analytics.min.js";var n=document.getElementsByTagName("script")[0];n.parentNode.insertBefore(e,n)};analytics.SNIPPET_VERSION="4.0.0";
      analytics.load("gozgbQevLVanP9Tz1JxvJ3KS3aTFH3S6");
      analytics.page();
      }}();
    </script>


    <script>(function(w,d,s,l,i){w[l]=w[l]||[];w[l].push({'gtm.start':
    new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],
    j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src=
    'https://www.googletagmanager.com/gtm.js?id='+i+dl;f.parentNode.insertBefore(j,f);
    })(window,document,'script','dataLayer','GTM-K2VBPR');</script>

    <script>
    (function(h,o,t,j,a,r){
        h.hj=h.hj||function(){(h.hj.q=h.hj.q||[]).push(arguments)};
        h._hjSettings={hjid:682191,hjsv:6};
        a=o.getElementsByTagName('head')[0];
        r=o.createElement('script');r.async=1;
        r.src=t+h._hjSettings.hjid+j+h._hjSettings.hjsv;
        a.appendChild(r);
    })(window,document,'https://static.hotjar.com/c/hotjar-','.js?sv=');
    </script>


  <link rel="canonical" href="https://developer.nexmo.com/messages/overview">

  <link rel="stylesheet" media="all" href="/assets/application-6ab483ce13ee7b3481623e2c0b3ea20860b9c5d194107a4bc1317136928c8823.css" />
  <script src="/assets/application-27edb97293e7ab9cd9e00ca9ada51c1fe7528130055e75e3a4b25320b9bcd577.js"></script>




  <script src="/packs/js/runtime~application-396039636117eae6621e.js" defer="defer"></script>
<script src="/packs/js/2-5ac7cde39b07231ac752.chunk.js" defer="defer"></script>
<script src="/packs/js/application-88c820c02a3e4cee0768.chunk.js" defer="defer"></script>
  <script src="https://www.google.com/recaptcha/api.js" async="async" defer="defer"></script>


  <link rel="apple-touch-icon" sizes="180x180" href="/apple-touch-icon.png">
  <link rel="icon" type="image/png" sizes="32x32" href="/favicon-32x32.png">
  <link rel="icon" type="image/png" sizes="16x16" href="/favicon-16x16.png">
  <link rel="manifest" href="/manifest.json">
  <link rel="mask-icon" href="/safari-pinned-tab.svg" color="#5bbad5">
  <meta name="apple-mobile-web-app-title" content="Nexmo Developer">
  <meta name="application-name" content="Nexmo Developer">
  <meta name="msapplication-TileColor" content="#da532c">
  <meta name="msapplication-TileImage" content="/mstile-144x144.png">
  <meta name="theme-color" content="#ffffff">

  <meta property="og:url" content="https://developer.nexmo.com/messages/overview" />
  <meta property="og:type" content="article" />
  <meta property="og:title" content="Nexmo Developer" />

  <meta property="og:image" content="https://developer.nexmo.com/assets/images/nexmo-developer-card.png" />
  <meta property="og:image:width" content="835" />
  <meta property="og:image:height" content="437" />

    <meta property="og:description" content="Everything you need to build connected applications with Nexmo" />

  <meta name="basic_auth_username" content="nexmo" />
  <meta name="basic_auth_password" content="" />
  <meta name="search_url" content="https://search.nexmo.com/search" />
  <meta name="environment" content="production" />

  <meta name="algolia_application_id" content="QWYTZ63XKQ" />

    <meta name="algolia_search_key" content="OTYyNGE4NjIyN2QyNDBjOWJiY2ExN2Q2MTVhMzQ4MDViZDE1ZjA0NGQzNjBkYjY1NDIzZWM3OTQxNDM0YWJiYWZpbHRlcnM9Tk9UK2NhdGVnb3J5LmlkJTNBKzIwMDIwMTQ0MytBTkQrTk9UK2NhdGVnb3J5LmlkJTNBKzIwMDkxOTM2NytBTkQrTk9UK3NlY3Rpb24uaWQlM0ErMjAwNjIyNDIzK0FORCtOT1Qrc2VjdGlvbi5pZCUzQSsyMDA2Mzk3NDcrQU5EK05PVCtzZWN0aW9uLmlkJTNBKzIwMDYzOTcwNytBTkQrTk9UK3NlY3Rpb24uaWQlM0ErMjA2MDI3OTA3K0FORCtOT1Qrc2VjdGlvbi5pZCUzQSsyMDEzNTExMjgrQU5EK05PVCtzZWN0aW9uLmlkJTNBKzIwMDYzNzY3NitBTkQrTk9UK3NlY3Rpb24uaWQlM0ErMjAwOTA5MjA3K0FORCtOT1Qrc2VjdGlvbi5pZCUzQSsyMDA2Mzk3NTcrQU5EK05PVCtzZWN0aW9uLmlkJTNBKzIwMDY0NzA5OCtBTkQrTk9UK3NlY3Rpb24uaWQlM0ErMTE1MDAzNDExNDQ3JmF0dHJpYnV0ZXNUb1NuaXBwZXQ9JTVCJTIyYm9keSUyMiUyQyUyMmJvZHlfc2FmZSUyMiU1RA==" />

      <meta name="algolia_index" content="production_nexmo_developer" />
      <meta name="algolia_index" content="zendesk_nexmo_articles" />

  <meta name="copyright" content="2020 Nexmo, The Vonage API Platform" />

  <meta name="csrf-param" content="authenticity_token" />
<meta name="csrf-token" content="Zd+RnyPZQgK2aGnMc9vb/Yfemu+NFKNs4SvQeOfPZ2ssBB3PQgh0fI4h0EoZ4Dp/BmFRfwvatcK16ag8P37PQw==" />

  
</head>


  <body class="Nxd-template" data-push-state-root="/messages/overview">
      <noscript><iframe src="https://www.googletagmanager.com/ns.html?id=GTM-K2VBPR" height="0" width="0" style="display:none;visibility:hidden"></iframe></noscript>



<div class="Nxd-header">
  <header id="header" class="Nxd-header__main">
    <div class="Nxd-logo">
      <a href="/" id="logo" class="Nxd-logo__image Vlt-M-plus">
        <img alt="Nexmo Developer Logo" src="/assets/nexmo-developer-logo-27729a3ab4703a09c7ba309049b7679e795af2d60ce84672ca12bd680f9ef77b.svg" />
      </a>
      <a href="/" id="logo" class="Nxd-logo__image Vlt-S-only">
        <img alt="Nexmo Developer Logo" src="/assets/nexmo-logo-collapsed-55d46ded8d5a992fbcec4c93b1b6a3ce71dab62e774fa459070345b182a5e814.svg" />
      </a>
      <a href="/careers" class="Vlt-M-plus">
        <span id="header-hiring" class="Nxd-logo__hiring">We&#39;re hiring</span>
      </a>
    </div>

    <nav class="Nxd-header__nav">
      <a class="Nxd-main-header__link Vlt-M-plus" href="https://nexmo.com">Nexmo.com</a>
      <a href="https://dashboard.nexmo.com/sign-up" class="Vlt-btn Vlt-btn--primary" data-ab="try_button_v2"><b>
          &lt; Start building for free /&gt;
      </b></a>
    </nav>
  </header>

  <nav id="subnav" class="Nxd-header__sub">
    <a id="Vlt-sidenav-mobile-trigger"><svg><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-menu"></use></svg></a>

    <div class="Nxd-header__sub__menu">
      <a href="/documentation" class="Vlt-tabs__link Vlt-tabs__link_active">Documentation</a>
      <a href="/use-cases" class="Vlt-tabs__link "><span class="translation_missing" title="translation missing: en.layouts.partials.header.use-cases">Use Cases</span></a>
      <a href="/api" class="Vlt-tabs__link ">API Reference</a>
      <a href="/tools" class="Vlt-tabs__link ">SDKs &amp; Tools</a>
      <a href="/community" class="Vlt-tabs__link ">Community</a>
      <a href="/extend" class="Vlt-tabs__link ">Extend</a>
    </div>

      <form action="/search" accept-charset="UTF-8" method="get">
        <div id="search-app">
          <input type="text" id="searchbox" name="query" placeholder="Search" name="query" autocomplete="off" value="">
        </div>
</form>  </nav>
</div>

    <div id="Vlt-sidenav" class="Vlt-sidenav Vlt-sidenav--light">
      <div class="Vlt-sidenav__scroll">
        <nav class="sidenav" tabindex="0" data-active="/messages/overview">
            <ul class="Vlt-sidemenu Vlt-sidemenu--rounded navigation js-navigation navigation--documentation">
  <li class='navigation-item--concepts navigation-item'>
  <span class='Vlt-sidemenu__trigger' tabindex='0'>
      <svg class='Vlt-red'><use xlink:href='/symbol/volta-icons.svg#Vlt-icon-mind-map' /></svg>
    <span class='Vlt-sidemenu__label'>
      Concepts

    </span>
  </span>
    <ul class="Vlt-sidemenu__list--compressed">
      <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/concepts/overview">
        Overview
</a></li>
<li class="navigation-item--guides navigation-item">
    <li class="js--collapsible navigation-item--guides navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Guides</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--authentication navigation-item">
    <a class="Vlt-sidemenu__link" href="/concepts/guides/authentication">
        Authentication
</a></li>
<li class="navigation-item--signing-messages navigation-item">
    <a class="Vlt-sidemenu__link" href="/concepts/guides/signing-messages">
        Signing messages
</a></li>
<li class="navigation-item--webhooks navigation-item">
    <a class="Vlt-sidemenu__link" href="/concepts/guides/webhooks">
        Webhooks
</a></li>
<li class="navigation-item--glossary navigation-item">
    <a class="Vlt-sidemenu__link" href="/concepts/guides/glossary">
        Glossary
</a></li>
<li class="navigation-item--testing-with-ngrok navigation-item">
    <a class="Vlt-sidemenu__link" href="/concepts/guides/testing-with-ngrok">
        Testing with Ngrok
</a></li>

        </ul>
    </li>
</li>

    </ul>
</li>
<li class='navigation-item--application navigation-item'>
  <span class='Vlt-sidemenu__trigger' tabindex='0'>
      <svg class='Vlt-blue'><use xlink:href='/symbol/volta-icons.svg#Vlt-icon-flow' /></svg>
    <span class='Vlt-sidemenu__label'>
      Application

    </span>
  </span>
    <ul class="Vlt-sidemenu__list--compressed">
      <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/application/overview">
        Overview
</a></li>
<li class="navigation-item--code-snippets navigation-item">
    <li class="js--collapsible navigation-item--code-snippets navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Code Snippets</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--create-an-application navigation-item">
    <a class="Vlt-sidemenu__link" href="/application/code-snippets/create-application">
        Create an Application
</a></li>
<li class="navigation-item--list-applications navigation-item">
    <a class="Vlt-sidemenu__link" href="/application/code-snippets/list-applications">
        List Applications
</a></li>
<li class="navigation-item--get-an-application navigation-item">
    <a class="Vlt-sidemenu__link" href="/application/code-snippets/get-application">
        Get an Application
</a></li>
<li class="navigation-item--update-application navigation-item">
    <a class="Vlt-sidemenu__link" href="/application/code-snippets/update-application">
        Update Application
</a></li>
<li class="navigation-item--delete-an-application navigation-item">
    <a class="Vlt-sidemenu__link" href="/application/code-snippets/delete-application">
        Delete an Application
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/application/api-reference">
        API Reference
</a></li>
<li class="navigation-item--nexmo-cli navigation-item">
    <a class="Vlt-sidemenu__link" href="/application/nexmo-cli">
        Nexmo CLI
</a></li>

    </ul>
</li>
<li class='navigation-item--messages navigation-item'>
  <span class='Vlt-sidemenu__trigger' tabindex='0'>
      <svg class='Vlt-purple'><use xlink:href='/symbol/volta-icons.svg#Vlt-icon-chat' /></svg>
    <span class='Vlt-sidemenu__label'>
      Messages API

        <a class="Vlt-badge Vlt-badge--margin-left Vlt-bg-green-lighter Vlt-green" href="/product-lifecycle/beta">Beta</a>
    </span>
  </span>
    <ul class="Vlt-sidemenu__list--compressed">
      <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/overview">
        Overview
</a></li>
<li class="navigation-item--concepts navigation-item">
    <li class="js--collapsible navigation-item--concepts navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Concepts</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--external-accounts navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/concepts/external-accounts">
        External Accounts
</a></li>
<li class="navigation-item--understanding-facebook-messaging navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/concepts/facebook">
        Understanding Facebook messaging
</a></li>
<li class="navigation-item--understanding-viber-messaging navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/concepts/viber">
        Understanding Viber messaging
</a></li>
<li class="navigation-item--understanding-whatsapp-messaging navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/concepts/whatsapp">
        Understanding WhatsApp messaging
</a></li>
<li class="navigation-item--custom-objects navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/concepts/custom-objects">
        Custom objects
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--code-snippets navigation-item">
    <h5 class="Vlt-sidemenu__title Vlt-sidemenu__title--border">Code Snippets</h5>
      <ul class="Vlt-sidemenu__list--compressed">
        <li class="navigation-item--before-you-begin navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/before-you-begin">
        Before you Begin
</a></li>
<li class="navigation-item--install-nexmo-cli navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/install-cli">
        Install Nexmo CLI
</a></li>
<li class="navigation-item--create-a-nexmo-application navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/create-an-application">
        Create a Nexmo Application
</a></li>
<li class="navigation-item--install-client-library navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/client-library">
        Install Client Library
</a></li>
<li class="navigation-item--configure-webhooks navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/configure-webhooks">
        Configure Webhooks
</a></li>
<li class="navigation-item--inbound-message-webhook navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/inbound-message">
        Inbound Message Webhook
</a></li>
<li class="navigation-item--message-status-webhook navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/message-status">
        Message Status Webhook
</a></li>
<li class="navigation-item--mms navigation-item">
    <li class="js--collapsible navigation-item--mms navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">MMS</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--send-an-mms navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/mms/send-mms">
        Send an MMS
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--whatsapp navigation-item">
    <li class="js--collapsible navigation-item--whatsapp navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">WhatsApp</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--send-a-message-template-mtm navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/whatsapp/send-mtm">
        Send a Message Template (MTM)
</a></li>
<li class="navigation-item--send-a-media-message-template navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/whatsapp/send-media-mtm">
        Send a Media Message Template
</a></li>
<li class="navigation-item--send-an-image-message navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/whatsapp/send-image">
        Send an Image Message
</a></li>
<li class="navigation-item--send-a-contact navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/whatsapp/send-contact">
        Send a Contact
</a></li>
<li class="navigation-item--send-a-text-message navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/whatsapp/send-text">
        Send a Text Message
</a></li>
<li class="navigation-item--send-an-audio-message navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/whatsapp/send-audio">
        Send an Audio Message
</a></li>
<li class="navigation-item--send-a-quick-reply-button navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/whatsapp/send-button-quick-reply">
        Send a Quick Reply Button
</a></li>
<li class="navigation-item--send-a-location navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/whatsapp/send-location">
        Send a Location
</a></li>
<li class="navigation-item--send-a-file-message navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/whatsapp/send-file">
        Send a File Message
</a></li>
<li class="navigation-item--send-a-video-message navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/whatsapp/send-video">
        Send a Video Message
</a></li>
<li class="navigation-item--send-a-link-button navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/whatsapp/send-button-link">
        Send a Link Button
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--viber-service-messages navigation-item">
    <li class="js--collapsible navigation-item--viber-service-messages navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Viber Service Messages</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--send-a-text-message navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/viber/send-text">
        Send a Text Message
</a></li>
<li class="navigation-item--send-an-image-message navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/viber/send-image">
        Send an Image Message
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--facebook-messenger navigation-item">
    <li class="js--collapsible navigation-item--facebook-messenger navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Facebook Messenger</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--send-an-image-message navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/messenger/send-image">
        Send an Image Message
</a></li>
<li class="navigation-item--send-a-text-message navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/messenger/send-text">
        Send a Text Message
</a></li>
<li class="navigation-item--send-an-audio-message navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/messenger/send-audio">
        Send an Audio Message
</a></li>
<li class="navigation-item--send-a-file-message navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/messenger/send-file">
        Send a File Message
</a></li>
<li class="navigation-item--send-a-video-message navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/messenger/send-video">
        Send a Video Message
</a></li>
<li class="navigation-item--send-a-message-template navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/messenger/send-template">
        Send a Message Template
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--sms navigation-item">
    <li class="js--collapsible navigation-item--sms navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">SMS</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--send-an-sms navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/code-snippets/sms/send-sms">
        Send an SMS
</a></li>

        </ul>
    </li>
</li>

      </ul>
</li>
<li class="navigation-item--use-cases navigation-item">
    <li class="js--collapsible navigation-item--use-cases navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Use Cases</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--receive-product-information-automatically-via-facebook-messenger navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/fbm-product-info">
        Receive product information automatically via Facebook Messenger
</a></li>
<li class="navigation-item--sending-viber-service-messages-with-the-messages-api navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/sending-viber-service-messages-with-messages-api">
        Sending Viber Service messages with the Messages API
</a></li>
<li class="navigation-item--sending-sms-messages-with-the-messages-api navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/sending-sms-messages-with-messages-api">
        Sending SMS messages with the Messages API
</a></li>
<li class="navigation-item--sending-facebook-messenger-messages-with-the-messages-api navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/sending-facebook-messenger-messages-with-messages-api">
        Sending Facebook Messenger messages with the Messages API
</a></li>
<li class="navigation-item--sending-whatsapp-messages-with-the-messages-api navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/sending-whatsapp-messages-with-messages-api">
        Sending WhatsApp messages with the Messages API
</a></li>
<li class="navigation-item--real-time-data-feed-into-multiple-channels-using-messages-api navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/real-time-feed">
        Real-time data feed into multiple channels using Messages API
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/api-reference">
        API Reference
</a></li>
<li class="navigation-item--external-accounts-api navigation-item">
    <li class="js--collapsible navigation-item--external-accounts-api navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">External Accounts API</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/external-accounts/overview">
        Overview
</a></li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/messages/external-accounts/api-reference">
        API Reference
</a></li>

        </ul>
    </li>
</li>

    </ul>
</li>
<li class='navigation-item--messaging navigation-item'>
  <span class='Vlt-sidemenu__trigger' tabindex='0'>
      <svg class='Vlt-purple'><use xlink:href='/symbol/volta-icons.svg#Vlt-icon-message' /></svg>
    <span class='Vlt-sidemenu__label'>
      Messaging

    </span>
  </span>
    <ul class="Vlt-sidemenu__list--compressed">
      <li class="navigation-item--sms navigation-item">
    <li class="js--collapsible navigation-item--sms navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">SMS</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/sms/overview">
        Overview
</a></li>
<li class="navigation-item--guides navigation-item">
    <li class="js--collapsible navigation-item--guides navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Guides</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--sender-identity navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/sms/guides/custom-sender-id">
        Sender identity
</a></li>
<li class="navigation-item--concatenation-and-encoding navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/sms/guides/concatenation-and-encoding">
        Concatenation and encoding
</a></li>
<li class="navigation-item--country-specific-features navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/sms/guides/country-specific-features">
        Country specific features
</a></li>
<li class="navigation-item--delivery-receipts navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/sms/guides/delivery-receipts">
        Delivery receipts
</a></li>
<li class="navigation-item--inbound-sms navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/sms/guides/inbound-sms">
        Inbound SMS
</a></li>
<li class="navigation-item--troubleshooting navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/sms/guides/troubleshooting-sms">
        Troubleshooting
</a></li>
<li class="navigation-item--smpp-access navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/sms/guides/SMPP-access">
        SMPP access
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--code-snippets navigation-item">
    <li class="js--collapsible navigation-item--code-snippets navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Code Snippets</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--before-you-begin navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/sms/code-snippets/before-you-begin">
        Before you begin
</a></li>
<li class="navigation-item--send-an-sms navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/sms/code-snippets/send-an-sms">
        Send an SMS
</a></li>
<li class="navigation-item--send-an-sms-with-unicode navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/sms/code-snippets/send-an-sms-with-unicode">
        Send an SMS with Unicode
</a></li>
<li class="navigation-item--delivery-receipts navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/sms/code-snippets/delivery-receipts">
        Delivery Receipts
</a></li>
<li class="navigation-item--receive-an-sms navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/sms/code-snippets/receiving-an-sms">
        Receive an SMS
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--tutorials navigation-item">
    <li class="js--collapsible navigation-item--tutorials navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Tutorials</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--anything-to-sms-with-ifttt-and-nexmo navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2018/09/18/anything-to-sms-ifttt-nexmo-dr/">
        Anything-to-SMS with IFTTT and Nexmo
</a></li>
<li class="navigation-item--sending-sms-messages-with-php navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2017/09/20/sending-sms-messages-with-php-dr/">
        Sending SMS Messages with PHP
</a></li>
<li class="navigation-item--show-sms-notifications-in-the-browser-with-angular-node-js-and-ably navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2018/08/07/sms-notifications-browser-with-angular-node-ably-dr/">
        Show SMS Notifications in the Browser with Angular, Node.JS, and Ably
</a></li>
<li class="navigation-item--serverless-sms-fortune-cookies-with-nexmo-and-ibm navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2018/08/14/serverless-sms-nexmo-ibm-dr/">
        Serverless SMS Fortune Cookies with Nexmo and IBM
</a></li>
<li class="navigation-item--how-to-receive-sms-messages-with-ruby-on-rails navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2017/10/23/receive-sms-messages-ruby-on-rails-dr/">
        How to Receive SMS Messages with Ruby on Rails
</a></li>
<li class="navigation-item--receive-sms-messages-with-java navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2017/05/31/receive-sms-messages-java-dr/">
        Receive SMS Messages with Java
</a></li>
<li class="navigation-item--how-to-send-sms-messages-with-ruby-on-rails navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2017/10/16/send-sms-ruby-on-rails-dr/">
        How to Send SMS Messages with Ruby on Rails
</a></li>
<li class="navigation-item--how-to-send-sms-messages-with-asp-net-mvc-framework navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2017/03/23/send-sms-messages-asp-net-mvc-framework-dr/">
        How to Send SMS Messages with ASP.NET MVC Framework
</a></li>
<li class="navigation-item--how-to-get-an-sms-delivery-receipt-in-asp-net-mvc navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2017/07/21/get-sms-delivery-receipt-asp-net-mvc-dr/">
        How to Get an SMS Delivery Receipt in ASP .NET MVC
</a></li>
<li class="navigation-item--how-to-send-sms-messages-with-python-flask-and-nexmo navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2017/06/22/send-sms-messages-python-flask-dr/">
        How to Send SMS Messages with Python, Flask and Nexmo
</a></li>
<li class="navigation-item--how-to-send-sms-messages-with-java navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2017/05/03/send-sms-messages-with-java-dr/">
        How to Send SMS Messages with Java
</a></li>
<li class="navigation-item--receiving-an-sms-with-php navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2018/06/19/receiving-an-sms-with-php-dr/">
        Receiving an SMS with PHP
</a></li>
<li class="navigation-item--receive-an-sms-delivery-receipt-from-a-mobile-carrier-with-ruby-on-rails navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2017/10/19/receive-sms-delivery-receipt-ruby-on-rails-dr/">
        Receive an SMS Delivery Receipt from a Mobile Carrier with Ruby on Rails
</a></li>
<li class="navigation-item--receive-sms-messages-with-asp-net-mvc-framework navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2017/03/31/recieve-sms-messages-with-asp-net-mvc-framework-dr/">
        Receive SMS Messages with ASP.NET MVC Framework
</a></li>
<li class="navigation-item--receiving-sms-delivery-receipts-with-php navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2018/06/25/receiving-sms-delivery-receipts-with-php-dr/">
        Receiving SMS Delivery Receipts with PHP
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--use-cases navigation-item">
    <li class="js--collapsible navigation-item--use-cases navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Use Cases</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--receiving-concatenated-sms navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/receiving-concat-sms">
        Receiving Concatenated SMS
</a></li>
<li class="navigation-item--two-way-sms-for-customer-engagement navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/two-way-sms-for-customer-engagement">
        Two-way SMS for customer engagement
</a></li>
<li class="navigation-item--private-sms-communication navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/private-sms-communication">
        Private SMS communication
</a></li>
<li class="navigation-item--sms-customer-support navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/sms-customer-support">
        SMS Customer Support
</a></li>
<li class="navigation-item--mobile-app-invites navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/mobile-app-invites">
        Mobile app invites
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/sms/api-reference">
        API Reference
</a></li>
<li class="navigation-item--message-search navigation-item">
    <li class="js--collapsible navigation-item--message-search navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Message Search</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/sms/message-search/api-reference">
        API Reference
</a></li>

        </ul>
    </li>
</li>

        </ul>
    </li>
</li>
<li class="navigation-item--us-short-codes navigation-item">
    <li class="js--collapsible navigation-item--us-short-codes navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">US Short Codes</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/us-short-codes/overview">
        Overview
</a></li>
<li class="navigation-item--guides navigation-item">
    <li class="js--collapsible navigation-item--guides navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Guides</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--2fa navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/us-short-codes/guides/2fa">
        2FA
</a></li>
<li class="navigation-item--campaign-subscription-management navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/us-short-codes/guides/campaign-subscription-management">
        Campaign Subscription Management
</a></li>
<li class="navigation-item--alerts navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/us-short-codes/guides/alerts">
        Alerts
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--two-factor-authentication-api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/us-short-codes/two-factor-api">
        Two-factor Authentication API Reference
</a></li>
<li class="navigation-item--alerts-subscribing-api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/us-short-codes/alerts-subscribing-api">
        Alerts - Subscribing API Reference
</a></li>
<li class="navigation-item--alerts-sending-api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/us-short-codes/alerts-sending-api">
        Alerts - Sending API Reference
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--conversion-api navigation-item">
    <li class="js--collapsible navigation-item--conversion-api navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Conversion API</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/conversion-api/overview">
        Overview
</a></li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/messaging/conversion-api/api-reference">
        API Reference
</a></li>

        </ul>
    </li>
</li>

    </ul>
</li>
<li class='navigation-item--dispatch navigation-item'>
  <span class='Vlt-sidemenu__trigger' tabindex='0'>
      <svg class='Vlt-purple'><use xlink:href='/symbol/volta-icons.svg#Vlt-icon-flow' /></svg>
    <span class='Vlt-sidemenu__label'>
      Dispatch API

        <a class="Vlt-badge Vlt-badge--margin-left Vlt-bg-green-lighter Vlt-green" href="/product-lifecycle/beta">Beta</a>
    </span>
  </span>
    <ul class="Vlt-sidemenu__list--compressed">
      <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/dispatch/overview">
        Overview
</a></li>
<li class="navigation-item--concepts navigation-item">
    <li class="js--collapsible navigation-item--concepts navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Concepts</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--what-is-a-dispatch-workflow navigation-item">
    <a class="Vlt-sidemenu__link" href="/dispatch/concepts/workflows">
        What is a Dispatch workflow?
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--code-snippets navigation-item">
    <li class="js--collapsible navigation-item--code-snippets navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Code Snippets</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--before-you-begin navigation-item">
    <a class="Vlt-sidemenu__link" href="/dispatch/code-snippets/before-you-begin">
        Before you begin
</a></li>
<li class="navigation-item--install-nexmo-cli navigation-item">
    <a class="Vlt-sidemenu__link" href="/dispatch/code-snippets/install-cli">
        Install Nexmo CLI
</a></li>
<li class="navigation-item--client-library navigation-item">
    <a class="Vlt-sidemenu__link" href="/dispatch/code-snippets/client-library">
        Client library
</a></li>
<li class="navigation-item--how-to-create-a-nexmo-messages-and-dispatch-application navigation-item">
    <a class="Vlt-sidemenu__link" href="/dispatch/code-snippets/create-an-application">
        How to create a Nexmo Messages and Dispatch Application
</a></li>
<li class="navigation-item--send-a-facebook-message-with-failover navigation-item">
    <a class="Vlt-sidemenu__link" href="/dispatch/code-snippets/send-a-facebook-message-with-failover">
        Send a Facebook message with failover
</a></li>
<li class="navigation-item--send-a-viber-message-with-failover navigation-item">
    <a class="Vlt-sidemenu__link" href="/dispatch/code-snippets/send-a-viber-message-with-failover">
        Send a Viber message with failover
</a></li>
<li class="navigation-item--send-an-mms-with-failover navigation-item">
    <a class="Vlt-sidemenu__link" href="/dispatch/code-snippets/send-an-mms-with-failover">
        Send an MMS with failover
</a></li>
<li class="navigation-item--send-a-whatsapp-message-with-failover navigation-item">
    <a class="Vlt-sidemenu__link" href="/dispatch/code-snippets/send-a-whatsapp-message-with-failover">
        Send a WhatsApp message with failover
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--tutorials navigation-item">
    <li class="js--collapsible navigation-item--tutorials navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Tutorials</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--sending-a-facebook-message-with-failover navigation-item">
    <a class="Vlt-sidemenu__link" href="/dispatch/tutorials/sending-facebook-message-with-failover">
        Sending a Facebook message with failover
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--use-cases navigation-item">
    <li class="js--collapsible navigation-item--use-cases navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Use Cases</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--multi-user-multi-channel-failover-using-dispatch-api navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/dispatch-user-fallback">
        Multi-user, multi-channel failover using Dispatch API
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/dispatch/api-reference">
        API Reference
</a></li>
<li class="navigation-item--external-accounts-api navigation-item">
    <li class="js--collapsible navigation-item--external-accounts-api navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">External Accounts API</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/dispatch/external-accounts/overview">
        Overview
</a></li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/dispatch/external-accounts/api-reference">
        API Reference
</a></li>

        </ul>
    </li>
</li>

    </ul>
</li>
<li class='navigation-item--verify navigation-item'>
  <span class='Vlt-sidemenu__trigger' tabindex='0'>
      <svg class='Vlt-indigo'><use xlink:href='/symbol/volta-icons.svg#Vlt-icon-lock' /></svg>
    <span class='Vlt-sidemenu__label'>
      Verify

    </span>
  </span>
    <ul class="Vlt-sidemenu__list--compressed">
      <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/verify/overview">
        Overview
</a></li>
<li class="navigation-item--guides navigation-item">
    <li class="js--collapsible navigation-item--guides navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Guides</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--verify-languages navigation-item">
    <a class="Vlt-sidemenu__link" href="/verify/guides/verify-languages">
        Verify Languages
</a></li>
<li class="navigation-item--workflows-and-events navigation-item">
    <a class="Vlt-sidemenu__link" href="/verify/guides/workflows-and-events">
        Workflows and Events
</a></li>
<li class="navigation-item--change-the-event-timings navigation-item">
    <a class="Vlt-sidemenu__link" href="/verify/guides/changing-default-timings">
        Change the event timings
</a></li>
<li class="navigation-item--verify-velocity-rules navigation-item">
    <a class="Vlt-sidemenu__link" href="/verify/guides/velocity-rules">
        Verify Velocity Rules
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--code-snippets navigation-item">
    <li class="js--collapsible navigation-item--code-snippets navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Code Snippets</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--before-you-begin navigation-item">
    <a class="Vlt-sidemenu__link" href="/verify/code-snippets/before-you-begin">
        Before you begin
</a></li>
<li class="navigation-item--search-for-verify-request navigation-item">
    <a class="Vlt-sidemenu__link" href="/verify/code-snippets/search-verify-request">
        Search for Verify request
</a></li>
<li class="navigation-item--send-verification-code-with-workflow navigation-item">
    <a class="Vlt-sidemenu__link" href="/verify/code-snippets/send-verify-request-with-workflow">
        Send verification code with workflow
</a></li>
<li class="navigation-item--send-verification-code navigation-item">
    <a class="Vlt-sidemenu__link" href="/verify/code-snippets/send-verify-request">
        Send verification code
</a></li>
<li class="navigation-item--check-verification-code navigation-item">
    <a class="Vlt-sidemenu__link" href="/verify/code-snippets/check-verify-request">
        Check verification code
</a></li>
<li class="navigation-item--cancel-verification-request navigation-item">
    <a class="Vlt-sidemenu__link" href="/verify/code-snippets/cancel-verify-request">
        Cancel verification request
</a></li>
<li class="navigation-item--trigger-next-verification-process navigation-item">
    <a class="Vlt-sidemenu__link" href="/verify/code-snippets/trigger-next-verification-process">
        Trigger next verification process
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--tutorials navigation-item">
    <li class="js--collapsible navigation-item--tutorials navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Tutorials</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--add-two-factor-authentication-to-a-microsoft-bot-with-nexmo-s-verify-api navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2018/07/11/add-two-factor-authentication-to-a-microsoft-bot-with-nexmos-verify-api-dr/">
        Add two factor authentication to a Microsoft bot with Nexmo’s Verify API
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--use-cases navigation-item">
    <li class="js--collapsible navigation-item--use-cases navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Use Cases</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--passwordless-authentication navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/passwordless-authentication">
        Passwordless authentication
</a></li>
<li class="navigation-item--two-factor-authentication-for-security-and-spam-prevention navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/two-factor-authentication">
        Two-factor authentication for security and spam prevention
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/verify/api-reference">
        API Reference
</a></li>

    </ul>
</li>
<li class='navigation-item--voice navigation-item'>
  <span class='Vlt-sidemenu__trigger' tabindex='0'>
      <svg class='Vlt-green'><use xlink:href='/symbol/volta-icons.svg#Vlt-icon-phone' /></svg>
    <span class='Vlt-sidemenu__label'>
      Voice

    </span>
  </span>
    <ul class="Vlt-sidemenu__list--compressed">
      <li class="navigation-item--voice-api navigation-item">
    <li class="js--collapsible navigation-item--voice-api navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Voice API</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/overview">
        Overview
</a></li>
<li class="navigation-item--guides navigation-item">
    <li class="js--collapsible navigation-item--guides navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Guides</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--troubleshooting navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/guides/troubleshooting">
        Troubleshooting
</a></li>
<li class="navigation-item--numbers navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/guides/numbers">
        Numbers
</a></li>
<li class="navigation-item--call-flow navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/guides/call-flow">
        Call Flow
</a></li>
<li class="navigation-item--nexmo-call-control-objects navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/guides/ncco">
        Nexmo Call Control Objects
</a></li>
<li class="navigation-item--legs-and-conversations navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/guides/legs-conversations">
        Legs and Conversations
</a></li>
<li class="navigation-item--text-to-speech navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/guides/text-to-speech">
        Text to Speech
</a></li>
<li class="navigation-item--customizing-spoken-text navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/guides/customizing-tts">
        Customizing Spoken Text
</a></li>
<li class="navigation-item--endpoints navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/guides/endpoints">
        Endpoints
</a></li>
<li class="navigation-item--recording navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/guides/recording">
        Recording
</a></li>
<li class="navigation-item--dtmf navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/guides/dtmf">
        DTMF
</a></li>
<li class="navigation-item--websockets navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/guides/websockets">
        <span class="Vlt-sidemenu__label">
          WebSockets
          <span class="Vlt-badge Vlt-badge--margin-left Vlt-bg-green-lighter Vlt-green">
            Beta
          </span>
        </span>
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--code-snippets navigation-item">
    <li class="js--collapsible navigation-item--code-snippets navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Code Snippets</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--before-you-begin navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/before-you-begin">
        Before you begin
</a></li>
<li class="navigation-item--make-an-outbound-call-with-an-ncco navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/make-an-outbound-call-with-ncco">
        Make an outbound call with an NCCO
</a></li>
<li class="navigation-item--connect-an-inbound-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/connect-an-inbound-call">
        Connect an inbound call
</a></li>
<li class="navigation-item--download-a-recording navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/download-a-recording">
        Download a recording
</a></li>
<li class="navigation-item--earmuff-a-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/earmuff-a-call">
        Earmuff a call
</a></li>
<li class="navigation-item--handle-user-input-with-dtmf navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/handle-user-input-with-dtmf">
        Handle user input with DTMF
</a></li>
<li class="navigation-item--connect-callers-into-a-conference navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/connect-callers-into-a-conference">
        Connect callers into a conference
</a></li>
<li class="navigation-item--make-an-outbound-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/make-an-outbound-call">
        Make an outbound call
</a></li>
<li class="navigation-item--mute-a-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/mute-a-call">
        Mute a call
</a></li>
<li class="navigation-item--play-an-audio-stream-into-a-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/play-an-audio-stream-into-a-call">
        Play an audio stream into a call
</a></li>
<li class="navigation-item--play-dtmf-into-a-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/play-dtmf-into-a-call">
        Play DTMF into a call
</a></li>
<li class="navigation-item--play-text-to-speech-into-a-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/play-text-to-speech-into-a-call">
        Play text-to-speech into a call
</a></li>
<li class="navigation-item--receive-an-inbound-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/receive-an-inbound-call">
        Receive an inbound call
</a></li>
<li class="navigation-item--record-a-call-with-split-audio navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/record-a-call-with-split-audio">
        Record a call with split audio
</a></li>
<li class="navigation-item--record-a-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/record-a-call">
        Record a call
</a></li>
<li class="navigation-item--record-a-conversation navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/record-a-conversation">
        Record a conversation
</a></li>
<li class="navigation-item--record-a-message navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/record-a-message">
        Record a message
</a></li>
<li class="navigation-item--retrieve-information-for-a-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/retrieve-info-for-a-call">
        Retrieve information for a call
</a></li>
<li class="navigation-item--retrieve-information-for-all-calls navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/retrieve-info-for-all-calls">
        Retrieve information for all calls
</a></li>
<li class="navigation-item--transfer-a-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/transfer-a-call">
        Transfer a call
</a></li>
<li class="navigation-item--transfer-a-call-with-inline-ncco navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/transfer-a-call-inline-ncco">
        Transfer a call with inline NCCO
</a></li>
<li class="navigation-item--track-ncco-progress navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/code-snippets/track-ncco-progress">
        Track NCCO progress
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--use-cases navigation-item">
    <li class="js--collapsible navigation-item--use-cases navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Use Cases</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--private-voice-communication navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/private-voice-communication">
        Private voice communication
</a></li>
<li class="navigation-item--broadcast-voice-based-critical-alerts navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/voice-alerts">
        Broadcast Voice-based Critical Alerts
</a></li>
<li class="navigation-item--call-a-websocket-with-python navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/voice-call-websocket-python">
        Call a Websocket with Python
</a></li>
<li class="navigation-item--add-a-call-whisper-to-an-inbound-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/add-a-call-whisper-to-an-inbound-call">
        Add a Call whisper to an inbound call
</a></li>
<li class="navigation-item--interactive-voice-response navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/interactive-voice-response">
        Interactive Voice Response
</a></li>
<li class="navigation-item--transcribe-a-recorded-call-with-amazon-transcribe navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/trancribe-amazon-api">
        Transcribe a recorded call with Amazon Transcribe
</a></li>
<li class="navigation-item--call-a-websocket-with-node-js navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/voice-call-websocket-node">
        Call a Websocket with Node.js
</a></li>
<li class="navigation-item--local-numbers navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/local-numbers">
        Local Numbers
</a></li>
<li class="navigation-item--call-tracking navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/call-tracking">
        Call tracking
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/api-reference">
        API Reference
</a></li>
<li class="navigation-item--ncco-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/ncco-reference">
        NCCO Reference
</a></li>
<li class="navigation-item--webhook-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/voice-api/webhook-reference">
        Webhook Reference
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--sip navigation-item">
    <li class="js--collapsible navigation-item--sip navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">SIP</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/sip/overview">
        Overview
</a></li>
<li class="navigation-item--concepts navigation-item">
    <li class="js--collapsible navigation-item--concepts navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Concepts</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--programmable-sip navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/sip/concepts/programmable-sip">
        Programmable SIP
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--configure navigation-item">
    <li class="js--collapsible navigation-item--configure navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Configure</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--avaya-sbce navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/sip/configure/avaya-sbce">
        Avaya SBCe
</a></li>
<li class="navigation-item--skype-for-business navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/sip/configure/skypeforbusiness">
        Skype for Business
</a></li>
<li class="navigation-item--mitel-mivoice navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/sip/configure/mitel-mivoice">
        MiTel MiVoice
</a></li>
<li class="navigation-item--nec-sv9100 navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/sip/configure/nec-sv9100">
        NEC SV9100
</a></li>
<li class="navigation-item--freepbx navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/sip/configure/freepbx">
        FreePBX
</a></li>
<li class="navigation-item--cisco-cucm-cube navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/sip/configure/cucm-cube">
        Cisco CUCM/CUBE
</a></li>
<li class="navigation-item--freeswitch navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/sip/configure/freeswitch">
        FreeSWITCH
</a></li>
<li class="navigation-item--asterisk navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/sip/configure/asterisk">
        Asterisk
</a></li>
<li class="navigation-item--shoretel-ingate navigation-item">
    <a class="Vlt-sidemenu__link" href="/voice/sip/configure/shoretel">
        ShoreTel &amp; InGate
</a></li>

        </ul>
    </li>
</li>

        </ul>
    </li>
</li>

    </ul>
</li>
<li class='navigation-item--number-insight navigation-item'>
  <span class='Vlt-sidemenu__trigger' tabindex='0'>
      <svg class='Vlt-orange'><use xlink:href='/symbol/volta-icons.svg#Vlt-icon-file-search' /></svg>
    <span class='Vlt-sidemenu__label'>
      Number Insight

    </span>
  </span>
    <ul class="Vlt-sidemenu__list--compressed">
      <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/number-insight/overview">
        Overview
</a></li>
<li class="navigation-item--guides navigation-item">
    <li class="js--collapsible navigation-item--guides navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Guides</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--retrieving-cnam-owner-details navigation-item">
    <a class="Vlt-sidemenu__link" href="/number-insight/guides/cnam">
        Retrieving CNAM Owner Details
</a></li>
<li class="navigation-item--using-number-insight-via-the-nexmo-cli navigation-item">
    <a class="Vlt-sidemenu__link" href="/number-insight/guides/number-insight-via-cli">
        Using Number Insight via the Nexmo CLI
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--code-snippets navigation-item">
    <li class="js--collapsible navigation-item--code-snippets navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Code Snippets</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--before-you-begin navigation-item">
    <a class="Vlt-sidemenu__link" href="/number-insight/code-snippets/before-you-begin">
        Before you begin
</a></li>
<li class="navigation-item--number-insight-basic navigation-item">
    <a class="Vlt-sidemenu__link" href="/number-insight/code-snippets/number-insight-basic">
        Number Insight Basic
</a></li>
<li class="navigation-item--number-insight-standard navigation-item">
    <a class="Vlt-sidemenu__link" href="/number-insight/code-snippets/number-insight-standard">
        Number Insight Standard
</a></li>
<li class="navigation-item--number-insight-advanced navigation-item">
    <a class="Vlt-sidemenu__link" href="/number-insight/code-snippets/number-insight-advanced-async">
        Number Insight Advanced
</a></li>
<li class="navigation-item--number-insight-advanced-webhook navigation-item">
    <a class="Vlt-sidemenu__link" href="/number-insight/code-snippets/number-insight-advanced-async-callback">
        Number Insight Advanced Webhook
</a></li>
<li class="navigation-item--number-insight-advanced-sync navigation-item">
    <a class="Vlt-sidemenu__link" href="/number-insight/code-snippets/number-insight-advanced-sync">
        Number Insight Advanced (Sync)
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--tutorials navigation-item">
    <li class="js--collapsible navigation-item--tutorials navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Tutorials</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--getting-started-with-nexmo-number-insight-apis-and-asp-net navigation-item">
    <a class="Vlt-sidemenu__link" href="https://www.nexmo.com/blog/2018/05/22/getting-started-with-nexmo-number-insight-apis-and-asp-net-dr/">
        Getting Started with Nexmo Number Insight APIs and ASP.NET
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--use-cases navigation-item">
    <li class="js--collapsible navigation-item--use-cases navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Use Cases</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--fraud-scoring-and-phone-number-verification navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/fraud-scoring-and-phone-number-verification">
        Fraud Scoring and Phone Number Verification
</a></li>
<li class="navigation-item--number-insight-advanced-api navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/number-insight-async-tutorial">
        Number Insight Advanced API
</a></li>
<li class="navigation-item--validate-a-number navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/validate-a-number">
        Validate a number
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/number-insight/api-reference">
        API Reference
</a></li>

    </ul>
</li>
<li class='navigation-item--conversation navigation-item'>
  <span class='Vlt-sidemenu__trigger' tabindex='0'>
      <svg class='Vlt-teal'><use xlink:href='/symbol/volta-icons.svg#Vlt-icon-message' /></svg>
    <span class='Vlt-sidemenu__label'>
      Conversation

        <a class="Vlt-badge Vlt-badge--margin-left Vlt-bg-green-lighter Vlt-green" href="/product-lifecycle/beta">Beta</a>
    </span>
  </span>
    <ul class="Vlt-sidemenu__list--compressed">
      <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/overview">
        Overview
</a></li>
<li class="navigation-item--concepts navigation-item">
    <li class="js--collapsible navigation-item--concepts navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Concepts</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--application navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/concepts/application">
        Application
</a></li>
<li class="navigation-item--conversation navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/concepts/conversation">
        Conversation
</a></li>
<li class="navigation-item--user navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/concepts/user">
        User
</a></li>
<li class="navigation-item--member navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/concepts/member">
        Member
</a></li>
<li class="navigation-item--call navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/concepts/call">
        Call
</a></li>
<li class="navigation-item--channel navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/concepts/channel">
        Channel
</a></li>
<li class="navigation-item--leg navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/concepts/leg">
        Leg
</a></li>
<li class="navigation-item--media navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/concepts/media">
        Media
</a></li>
<li class="navigation-item--event navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/concepts/event">
        Event
</a></li>
<li class="navigation-item--session navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/concepts/session">
        Session
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--guides navigation-item">
    <li class="js--collapsible navigation-item--guides navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Guides</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--how-to-set-up-your-application navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/guides/application-setup">
        How to set up your application
</a></li>
<li class="navigation-item--how-to-authenticate-users navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/guides/user-authentication">
        How to authenticate users
</a></li>
<li class="navigation-item--how-to-generate-jwts navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/guides/jwt-acl">
        How to generate JWTs
</a></li>
<li class="navigation-item--event-flow navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/guides/event-flow">
        Event flow
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--code-snippets navigation-item">
    <h5 class="Vlt-sidemenu__title Vlt-sidemenu__title--border">Code Snippets</h5>
      <ul class="Vlt-sidemenu__list--compressed">
        <li class="navigation-item--conversation navigation-item">
    <li class="js--collapsible navigation-item--conversation navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Conversation</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--create-a-conversation navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/conversation/create-conversation">
        Create a Conversation
</a></li>
<li class="navigation-item--delete-a-conversation navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/conversation/delete-conversation">
        Delete a Conversation
</a></li>
<li class="navigation-item--get-a-conversation navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/conversation/get-conversation">
        Get a Conversation
</a></li>
<li class="navigation-item--record-a-conversation navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/conversation/record-conversation">
        Record a Conversation
</a></li>
<li class="navigation-item--update-conversation navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/conversation/update-conversation">
        Update Conversation
</a></li>
<li class="navigation-item--list-conversations navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/conversation/list-conversations">
        List Conversations
</a></li>
<li class="navigation-item--list-next-conversations navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/conversation/list-next-conversations">
        List Next Conversations
</a></li>
<li class="navigation-item--list-previous-conversations navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/conversation/list-prev-conversations">
        List Previous Conversations
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--user navigation-item">
    <li class="js--collapsible navigation-item--user navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">User</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--create-a-user navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/user/create-user">
        Create a User
</a></li>
<li class="navigation-item--delete-a-user navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/user/delete-user">
        Delete a User
</a></li>
<li class="navigation-item--get-a-user navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/user/get-user">
        Get a User
</a></li>
<li class="navigation-item--update-a-user navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/user/update-user">
        Update a User
</a></li>
<li class="navigation-item--list-users navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/user/list-users">
        List Users
</a></li>
<li class="navigation-item--list-next-users navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/user/list-next-users">
        List Next Users
</a></li>
<li class="navigation-item--list-previous-users navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/user/list-prev-users">
        List Previous Users
</a></li>
<li class="navigation-item--list-a-user-s-conversations navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/user/list-user-conversations">
        List a User&#39;s Conversations
</a></li>
<li class="navigation-item--list-next-page-of-a-user-s-conversations navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/user/list-next-user-conversations">
        List Next Page of a User&#39;s Conversations
</a></li>
<li class="navigation-item--list-previous-page-of-a-user-s-conversations navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/user/list-prev-user-conversations">
        List Previous Page of a User&#39;s Conversations
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--leg navigation-item">
    <li class="js--collapsible navigation-item--leg navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Leg</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--delete-a-leg navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/leg/delete-leg">
        Delete a Leg
</a></li>
<li class="navigation-item--list-legs navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/leg/list-legs">
        List Legs
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--member navigation-item">
    <li class="js--collapsible navigation-item--member navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Member</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--create-a-member navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/member/create-member">
        Create a Member
</a></li>
<li class="navigation-item--delete-a-member navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/member/delete-member">
        Delete a Member
</a></li>
<li class="navigation-item--get-a-member navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/member/get-member">
        Get a Member
</a></li>
<li class="navigation-item--update-a-member navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/member/update-member">
        Update a Member
</a></li>
<li class="navigation-item--list-members navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/member/list-members">
        List Members
</a></li>
<li class="navigation-item--list-next-members navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/member/list-next-members">
        List Next Members
</a></li>
<li class="navigation-item--list-previous-members navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/member/list-prev-members">
        List Previous Members
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--event navigation-item">
    <li class="js--collapsible navigation-item--event navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Event</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--create-an-event navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/event/create-event">
        Create an Event
</a></li>
<li class="navigation-item--create-a-custom-event navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/event/create-custom-event">
        Create a custom Event
</a></li>
<li class="navigation-item--delete-an-event navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/event/delete-event">
        Delete an Event
</a></li>
<li class="navigation-item--get-an-event navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/event/get-event">
        Get an Event
</a></li>
<li class="navigation-item--list-events navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/event/list-events">
        List Events
</a></li>
<li class="navigation-item--list-next-events navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/event/list-next-events">
        List Next Events
</a></li>
<li class="navigation-item--list-previous-events navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/code-snippets/event/list-prev-events">
        List Previous Events
</a></li>

        </ul>
    </li>
</li>

      </ul>
</li>
<li class="navigation-item--use-cases navigation-item">
    <li class="js--collapsible navigation-item--use-cases navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Use Cases</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--retrieve-conversation-details-for-an-in-progress-voice-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/retrieve-conversation-details">
        Retrieve Conversation details for an in-progress voice call
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/conversation/api-reference">
        API Reference
</a></li>

    </ul>
</li>
<li class='navigation-item--client-sdk navigation-item'>
  <span class='Vlt-sidemenu__trigger' tabindex='0'>
      <svg class='Vlt-teal'><use xlink:href='/symbol/volta-icons.svg#Vlt-icon-queue' /></svg>
    <span class='Vlt-sidemenu__label'>
      Client SDK

        <a class="Vlt-badge Vlt-badge--margin-left Vlt-bg-green-lighter Vlt-green" href="/product-lifecycle/beta">Beta</a>
    </span>
  </span>
    <ul class="Vlt-sidemenu__list--compressed">
      <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/overview">
        Overview
</a></li>
<li class="navigation-item--setup navigation-item">
    <li class="js--collapsible navigation-item--setup navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Setup</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--create-your-application navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/setup/create-your-application">
        Create your application
</a></li>
<li class="navigation-item--add-client-sdk-to-your-application navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/setup/add-sdk-to-your-app">
        Add Client SDK to your application
</a></li>
<li class="navigation-item--set-up-push-notifications navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/setup/set-up-push-notifications">
        Set up push notifications
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--configuration navigation-item">
    <li class="js--collapsible navigation-item--configuration navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Configuration</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--configure-your-data-center navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/configuration/configure-data-center">
        Configure your data center
</a></li>
<li class="navigation-item--configure-ice-server-url navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/configuration/configure-ice-server">
        Configure ICE server URL
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--custom-events navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/custom-events">
        Custom Events
</a></li>
<li class="navigation-item--in-app-messaging navigation-item">
    <li class="js--collapsible navigation-item--in-app-messaging navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">In-App Messaging</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-messaging/overview">
        Overview
</a></li>
<li class="navigation-item--guides navigation-item">
    <li class="js--collapsible navigation-item--guides navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Guides</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--inviting-members navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-messaging/guides/inviting-members">
        Inviting Members
</a></li>
<li class="navigation-item--send-and-receive-text-messages navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-messaging/guides/send-receive-text">
        Send and Receive Text Messages
</a></li>
<li class="navigation-item--send-and-receive-images navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-messaging/guides/send-receive-image">
        Send and Receive Images
</a></li>
<li class="navigation-item--seen-receipt navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-messaging/guides/seen-receipt">
        Seen Receipt
</a></li>
<li class="navigation-item--typing-indicators navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-messaging/guides/typing-indicators">
        Typing Indicators
</a></li>
<li class="navigation-item--leave-conversation navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-messaging/guides/leave-conversation">
        Leave Conversation
</a></li>
<li class="navigation-item--utilizing-events navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-messaging/guides/utilizing-events">
        Utilizing Events
</a></li>

        </ul>
    </li>
</li>

        </ul>
    </li>
</li>
<li class="navigation-item--in-app-voice navigation-item">
    <li class="js--collapsible navigation-item--in-app-voice navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">In-App Voice</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-voice/overview">
        Overview
</a></li>
<li class="navigation-item--getting-started navigation-item">
    <li class="js--collapsible navigation-item--getting-started navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Getting Started</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--receive-a-phone-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-voice/getting-started/receive-phone-call">
        Receive a phone call
</a></li>
<li class="navigation-item--app-to-app-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-voice/getting-started/app-to-app-call">
        App to App call
</a></li>
<li class="navigation-item--make-a-phone-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-voice/getting-started/make-phone-call">
        Make a phone call
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--concepts navigation-item">
    <li class="js--collapsible navigation-item--concepts navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Concepts</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--call-statuses navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-voice/concepts/call-statuses">
        Call Statuses
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--guides navigation-item">
    <li class="js--collapsible navigation-item--guides navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Guides</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--enable-audio navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-voice/guides/enable-audio">
        Enable Audio
</a></li>
<li class="navigation-item--send-and-receive-dtmf navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-voice/guides/send-and-receive-dtmf">
        Send and Receive DTMF
</a></li>
<li class="navigation-item--make-a-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-voice/guides/make-call">
        Make a Call
</a></li>
<li class="navigation-item--receive-a-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-voice/guides/receive-call">
        Receive a Call
</a></li>
<li class="navigation-item--mute-a-call-member navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-voice/guides/mute-call-member">
        Mute a Call Member
</a></li>
<li class="navigation-item--earmuff-a-call-member navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/in-app-voice/guides/earmuff-call-member">
        Earmuff a Call Member
</a></li>

        </ul>
    </li>
</li>

        </ul>
    </li>
</li>
<li class="navigation-item--tutorials navigation-item">
    <li class="js--collapsible navigation-item--tutorials navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Tutorials</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--creating-a-web-based-chat-app navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/tutorials/in-app-messaging">
        Creating a web-based chat app
</a></li>
<li class="navigation-item--receiving-an-in-app-voice-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/tutorials/phone-to-app">
        Receiving an in-app voice call
</a></li>
<li class="navigation-item--making-an-in-app-voice-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/tutorials/app-to-phone">
        Making an in-app voice call
</a></li>
<li class="navigation-item--creating-an-ios-chat-app navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/tutorials/ios-in-app-messaging-chat">
        Creating an iOS chat app
</a></li>
<li class="navigation-item--making-an-app-to-app-voice-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/tutorials/app-to-app">
        Making an app to app voice call
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--use-cases navigation-item">
    <li class="js--collapsible navigation-item--use-cases navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Use Cases</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--click-to-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/client-sdk-click-to-call">
        Click to Call
</a></li>
<li class="navigation-item--digital-marketplace navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/digital-marketplace-client-sdk">
        Digital Marketplace
</a></li>
<li class="navigation-item--contact-center navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/contact-center-client-sdk">
        Contact Center
</a></li>
<li class="navigation-item--order-support-system navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/client-sdk-sendinblue-order-confirm">
        Order support system
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--troubleshooting navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/troubleshooting">
        Troubleshooting
</a></li>
<li class="navigation-item--sdk-documentation navigation-item">
    <h5 class="Vlt-sidemenu__title Vlt-sidemenu__title--border">SDK Documentation</h5>
      <ul class="Vlt-sidemenu__list--compressed">
        <li class="navigation-item--ios navigation-item">
    <li class="js--collapsible navigation-item--ios navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">iOS</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--release-notes navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/sdk-documentation/ios/release-notes">
        Release Notes
</a></li>
<li class="navigation-item--sdk-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/sdk-documentation/ios/ios">
        SDK Reference
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--android navigation-item">
    <li class="js--collapsible navigation-item--android navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Android</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--release-notes navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/sdk-documentation/android/release-notes">
        Release Notes
</a></li>
<li class="navigation-item--sdk-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/sdk-documentation/android/android">
        SDK Reference
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--javascript navigation-item">
    <li class="js--collapsible navigation-item--javascript navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">JavaScript</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--release-notes navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/sdk-documentation/javascript/release-notes">
        Release Notes
</a></li>
<li class="navigation-item--sdk-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/client-sdk/sdk-documentation/javascript/javascript">
        SDK Reference
</a></li>

        </ul>
    </li>
</li>

      </ul>
</li>

    </ul>
</li>
<li class='navigation-item--numbers navigation-item'>
  <span class='Vlt-sidemenu__trigger' tabindex='0'>
      <svg class='Vlt-red'><use xlink:href='/symbol/volta-icons.svg#Vlt-icon-phone-number' /></svg>
    <span class='Vlt-sidemenu__label'>
      Numbers

    </span>
  </span>
    <ul class="Vlt-sidemenu__list--compressed">
      <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/numbers/overview">
        Overview
</a></li>
<li class="navigation-item--guides navigation-item">
    <li class="js--collapsible navigation-item--guides navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Guides</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--number-management navigation-item">
    <a class="Vlt-sidemenu__link" href="/numbers/guides/number-management">
        Number Management
</a></li>
<li class="navigation-item--manage-numbers-with-the-nexmo-cli navigation-item">
    <a class="Vlt-sidemenu__link" href="/numbers/guides/numbers-cli">
        Manage Numbers with the Nexmo CLI
</a></li>
<li class="navigation-item--enable-2fa-with-a-short-code navigation-item">
    <a class="Vlt-sidemenu__link" href="/numbers/guides/enable-2fa">
        Enable 2FA with a Short Code
</a></li>
<li class="navigation-item--setup-event-alerts navigation-item">
    <a class="Vlt-sidemenu__link" href="/numbers/guides/event-alerts">
        Setup Event Alerts
</a></li>
<li class="navigation-item--payments navigation-item">
    <a class="Vlt-sidemenu__link" href="/numbers/guides/payments">
        Payments
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--code-snippets navigation-item">
    <li class="js--collapsible navigation-item--code-snippets navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Code Snippets</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--list-your-numbers navigation-item">
    <a class="Vlt-sidemenu__link" href="/numbers/code-snippets/list-owned">
        List Your Numbers
</a></li>
<li class="navigation-item--search-available-numbers navigation-item">
    <a class="Vlt-sidemenu__link" href="/numbers/code-snippets/search-available">
        Search Available Numbers
</a></li>
<li class="navigation-item--buy-a-number navigation-item">
    <a class="Vlt-sidemenu__link" href="/numbers/code-snippets/buy">
        Buy a Number
</a></li>
<li class="navigation-item--update-a-number navigation-item">
    <a class="Vlt-sidemenu__link" href="/numbers/code-snippets/update">
        Update a Number
</a></li>
<li class="navigation-item--cancel-a-number navigation-item">
    <a class="Vlt-sidemenu__link" href="/numbers/code-snippets/cancel">
        Cancel a Number
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/numbers/api-reference">
        API Reference
</a></li>

    </ul>
</li>
<li class='navigation-item--account navigation-item'>
  <span class='Vlt-sidemenu__trigger' tabindex='0'>
      <svg class='Vlt-blue'><use xlink:href='/symbol/volta-icons.svg#Vlt-icon-user' /></svg>
    <span class='Vlt-sidemenu__label'>
      Account

    </span>
  </span>
    <ul class="Vlt-sidemenu__list--compressed">
      <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/overview">
        Overview
</a></li>
<li class="navigation-item--guides navigation-item">
    <li class="js--collapsible navigation-item--guides navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Guides</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--nexmo-account-dashboard navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/guides/dashboard-management">
        Nexmo Account Dashboard
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--code-snippets navigation-item">
    <li class="js--collapsible navigation-item--code-snippets navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Code Snippets</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--create-a-secret navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/code-snippets/create-a-secret">
        Create a secret
</a></li>
<li class="navigation-item--get-account-balance navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/code-snippets/account-balance">
        Get account balance
</a></li>
<li class="navigation-item--configure-account navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/code-snippets/configure-account">
        Configure account
</a></li>
<li class="navigation-item--revoke-a-secret navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/code-snippets/revoke-a-secret">
        Revoke a secret
</a></li>
<li class="navigation-item--list-all-secrets navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/code-snippets/list-all-secrets">
        List all secrets
</a></li>
<li class="navigation-item--fetch-a-secret navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/code-snippets/fetch-a-secret">
        Fetch a secret
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--secret-management navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/secret-management">
        Secret Management
</a></li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/api-reference">
        API Reference
</a></li>
<li class="navigation-item--subaccounts-beta navigation-item">
    <li class="js--collapsible navigation-item--subaccounts-beta navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Subaccounts (Beta)</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/subaccounts/overview">
        Overview
</a></li>
<li class="navigation-item--code-snippets navigation-item">
    <li class="js--collapsible navigation-item--code-snippets navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Code Snippets</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--create-a-subaccount navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/subaccounts/code-snippets/create-subaccount">
        Create a Subaccount
</a></li>
<li class="navigation-item--get-subaccount navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/subaccounts/code-snippets/get-subaccount">
        Get Subaccount
</a></li>
<li class="navigation-item--get-subaccounts navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/subaccounts/code-snippets/get-subaccounts">
        Get Subaccounts
</a></li>
<li class="navigation-item--transfer-balance navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/subaccounts/code-snippets/transfer-balance">
        Transfer Balance
</a></li>
<li class="navigation-item--get-balance-transfers navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/subaccounts/code-snippets/get-balance-transfers">
        Get Balance Transfers
</a></li>
<li class="navigation-item--transfer-credit navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/subaccounts/code-snippets/transfer-credit">
        Transfer Credit
</a></li>
<li class="navigation-item--get-credit-transfers navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/subaccounts/code-snippets/get-credit-transfers">
        Get Credit Transfers
</a></li>
<li class="navigation-item--suspend-a-subaccount navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/subaccounts/code-snippets/suspend-subaccount">
        Suspend a Subaccount
</a></li>
<li class="navigation-item--reactivate-a-subaccount navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/subaccounts/code-snippets/reactivate-subaccount">
        Reactivate a Subaccount
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--use-cases navigation-item">
    <li class="js--collapsible navigation-item--use-cases navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Use Cases</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--using-the-subaccounts-api navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/using-subaccounts">
        Using the Subaccounts API
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/account/subaccounts/api-reference">
        API Reference
</a></li>

        </ul>
    </li>
</li>

    </ul>
</li>
<li class='navigation-item--audit navigation-item'>
  <span class='Vlt-sidemenu__trigger' tabindex='0'>
      <svg class='Vlt-green'><use xlink:href='/symbol/volta-icons.svg#Vlt-icon-file-search' /></svg>
    <span class='Vlt-sidemenu__label'>
      Audit

        <a class="Vlt-badge Vlt-badge--margin-left Vlt-bg-green-lighter Vlt-green" href="/product-lifecycle/beta">Beta</a>
    </span>
  </span>
    <ul class="Vlt-sidemenu__list--compressed">
      <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/audit/overview">
        Overview
</a></li>
<li class="navigation-item--concepts navigation-item">
    <li class="js--collapsible navigation-item--concepts navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Concepts</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--audit-events navigation-item">
    <a class="Vlt-sidemenu__link" href="/audit/concepts/audit-events">
        Audit Events
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--code-snippets navigation-item">
    <li class="js--collapsible navigation-item--code-snippets navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Code Snippets</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--get-audit-events navigation-item">
    <a class="Vlt-sidemenu__link" href="/audit/code-snippets/get-events">
        Get audit events
</a></li>
<li class="navigation-item--get-audit-event navigation-item">
    <a class="Vlt-sidemenu__link" href="/audit/code-snippets/get-event">
        Get audit event
</a></li>
<li class="navigation-item--get-audit-events-with-filtering navigation-item">
    <a class="Vlt-sidemenu__link" href="/audit/code-snippets/get-events-with-filtering">
        Get audit events with filtering
</a></li>
<li class="navigation-item--get-audit-event-types navigation-item">
    <a class="Vlt-sidemenu__link" href="/audit/code-snippets/get-event-types">
        Get audit event types
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--use-cases navigation-item">
    <li class="js--collapsible navigation-item--use-cases navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Use Cases</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--retrieve-audit-events navigation-item">
    <a class="Vlt-sidemenu__link" href="/use-cases/retrieve-audit-events">
        Retrieve audit events
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/audit/api-reference">
        API Reference
</a></li>

    </ul>
</li>
<li class='navigation-item--redact navigation-item'>
  <span class='Vlt-sidemenu__trigger' tabindex='0'>
      <svg class='Vlt-red'><use xlink:href='/symbol/volta-icons.svg#Vlt-icon-lock' /></svg>
    <span class='Vlt-sidemenu__label'>
      Redact

        <a class="Vlt-badge Vlt-badge--margin-left Vlt-bg-blue-lighter Vlt-blue" href="/product-lifecycle/dev-preview">Dev Preview</a>
    </span>
  </span>
    <ul class="Vlt-sidemenu__list--compressed">
      <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/redact/overview">
        Overview
</a></li>
<li class="navigation-item--guides navigation-item">
    <li class="js--collapsible navigation-item--guides navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Guides</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--developer-field-usage-guidance navigation-item">
    <a class="Vlt-sidemenu__link" href="/redact/guides/developer-field-usage-guidance">
        Developer Field Usage Guidance
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--code-snippets navigation-item">
    <li class="js--collapsible navigation-item--code-snippets navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Code Snippets</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--redact-using-an-id navigation-item">
    <a class="Vlt-sidemenu__link" href="/redact/code-snippets/redact-using-id">
        Redact using an ID
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/redact/api-reference">
        API Reference
</a></li>

    </ul>
</li>
<li class='navigation-item--reports navigation-item'>
  <span class='Vlt-sidemenu__trigger' tabindex='0'>
      <svg class='Vlt-orange'><use xlink:href='/symbol/volta-icons.svg#Vlt-icon-report' /></svg>
    <span class='Vlt-sidemenu__label'>
      Reports

        <a class="Vlt-badge Vlt-badge--margin-left Vlt-bg-green-lighter Vlt-green" href="/product-lifecycle/beta">Beta</a>
    </span>
  </span>
    <ul class="Vlt-sidemenu__list--compressed">
      <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/reports/overview">
        Overview
</a></li>
<li class="navigation-item--tutorials navigation-item">
    <li class="js--collapsible navigation-item--tutorials navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Tutorials</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--create-a-report-using-the-command-line navigation-item">
    <a class="Vlt-sidemenu__link" href="/reports/tutorials/create-and-retrieve-a-report">
        Create a report using the command line
</a></li>
<li class="navigation-item--create-a-report-using-a-graphical-tool navigation-item">
    <a class="Vlt-sidemenu__link" href="/reports/tutorials/create-report-using-graphical-tools">
        Create a report using a graphical tool
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/reports/api-reference">
        API Reference
</a></li>

    </ul>
</li>
<li class='navigation-item--vonage-business-cloud navigation-item'>
  <span class='Vlt-sidemenu__trigger' tabindex='0'>
      <svg class='Vlt-green'><use xlink:href='/symbol/volta-icons.svg#Vlt-icon-telephone' /></svg>
    <span class='Vlt-sidemenu__label'>
      Vonage Business Cloud

    </span>
  </span>
    <ul class="Vlt-sidemenu__list--compressed">
      <li class="navigation-item--smart-numbers navigation-item">
    <li class="js--collapsible navigation-item--smart-numbers navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Smart Numbers</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/smart-numbers/overview">
        Overview
</a></li>
<li class="navigation-item--guides navigation-item">
    <li class="js--collapsible navigation-item--guides navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Guides</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--enable-smart-numbers navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/smart-numbers/guides/enable-addon">
        Enable Smart Numbers
</a></li>
<li class="navigation-item--create-a-nexmo-voice-application navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/smart-numbers/guides/create-voice-application">
        Create a Nexmo Voice application
</a></li>
<li class="navigation-item--provision-the-service navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/smart-numbers/guides/provision-smart-numbers">
        Provision the Service
</a></li>
<li class="navigation-item--billing navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/smart-numbers/guides/billing">
        Billing
</a></li>
<li class="navigation-item--resources navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/smart-numbers/guides/vbc-resources">
        Resources
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--code-snippets navigation-item">
    <li class="js--collapsible navigation-item--code-snippets navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Code Snippets</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--receive-an-inbound-call navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/smart-numbers/code-snippets/vbc-receive-inbound-call">
        Receive an inbound call
</a></li>
<li class="navigation-item--route-to-a-vbc-extension navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/smart-numbers/code-snippets/vbc-route-to-extension">
        Route to a VBC Extension
</a></li>

        </ul>
    </li>
</li>

        </ul>
    </li>
</li>
<li class="navigation-item--vbc-apis navigation-item">
    <li class="js--collapsible navigation-item--vbc-apis navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">VBC APIs</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/overview">
        Overview
</a></li>
<li class="navigation-item--getting-started navigation-item">
    <li class="js--collapsible navigation-item--getting-started navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Getting Started</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--create-an-application navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/getting-started/create-application">
        Create an Application
</a></li>
<li class="navigation-item--configure-authentication navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/getting-started/authentication">
        Configure Authentication
</a></li>
<li class="navigation-item--subscribe-to-the-apis navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/getting-started/subscribe-api">
        Subscribe to the APIs
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--account-api navigation-item">
    <li class="js--collapsible navigation-item--account-api navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Account API</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/account-api/overview">
        Overview
</a></li>
<li class="navigation-item--code-snippets navigation-item">
    <li class="js--collapsible navigation-item--code-snippets navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Code Snippets</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--retrieve-an-account navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/account-api/code-snippets/retrieve-account">
        Retrieve an account
</a></li>
<li class="navigation-item--retrieve-a-location navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/account-api/code-snippets/retrieve-location">
        Retrieve a location
</a></li>
<li class="navigation-item--retrieve-a-list-of-locations navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/account-api/code-snippets/retrieve-locations">
        Retrieve a list of locations
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/account-api/api-reference">
        API Reference
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--extension-api navigation-item">
    <li class="js--collapsible navigation-item--extension-api navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Extension API</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/extension-api/overview">
        Overview
</a></li>
<li class="navigation-item--code-snippets navigation-item">
    <li class="js--collapsible navigation-item--code-snippets navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Code Snippets</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--retrieve-an-extension navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/extension-api/code-snippets/retrieve-extension">
        Retrieve an extension
</a></li>
<li class="navigation-item--retrieve-a-list-of-extensions navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/extension-api/code-snippets/retrieve-extension-list">
        Retrieve a list of extensions
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/extension-api/api-reference">
        API Reference
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--reports-api navigation-item">
    <li class="js--collapsible navigation-item--reports-api navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Reports API</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/reports-api/api-reference">
        API Reference
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--user-api navigation-item">
    <li class="js--collapsible navigation-item--user-api navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">User API</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--overview navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/user-api/overview">
        Overview
</a></li>
<li class="navigation-item--code-snippets navigation-item">
    <li class="js--collapsible navigation-item--code-snippets navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Code Snippets</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--retrieve-a-user navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/user-api/code-snippets/retrieve-user">
        Retrieve a user
</a></li>
<li class="navigation-item--retrieve-a-list-of-users navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/user-api/code-snippets/retrieve-user-list">
        Retrieve a list of users
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/user-api/api-reference">
        API Reference
</a></li>

        </ul>
    </li>
</li>
<li class="navigation-item--call-recording-api navigation-item">
    <li class="js--collapsible navigation-item--call-recording-api navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Call Recording API</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/vbc-apis/call-recording-api/api-reference">
        API Reference
</a></li>

        </ul>
    </li>
</li>

        </ul>
    </li>
</li>
<li class="navigation-item--vonage-integration-suite navigation-item">
    <li class="js--collapsible navigation-item--vonage-integration-suite navigation-item">
      <a class="Vlt-sidemenu__trigger" href="/concepts">
        <span class="Vlt-sidemenu__label">Vonage Integration Suite</span>
      </a>
        <ul class="Vlt-sidemenu__list--compressed">
          <li class="navigation-item--api-reference navigation-item">
    <a class="Vlt-sidemenu__link" href="/vonage-business-cloud/integration-suite/api-reference">
        API Reference
</a></li>

        </ul>
    </li>
</li>

    </ul>
</li>

</ul>

        </nav>
      </div>
    </div>
    <main class="Vlt-main Vlt-main--light Nxd-main" tabindex="0">
        <div class="Nxd-header-notices">

      <div class="Vlt-card Vlt-article" id="primary-content">
        <h1 id="messages-api-overview" data-id="4cc75ea67ca02b95cd95d24736fa53ea" class=" Vlt-title--icon">
<a href="#messages-api-overview" class="heading-permalink">
  <svg class="Vlt-grey"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-link"></use></svg>
</a>
Messages API Overview</h1>
<p>The Messages API allows you to send and in some cases receive messages over the following communications channels:</p><ul class="Vlt-list Vlt-list--simple">
<li>SMS/MMS</li>
<li>Facebook Messenger</li>
<li>Viber</li>
<li>WhatsApp</li>
</ul><p>Further channels may be supported in the future.</p><p>The following diagram illustrates the relationship between the Messages API and the Dispatch API:</p><p><figure><img src="/assets/images/messages-dispatch-overview.png" alt="#{alt_text}"></figure></p>
<h2 id="contents" data-id="c34f7a8d84d0bc674a59191c01334f8d" class=" Vlt-title--icon">
<a href="#contents" class="heading-permalink">
  <svg class="Vlt-grey"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-link"></use></svg>
</a>
Contents</h2>
<ul class="Vlt-list Vlt-list--simple">
<li><a href="#beta">Beta</a></li>
<li><a href="#supported-features">Supported features</a></li>
<li><a href="#external-accounts-api">External Accounts API</a></li>
<li><a href="#getting-started">Getting started</a></li>
<li><a href="#concepts">Concepts</a></li>
<li><a href="#code-snippets">Code Snippets</a></li>
<li><a href="#use-cases">Use Cases</a></li>
<li><a href="#reference">Reference</a></li>
</ul>
<h2 id="beta" data-id="62ed272c1fd816a308f1782a3e42d925" class=" Vlt-title--icon">
<a href="#beta" class="heading-permalink">
  <svg class="Vlt-grey"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-link"></use></svg>
</a>
Beta</h2>
<p>This API is currently in Beta.</p><p>Nexmo always welcomes your feedback. Your suggestions help us improve the product. If you do need help, please email <a href="mailto:support@nexmo.com">support@nexmo.com</a> and include the Messages API in the subject line. Please note that during the Beta period, support times are limited to Monday to Friday.</p><p>During Beta Nexmo will expand the capabilities of the API.</p>
<h2 id="supported-features" data-id="30d4e125f7c5a44128468e6850da04c8" class=" Vlt-title--icon">
<a href="#supported-features" class="heading-permalink">
  <svg class="Vlt-grey"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-link"></use></svg>
</a>
Supported features</h2>
<p>In this release the following features are supported:</p><div class="Vlt-table Vlt-table--data Vlt-table--bordered"><table>
<thead>
<tr>
<th style="text-align: left">Channel</th>
<th style="text-align: center">Outbound Text</th>
<th style="text-align: center">Outbound Image</th>
<th style="text-align: center">Outbound Audio</th>
<th style="text-align: center">Outbound Video</th>
<th style="text-align: center">Outbound File</th>
<th style="text-align: center">Outbound Template</th>
</tr>
</thead>
<tbody>
<tr>
<td style="text-align: left">SMS</td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
</tr>
<tr>
<td style="text-align: left">MMS</td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
</tr>
<tr>
<td style="text-align: left">Viber Service Messages</td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
</tr>
<tr>
<td style="text-align: left">Facebook Messenger</td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
</tr>
<tr>
<td style="text-align: left">WhatsApp</td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
</tr>
</tbody>
</table></div><div class="Vlt-table Vlt-table--data Vlt-table--bordered"><table>
<thead>
<tr>
<th style="text-align: left">Channel</th>
<th style="text-align: center">Inbound Text</th>
<th style="text-align: center">Inbound Image</th>
<th style="text-align: center">Inbound Audio</th>
<th style="text-align: center">Inbound Video</th>
<th style="text-align: center">Inbound File</th>
<th style="text-align: center">Inbound Location</th>
</tr>
</thead>
<tbody>
<tr>
<td style="text-align: left">MMS</td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
</tr>
<tr>
<td style="text-align: left">Viber Service Messages</td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
</tr>
<tr>
<td style="text-align: left">Facebook Messenger</td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
</tr>
<tr>
<td style="text-align: left">WhatsApp</td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
</tr>
</tbody>
</table></div><p>Limited support is also provided for <a href="/messages/concepts/custom-objects">custom objects</a>:</p><div class="Vlt-table Vlt-table--data Vlt-table--bordered"><table>
<thead>
<tr>
<th style="text-align: left">Channel</th>
<th style="text-align: center">Outbound Button</th>
<th style="text-align: center">Outbound Location</th>
<th style="text-align: center">Outbound Contact</th>
</tr>
</thead>
<tbody>
<tr>
<td style="text-align: left">SMS</td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
</tr>
<tr>
<td style="text-align: left">MMS</td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
</tr>
<tr>
<td style="text-align: left">Viber Service Messages</td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
</tr>
<tr>
<td style="text-align: left">Facebook Messenger</td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center">n/a</td>
<td style="text-align: center">n/a</td>
</tr>
<tr>
<td style="text-align: left">WhatsApp</td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
<td style="text-align: center"><svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg></td>
</tr>
</tbody>
</table></div><p><strong>Key:</strong></p><ul class="Vlt-list Vlt-list--simple">
<li>
<svg class="Vlt-green Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-check"></use></svg> = Supported.</li>
<li>
<svg class="Vlt-red Vlt-icon Vlt-icon--small"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-cross"></use></svg> = Supported by the channel, but not by Nexmo.</li>
<li>n/a = Not supported by the channel.</li>
</ul>
<h2 id="external-accounts-api" data-id="098ffba8364666e1d37c7363da7a9460" class=" Vlt-title--icon">
<a href="#external-accounts-api" class="heading-permalink">
  <svg class="Vlt-grey"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-link"></use></svg>
</a>
External Accounts API</h2>
<p>The <a href="/api/external-accounts">External Accounts API</a> is used to manage your accounts for Viber Service Messages, Facebook Messenger and WhatsApp when using those channels with the Messages and Dispatch APIs.</p>
<h2 id="getting-started" data-id="89b78c614122822f096b11631180c447" class=" Vlt-title--icon">
<a href="#getting-started" class="heading-permalink">
  <svg class="Vlt-grey"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-link"></use></svg>
</a>
Getting started</h2>
<p>In this example you will need to replace the following variables with actual values using any convenient method:</p><div class="Vlt-table Vlt-table--data Vlt-table--bordered"><table>
<thead>
<tr>
<th>Key</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td><code>NEXMO_API_KEY</code></td>
<td>Nexmo API key which can be obtained from your <a href="https://dashboard.nexmo.com">Nexmo Dashboard</a>.</td>
</tr>
<tr>
<td><code>NEXMO_API_SECRET</code></td>
<td>Nexmo API secret which can be obtained from your <a href="https://dashboard.nexmo.com">Nexmo Dashboard</a>.</td>
</tr>
<tr>
<td><code>FROM_NUMBER</code></td>
<td>A phone number you own or some text to identify the sender.</td>
</tr>
<tr>
<td><code>TO_NUMBER</code></td>
<td>The number of the phone to which the message will be sent.</td>
</tr>
</tbody>
</table></div><div class="Vlt-callout Vlt-callout--tip">
<i></i><div class="Vlt-callout__content"><p><strong>NOTE:</strong> Don't use a leading <code>+</code> or <code>00</code> when entering a phone number, start with the country code, for example 447700900000.</p></div>
</div><p>The following code shows how to send an SMS message using the Messages API:</p><div class="Vlt-tabs">
  <div class="Vlt-tabs__header--bordered skip-pushstate" data-has-initial-tab="false"><li class="Vlt-tabs__link Vlt-tabs__link_active" aria-selected="true" data-language="curl" data-language-type="terminal_programs" data-language-linkable="true"><a class="tab-link"><svg><use xlink:href="/assets/images/brands/curl.svg#curl"></use></svg><span>cURL</span></a></li></div>
  <div class="Vlt-tabs__content"><div id="ff19c8fa63714f0bc55c6de68c933f19" class="Vlt-tabs__panel Vlt-tabs__panel_active">
<h2 class="Vlt-title--margin-top3 Vlt-title--icon" id="write-the-code" data-id="10fdb11b103e580759540357df7e50ab">
<a href="#write-the-code" class="heading-permalink">
  <svg class="Vlt-grey"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-link"></use></svg>
</a>
Write the code</h2>

<p>Add the following to <code>send-sms-basic-auth.sh</code>:</p>

<div class="copy-wrapper">
  <div class="copy-button" data-lang="cURL" data-block="messages/sms/send-sms-basic-auth" data-section="code">
    <svg class="octicon octicon-clippy top left" viewbox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M2 13h4v1H2v-1zm5-6H2v1h5V7zm2 3V8l-3 3 3 3v-2h5v-2H9zM4.5 9H2v1h2.5V9zM2 12h2.5v-1H2v1zm9 1h1v2c-.02.28-.11.52-.3.7-.19.18-.42.28-.7.3H1c-.55 0-1-.45-1-1V4c0-.55.45-1 1-1h3c0-1.11.89-2 2-2 1.11 0 2 .89 2 2h3c.55 0 1 .45 1 1v5h-1V6H1v9h10v-2zM2 5h8c0-.55-.45-1-1-1H8c-.55 0-1-.45-1-1s-.45-1-1-1-1 .45-1 1-.45 1-1 1H3c-.55 0-1 .45-1 1z"></path></svg> <span>Copy to Clipboard</span>
  </div>
  <pre class="highlight shell main-code"><code>curl -X POST https://api.nexmo.com/v0.1/messages <span class="se">\</span>
     -u <span class="s2">"</span><span class="nv">$NEXMO_API_KEY</span><span class="s2">:</span><span class="nv">$NEXMO_API_SECRET</span><span class="s2">"</span> <span class="se">\</span>
     -H <span class="s1">'Content-Type: application/json'</span> <span class="se">\</span>
     -H <span class="s1">'Accept: application/json'</span> <span class="se">\</span>
     -d <span class="s1">$'{
          "from": { "type": "sms", "number": "'</span><span class="nv">$FROM_NUMBER</span><span class="s1">'" },
          "to": { "type": "sms", "number": "'</span><span class="nv">$TO_NUMBER</span><span class="s1">'" },
          "message": {
            "content": {
              "type": "text",
              "text": "This is an SMS sent from the Messages API"
        }
   }
}'</span>
</code></pre>

</div>

<p><a data-section="code" data-lang="cURL" data-block="messages/sms/send-sms-basic-auth" href="https://github.com/nexmo/nexmo-curl-code-snippets/blob/master/messages/sms/send-sms-basic-auth.sh#L6-L19">View full source</a></p>

<h2 id="run-your-code" data-id="8fc61eaf5a686c039251b9d31bfa0fcd" class=" Vlt-title--icon">
<a href="#run-your-code" class="heading-permalink">
  <svg class="Vlt-grey"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-link"></use></svg>
</a>
Run your code</h2>
<p>  Save this file to your machine and run it:
    </p>
<pre class="highlight bash run-command"><code>bash send-sms-basic-auth.sh</code></pre>
</div></div>
</div>

<h2 id="concepts" data-id="bcef2e81056aba3ccf9c31a53472bf36" class=" Vlt-title--icon">
<a href="#concepts" class="heading-permalink">
  <svg class="Vlt-grey"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-link"></use></svg>
</a>
Concepts</h2>
<ul class="Vlt-list Vlt-list--simple">
  
    <li>
<a href="/messages/concepts/external-accounts">External Accounts</a>: External accounts are Messaging accounts such as Facebook, WhatsApp and Viber that you want to link to your Messages and Dispatch applications.</li>
  
    <li>
<a href="/messages/concepts/facebook">Understanding Facebook messaging</a>: Understanding Facebook messaging.</li>
  
    <li>
<a href="/messages/concepts/viber">Understanding Viber messaging</a>: Viber messaging solution for businesses.</li>
  
    <li>
<a href="/messages/concepts/whatsapp">Understanding WhatsApp messaging</a>: WhatsApp messaging solution for businesses.</li>
  
    <li>
<a href="/messages/concepts/custom-objects">Custom objects</a>: Understanding custom objects</li>
  
</ul>

<h2 id="code-snippets" data-id="2944d942ba247fe0ede3b57efa41b1e9" class=" Vlt-title--icon">
<a href="#code-snippets" class="heading-permalink">
  <svg class="Vlt-grey"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-link"></use></svg>
</a>
Code Snippets</h2>
<ul class="Vlt-list Vlt-list--simple">
  
    <li>
<a href="/messages/code-snippets/before-you-begin">
      
      Before you Begin</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/install-cli">
      
      Install Nexmo CLI</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/create-an-application">
      
      Create a Nexmo Application</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/client-library">
      
      Install Client Library</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/configure-webhooks">
      
      Configure Webhooks</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/inbound-message">
      
      Inbound Message Webhook</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/message-status">
      
      Message Status Webhook</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/whatsapp/send-mtm">
      
        Whatsapp /
        
      Send a Message Template (MTM)</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/viber/send-text">
      
        Viber /
        
      Send a Text Message</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/whatsapp/send-media-mtm">
      
        Whatsapp /
        
      Send a Media Message Template</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/viber/send-image">
      
        Viber /
        
      Send an Image Message</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/mms/send-mms">
      
        Mms /
        
      Send an MMS</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/whatsapp/send-image">
      
        Whatsapp /
        
      Send an Image Message</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/whatsapp/send-contact">
      
        Whatsapp /
        
      Send a Contact</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/whatsapp/send-text">
      
        Whatsapp /
        
      Send a Text Message</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/whatsapp/send-audio">
      
        Whatsapp /
        
      Send an Audio Message</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/whatsapp/send-button-quick-reply">
      
        Whatsapp /
        
      Send a Quick Reply Button</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/whatsapp/send-location">
      
        Whatsapp /
        
      Send a Location</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/whatsapp/send-file">
      
        Whatsapp /
        
      Send a File Message</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/whatsapp/send-video">
      
        Whatsapp /
        
      Send a Video Message</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/whatsapp/send-button-link">
      
        Whatsapp /
        
      Send a Link Button</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/messenger/send-image">
      
        Messenger /
        
      Send an Image Message</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/messenger/send-text">
      
        Messenger /
        
      Send a Text Message</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/messenger/send-audio">
      
        Messenger /
        
      Send an Audio Message</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/messenger/send-file">
      
        Messenger /
        
      Send a File Message</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/messenger/send-video">
      
        Messenger /
        
      Send a Video Message</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/messenger/send-template">
      
        Messenger /
        
      Send a Message Template</a>
    </li>
  
    <li>
<a href="/messages/code-snippets/sms/send-sms">
      
        Sms /
        
      Send an SMS</a>
    </li>
  
</ul>

<h2 id="use-cases" data-id="9d4d18b53e91eb0fd68ec18ecd5c3f87" class=" Vlt-title--icon">
<a href="#use-cases" class="heading-permalink">
  <svg class="Vlt-grey"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-link"></use></svg>
</a>
Use Cases</h2>
<ul class="Vlt-list Vlt-list--simple">
  
    <li><a href="/use-cases/fbm-product-info">Receive product information automatically via Facebook Messenger</a></li>
  
    <li><a href="/use-cases/sending-viber-service-messages-with-messages-api">Sending Viber Service messages with the Messages API</a></li>
  
    <li><a href="/use-cases/sending-sms-messages-with-messages-api">Sending SMS messages with the Messages API</a></li>
  
    <li><a href="/use-cases/sending-facebook-messenger-messages-with-messages-api">Sending Facebook Messenger messages with the Messages API</a></li>
  
    <li><a href="/use-cases/sending-whatsapp-messages-with-messages-api">Sending WhatsApp messages with the Messages API</a></li>
  
    <li><a href="/use-cases/real-time-feed">Real-time data feed into multiple channels using Messages API</a></li>
  
</ul>

<h2 id="reference" data-id="a9b4109e7e5d18037f418607e44aa800" class=" Vlt-title--icon">
<a href="#reference" class="heading-permalink">
  <svg class="Vlt-grey"><use xlink:href="/symbol/volta-icons.svg#Vlt-icon-link"></use></svg>
</a>
Reference</h2>
<ul class="Vlt-list Vlt-list--simple">
<li><a href="/api/messages-olympus">Messages API Reference</a></li>
<li><a href="/api/external-accounts">External Accounts API Reference</a></li>
</ul>

          <br>
  <hr>
  <br>

  <script>
    window.feedbackProps = {
      code_language_set_by_url: false,
      code_language: '',
      source: 'https://developer.nexmo.com/messages/overview',

      recaptcha: {
        enabled: true,
        skip: false,
        sitekey: '6Ley3FUUAAAAAOBiPZf782BNSWBKMDw_2KVdroPC',
      },

        github_url: 'https://github.com/Nexmo/nexmo-developer/blob/master/./_documentation/en/messages/overview.md',
    }
  </script>

      <div id="recaptcha-container"></div>

  <div id="feedback-app"></div>

      </div>
    </main>
  </body>
</html>

