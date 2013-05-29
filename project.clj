(defproject bloomoon "0.1.0-SNAPSHOT"
  :description "A Clojure wrapper around the Hadoop bloom filter implementation."
  :url "git@github.com:reborg/bloomoon.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :java-source-paths ["bloom"]
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:dev {:dependencies [[midje "1.5.1"]]}})
