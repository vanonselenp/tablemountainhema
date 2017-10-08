(ns user
  (:require 
            [mount.core :as mount]
            tablemountainhema.core))

(defn start []
  (mount/start-without #'tablemountainhema.core/repl-server))

(defn stop []
  (mount/stop-except #'tablemountainhema.core/repl-server))

(defn restart []
  (stop)
  (start))


