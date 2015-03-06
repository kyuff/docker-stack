#docker run --rm -it --link database:database --name cli kyuff/cli
docker run -v /Users/swi/docker:/data -p 8080:8080 -p 9990:9990 --rm -it --name web --link database:database kyuff/web
