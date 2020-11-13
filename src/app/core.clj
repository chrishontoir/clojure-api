(ns app.core
  (:gen-class)
  (:require [org.httpkit.server :as s]
            [app.app :refer [app]]))

(defn create-server []
  (println "Server started on port 8080")
  (s/run-server (app) {:port 8080}))

(defn stop-server [server]
  (server :timeout 100))

(defn -main []
  (create-server))
