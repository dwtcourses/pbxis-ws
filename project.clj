(defproject com.ingemark/pbxis-ws "0.1.0-SNAPSHOT"
  :description "Asterisk Call Center Web Service"
  :url "http://www.inge-mark.hr"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.5.0"]
                 [org.clojure/core.incubator "0.1.2"]
                 [org.clojure/data.json "0.2.1"]
                 [com.ingemark/pbxis "0.5.1-SNAPSHOT"]
                 [net.cgrand/moustache "1.2.0-alpha2"]
                 [hiccup "1.0.2"]
                 [ring/ring-core "1.1.0" :exclusions [javax.servlet/servlet-api]]
                 [aleph "0.3.0-beta14"]
                 [org.slf4j/slf4j-api "1.7.2"]
                 [ch.qos.logback/logback-classic "1.0.9"]]
  :jvm-opts ["-Dlogback.configurationFile=logback.xml"]
  :main com.ingemark.pbxis-ws.main)