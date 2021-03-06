(defproject kixi/buddy "1.2.1"
  :description "Security library for Clojure"
  :url "https://github.com/funcool/buddy"
  :license {:name "Apache 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[kixi/buddy-core "1.1.2" :exclusions [org.clojure/clojure]]
                 [buddy/buddy-auth "1.3.0" :exclusions [org.clojure/clojure]]
                 [buddy/buddy-hashers "1.1.0" :exclusions [org.clojure/clojure]]
                 [buddy/buddy-sign "1.3.0" :exclusions [org.clojure/clojure]]]
  :plugins [[lein-ancient "0.6.10"]]
  :javac-options ["-target" "1.7" "-source" "1.7" "-Xlint:-options"])
