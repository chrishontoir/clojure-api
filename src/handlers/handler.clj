(ns handlers.handler
  (:require [clojure.string :as str]))

(defn handler [{querystring :query-string}]
  (let [message (nth (str/split querystring #"=") 1)
        body {:message message}]
    body))