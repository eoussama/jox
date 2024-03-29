#!/bin/sh

tag="0.0.1"
project="jox"
username="eoussama"
image="$username/$project:$tag"

docker build -f ./docker/Dockerfile -t $image .
docker run -it --rm -v "$(pwd)":/jox $image