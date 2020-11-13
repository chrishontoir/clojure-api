(ns middleware.response_handler
  (:require [helpers.log :refer [log]]))

(defn responseHandler [body]
  (if (empty? body)
    (do
      (log "021" "No Content")
      {:status 204
       :headers {"Content-Type" "application/json"}})
    (do
      (log "020" "Successful")
      {:status 200
       :headers {"Content-Type" "application/json"}
       :body body})))
