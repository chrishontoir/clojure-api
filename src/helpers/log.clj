(ns helpers.log)

(defn log [code message & [data]]
  (if (nil? data)
    (println {:code code :message message})
    (println {:code code :message message :data data})))
