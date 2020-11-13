(ns middleware.elapsed_time
  (:require [clj-time.core :as time]
            [helpers.log :refer [log]]))

(defn logElapsedTime [start end]
  (let [elapsed (time/in-millis (time/interval start end))]
    (log "001" "API Elapsed Time" {:elapsed elapsed})))
