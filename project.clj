(defproject im.chit/hara "1.1.0-SNAPSHOT"
  :description "General purpose utilities library "
  :url "http://github.com/zcaudate/hara"
  :license {:name "The MIT License"
            :url "http://http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :codox {:include [hara.common]}
  :profiles {:dev {:dependencies [[midje "1.6.0"]
                                  [clj-time "0.5.1"]]
                   :plugins [[lein-midje "3.1.3"]]}})
