FROM ubuntu:14.04.1


# Add the package cloud repo to apt-get
RUN apt-get update && apt-get install -y curl \
					 apt-transport-https \
                   && apt-get clean
RUN curl https://packagecloud.io/gpg.key | apt-key add -

RUN curl https://packagecloud.io/install/repositories/basho/riak/script.deb | sudo bash

RUN apt-get update && apt-get install -y riak=2.0.0-1 \
		   && apt-get clean
		  




