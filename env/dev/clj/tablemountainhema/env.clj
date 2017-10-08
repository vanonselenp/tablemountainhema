(ns tablemountainhema.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [tablemountainhema.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[tablemountainhema started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[tablemountainhema has shut down successfully]=-"))
   :middleware wrap-dev})
