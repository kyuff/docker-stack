#!/bin/bash

basename=kyuff


function build {
  if [ -d "$1" ]; then
      echo ---------------------------------------
      echo               building $basename/$1           
      echo ---------------------------------------
      cd $1
      if [[ -x "pre-build.sh" && -f "pre-build.sh" ]]; then
         ./pre-build.sh
      fi
      docker build -t $basename/$1 .
      cd ..
  else 
      echo ---------------------------------------
      echo               ignoring $basename/$1
      echo                - no docker file found
      echo ---------------------------------------
  fi
}

function build_all {
  echo "Building everything"
  for i in $( find . -name Dockerfile -type f | xargs -I X dirname X | xargs -I X basename X ); do
       build $i
  done
}

if [ $# -eq 0 ]; then
  build_all
else
  build $1
fi
