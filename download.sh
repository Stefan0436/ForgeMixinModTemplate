#!/bin/bash
read -rp "Git url: " url
read -rp "Output folder name: " outputname
git clone $url "$outputname"
cd "$outputname"
chmod ug=rwx gradlew
