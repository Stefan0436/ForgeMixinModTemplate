#!/bin/sh
echo "Git url:"
read -r url
echo "Output folder name:"
read -r outputname
git clone $url "$outputname"
if [ -d "$outputname" ]; then
  cd "$outputname"
  chmod ug=rwx gradlew
  rm "download-posix.sh"
  rm "download.sh"
  rm "download.bat"
fi
