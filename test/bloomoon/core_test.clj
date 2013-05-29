(ns bloomoon.core-test
  (:use midje.sweet
        bloomoon.core))

(unfinished bloom-add)

(defn hashify
  "creates an hash of the given item as a collection of zeros and ones"
  [item]
  )

(facts "creating hashes of strings"
       (fact "it returns a collection of zeros and ones"
             (let [hashified (hashify "whatever")]
               (reduce (fn [acc e] (and acc (< e 2))) true hashified)  => truthy)))

(defn malicious? [target blacklist]
  (let [bloom (bloom-add blacklist)
        hashified (hashify target)]
    (= bloom hashified)))

(facts "warning about malicious web sites"
       (fact "it is returning a tru positive if there is only one matching element"
             (let [list-of-urls ["twitter.com" ]]
             (malicious? "twitter.com" list-of-urls) => truthy
               (provided (bloom-add list-of-urls) => ...bitmap...)
               (provided (hashify "twitter.com") => ...bitmap...)))
       (fact "it should also tell me when a website is OK con"
             (let [list-of-urls ["facebook.com" 
                                 "linkedin.com"
                                 "gmail.com"]]
             (malicious? "twitter.com" list-of-urls) => falsey
               (provided (bloom-add list-of-urls) => ...bitmap1...)
               (provided (hashify "twitter.com") => ...bitmap2...))))
