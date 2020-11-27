#!/bin/sh
echo "Git url:"
read -r url
echo "Output folder name:"
read -r outputname
git clone $url "$outputname"
cd "$outputname" || exit
chmod ug=rwx gradlew
