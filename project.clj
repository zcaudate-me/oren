(defproject im.chit/oren "0.1.6"
  :description "system and process monitoring"
  :url "https://github.com/zcaudate/oren"
  :license {:name "The MIT License"
            :url "http://http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.github.dblock/oshi-core "3.3"]
                 [im.chit/hara.object "2.5.1"]]
  :publish {:theme  "mormont"
  
            :template {:author "Chris Zheng"
                       :email  "z@caudate.me"
                       :site   "oren"
                       :tracking-enabled "true"
                       :tracking "UA-31320512-2"}
            
            :files {"index"
                    {:input "test/documentation/home_oren.clj"
                     :title "oren"
                     :subtitle "system and process monitoring"}}})
