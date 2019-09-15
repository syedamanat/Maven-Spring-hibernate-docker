![Docker, Maven, Spring, Hibernate, ](https://miro.medium.com/max/512/1*ExcOmgHiWZYPLnmsHBa2Hw.jpeg)


<h2>Hi,</h2>
The purpose for this repo is to deploy commonly used functionalities such as Spring security
authentication, standard Object bound IO with Hibernate, REST-HATEOAS led development.
 <br/>
The ambition is to develop a repo with pre-made &amp; tested code templates which can decrease the development time.<br/>
<h3>You can find the API collection below: </h3>
<a href="https://documenter.getpostman.com/view/8809491/SVmtxzVG?version=latest">Postman Collection</a>


<h5>Docker file is already set, using below commands you can host it and access on port 9090</h5>
<ul>
<li>docker build -t maven-template -f .\\.Dockerfile .  </li>
<li>docker run -p 9090:8080 -d maven-template </li>

<li>docker ps </li>
<li>docker container exec -it &lt;container_id&gt; /bin/sh</li>
<li>cd webapps </li> 
</ul>

<h5>Feel free to contribute to this, branch rules active.</h5>
<h6> You can reach me out at <a href="https://twitter.com/devdevsyed" target="_blank">@devdevsyed</a> or <a href="http://syedamanat.me" target="_blank">http://syedamanat.me</a></h6>


