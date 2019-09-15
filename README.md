#Hi,
The purpose for this repo is to deploy commonly used functionalities such as Spring security
authentication, standard Object bound IO with Hibernate, REST-HATEOAS led development.
 
The ambition is to develop a repo with pre-made & tested code templates which can decrease the development time.
###You can find the API collection below: 
https://documenter.getpostman.com/view/8809491/SVmtxzVG?version=latest


#####Docker file is already set, using below commands you can host it and access on port 9090
docker build -t maven-template -f .\\.Dockerfile . <br/>
docker run -p 9090:8080 -d maven-template<br/>

docker ps <br/> 
docker container exec -it <container_id> /bin/sh<br/>
cd webapps 

###Feel free to contribute to this, branch rules active.
##### You can reach me out at https://twitter.com/devdevsyed or http://syedamanat.me


