# bloomoon

An STM-friendly bloom filter implementation written in Clojure.

## Description

For many usage scenarios, bloom filters can be built starting from the final collection of items they should contain. There are other scenarios, for example in real-time processing of big data, where the ckeck on the bloom filter should happen as soon as the next item is available. At the same time the bloom filter should be shared between different processes all accessing it concurrently. Bloomoon is an immutable data structure that supports Clojure concurrency semantic like atoms, refs or agents built on the same principles of the Clojure STM.

## Details

Bloomoon rounds the number of configured bits automatically to the next power of two to enable faster bit-wise operations.

## Usage

Bloomoon can be used standalone or as part of collection operations such as filtering. In standalone mode:

    > (use 'bloomoon.core as bloom)
    
    > (bloom/check "test1")
    > false
    > (bloom/add "test1")
    > false "

FIXME

## License

Copyright © 2013, Reborg.net
Copyright © 2005, European Commission project OneLab for all Java sources

Distributed under the Eclipse Public License, the same as Clojure.
