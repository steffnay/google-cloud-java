#!/bin/bash

set -e

violations=0
for pomFile in $(find . -mindepth 2 -name pom.xml | sort ); do
  if [[ "${pomFile}" =~ .*google-cloud-jar-parent.* ]] || [[ "${pomFile}" =~ .*google-cloud-pom-parent.* ]] ||[[ "${pomFile}" =~ .*CoverageAggregator.* ]]; then
    continue
  fi

  if grep -n '<version>.*</version>' "$pomFile" | grep -v 'x-version-update'; then
    echo "Found version declaration(s) without x-version-update in: $pomFile"
    violations=$((violations + 1))
    echo "---------------------------------------------------------"
  fi
done

echo "FOUND $violations VIOLATIONS!"

if [[ $violations -gt 0 ]]; then
  exit 1
fi