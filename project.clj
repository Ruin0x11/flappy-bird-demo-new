(defproject flappy-bird-demo-new "0.1.0-SNAPSHOT"
  :description "The original figwheel flappybird demo redone for figwheel.main"

  :url "http://rigsomelight.com/2014/05/01/interactive-programming-flappy-bird-clojurescript.html"

  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/clojurescript "1.10.866"]
                 [org.clojure/core.async "1.3.618"]
                 [cljsjs/react-dom-server "17.0.2-0"]  ;; for sablono
                 [cljsjs/react-dom "17.0.2-0"] ;; for sablono
                 [cljsjs/react "17.0.2-0"] ;; for sablono
                 [sablono "0.8.6"]]

  :resource-paths ["resources" "target"]
  
  :clean-targets ^{:protect false} ["target/public"]
  
  :profiles {:dev {:dependencies [[com.bhauman/figwheel-main "0.2.13"]
                                  [com.bhauman/rebel-readline-cljs "0.1.4"]
                                  [cider/piggieback "0.5.1"]]
                   :repl-options {:nrepl-middleware [cider.piggieback/wrap-cljs-repl]}}}

  :aliases {"fig"       ["trampoline" "run" "-m" "figwheel.main"]
            "fig:build" ["trampoline" "run" "-m" "figwheel.main" "-b" "flappy" "-r"]})
