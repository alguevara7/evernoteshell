(defproject evernoteshell "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-swank "1.4.4"]
            [lein-marginalia "0.7.1"]]
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [evernote/evernote-api "1.21"]
                 [libthrift/libthrift "1.0.0-SNAPSHOT"]]
  :repositories {"alexguev at github" "https://github.com/alexguev/maven/raw/master/releases/"})
