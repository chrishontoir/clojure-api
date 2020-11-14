(ns app.app
    (:require [compojure.core :refer [routes GET]]
              [handlers.handler :refer [handler]]
              [clj-time.core :as time]
              [middleware.elapsed_time :refer [logElapsedTime]]
              [middleware.response_handler :refer [responseHandler]]))

(defn now []
    (time/now))

(defn app []
    (routes
        (GET "/" [:as req]
          (let [start (now)
                body (handler req)
                response (responseHandler body)
                end (now)]
            (logElapsedTime start end)
            response))))
