<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="main"/>
    <title>Welcome to Famous Quotes</title>
    <style type="text/css" media="screen">
      #status {
	  background-color: #eee;
	  border: .2em solid #fff;
	  margin: 2em 2em 1em;
	  padding: 1em;
	  width: 12em;
	  float: left;
	  -moz-box-shadow: 0px 0px 1.25em #ccc;
	  -webkit-box-shadow: 0px 0px 1.25em #ccc;
	  box-shadow: 0px 0px 1.25em #ccc;
	  -moz-border-radius: 0.6em;
	  -webkit-border-radius: 0.6em;
	  border-radius: 0.6em;
      }

      .ie6 #status {
	  display: inline; /* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
      }

      #status ul {
	  font-size: 0.9em;
	  list-style-type: none;
	  margin-bottom: 0.6em;
	  padding: 0;
      }

      #status li {
	  line-height: 1.3;
      }

      #status h1 {
	  text-transform: uppercase;
	  font-size: 1.1em;
	  margin: 0 0 0.3em;
      }

      #page-body {
	  margin: 2em 1em 1.25em 4em;
      }

      h2 {
	  margin-top: 1em;
	  margin-bottom: 0.3em;
	  font-size: 1em;
      }

      p {
	  line-height: 1.5;
	  margin: 0.25em 0;
      }

      #controller-list ul {
	  list-style-position: inside;
      }

      #controller-list li {
	  line-height: 1.3;
	  list-style-position: inside;
	  margin: 0.25em 0;
      }

      @media screen and (max-width: 480px) {
	  #status {
	      display: none;
	  }

	  #page-body {
	      margin: 0 1em 1em;
	  }

	  #page-body h1 {
	      margin-top: 0;
	  }
      }
    </style>
    <g:javascript library="jquery"/>
  </head>
  <body>
    <a href="#page-body" class="skip"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
    <div id="page-body" role="main">
      <h1>Welcome to Famous Quotes</h1>
      <p>Hi, almost everyone think they know everything, but in fact, only few wise men see the truth
      light. From their anecdote and speech, luckily, we can also catch sight of the true world.</p>
      <div id="controller-list" role="navigation">
	<h2>Today's Quote: </h2>
	<p>
	  ${quote.sentence} -- ${quote.authorName}
	</p>
	<h2>Random Quote: </h2>
	<g:remoteLink action="random" update="randQuote">
	  <r:img uri="/images/reload_icon_mac.png"/>
	</g:remoteLink>
	<div id="randQuote">
	<p>
	  ${quote.sentence} -- ${quote.authorName}
	</p>
	</div>
      </div>
    </div>
  </body>
</html>
